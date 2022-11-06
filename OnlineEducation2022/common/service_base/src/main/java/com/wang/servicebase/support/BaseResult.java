package com.wang.servicebase.support;

import lombok.Data;

/**
 * @author wzzmm
 * @since 2022/11/6 18:23
 */
@Data
public class BaseResult {
    private String code;
    private String message;

    public static BaseResult success(){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode("200");
        baseResult.setMessage("成功");
        return baseResult;
    }
}
