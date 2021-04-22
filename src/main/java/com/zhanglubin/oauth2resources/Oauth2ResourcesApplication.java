package com.zhanglubin.oauth2resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2ResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourcesApplication.class, args);
        System.out.println("-------------资源服务启动成功----------------");
    }

}
