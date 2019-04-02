package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 用户表 fish_user
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishUser {

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
     * 用户头像地址
     */
    private String userHeadUrl;
    /**
     * 用户昵称
     */
    private String userNickname;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userMail;
    /**
     * 个人介绍
     */
    private String userIntroduce;
    /**
     * 是否删除
     */
    private String isDelete;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
