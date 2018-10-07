package com.zhouzl.appdemo.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoClass implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	private String classNameDemo = "DemoClass";
	private String beanName;
	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;

	public DemoClass() {
		System.out.println("DemoClass构造函数开始执行");
		if(beanName == null) {
			System.out.println("BeanName is null");
		}
		System.out.println("DemoClass构造函数结束执行");
	}
	
	public String getClassNameDemo() {
		return classNameDemo;
	}

	public void setClassNameDemo(String classNameDemo) {
		this.classNameDemo = classNameDemo;
	}
	
	public void initMethod() {
		System.out.println("This is the specific init-method of DemoClass Bean.");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("开始设置Bean Name: ");
		this.beanName = name;
		System.out.println(this.beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("开始执行InitializingBean借口的afterPropertiesSet方法");
		System.out.println("...");
		System.out.println("执行InitializingBean借口的afterPropertiesSet方法结束");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("开始设置ApplicationContext: ");
		this.applicationContext = applicationContext;
		System.out.println(this.applicationContext);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("开始设置BeanFactory: ");
		this.beanFactory = beanFactory;
		System.out.println(this.beanFactory);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("销毁DemoClass的Bean");
	}
	
}
