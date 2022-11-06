package com.wang.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.entity.User;
import com.wang.entity.vo.UserQuery;
import com.wang.service.IEduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wzzmm
 * @since 2022/11/5 16:25
 */
@RestController
@RequestMapping("/eduTeacher")
@Api(value = "讲师管理")
public class EduTeacherController {

    @Autowired
    private IEduTeacherService eduTeacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public List<User> findAllTeacher(@ApiParam(value = "讲师名字") String name) {
        return null;
    }

    @ApiOperation(value = "分页查询")
    @GetMapping("pageTeacher/{current}/{limit}")
    public List<User> pageListTeacher(@PathVariable long current, @PathVariable long limit) {
        Page<User> user = new Page<>(current, limit);
        IPage<User> page = eduTeacherService.page(user, null);
        long total = page.getTotal();
        return page.getRecords();
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("pageTeacher/{current}/{limit}")
    public List<User> pageListTeacher(@PathVariable long current,
                                      @PathVariable long limit,
                                      @RequestBody(required = false) UserQuery userQuery) {
        Page<User> userPage = new Page<>(current, limit);
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        if (!StringUtils.isEmpty(userQuery.getName())){
            //表中的字段名
            wrapper.like(User::getName,userQuery.getName());
            wrapper.eq(User::getAge,userQuery.getAge());
            //大于
            wrapper.ge(User::getCreateTime,userQuery.getCreateTime());
            //小于
            wrapper.ge(User::getCreateTime,userQuery.getCreateTime());
        }
        IPage<User> page = eduTeacherService.page(userPage, wrapper);
        long total = page.getTotal();
        return page.getRecords();
    }
}
