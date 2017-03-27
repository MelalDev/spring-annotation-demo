package com.md.base;

import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	
	/*private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

	@Required
   	@Value("Test1")
	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}*/
	
	
	private BeanB beanB;
	private BeanC beanC;
	
	private List<String> lists = new ArrayList<String>();
	//@Autowired(required=false)
	public BeanA(BeanB beanB){
		System.out.println("constructor BeanA(BeanB beanB)");
		this.beanB = beanB;
		
	}
	
	@Autowired//(required=false)
	public BeanA(BeanB beanB, BeanC beanC) {
		super();
		System.out.println("constructor BeanA(BeanB beanB, BeanC beanC) ");
		this.beanB = beanB;
		this.beanC = beanC;
	}
	
	public BeanB getBeanB() {
		return beanB;
	}
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	public BeanC getBeanC() {
		return beanC;
	}
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
}
