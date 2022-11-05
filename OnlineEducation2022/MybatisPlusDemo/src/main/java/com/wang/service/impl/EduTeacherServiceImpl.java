package com.wang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.entity.User;
import com.wang.mapper.UserMapper;
import com.wang.service.IEduTeacherService;
import org.springframework.stereotype.Service;

/**
 * @author wzzmm
 * @since 2022/11/5 16:24
 */
@Service
public class EduTeacherServiceImpl extends ServiceImpl<UserMapper, User> implements IEduTeacherService {

}
