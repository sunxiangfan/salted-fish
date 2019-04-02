package com.salted.fish.service;

import com.salted.fish.common.entity.FishOperationRecord;

import java.util.List;

/**
 * 操作记录 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishOperationRecordService {
    /**
     * 查询操作记录信息
     *
     * @param id 操作记录ID
     * @return 操作记录信息
     */
    public FishOperationRecord selectFishOperationRecordById(Integer id);

    /**
     * 查询操作记录列表
     *
     * @param fishOperationRecord 操作记录信息
     * @return 操作记录集合
     */
    public List<FishOperationRecord> selectFishOperationRecordList(FishOperationRecord fishOperationRecord);

    /**
     * 新增操作记录
     *
     * @param fishOperationRecord 操作记录信息
     * @return 结果
     */
    public int insertFishOperationRecord(FishOperationRecord fishOperationRecord);

    /**
     * 修改操作记录
     *
     * @param fishOperationRecord 操作记录信息
     * @return 结果
     */
    public int updateFishOperationRecord(FishOperationRecord fishOperationRecord);

    /**
     * 删除操作记录信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishOperationRecordByIds(String ids);

}
