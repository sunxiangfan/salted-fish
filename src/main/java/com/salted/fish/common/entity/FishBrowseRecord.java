package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 浏览记录表 fish_browse_record
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishBrowseRecord {

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
     * 浏览类型（1文章，2视频）
     */
    private String browseType;
    /**
     * 业务code（文章或视频code）
     */
    private String businessCode;
    /**
     * 创建时间
     */
    private Date createTime;
}
