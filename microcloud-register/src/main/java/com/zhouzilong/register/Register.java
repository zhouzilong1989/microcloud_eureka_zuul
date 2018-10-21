package com.zhouzilong.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //spring-boot 启动注解
@EnableEurekaServer // spring-cloud 服务注解
public class Register extends SpringBootServletInitializer {
     public static void main(String [] args) {
            new SpringApplicationBuilder(Register.class).web(true).run(args);
     }
     
     @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
         return builder.sources(Register.class);
     }
}
