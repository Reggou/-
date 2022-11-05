package com.wang.controller;

import com.wang.service.IEduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzzmm
 * @since 2022/11/5 16:25
 */
@RestController
public class EduTeacherController {

    @Autowired
    private IEduTeacherService eduTeacherService;
}
