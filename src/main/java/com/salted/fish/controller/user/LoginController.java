package com.salted.fish.controller.user;

import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.service.IFishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 登录 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
@RequestMapping("user")
public class LoginController {

    @CrossOrigin
    @PostMapping("login")
    public ResultDTO login() {
        Login login = new Login();
        login.setToken("admin-token");
        return ResultDTO.success(login);
    }

    @CrossOrigin
    @PostMapping("info")
    public ResultDTO info() {
        Info info = new Info();
        String roles[] = {"admin"};
        info.setRoles(roles);
        info.setIntroduction("我是管理员");
        info.setName("Super Admin");
        return ResultDTO.success(info);
    }

    class Info{
        private String roles[];
        private String introduction;
        private String avatar;
        private String name;

        public String[] getRoles() {
            return roles;
        }

        public void setRoles(String[] roles) {
            this.roles = roles;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    class Login{
        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
