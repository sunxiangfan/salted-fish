package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishColumnDict;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishColumnDictMapper;
import com.salted.fish.service.IFishColumnDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 栏目字典 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishColumnDictServiceImpl implements IFishColumnDictService {
    @Autowired
    private FishColumnDictMapper fishColumnDictMapper;

    /**
     * 查询栏目字典信息
     *
     * @param id 栏目字典ID
     * @return 栏目字典信息
     */
    @Override
    public FishColumnDict selectFishColumnDictById(Integer id) {
        return fishColumnDictMapper.selectFishColumnDictById(id);
    }

    /**
     * 查询栏目字典列表
     *
     * @param fishColumnDict 栏目字典信息
     * @return 栏目字典集合
     */
    @Override
    public List<FishColumnDict> selectFishColumnDictList(FishColumnDict fishColumnDict) {
        return fishColumnDictMapper.selectFishColumnDictList(fishColumnDict);
    }

    /**
     * 新增栏目字典
     *
     * @param fishColumnDict 栏目字典信息
     * @return 结果
     */
    @Override
    public int insertFishColumnDict(FishColumnDict fishColumnDict) {
        return fishColumnDictMapper.insertFishColumnDict(fishColumnDict);
    }

    /**
     * 修改栏目字典
     *
     * @param fishColumnDict 栏目字典信息
     * @return 结果
     */
    @Override
    public int updateFishColumnDict(FishColumnDict fishColumnDict) {
        return fishColumnDictMapper.updateFishColumnDict(fishColumnDict);
    }

    /**
     * 删除栏目字典对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishColumnDictByIds(String ids) {
        return fishColumnDictMapper.deleteFishColumnDictByIds(Convert.toStrArray(ids));
    }

}
