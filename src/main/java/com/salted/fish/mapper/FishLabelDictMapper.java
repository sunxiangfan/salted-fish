package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishLabelDict;

import java.util.List;

/**
 * 标签字典 数据层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface FishLabelDictMapper {
    /**
     * 查询标签字典信息
     *
     * @param id 标签字典ID
     * @return 标签字典信息
     */
    public FishLabelDict selectFishLabelDictById(Integer id);

    /**
     * 查询标签字典列表
     *
     * @param fishLabelDict 标签字典信息
     * @return 标签字典集合
     */
    public List<FishLabelDict> selectFishLabelDictList(FishLabelDict fishLabelDict);

    /**
     * 新增标签字典
     *
     * @param fishLabelDict 标签字典信息
     * @return 结果
     */
    public int insertFishLabelDict(FishLabelDict fishLabelDict);

    /**
     * 修改标签字典
     *
     * @param fishLabelDict 标签字典信息
     * @return 结果
     */
    public int updateFishLabelDict(FishLabelDict fishLabelDict);

    /**
     * 删除标签字典
     *
     * @param id 标签字典ID
     * @return 结果
     */
    public int deleteFishLabelDictById(Integer id);

    /**
     * 批量删除标签字典
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishLabelDictByIds(String[] ids);

}