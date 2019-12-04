package com.nakami.gradle.springcloud.service.impl;

import com.nakami.gradle.springcloud.dao.UserDao;
import com.nakami.gradle.springcloud.service.MyEchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wuxiao on 2019/11/28 15:58.
 */
@Service(version = "1.0.0")
public class MyEchoServiceImpl implements MyEchoService {
    @Autowired
    UserDao userDao;
    @Override
    public String echo() {
        return "greeting";
    }
}
