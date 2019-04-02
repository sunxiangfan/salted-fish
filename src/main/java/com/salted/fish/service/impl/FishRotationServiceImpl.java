package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishRotation;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishRotationMapper;
import com.salted.fish.service.IFishRotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播图配置 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishRotationServiceImpl implements IFishRotationService {
    @Autowired
    private FishRotationMapper fishRotationMapper;

    /**
     * 查询轮播图配置信息
     *
     * @param id 轮播图配置ID
     * @return 轮播图配置信息
     */
    @Override
    public FishRotation selectFishRotationById(Integer id) {
        return fishRotationMapper.selectFishRotationById(id);
    }

    /**
     * 查询轮播图配置列表
     *
     * @param fishRotation 轮播图配置信息
     * @return 轮播图配置集合
     */
    @Override
    public List<FishRotation> selectFishRotationList(FishRotation fishRotation) {
        return fishRotationMapper.selectFishRotationList(fishRotation);
    }

    /**
     * 新增轮播图配置
     *
     * @param fishRotation 轮播图配置信息
     * @return 结果
     */
    @Override
    public int insertFishRotation(FishRotation fishRotation) {
        return fishRotationMapper.insertFishRotation(fishRotation);
    }

    /**
     * 修改轮播图配置
     *
     * @param fishRotation 轮播图配置信息
     * @return 结果
     */
    @Override
    public int updateFishRotation(FishRotation fishRotation) {
        return fishRotationMapper.updateFishRotation(fishRotation);
    }

    /**
     * 删除轮播图配置对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishRotationByIds(String ids) {
        return fishRotationMapper.deleteFishRotationByIds(Convert.toStrArray(ids));
    }

}
