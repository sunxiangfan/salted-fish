package com.salted.fish.controller;

import com.salted.fish.service.IFishCommentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishCommentRecordController {


    @Autowired
    private IFishCommentRecordService fishCommentRecordService;

}
