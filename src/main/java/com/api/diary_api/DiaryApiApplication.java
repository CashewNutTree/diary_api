package com.api.diary_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.api.diary_api.**")
public class DiaryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiaryApiApplication.class, args);
    }

}
