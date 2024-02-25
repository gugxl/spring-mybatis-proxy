package com.gugu.example.springmybatisproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring.xml"})
public class SpringMybatisProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisProxyApplication.class, args);
    }

}
