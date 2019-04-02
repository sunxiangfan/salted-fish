package com.salted.fish.controller;

import com.salted.fish.service.IFishFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 关注/粉丝 信息操作处理
 *
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishFollowController {

    @Autowired
    private IFishFollowService fishFollowService;

}
