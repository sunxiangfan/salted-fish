package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishLabelDict;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishLabelDictMapper;
import com.salted.fish.service.IFishLabelDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标签字典 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishLabelDictServiceImpl implements IFishLabelDictService {
    @Autowired
    private FishLabelDictMapper fishLabelDictMapper;

    /**
     * 查询标签字典信息
     *
     * @param id 标签字典ID
     * @return 标签字典信息
     */
    @Override
    public FishLabelDict selectFishLabelDictById(Integer id) {
        return fishLabelDictMapper.selectFishLabelDictById(id);
    }

    /**
     * 查询标签字典列表
     *
     * @param fishLabelDict 标签字典信息
     * @return 标签字典集合
     */
    @Override
    public List<FishLabelDict> selectFishLabelDictList(FishLabelDict fishLabelDict) {
        return fishLabelDictMapper.selectFishLabelDictList(fishLabelDict);
    }

    /**
     * 新增标签字典
     *
     * @param fishLabelDict 标签字典信息
     * @return 结果
     */
    @Override
    public int insertFishLabelDict(FishLabelDict fishLabelDict) {
        return fishLabelDictMapper.insertFishLabelDict(fishLabelDict);
    }

    /**
     * 修改标签字典
     *
     * @param fishLabelDict 标签字典信息
     * @return 结果
     */
    @Override
    public int updateFishLabelDict(FishLabelDict fishLabelDict) {
        return fishLabelDictMapper.updateFishLabelDict(fishLabelDict);
    }

    /**
     * 删除标签字典对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishLabelDictByIds(String ids) {
        return fishLabelDictMapper.deleteFishLabelDictByIds(Convert.toStrArray(ids));
    }

}
