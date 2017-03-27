package com.md.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	
	//@Autowired(required=false)
	@Autowired
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
