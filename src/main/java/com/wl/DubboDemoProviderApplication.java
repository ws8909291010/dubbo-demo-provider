package com.wl;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboDemoProviderApplication {
    public static void main(String[] args) {
        System.out.println("=============start============");
        SpringApplication.run(DubboDemoProviderApplication.class, args);
        System.out.println("=============end============");
    }
}
