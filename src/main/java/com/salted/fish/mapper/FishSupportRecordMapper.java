package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishSupportRecord;

import java.util.List;

/**
 * 点赞记录 数据层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface FishSupportRecordMapper {
    /**
     * 查询点赞记录信息
     *
     * @param id 点赞记录ID
     * @return 点赞记录信息
     */
    public FishSupportRecord selectFishSupportRecordById(Integer id);

    /**
     * 查询点赞记录列表
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 点赞记录集合
     */
    public List<FishSupportRecord> selectFishSupportRecordList(FishSupportRecord fishSupportRecord);

    /**
     * 新增点赞记录
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 结果
     */
    public int insertFishSupportRecord(FishSupportRecord fishSupportRecord);

    /**
     * 修改点赞记录
     *
     * @param fishSupportRecord 点赞记录信息
     * @return 结果
     */
    public int updateFishSupportRecord(FishSupportRecord fishSupportRecord);

    /**
     * 删除点赞记录
     *
     * @param id 点赞记录ID
     * @return 结果
     */
    public int deleteFishSupportRecordById(Integer id);

    /**
     * 批量删除点赞记录
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishSupportRecordByIds(String[] ids);

}