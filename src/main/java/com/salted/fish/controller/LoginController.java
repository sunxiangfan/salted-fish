package com.salted.fish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);


}