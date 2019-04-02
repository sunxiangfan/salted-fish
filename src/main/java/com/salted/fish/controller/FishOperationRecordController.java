package com.salted.fish.controller;

import com.salted.fish.service.IFishOperationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 操作记录 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishOperationRecordController {

    @Autowired
    private IFishOperationRecordService fishOperationRecordService;

}
