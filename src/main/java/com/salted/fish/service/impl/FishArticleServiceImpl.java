package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.common.entity.FishColumnDict;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishArticleMapper;
import com.salted.fish.mapper.FishBrowseRecordMapper;
import com.salted.fish.mapper.FishColumnDictMapper;
import com.salted.fish.service.IFishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishArticleServiceImpl implements IFishArticleService {

    @Autowired
    private FishArticleMapper fishArticleMapper;
    @Autowired
    private FishBrowseRecordMapper fishBrowseRecordMapper;
    @Autowired
    private FishColumnDictMapper fishColumnDictMapper;

    /**
     * 查询文章信息
     *
     * @param id 文章ID
     * @return 文章信息
     */
    @Override
    public FishArticle selectFishArticleById(Integer id) {
        return fishArticleMapper.selectFishArticleById(id);
    }

    /**
     * 查询文章列表
     *
     * @param fishArticle 文章信息
     * @return 文章集合
     */
    @Override
    public List<FishArticle> selectFishArticleList(FishArticle fishArticle) {
        List<FishArticle> fishArticleList = fishArticleMapper.selectFishArticleList(fishArticle);
        for (int i = 0; i < fishArticleList.size(); i++) {
            Integer readNum = fishBrowseRecordMapper.selectReadByBusinessCode(fishArticleList.get(i).getArticleCode());
            Integer clickNum = fishBrowseRecordMapper.selectClickByBusinessCode(fishArticleList.get(i).getArticleCode());
            FishColumnDict fishColumnDict = new FishColumnDict();
            fishColumnDict.setColumnCode(fishArticleList.get(i).getColumnCode());
            List<FishColumnDict> fishColumnDictList = fishColumnDictMapper.selectFishColumnDictList(fishColumnDict);
            if (null != fishColumnDictList && fishColumnDictList.size() > 0) {
                fishArticleList.get(i).setColumnName(fishColumnDictList.get(0).getColumnName());
            }
            fishArticleList.get(i).setReadNum(readNum);
            fishArticleList.get(i).setClickNum(clickNum);
        }
        return fishArticleList;
    }

    /**
     * 新增文章
     *
     * @param fishArticle 文章信息
     * @return 结果
     */
    @Override
    public int insertFishArticle(FishArticle fishArticle) {
        return fishArticleMapper.insertFishArticle(fishArticle);
    }

    /**
     * 修改文章
     *
     * @param fishArticle 文章信息
     * @return 结果
     */
    @Override
    public int updateFishArticle(FishArticle fishArticle) {
        return fishArticleMapper.updateFishArticle(fishArticle);
    }

    /**
     * 删除文章对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishArticleByIds(String ids) {
        return fishArticleMapper.deleteFishArticleByIds(Convert.toStrArray(ids));
    }

}
