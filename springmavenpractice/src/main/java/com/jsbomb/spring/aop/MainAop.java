package com.jsbomb.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.jsbomb.spring.aop")
public class MainAop {

	
	@Autowired
	private Student student;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MainAop.class, AopConfig.class);
		
		MainAop main = context.getBean(MainAop.class);
		main.run();
	}
	
	public void run() {
		student.getInfo();
	}

}
