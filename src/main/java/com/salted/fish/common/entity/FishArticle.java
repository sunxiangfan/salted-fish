package com.salted.fish.common.entity;


import lombok.Data;

import java.util.Date;

/**
 * 文章表 fish_article
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishArticle {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 文章logo地址
     */
    private String articleLogoUrl;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章编码
     */
    private String articleCode;
    /**
     * 栏目code
     */
    private String columnCode;
    /**
     * 栏目Name
     */
    private String columnName;
    /**
     * 作者ID
     */
    private String userId;
    /**
     * 作者头像地址
     */
    private String userHeadUrl;
    /**
     * 作者昵称
     */
    private String userNickname;
    /**
     * 标签code
     */
    private String labelCode;
    /**
     * 标签名称
     */
    private String labelName;
    /**
     * 是否会员专享
     */
    private String isMember;
    /**
     * 是否推荐
     */
    private String isRecommend;
    /**
     * 是否发布
     */
    private String isRelease;
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
    /**
     * 阅读数
     */
    private Integer readNum;
    /**
     * 点击数
     */
    private Integer clickNum;
}
