package com.salted.fish.service;

import com.salted.fish.common.entity.FishArticle;

import java.util.List;

/**
 * 文章 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishArticleService {
    /**
     * 查询文章信息
     *
     * @param id 文章ID
     * @return 文章信息
     */
    public FishArticle selectFishArticleById(Integer id);

    /**
     * 查询文章列表
     *
     * @param fishArticle 文章信息
     * @return 文章集合
     */
    public List<FishArticle> selectFishArticleList(FishArticle fishArticle);

    /**
     * 新增文章
     *
     * @param fishArticle 文章信息
     * @return 结果
     */
    public int insertFishArticle(FishArticle fishArticle);

    /**
     * 修改文章
     *
     * @param fishArticle 文章信息
     * @return 结果
     */
    public int updateFishArticle(FishArticle fishArticle);

    /**
     * 删除文章信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishArticleByIds(String ids);

}
