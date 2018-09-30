package com.zhouzl.app3.component;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microcloud-demoapp")
public interface FeignConfig {
	
	@GetMapping("/test")
    String helloTest();
	
}
