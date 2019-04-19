package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.service.IFishArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger log = LoggerFactory.getLogger(FishArticleController.class);

    @Autowired
    private IFishArticleService fishArticleService;

    @CrossOrigin
    @PostMapping("selectFishArticleList")
    public ResultDTO selectFishArticleList(@RequestBody FishArticle fishArticle) {
        log.info("selectFishArticleList：" + JSON.toJSONString(fishArticle));
        try {
            PageHelper.startPage(fishArticle.getPageNum(), fishArticle.getPageSize());
            List<FishArticle> fishArticleList = fishArticleService.selectFishArticleList(fishArticle);
            PageInfo<FishArticle> pageInfo = new PageInfo<FishArticle>(fishArticleList);
            return ResultDTO.success(pageInfo);
        } catch (Exception e) {
            log.error("selectFishArticleList error", e);
            return ResultDTO.fail();
        }
    }
}
