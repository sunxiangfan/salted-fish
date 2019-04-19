package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishVideo;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishVideoMapper;
import com.salted.fish.service.IFishVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 视频 服务层实现
 *
 * @author shop
 * @date 2019-04-19
 */
@Service
public class FishVideoServiceImpl implements IFishVideoService {

    @Autowired
    private FishVideoMapper fishVideoMapper;

    /**
     * 查询视频信息
     *
     * @param id 视频ID
     * @return 视频信息
     */
    @Override
    public FishVideo selectFishVideoById(Integer id) {
        return fishVideoMapper.selectFishVideoById(id);
    }

    /**
     * 查询视频列表
     *
     * @param fishVideo 视频信息
     * @return 视频集合
     */
    @Override
    public List<FishVideo> selectFishVideoList(FishVideo fishVideo) {
        return fishVideoMapper.selectFishVideoList(fishVideo);
    }

    /**
     * 新增视频
     *
     * @param fishVideo 视频信息
     * @return 结果
     */
    @Override
    public int insertFishVideo(FishVideo fishVideo) {
        return fishVideoMapper.insertFishVideo(fishVideo);
    }

    /**
     * 修改视频
     *
     * @param fishVideo 视频信息
     * @return 结果
     */
    @Override
    public int updateFishVideo(FishVideo fishVideo) {
        return fishVideoMapper.updateFishVideo(fishVideo);
    }

    /**
     * 删除视频对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishVideoByIds(String ids) {
        return fishVideoMapper.deleteFishVideoByIds(Convert.toStrArray(ids));
    }

}
