package com.zhouzl.appdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppdemoController {
	
	@Value("${server.port}")
    private String port;
	
	@RequestMapping("/test")
	public String forTest() {
		return "hello! 我是" + port;
	}
}
