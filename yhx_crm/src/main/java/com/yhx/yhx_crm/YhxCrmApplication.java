package com.yhx.yhx_crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yhx.yhx_crm.mapper")
public class YhxCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YhxCrmApplication.class, args);
    }

}
