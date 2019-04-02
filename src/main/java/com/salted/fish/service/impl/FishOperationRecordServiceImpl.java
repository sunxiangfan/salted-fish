package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishOperationRecord;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishOperationRecordMapper;
import com.salted.fish.service.IFishOperationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作记录 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishOperationRecordServiceImpl implements IFishOperationRecordService {
    @Autowired
    private FishOperationRecordMapper fishOperationRecordMapper;

    /**
     * 查询操作记录信息
     *
     * @param id 操作记录ID
     * @return 操作记录信息
     */
    @Override
    public FishOperationRecord selectFishOperationRecordById(Integer id) {
        return fishOperationRecordMapper.selectFishOperationRecordById(id);
    }

    /**
     * 查询操作记录列表
     *
     * @param fishOperationRecord 操作记录信息
     * @return 操作记录集合
     */
    @Override
    public List<FishOperationRecord> selectFishOperationRecordList(FishOperationRecord fishOperationRecord) {
        return fishOperationRecordMapper.selectFishOperationRecordList(fishOperationRecord);
    }

    /**
     * 新增操作记录
     *
     * @param fishOperationRecord 操作记录信息
     * @return 结果
     */
    @Override
    public int insertFishOperationRecord(FishOperationRecord fishOperationRecord) {
        return fishOperationRecordMapper.insertFishOperationRecord(fishOperationRecord);
    }

    /**
     * 修改操作记录
     *
     * @param fishOperationRecord 操作记录信息
     * @return 结果
     */
    @Override
    public int updateFishOperationRecord(FishOperationRecord fishOperationRecord) {
        return fishOperationRecordMapper.updateFishOperationRecord(fishOperationRecord);
    }

    /**
     * 删除操作记录对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishOperationRecordByIds(String ids) {
        return fishOperationRecordMapper.deleteFishOperationRecordByIds(Convert.toStrArray(ids));
    }

}
