package com.wang.entities;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author wzzmm
 * @since 2022/11/10 20:01
 */
@Data
public class ExcelEntity {
    @ExcelProperty(value = "编号", index = 0)
    private String no;
    @ExcelProperty(value = "姓名", index = 1)
    private String name;
}
