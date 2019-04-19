package com.salted.fish.controller;

import com.salted.fish.service.IFishVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 视频 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("/system/fishVideo")
public class FishVideoController {

    @Autowired
    private IFishVideoService fishVideoService;

}
