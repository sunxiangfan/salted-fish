package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 关注/粉丝表 fish_follow
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishFollow {

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
     * 被关注用户ID
     */
    private String followUserId;
    /**
     * 创建时间
     */
    private Date createTime;
}
