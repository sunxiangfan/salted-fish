package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishDifficultyDict;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishDifficultyDictMapper;
import com.salted.fish.service.IFishDifficultyDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 难度字典 服务层实现
 *
 * @author shop
 * @date 2019-04-19
 */
@Service
public class FishDifficultyDictServiceImpl implements IFishDifficultyDictService {

    @Autowired
    private FishDifficultyDictMapper fishDifficultyDictMapper;

    /**
     * 查询难度字典信息
     *
     * @param id 难度字典ID
     * @return 难度字典信息
     */
    @Override
    public FishDifficultyDict selectFishDifficultyDictById(Integer id) {
        return fishDifficultyDictMapper.selectFishDifficultyDictById(id);
    }

    /**
     * 查询难度字典列表
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 难度字典集合
     */
    @Override
    public List<FishDifficultyDict> selectFishDifficultyDictList(FishDifficultyDict fishDifficultyDict) {
        return fishDifficultyDictMapper.selectFishDifficultyDictList(fishDifficultyDict);
    }

    /**
     * 新增难度字典
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 结果
     */
    @Override
    public int insertFishDifficultyDict(FishDifficultyDict fishDifficultyDict) {
        return fishDifficultyDictMapper.insertFishDifficultyDict(fishDifficultyDict);
    }

    /**
     * 修改难度字典
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 结果
     */
    @Override
    public int updateFishDifficultyDict(FishDifficultyDict fishDifficultyDict) {
        return fishDifficultyDictMapper.updateFishDifficultyDict(fishDifficultyDict);
    }

    /**
     * 删除难度字典对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishDifficultyDictByIds(String ids) {
        return fishDifficultyDictMapper.deleteFishDifficultyDictByIds(Convert.toStrArray(ids));
    }

}
