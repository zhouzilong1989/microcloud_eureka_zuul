package com.zhouzl.app3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan(value="com.zhouzl.app3")
public class PortalApplication3 {
	public static void main(String[] args) {
        new SpringApplicationBuilder(PortalApplication3.class).web(true).run(args);
    }
}
