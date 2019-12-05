package com.nakami.gradle.springcloud.provider.controller;

import com.nakami.gradle.springcloud.provider.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuxiao on 2019/12/4 19:24.
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("getAll")
    public String getAll(){
        return userService.getAllUser().toString();
    }
}
