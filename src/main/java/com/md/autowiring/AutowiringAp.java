package com.md.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowiringAp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-bean.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		for(BeanB bean:beanA.getBeanBs()){
			System.out.println(bean.getMyProperty());
		}
			
		((ClassPathXmlApplicationContext)context).close();
	}

}
