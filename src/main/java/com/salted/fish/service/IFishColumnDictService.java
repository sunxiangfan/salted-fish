package com.salted.fish.service;

import com.salted.fish.common.entity.FishColumnDict;

import java.util.List;

/**
 * 栏目字典 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishColumnDictService {
    /**
     * 查询栏目字典信息
     *
     * @param id 栏目字典ID
     * @return 栏目字典信息
     */
    public FishColumnDict selectFishColumnDictById(Integer id);

    /**
     * 查询栏目字典列表
     *
     * @param fishColumnDict 栏目字典信息
     * @return 栏目字典集合
     */
    public List<FishColumnDict> selectFishColumnDictList(FishColumnDict fishColumnDict);

    /**
     * 新增栏目字典
     *
     * @param fishColumnDict 栏目字典信息
     * @return 结果
     */
    public int insertFishColumnDict(FishColumnDict fishColumnDict);

    /**
     * 修改栏目字典
     *
     * @param fishColumnDict 栏目字典信息
     * @return 结果
     */
    public int updateFishColumnDict(FishColumnDict fishColumnDict);

    /**
     * 删除栏目字典信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishColumnDictByIds(String ids);

}
