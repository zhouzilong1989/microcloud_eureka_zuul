package com.zhouzl.appdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhouzl.appdemo.domain.DemoClass;

@Configuration
public class DemoConfiguration {
	
	@Bean
	DemoClass demoClassBean() {
		return new DemoClass();
	}
	
}
