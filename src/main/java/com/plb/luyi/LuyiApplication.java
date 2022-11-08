package com.plb.luyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.plb.luyi.mapper")
public class LuyiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuyiApplication.class, args);
    }

}
