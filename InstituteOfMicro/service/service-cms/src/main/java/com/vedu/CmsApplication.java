package com.vedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author flyfly
 */
@SpringBootApplication
@ComponentScan({"com.vedu", "com.vedu.mapper"}) //指定扫描位置
@MapperScan("com.vedu.mapper")
public class CmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}
