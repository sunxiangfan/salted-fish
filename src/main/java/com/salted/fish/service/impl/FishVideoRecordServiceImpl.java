package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishVideoRecord;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishVideoRecordMapper;
import com.salted.fish.service.IFishVideoRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 视频明细 服务层实现
 *
 * @author shop
 * @date 2019-04-19
 */
@Service
public class FishVideoRecordServiceImpl implements IFishVideoRecordService {

    @Autowired
    private FishVideoRecordMapper fishVideoRecordMapper;

    /**
     * 查询视频明细信息
     *
     * @param id 视频明细ID
     * @return 视频明细信息
     */
    @Override
    public FishVideoRecord selectFishVideoRecordById(Integer id) {
        return fishVideoRecordMapper.selectFishVideoRecordById(id);
    }

    /**
     * 查询视频明细列表
     *
     * @param fishVideoRecord 视频明细信息
     * @return 视频明细集合
     */
    @Override
    public List<FishVideoRecord> selectFishVideoRecordList(FishVideoRecord fishVideoRecord) {
        return fishVideoRecordMapper.selectFishVideoRecordList(fishVideoRecord);
    }

    /**
     * 新增视频明细
     *
     * @param fishVideoRecord 视频明细信息
     * @return 结果
     */
    @Override
    public int insertFishVideoRecord(FishVideoRecord fishVideoRecord) {
        return fishVideoRecordMapper.insertFishVideoRecord(fishVideoRecord);
    }

    /**
     * 修改视频明细
     *
     * @param fishVideoRecord 视频明细信息
     * @return 结果
     */
    @Override
    public int updateFishVideoRecord(FishVideoRecord fishVideoRecord) {
        return fishVideoRecordMapper.updateFishVideoRecord(fishVideoRecord);
    }

    /**
     * 删除视频明细对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishVideoRecordByIds(String ids) {
        return fishVideoRecordMapper.deleteFishVideoRecordByIds(Convert.toStrArray(ids));
    }

}
