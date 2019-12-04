package com.nakami.gradle.springcloud.dao;

import com.nakami.gradle.springcloud.model.BackUser;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by wuxiao on 2019/11/30 10:11.
 */
public interface UserDao extends Mapper<BackUser> {
    BackUser getUserByName();
}
