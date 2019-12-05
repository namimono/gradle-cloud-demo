package com.nakami.gradle.springcloud.provider.dao;

import com.nakami.gradle.springcloud.provider.api.model.BackUser;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by wuxiao on 2019/11/30 10:11.
 */
@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<BackUser> {
    BackUser getUserByName();
}
