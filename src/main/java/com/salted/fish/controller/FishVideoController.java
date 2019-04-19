package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishVideo;
import com.salted.fish.service.IFishVideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 视频 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("web")
public class FishVideoController {

    Logger log = LoggerFactory.getLogger(FishVideoController.class);

    @Autowired
    private IFishVideoService fishVideoService;

    @CrossOrigin
    @PostMapping("selectFishVideoList")
    public ResultDTO selectFishVideoList(@RequestBody FishVideo fishVideo) {
        log.info("selectFishVideoList：" + JSON.toJSONString(fishVideo));
        try {
            PageHelper.startPage(fishVideo.getPageNum(), fishVideo.getPageSize());
            List<FishVideo> fishArticleList = fishVideoService.selectFishVideoList(fishVideo);
            PageInfo<FishVideo> pageInfo = new PageInfo<FishVideo>(fishArticleList);
            return ResultDTO.success(pageInfo);
        } catch (Exception e) {
            log.error("selectFishVideoList error", e);
            return ResultDTO.fail();
        }
    }

}
