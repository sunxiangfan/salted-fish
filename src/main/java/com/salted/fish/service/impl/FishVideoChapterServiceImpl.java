package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishVideoChapter;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishVideoChapterMapper;
import com.salted.fish.service.IFishVideoChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 章节 服务层实现
 *
 * @author shop
 * @date 2019-04-19
 */
@Service
public class FishVideoChapterServiceImpl implements IFishVideoChapterService {

    @Autowired
    private FishVideoChapterMapper fishVideoChapterMapper;

    /**
     * 查询章节信息
     *
     * @param id 章节ID
     * @return 章节信息
     */
    @Override
    public FishVideoChapter selectFishVideoChapterById(Integer id) {
        return fishVideoChapterMapper.selectFishVideoChapterById(id);
    }

    /**
     * 查询章节列表
     *
     * @param fishVideoChapter 章节信息
     * @return 章节集合
     */
    @Override
    public List<FishVideoChapter> selectFishVideoChapterList(FishVideoChapter fishVideoChapter) {
        return fishVideoChapterMapper.selectFishVideoChapterList(fishVideoChapter);
    }

    /**
     * 新增章节
     *
     * @param fishVideoChapter 章节信息
     * @return 结果
     */
    @Override
    public int insertFishVideoChapter(FishVideoChapter fishVideoChapter) {
        return fishVideoChapterMapper.insertFishVideoChapter(fishVideoChapter);
    }

    /**
     * 修改章节
     *
     * @param fishVideoChapter 章节信息
     * @return 结果
     */
    @Override
    public int updateFishVideoChapter(FishVideoChapter fishVideoChapter) {
        return fishVideoChapterMapper.updateFishVideoChapter(fishVideoChapter);
    }

    /**
     * 删除章节对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishVideoChapterByIds(String ids) {
        return fishVideoChapterMapper.deleteFishVideoChapterByIds(Convert.toStrArray(ids));
    }

}
