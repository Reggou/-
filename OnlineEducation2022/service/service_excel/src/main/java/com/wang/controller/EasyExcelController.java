package com.wang.controller;

import com.alibaba.excel.EasyExcel;
import com.wang.entities.ExcelEntity;
import com.wang.support.ExcelListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author wzzmm
 * @since 2022/11/10 20:05
 */
@RestController
@RequestMapping("/excel")
public class EasyExcelController {

    private static final String FILE_NAME = "F:\\write.xlsx";
    /**
     * 写excel
     */
    @PostMapping("write")
    public void writeExcel() {
        List<ExcelEntity> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            ExcelEntity excelEntity = new ExcelEntity();
            excelEntity.setNo(uuid);
            excelEntity.setName("name" + i);
            list.add(excelEntity);
        }
        EasyExcel.write(FILE_NAME, ExcelEntity.class).sheet("人员列表").doWrite(list);
    }

    /**
     * 写excel
     */
    @PostMapping("read")
    public void readExcel(){
        EasyExcel.read(FILE_NAME,ExcelEntity.class, new ExcelListener()).sheet("人员列表").doRead();
    }

}
