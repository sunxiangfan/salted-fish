package com.salted.fish.service;

import com.salted.fish.common.entity.FishCommentRecord;

import java.util.List;

/**
 * 评论 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishCommentRecordService {
    /**
     * 查询评论信息
     *
     * @param id 评论ID
     * @return 评论信息
     */
    public FishCommentRecord selectFishCommentRecordById(Integer id);

    /**
     * 查询评论列表
     *
     * @param fishCommentRecord 评论信息
     * @return 评论集合
     */
    public List<FishCommentRecord> selectFishCommentRecordList(FishCommentRecord fishCommentRecord);

    /**
     * 新增评论
     *
     * @param fishCommentRecord 评论信息
     * @return 结果
     */
    public int insertFishCommentRecord(FishCommentRecord fishCommentRecord);

    /**
     * 修改评论
     *
     * @param fishCommentRecord 评论信息
     * @return 结果
     */
    public int updateFishCommentRecord(FishCommentRecord fishCommentRecord);

    /**
     * 删除评论信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishCommentRecordByIds(String ids);

}
