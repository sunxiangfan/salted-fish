package com.salted.fish.controller;

import com.salted.fish.service.IFishDifficultyDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 难度字典 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("/system/fishDifficultyDict")
public class FishDifficultyDictController {


    @Autowired
    private IFishDifficultyDictService fishDifficultyDictService;

}
