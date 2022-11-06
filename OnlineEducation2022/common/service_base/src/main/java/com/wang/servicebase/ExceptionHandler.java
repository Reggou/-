package com.wang.servicebase;

import com.wang.servicebase.support.BaseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author wzzmm
 * @since 2022/11/6 21:03
 */
@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResult error(Exception e){
        return BaseResult.exception(e);
    }
}
