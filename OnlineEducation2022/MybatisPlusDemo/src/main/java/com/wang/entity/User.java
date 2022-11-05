package com.wang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wzzmm
 * @since 2022/10/24 22:36
 */
@Data
@ApiModel(value = "User对象",description = "用户")
public class User {
    @ApiModelProperty(access = "id")
    private Long id;
    private String name;
    private Integer age;
    private String email;
}