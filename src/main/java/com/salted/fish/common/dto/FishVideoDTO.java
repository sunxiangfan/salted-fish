package com.salted.fish.common.dto;


import com.salted.fish.common.entity.PageInfo;
import lombok.Data;

import java.util.Date;

/**
 * 视频表 fish_video
 *
 * @author shop
 * @date 2019-04-19
 */
@Data
public class FishVideoDTO extends PageInfo {

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 视频编码
     */
    private String videoCode;
    /**
     * 视频标题
     */
    private String videoTitle;
    /**
     * 视频图片地址
     */
    private String videoLogoUrl;
    /**
     * 栏目code
     */
    private String columnCode;
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
     * 视频总时长
     */
    private String videoTotalTime;
    /**
     * 难度编码
     */
    private String videoDifficultyCode;
    /**
     * 难度名称
     */
    private String videoDifficultyName;
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
}
