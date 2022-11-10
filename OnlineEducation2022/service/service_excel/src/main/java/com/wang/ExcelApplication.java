package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author wzzmm
 * @since 2022/11/10 20:25
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ExcelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExcelApplication.class,args);
    }
}
