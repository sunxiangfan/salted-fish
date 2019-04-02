package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 评论表 fish_comment_record
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishCommentRecord {

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
     * 评论（1文章，2视频）
     */
    private String commentType;
    /**
     * 业务code（文章或视频code）
     */
    private String businessCode;
    /**
     * 作者头像地址
     */
    private String userHeadUrl;
    /**
     * 作者昵称
     */
    private String userNickname;
    /**
     * 评论内容
     */
    private String commentContent;
    /**
     * 楼数
     */
    private String floorNumber;
    /**
     * 是否删除
     */
    private String isDelete;
    /**
     * 创建时间
     */
    private Date createTime;
}
