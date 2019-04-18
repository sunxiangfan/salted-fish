package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.salted.fish.common.dto.CheckNickNameDTO;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.dto.SendSMSDTO;
import com.salted.fish.common.entity.FishUser;
import com.salted.fish.common.util.ValidationUtils;
import com.salted.fish.service.IFishUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishUserController {

    Logger log = LoggerFactory.getLogger(FishUserController.class);

    @Autowired
    private IFishUserService fishUserService;

    @CrossOrigin
    @PostMapping("checkUserByUserPhone")
    public ResultDTO checkUserByUserPhone(@RequestBody SendSMSDTO body) {
        log.info("checkUserByUserPhone：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            FishUser fishUser = new FishUser();
            fishUser.setUserPhone(body.getUserPhone());
            List<FishUser> fishUserList = fishUserService.selectFishUserList(fishUser);
            if (null != fishUserList && fishUserList.size() == 1) {
                return ResultDTO.fail("用户已存在");
            }
            return ResultDTO.success();
        } catch (Exception e) {
            log.error("checkUserByUserPhone error", e);
            return ResultDTO.fail();
        }
    }

    @CrossOrigin
    @PostMapping("checkUserByUserNickName")
    public ResultDTO checkUserByUserNickName(@RequestBody CheckNickNameDTO body) {
        log.info("checkUserByUserNickName：" + JSON.toJSONString(body));
        ResultDTO result = ValidationUtils.validateEntity(body);
        if (null != result) {
            return result;
        }
        try {
            FishUser fishUser = new FishUser();
            fishUser.setUserNickname(body.getUserNickName());
            List<FishUser> fishUserList = fishUserService.selectFishUserList(fishUser);
            if (null != fishUserList && fishUserList.size() == 1) {
                return ResultDTO.fail("用户已存在");
            }
            return ResultDTO.success();
        } catch (Exception e) {
            log.error("checkUserByUserNickName error", e);
            return ResultDTO.fail();
        }
    }
}