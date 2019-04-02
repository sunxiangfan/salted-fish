package com.salted.fish.service;

import com.salted.fish.common.entity.FishArticleContent;

import java.util.List;

/**
 * 文章内容 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishArticleContentService {
    /**
     * 查询文章内容信息
     *
     * @param id 文章内容ID
     * @return 文章内容信息
     */
    public FishArticleContent selectFishArticleContentById(Integer id);

    /**
     * 查询文章内容列表
     *
     * @param fishArticleContent 文章内容信息
     * @return 文章内容集合
     */
    public List<FishArticleContent> selectFishArticleContentList(FishArticleContent fishArticleContent);

    /**
     * 新增文章内容
     *
     * @param fishArticleContent 文章内容信息
     * @return 结果
     */
    public int insertFishArticleContent(FishArticleContent fishArticleContent);

    /**
     * 修改文章内容
     *
     * @param fishArticleContent 文章内容信息
     * @return 结果
     */
    public int updateFishArticleContent(FishArticleContent fishArticleContent);

    /**
     * 删除文章内容信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishArticleContentByIds(String ids);

}
