package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 章节表 fish_video_chapter
 *
 * @author shop
 * @date 2019-04-19
 */
@Data
public class FishVideoChapter {

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
     * 章节描述
     */
    private String chapterDescribe;
    /**
     * 章节标题
     */
    private String chapterTitle;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
