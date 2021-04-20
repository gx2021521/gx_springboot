package com.example;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

/**
 * @author admin
 */
@SpringBootApplication
@MapperScan("com.example.mapper")//扫描的mapper,导入tk包
public class GxSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxSpringbootApplication.class, args);

    }
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
