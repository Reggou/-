package com.wang.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author wzzmm
 * @since 2022/11/6 19:23
 */
@Data
@ApiModel(value = "User对象", description = "用户")
public class UserQuery {
    @ApiModelProperty(access = "名称")
    private String name;
    private Integer age;
    private String email;
    private Date createTime;
}