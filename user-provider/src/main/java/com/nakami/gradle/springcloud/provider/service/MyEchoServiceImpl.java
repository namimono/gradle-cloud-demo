package com.nakami.gradle.springcloud.provider.service;

import com.nakami.gradle.springcloud.provider.api.service.MyEchoService;
import com.nakami.gradle.springcloud.provider.dao.UserDao;
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
