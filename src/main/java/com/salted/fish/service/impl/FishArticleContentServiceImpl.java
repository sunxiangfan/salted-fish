package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishArticleContent;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishArticleContentMapper;
import com.salted.fish.service.IFishArticleContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章内容 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishArticleContentServiceImpl implements IFishArticleContentService {
    @Autowired
    private FishArticleContentMapper fishArticleContentMapper;

    /**
     * 查询文章内容信息
     *
     * @param id 文章内容ID
     * @return 文章内容信息
     */
    @Override
    public FishArticleContent selectFishArticleContentById(Integer id) {
        return fishArticleContentMapper.selectFishArticleContentById(id);
    }

    /**
     * 查询文章内容列表
     *
     * @param fishArticleContent 文章内容信息
     * @return 文章内容集合
     */
    @Override
    public List<FishArticleContent> selectFishArticleContentList(FishArticleContent fishArticleContent) {
        return fishArticleContentMapper.selectFishArticleContentList(fishArticleContent);
    }

    /**
     * 新增文章内容
     *
     * @param fishArticleContent 文章内容信息
     * @return 结果
     */
    @Override
    public int insertFishArticleContent(FishArticleContent fishArticleContent) {
        return fishArticleContentMapper.insertFishArticleContent(fishArticleContent);
    }

    /**
     * 修改文章内容
     *
     * @param fishArticleContent 文章内容信息
     * @return 结果
     */
    @Override
    public int updateFishArticleContent(FishArticleContent fishArticleContent) {
        return fishArticleContentMapper.updateFishArticleContent(fishArticleContent);
    }

    /**
     * 删除文章内容对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishArticleContentByIds(String ids) {
        return fishArticleContentMapper.deleteFishArticleContentByIds(Convert.toStrArray(ids));
    }

}
