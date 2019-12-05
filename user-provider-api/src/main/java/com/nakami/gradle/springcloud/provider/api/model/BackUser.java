package com.nakami.gradle.springcloud.provider.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wuxiao on 2019/11/30 10:10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackUser {
    private String id;
    private String name;
}
