package com.md.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	@Autowired
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
