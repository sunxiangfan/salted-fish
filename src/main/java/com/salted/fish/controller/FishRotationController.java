package com.salted.fish.controller;

import com.salted.fish.common.dto.ResultDTO;
import com.salted.fish.common.entity.FishRotation;
import com.salted.fish.service.IFishRotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 轮播图配置 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
@RequestMapping("web")
public class FishRotationController {

    Logger log = LoggerFactory.getLogger(FishRotationController.class);

    @Autowired
    private IFishRotationService fishRotationService;

    @CrossOrigin
    @PostMapping("selectFishRotationList")
    public ResultDTO selectFishRotationList() {
        log.info("selectFishRotationList");
        try {
            FishRotation fishRotation = new FishRotation();
            fishRotation.setIsRelease("1");
            List<FishRotation> fishRotations = fishRotationService.selectFishRotationList(fishRotation);
            return ResultDTO.success(fishRotations);
        } catch (Exception e) {
            log.error("selectFishRotationList error", e);
            return ResultDTO.fail();
        }
    }
}
