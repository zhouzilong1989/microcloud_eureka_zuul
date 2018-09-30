package com.zhouzl.app2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App2Controller {
	
	@Value("${server.port}")
    private String port;
	
	@RequestMapping("/test")
	public String forTest() {
		return "hello! 我是" + port;
	}
	
	@Autowired
    private RestTemplate restTemplate;

    @GetMapping("/clientTest")
    public String clientHello() {
        //第一个参数为：服务端的应用名称/调用接口的Mapping
        //第二个参数为返回的类型
        return restTemplate.getForObject("http://microcloud-demoapp/test",String.class);
    }
	
}
