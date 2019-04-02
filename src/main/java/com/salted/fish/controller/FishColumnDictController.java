package com.salted.fish.controller;

import com.salted.fish.service.IFishColumnDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 栏目字典 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishColumnDictController {

    @Autowired
    private IFishColumnDictService fishColumnDictService;

}
