package com.salted.fish.controller;

import com.salted.fish.service.IFishLabelDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 标签字典 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishLabelDictController {


    @Autowired
    private IFishLabelDictService fishLabelDictService;

}
