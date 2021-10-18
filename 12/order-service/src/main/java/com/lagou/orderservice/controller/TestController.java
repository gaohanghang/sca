package com.lagou.orderservice.controller;

import com.lagou.orderservice.config.CustomConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private CustomConfig customConfig;

    @GetMapping("/test")
    public String test(){
        return "flag:" + customConfig.getFlag() + "<br/> database:" + customConfig.getDatabase();
    }
}
