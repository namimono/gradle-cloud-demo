package com.nakami.gradle.springcloud.provider.controller;

import com.nakami.gradle.springcloud.provider.api.service.MyEchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuxiao on 2019/11/28 21:01.
 */
@RestController
@RequestMapping("/echo/")
public class EchoController {

    @Reference(version = "1.0.0")
    MyEchoService myEchoService;

    @GetMapping("get")
    public String get(){
        return myEchoService.echo();
    }
}
