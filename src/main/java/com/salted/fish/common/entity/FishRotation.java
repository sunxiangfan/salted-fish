package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 轮播图配置表 fish_rotation
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishRotation {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 图片地址
     */
    private String pictureUrl;
    /**
     * 目标地址
     */
    private String destinationUrl;
    /**
     * 是否发布
     */
    private String isRelease;
    /**
     * 创建时间
     */
    private Date createTime;
}
