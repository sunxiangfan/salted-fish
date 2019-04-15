package com.salted.fish.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.service.IFishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文章 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishArticleController {

    @Autowired
    private IFishArticleService fishArticleService;

    @CrossOrigin
    @PostMapping("selectFishArticleList")
    public ResultDTO selectFishArticleList() {
        PageHelper.startPage(0, 10);

        List<FishArticle> fishArticleList = fishArticleService.selectFishArticleList(new FishArticle());

        PageInfo<FishArticle> pageInfo = new PageInfo<FishArticle>(fishArticleList);

        return ResultDTO.success(pageInfo);
    }
}
