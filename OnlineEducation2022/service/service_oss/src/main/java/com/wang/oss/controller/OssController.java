package com.wang.oss.controller;

import com.wang.oss.controller.response.UploadFileResponse;
import com.wang.oss.service.OssService;
import com.wang.servicebase.support.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wzzmm
 * @since 2022/11/9 15:54
 */
@RestController
@RequestMapping("/oss")
@CrossOrigin
public class OssController {

    @Autowired
    private OssService ossService;

    /**
     * 上传文件到oss
     * @param file 文件
     * @return oss文件地址
     */
    @PostMapping("uploadOssFile")
    public BaseResult uploadOssFile(MultipartFile file){
        //返回上传到oss的路径
        String url = ossService.uploadFileAvatar(file);
        return UploadFileResponse.success().setData(url);
    }
}
