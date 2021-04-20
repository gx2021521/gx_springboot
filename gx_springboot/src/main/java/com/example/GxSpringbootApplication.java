package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author admin
 */
@SpringBootApplication
@MapperScan("com.example.mapper")//扫描的mapper,导入tk包
public class GxSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxSpringbootApplication.class, args);
    }

}
