package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishSupportRecord;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishSupportRecordMapper;
import com.salted.fish.service.IFishSupportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 点赞记录 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishSupportRecordServiceImpl implements IFishSupportRecordService {
    @Autowired
    private FishSupportRecordMapper fishSupportRecordMapper;

    /**
     * 查询点赞记录信息
     *
     * @param id 点赞记录ID
     * @return 点赞记录信息
     */
    @Override
    public FishSupportRecord selectFishSupportRecordById(Integer id) {
        return fishSupportRecordMapper.selectFishSupportRecordById(id);
    }

    /**
     * 查询点赞记录列表
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 点赞记录集合
     */
    @Override
    public List<FishSupportRecord> selectFishSupportRecordList(FishSupportRecord fishSupportRecord) {
        return fishSupportRecordMapper.selectFishSupportRecordList(fishSupportRecord);
    }

    /**
     * 新增点赞记录
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 结果
     */
    @Override
    public int insertFishSupportRecord(FishSupportRecord fishSupportRecord) {
        return fishSupportRecordMapper.insertFishSupportRecord(fishSupportRecord);
    }

    /**
     * 修改点赞记录
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 结果
     */
    @Override
    public int updateFishSupportRecord(FishSupportRecord fishSupportRecord) {
        return fishSupportRecordMapper.updateFishSupportRecord(fishSupportRecord);
    }

    /**
     * 删除点赞记录对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishSupportRecordByIds(String ids) {
        return fishSupportRecordMapper.deleteFishSupportRecordByIds(Convert.toStrArray(ids));
    }

}
