package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishCommentRecord;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishCommentRecordMapper;
import com.salted.fish.service.IFishCommentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishCommentRecordServiceImpl implements IFishCommentRecordService {
    @Autowired
    private FishCommentRecordMapper fishCommentRecordMapper;

    /**
     * 查询评论信息
     *
     * @param id 评论ID
     * @return 评论信息
     */
    @Override
    public FishCommentRecord selectFishCommentRecordById(Integer id) {
        return fishCommentRecordMapper.selectFishCommentRecordById(id);
    }

    /**
     * 查询评论列表
     *
     * @param fishCommentRecord 评论信息
     * @return 评论集合
     */
    @Override
    public List<FishCommentRecord> selectFishCommentRecordList(FishCommentRecord fishCommentRecord) {
        return fishCommentRecordMapper.selectFishCommentRecordList(fishCommentRecord);
    }

    /**
     * 新增评论
     *
     * @param fishCommentRecord 评论信息
     * @return 结果
     */
    @Override
    public int insertFishCommentRecord(FishCommentRecord fishCommentRecord) {
        return fishCommentRecordMapper.insertFishCommentRecord(fishCommentRecord);
    }

    /**
     * 修改评论
     *
     * @param fishCommentRecord 评论信息
     * @return 结果
     */
    @Override
    public int updateFishCommentRecord(FishCommentRecord fishCommentRecord) {
        return fishCommentRecordMapper.updateFishCommentRecord(fishCommentRecord);
    }

    /**
     * 删除评论对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishCommentRecordByIds(String ids) {
        return fishCommentRecordMapper.deleteFishCommentRecordByIds(Convert.toStrArray(ids));
    }

}
