package com.wang.controller;

import com.wang.entity.User;
import com.wang.service.IEduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wzzmm
 * @since 2022/11/5 16:25
 */
@RestController
@Api(value = "讲师管理")
public class EduTeacherController {

    @Autowired
    private IEduTeacherService eduTeacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping
    public List<User> findAllTeacher(@ApiParam(value = "讲师名字")String name){
        return null;
    }
}
