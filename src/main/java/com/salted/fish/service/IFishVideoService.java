package com.salted.fish.service;

import com.github.pagehelper.PageInfo;
import com.salted.fish.common.dto.FishVideoDTO;
import com.salted.fish.common.entity.FishVideo;

import java.util.List;

/**
 * 视频 服务层
 *
 * @author shop
 * @date 2019-04-19
 */
public interface IFishVideoService {
    /**
     * 查询视频信息
     *
     * @param id 视频ID
     * @return 视频信息
     */
    public FishVideo selectFishVideoById(Integer id);

    /**
     * 查询视频列表
     *
     * @param fishVideo 视频信息
     * @return 视频集合
     */
    public PageInfo<FishVideo> selectFishVideoList(FishVideoDTO dto);

    /**
     * 新增视频
     *
     * @param fishVideo 视频信息
     * @return 结果
     */
    public int insertFishVideo(FishVideo fishVideo);

    /**
     * 修改视频
     *
     * @param fishVideo 视频信息
     * @return 结果
     */
    public int updateFishVideo(FishVideo fishVideo);

    /**
     * 删除视频信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishVideoByIds(String ids);

}
