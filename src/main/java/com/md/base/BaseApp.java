package com.md.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("base-bean.xml");
		BeanA beanA = context.getBean("beanA",BeanA.class);
		
		System.out.println(beanA.getBeanB().getBeanD().getMyProperty());
		System.out.println(beanA.getBeanC().getBeanD().getMyProperty());
		((ClassPathXmlApplicationContext)context).close();
	}

}
