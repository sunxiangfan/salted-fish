package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishVideoChapter;

import java.util.List;

/**
 * 章节 数据层
 *
 * @author shop
 * @date 2019-04-19
 */
public interface FishVideoChapterMapper {
    /**
     * 查询章节信息
     *
     * @param id 章节ID
     * @return 章节信息
     */
    public FishVideoChapter selectFishVideoChapterById(Integer id);

    /**
     * 查询章节列表
     *
     * @param fishVideoChapter 章节信息
     * @return 章节集合
     */
    public List<FishVideoChapter> selectFishVideoChapterList(FishVideoChapter fishVideoChapter);

    /**
     * 新增章节
     *
     * @param fishVideoChapter 章节信息
     * @return 结果
     */
    public int insertFishVideoChapter(FishVideoChapter fishVideoChapter);

    /**
     * 修改章节
     *
     * @param fishVideoChapter 章节信息
     * @return 结果
     */
    public int updateFishVideoChapter(FishVideoChapter fishVideoChapter);

    /**
     * 删除章节
     *
     * @param id 章节ID
     * @return 结果
     */
    public int deleteFishVideoChapterById(Integer id);

    /**
     * 批量删除章节
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishVideoChapterByIds(String[] ids);

}