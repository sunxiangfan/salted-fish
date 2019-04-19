package com.salted.fish.controller;

import com.salted.fish.service.IFishVideoChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 章节 信息操作处理
 *
 * @author shop
 * @date 2019-04-19
 */
@RestController
@RequestMapping("/system/fishVideoChapter")
public class FishVideoChapterController {


    @Autowired
    private IFishVideoChapterService fishVideoChapterService;


}
