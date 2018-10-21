package com.zhouzl.app2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //Eureka Client
@EnableDiscoveryClient
@ComponentScan(value="com.zhouzl.app2")
public class PortalApplication2 extends SpringBootServletInitializer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(PortalApplication2.class).web(true).run(args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PortalApplication2.class);
    }
}