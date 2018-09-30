package com.zhouzl.appdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //Eureka Client
@EnableDiscoveryClient
@ComponentScan(value="com.zhouzl.appdemo")
public class PortalApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(PortalApplication.class).web(true).run(args);
    }
}
