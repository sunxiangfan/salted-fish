package com.salted.fish.service;

import com.salted.fish.common.entity.FishBrowseRecord;

import java.util.List;

/**
 * 浏览记录 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishBrowseRecordService {
    /**
     * 查询浏览记录信息
     *
     * @param id 浏览记录ID
     * @return 浏览记录信息
     */
    public FishBrowseRecord selectFishBrowseRecordById(Integer id);

    /**
     * 查询浏览记录列表
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 浏览记录集合
     */
    public List<FishBrowseRecord> selectFishBrowseRecordList(FishBrowseRecord fishBrowseRecord);

    /**
     * 新增浏览记录
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 结果
     */
    public int insertFishBrowseRecord(FishBrowseRecord fishBrowseRecord);

    /**
     * 修改浏览记录
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 结果
     */
    public int updateFishBrowseRecord(FishBrowseRecord fishBrowseRecord);

    /**
     * 删除浏览记录信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishBrowseRecordByIds(String ids);

}
