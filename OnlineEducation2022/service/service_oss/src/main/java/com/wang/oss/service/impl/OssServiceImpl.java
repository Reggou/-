package com.wang.oss.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.wang.oss.service.OssService;
import com.wang.oss.utils.ConstantPropertiesUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/**
 * @author wzzmm
 * @since 2022/11/9 15:55
 */
@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadFileAvatar(MultipartFile file) {
        String endPoint = ConstantPropertiesUtils.END_POINT;
        String keyId = ConstantPropertiesUtils.KEY_ID;
        String keySecret = ConstantPropertiesUtils.KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;
        //UUID
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        //获取指定格式日期
        String date = new DateTime().toString("yyyy-MM-dd");
        String url = null;
        try {
            OSS ossClient = new OSSClientBuilder().build(endPoint,keyId,keySecret);
            InputStream inputStream = file.getInputStream();
            String fileName = file.getName();
            ossClient.putObject(bucketName,fileName,inputStream);
            ossClient.shutdown();
             url = "https://"+bucketName+"."+endPoint+"/"+fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }
}
