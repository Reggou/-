package com.wang.entity;

import lombok.Data;

/**
 * @author wzzmm
 * @since 2022/10/24 22:36
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}