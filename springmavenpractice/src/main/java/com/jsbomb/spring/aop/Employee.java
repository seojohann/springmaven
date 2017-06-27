package com.jsbomb.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Employee extends Person {

	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Employeed title : " + title);
	}
}
