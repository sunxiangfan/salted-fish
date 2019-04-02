package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishCommentRecord;

import java.util.List;

/**
 * 评论 数据层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface FishCommentRecordMapper {
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
     * 删除评论
     *
     * @param id 评论ID
     * @return 结果
     */
    public int deleteFishCommentRecordById(Integer id);

    /**
     * 批量删除评论
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishCommentRecordByIds(String[] ids);

}