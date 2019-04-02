package com.salted.fish.service;

import com.salted.fish.common.entity.FishRotation;

import java.util.List;

/**
 * 轮播图配置 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishRotationService {
    /**
     * 查询轮播图配置信息
     *
     * @param id 轮播图配置ID
     * @return 轮播图配置信息
     */
    public FishRotation selectFishRotationById(Integer id);

    /**
     * 查询轮播图配置列表
     *
     * @param fishRotation 轮播图配置信息
     * @return 轮播图配置集合
     */
    public List<FishRotation> selectFishRotationList(FishRotation fishRotation);

    /**
     * 新增轮播图配置
     *
     * @param fishRotation 轮播图配置信息
     * @return 结果
     */
    public int insertFishRotation(FishRotation fishRotation);

    /**
     * 修改轮播图配置
     *
     * @param fishRotation 轮播图配置信息
     * @return 结果
     */
    public int updateFishRotation(FishRotation fishRotation);

    /**
     * 删除轮播图配置信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishRotationByIds(String ids);

}
