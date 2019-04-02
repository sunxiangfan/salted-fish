package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 用户登录表 fish_user_login
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishUserLogin {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 账号状态（1正常，2冻结）
     */
    private String userStatus;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
