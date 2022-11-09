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
    private Object data;

    public static BaseResult success(){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode("200");
        baseResult.setMessage("成功");
        return baseResult;
    }
    public static BaseResult exception(Exception e){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode("5001");
        baseResult.setMessage(e.getMessage());
        return baseResult;
    }

    public BaseResult setData(Object data){
        this.data = data;
        return this;
    }
}
