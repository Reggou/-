package com.wang.oss.controller.response;

import com.wang.servicebase.support.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wzzmm
 * @since 2022/11/9 23:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UploadFileResponse extends BaseResult {
    private String data;
}
