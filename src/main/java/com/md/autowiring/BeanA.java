package com.md.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	
	@Autowired
	private BeanB[] beanBs;

	public BeanB[] getBeanBs() {
		return beanBs;
	}

	public void setBeanBs(BeanB[] beanBs) {
		this.beanBs = beanBs;
	}
}
