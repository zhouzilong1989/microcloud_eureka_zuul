package com.zhouzl.appdemo.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.zhouzl.appdemo.domain.DemoClass;

@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof DemoClass) {
			System.out.println("开始执行BeanPostProcesser借口的预先初始化方法");
			System.out.println("预先beanName: " + beanName);
			System.out.println("执行BeanPostProcesser借口的预先初始化方法结束");
        }
        return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof DemoClass) {
			System.out.println("开始执行BeanPostProcesser借口的后初始化方法");
			System.out.println("后beanName: " + beanName);
			System.out.println("执行BeanPostProcesser借口的后初始化方法结束");
        }
		return bean;
	}
}
