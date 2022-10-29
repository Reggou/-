package com.wang;

import com.wang.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wzzmm
 * @since 2022/10/24 22:56
 */

public class MainTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFind(){
        userMapper.selectList(null);
    }
}
