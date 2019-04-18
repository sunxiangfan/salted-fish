package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.salted.fish.common.dto.*;
import com.salted.fish.common.entity.FishUser;
import com.salted.fish.common.entity.FishUserLogin;
import com.salted.fish.common.util.MD5;
import com.salted.fish.common.util.UUIDUtils;
import com.salted.fish.common.util.ValidationUtils;
import com.salted.fish.service.IFishUserLoginService;
import com.salted.fish.service.IFishUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 用户登录 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
@RequestMapping("web")
public class FishUserLoginController {

    Logger log = LoggerFactory.getLogger(FishUserLoginController.class);

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private IFishUserLoginService fishUserLoginService;
    @Autowired
    private IFishUserService fishUserService;

    @CrossOrigin
    @PostMapping("sendSMS")
    public ResultDTO sendSMS(@RequestBody SendSMSDTO body) {
        log.info("sendSMS：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            String check = redisTemplate.opsForValue().get("CHECK" + body.getUserPhone());
            if (null != check && check.equals("CHECK")) {
                return ResultDTO.fail("验证码发送频繁，请一分钟之后再试");
            }
            int code = (int) ((Math.random() * 9 + 1) * 100000);
            redisTemplate.opsForValue().set("SMS" + body.getUserPhone(), String.valueOf(code), 5, TimeUnit.MINUTES);
            redisTemplate.opsForValue().set("CHECK" + body.getUserPhone(), "CHECK", 1, TimeUnit.MINUTES);
            return ResultDTO.success(code);
        } catch (Exception e) {
            log.error("sendSMS error", e);
            return ResultDTO.fail();
        }
    }

    @CrossOrigin
    @PostMapping("checkSMS")
    public ResultDTO checkSMS(@RequestBody CheckSMSDTO body) {
        log.info("checkSMS：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            String code = redisTemplate.opsForValue().get("SMS" + body.getUserPhone());
            if (null != code && code.equals(body.getCode())) {
                return ResultDTO.success();
            } else {
                return ResultDTO.fail("验证码不正确");
            }
        } catch (Exception e) {
            log.error("checkSMS error", e);
            return ResultDTO.fail();
        }
    }

    @CrossOrigin
    @PostMapping("register")
    public ResultDTO register(@RequestBody WebRegisterDTO body) {
        log.info("register：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            FishUserLogin fishUserLogin = new FishUserLogin();
            fishUserLogin.setUserPhone(body.getUserPhone());
            List<FishUserLogin> userList = fishUserLoginService.selectFishUserLoginList(fishUserLogin);
            if (null != userList || userList.size() == 1) {
                return ResultDTO.fail("用户已存在");
            }
            FishUser fishUser = new FishUser();
            fishUser.setUserNickname(body.getUserNickName());
            List<FishUser> fishUserList = fishUserService.selectFishUserList(fishUser);
            if (null != fishUserList && fishUserList.size() == 1) {
                return ResultDTO.fail("昵称已存在");
            }
            String userId = UUIDUtils.getUserId();
            fishUserLogin.setUserId(userId);
            fishUserLogin.setUserPassword(MD5.md5(body.getUserPassword()));
            fishUserLoginService.insertFishUserLogin(fishUserLogin);
            fishUser.setUserPhone(body.getUserPhone());
            fishUser.setUserId(userId);
            fishUserService.insertFishUser(fishUser);
            return ResultDTO.success();
        } catch (Exception e) {
            log.error("register error", e);
            return ResultDTO.fail();
        }
    }

    @CrossOrigin
    @PostMapping("login")
    public ResultDTO webLogin(@RequestBody WebLoginDTO body) {
        log.info("webLogin：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            FishUserLogin fishUserLogin = new FishUserLogin();
            fishUserLogin.setUserPhone(body.getUserPhone());
            List<FishUserLogin> userList = fishUserLoginService.selectFishUserLoginList(fishUserLogin);
            if (null == userList || userList.size() != 1) {
                return ResultDTO.fail("用户未注册");
            }
            if (!MD5.verify(body.getUserPassword(), userList.get(0).getUserPassword())) {
                return ResultDTO.fail("密码错误");
            }
            FishUser user = fishUserService.selectFishUserByUserId(userList.get(0).getUserId());
            String uuid = UUID.randomUUID().toString().replace("-", "");
            user.setToken(uuid);
            redisTemplate.opsForValue().set(uuid, userList.get(0).getUserId(), 1, TimeUnit.DAYS);
            return ResultDTO.success(user);
        } catch (Exception e) {
            log.error("webLogin error", e);
            return ResultDTO.fail();
        }
    }
}
