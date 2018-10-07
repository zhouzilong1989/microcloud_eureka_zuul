package com.zhouzl.appdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhouzl.appdemo.domain.DemoClass;

@Component
@Aspect
public class LogAspect {
	
	@Autowired
	DemoClass demoClass;
	
	@Pointcut("execution(* com.zhouzl.appdemo.controller..*.*(..))")
	public void pointcutName() {}
	
	@Before("pointcutName()")
	public void performaceBefore() {
		System.out.println("Springboot AOP-----Before");
		System.out.println(demoClass.getClassNameDemo());
		demoClass.setClassNameDemo("AOP: " + demoClass.getClassNameDemo());
	}
	
	@After("pointcutName()")
	public void performaceAfter() {
		System.out.println("Springboot AOP-----After");
		System.out.println(demoClass.getClassNameDemo());
		demoClass.setClassNameDemo("DemoClass");
	}
	
}
