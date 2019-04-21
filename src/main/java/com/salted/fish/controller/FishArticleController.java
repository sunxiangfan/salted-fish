package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.salted.fish.common.dto.FishArticleDTO;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishArticle;
import com.salted.fish.service.IFishArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 文章 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
@RequestMapping("web")
public class FishArticleController {

    Logger log = LoggerFactory.getLogger(FishArticleController.class);

    @Autowired
    private IFishArticleService fishArticleService;

    @CrossOrigin
    @PostMapping("selectFishArticleList")
    public ResultDTO selectFishArticleList(@RequestBody FishArticleDTO dto) {
        log.info("selectFishArticleList：" + JSON.toJSONString(dto));
        try {
            PageInfo<FishArticle> pageInfo = fishArticleService.selectFishArticleList(dto);
            return ResultDTO.success(pageInfo);
        } catch (Exception e) {
            log.error("selectFishArticleList error", e);
            return ResultDTO.fail();
        }
    }
}
