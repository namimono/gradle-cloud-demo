package com.nakami.gradle.springcloud.service.impl;

import com.nakami.gradle.springcloud.dao.UserDao;
import com.nakami.gradle.springcloud.model.BackUser;
import com.nakami.gradle.springcloud.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wuxiao on 2019/12/4 19:09.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<BackUser> getAllUser() {
        return userDao.selectAll();
    }
}
