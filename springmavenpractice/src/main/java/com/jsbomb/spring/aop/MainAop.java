package com.jsbomb.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainAop {

	
	@Autowired
	private Student student;
	
	@Autowired
	private Employee employee;
	
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(MainAop.class, AopConfig.class);
		
		MainAop main = context.getBean(MainAop.class);
		main.run();
		
		context.close();
	}
	
	public void run() {
		student.getInfo();
		
		System.out.println("");
		employee.getInfo();
	}

}
