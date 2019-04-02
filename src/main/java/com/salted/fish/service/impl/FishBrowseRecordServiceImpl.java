package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishBrowseRecord;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishBrowseRecordMapper;
import com.salted.fish.service.IFishBrowseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 浏览记录 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishBrowseRecordServiceImpl implements IFishBrowseRecordService {
    @Autowired
    private FishBrowseRecordMapper fishBrowseRecordMapper;

    /**
     * 查询浏览记录信息
     *
     * @param id 浏览记录ID
     * @return 浏览记录信息
     */
    @Override
    public FishBrowseRecord selectFishBrowseRecordById(Integer id) {
        return fishBrowseRecordMapper.selectFishBrowseRecordById(id);
    }

    /**
     * 查询浏览记录列表
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 浏览记录集合
     */
    @Override
    public List<FishBrowseRecord> selectFishBrowseRecordList(FishBrowseRecord fishBrowseRecord) {
        return fishBrowseRecordMapper.selectFishBrowseRecordList(fishBrowseRecord);
    }

    /**
     * 新增浏览记录
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 结果
     */
    @Override
    public int insertFishBrowseRecord(FishBrowseRecord fishBrowseRecord) {
        return fishBrowseRecordMapper.insertFishBrowseRecord(fishBrowseRecord);
    }

    /**
     * 修改浏览记录
     *
     * @param fishBrowseRecord 浏览记录信息
     * @return 结果
     */
    @Override
    public int updateFishBrowseRecord(FishBrowseRecord fishBrowseRecord) {
        return fishBrowseRecordMapper.updateFishBrowseRecord(fishBrowseRecord);
    }

    /**
     * 删除浏览记录对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishBrowseRecordByIds(String ids) {
        return fishBrowseRecordMapper.deleteFishBrowseRecordByIds(Convert.toStrArray(ids));
    }

}
