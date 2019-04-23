package com.salted.fish.controller;

import com.alibaba.fastjson.JSON;
import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishVideoRecord;
import com.salted.fish.service.IFishVideoRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 视频明细 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("web")
public class FishVideoRecordController {

    Logger log = LoggerFactory.getLogger(FishVideoChapterController.class);

    @Autowired
    private IFishVideoRecordService fishVideoRecordService;

    @CrossOrigin
    @PostMapping("selectFishRecordList")
    public ResultDTO selectFishRecordList(@RequestBody FishVideoRecord dto) {
        log.info("selectFishRecordList：" + JSON.toJSONString(dto));
        try {
            List<FishVideoRecord> fishVideoRecordList = fishVideoRecordService.selectFishVideoRecordList(dto);
            return ResultDTO.success(fishVideoRecordList);
        } catch (Exception e) {
            log.error("selectFishRecordList error", e);
            return ResultDTO.fail();
        }
    }

}
