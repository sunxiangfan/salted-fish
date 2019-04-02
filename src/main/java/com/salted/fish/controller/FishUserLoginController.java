package com.salted.fish.controller;

import com.salted.fish.service.IFishUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录 信息操作处理
 * 
 * @author shop
 * @date 2019-04-02
 */
@RefreshScope
@RestController
public class FishUserLoginController
{

	
	@Autowired
	private IFishUserLoginService fishUserLoginService;

}
