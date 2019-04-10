package com.salted.fish.controller;

import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.service.IFishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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

    @PostMapping("selectFishArticleList")
    public ResultDTO selectFishArticleList(@RequestBody FishArticle fishArticle) {
        List<FishArticle> fishArticleList = fishArticleService.selectFishArticleList(fishArticle);
        return ResultDTO.success(fishArticleList);
    }
}
