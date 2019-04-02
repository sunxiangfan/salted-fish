package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 操作记录表 fish_operation_record
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishOperationRecord {

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
     * 操作类型（1关注，2收藏，3浏览，4发布，5点赞）
     */
    private String operationType;
    /**
     * 业务code（文章或视频code）
     */
    private String businessCode;
    /**
     * 创建时间
     */
    private Date createTime;
}
