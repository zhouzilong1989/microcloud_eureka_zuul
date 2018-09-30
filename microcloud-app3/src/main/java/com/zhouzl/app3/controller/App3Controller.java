package com.zhouzl.app3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zhouzl.app3.component.FeignConfig;

@RestController
public class App3Controller {
	
	@Value("${server.port}")
    private String port;
	
	@RequestMapping("/test")
	public String forTest() {
		return "hello! 我是" + port;
	}
	
	@Autowired
    private FeignConfig feignConfig;
	
	@GetMapping("/clientTest")
    public String clientHello() {
        return feignConfig.helloTest();
    }

}
