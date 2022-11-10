package com.wang.support;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.wang.entities.ExcelEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * 创建读取excel监听器
 *
 * @author wzzmm
 * @since 2022/11/10 20:57
 */
public class ExcelListener extends AnalysisEventListener<ExcelEntity> {
    //创建list集合封装最终的数据
    List<ExcelEntity> list = new ArrayList<>();
    //一行一行去读取excel内容
    @Override
    public void invoke(ExcelEntity excelEntity, AnalysisContext analysisContext) {
        System.out.println("***"+excelEntity);
        list.add(excelEntity);
    }
    //读取excel表头信息
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息："+headMap);
    }
    //读取完成后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
