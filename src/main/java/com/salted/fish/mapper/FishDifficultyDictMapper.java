package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishDifficultyDict;

import java.util.List;

/**
 * 难度字典 数据层
 *
 * @author shop
 * @date 2019-04-19
 */
public interface FishDifficultyDictMapper {
    /**
     * 查询难度字典信息
     *
     * @param id 难度字典ID
     * @return 难度字典信息
     */
    public FishDifficultyDict selectFishDifficultyDictById(Integer id);

    /**
     * 查询难度字典列表
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 难度字典集合
     */
    public List<FishDifficultyDict> selectFishDifficultyDictList(FishDifficultyDict fishDifficultyDict);

    /**
     * 新增难度字典
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 结果
     */
    public int insertFishDifficultyDict(FishDifficultyDict fishDifficultyDict);

    /**
     * 修改难度字典
     *
     * @param fishDifficultyDict 难度字典信息
     * @return 结果
     */
    public int updateFishDifficultyDict(FishDifficultyDict fishDifficultyDict);

    /**
     * 删除难度字典
     *
     * @param id 难度字典ID
     * @return 结果
     */
    public int deleteFishDifficultyDictById(Integer id);

    /**
     * 批量删除难度字典
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishDifficultyDictByIds(String[] ids);

}