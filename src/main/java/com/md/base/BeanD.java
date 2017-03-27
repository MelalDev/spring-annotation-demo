package com.md.base;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanD {
	
	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

	@Required
	@Value("Test1")
	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}
}
