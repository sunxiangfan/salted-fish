package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 文章内容表 fish_article_content
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishArticleContent {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 文章编码
     */
    private String articleCode;
    /**
     * 文章内容
     */
    private String articleContent;
    /**
     * 字数
     */
    private String wordNumber;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
