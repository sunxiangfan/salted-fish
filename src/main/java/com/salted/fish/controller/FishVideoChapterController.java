package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishVideoChapter;
import com.salted.fish.service.IFishVideoChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 章节 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("web")
public class FishVideoChapterController {

    Logger log = LoggerFactory.getLogger(FishVideoChapterController.class);

    @Autowired
    private IFishVideoChapterService fishVideoChapterService;


    @CrossOrigin
    @PostMapping("selectFishChapterList")
    public ResultDTO selectFishChapterList(@RequestBody FishVideoChapter dto) {
        log.info("selectFishChapterList：" + JSON.toJSONString(dto));
        try {
            List<FishVideoChapter> fishVideoChapterList = fishVideoChapterService.selectFishVideoChapterList(dto);
            return ResultDTO.success(fishVideoChapterList);
        } catch (Exception e) {
            log.error("selectFishChapterList error", e);
            return ResultDTO.fail();
        }
    }
}
