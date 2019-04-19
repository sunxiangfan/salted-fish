package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishVideoRecord;

import java.util.List;

/**
 * 视频明细 数据层
 *
 * @author shop
 * @date 2019-04-19
 */
public interface FishVideoRecordMapper {
    /**
     * 查询视频明细信息
     *
     * @param id 视频明细ID
     * @return 视频明细信息
     */
    public FishVideoRecord selectFishVideoRecordById(Integer id);

    /**
     * 查询视频明细列表
     *
     * @param fishVideoRecord 视频明细信息
     * @return 视频明细集合
     */
    public List<FishVideoRecord> selectFishVideoRecordList(FishVideoRecord fishVideoRecord);

    /**
     * 新增视频明细
     *
     * @param fishVideoRecord 视频明细信息
     * @return 结果
     */
    public int insertFishVideoRecord(FishVideoRecord fishVideoRecord);

    /**
     * 修改视频明细
     *
     * @param fishVideoRecord 视频明细信息
     * @return 结果
     */
    public int updateFishVideoRecord(FishVideoRecord fishVideoRecord);

    /**
     * 删除视频明细
     *
     * @param id 视频明细ID
     * @return 结果
     */
    public int deleteFishVideoRecordById(Integer id);

    /**
     * 批量删除视频明细
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishVideoRecordByIds(String[] ids);

}