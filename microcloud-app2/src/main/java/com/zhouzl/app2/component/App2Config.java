package com.zhouzl.app2.component;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class App2Config {
	
	@LoadBalanced
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
}
