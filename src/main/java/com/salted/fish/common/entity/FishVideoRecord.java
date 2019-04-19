package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 视频明细表 fish_video_record
 *
 * @author shop
 * @date 2019-04-19
 */
@Data
public class FishVideoRecord {

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 视频编码
     */
    private String videoCode;
    /**
     * 章节编码
     */
    private String chapterCode;
    /**
     * 视频地址
     */
    private String videoRecordUrl;
    /**
     * 视频排序
     */
    private String videoRecordSort;
    /**
     * 视频类型
     */
    private String videoRecordType;
    /**
     * 视频标题
     */
    private String videoRecordTitle;
    /**
     * 视频时长
     */
    private String videoRecordTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
