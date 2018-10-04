package com.secondgroud.front.webmusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.secondgroud.front.webmusic.mapper")
@SpringBootApplication
public class WebmusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmusicApplication.class, args);
    }
}
