package com.jsbomb.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@Import(AopConfig.class)
public class MainAop {

	
	@Autowired
	private Student student;
	
	@Autowired
	private Employee employee;
	
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(MainAop.class);
		
		MainAop main = context.getBean(MainAop.class);
		main.run();
		
		context.close();
	}
	
	public void run() {
		
		student.setName("John Doe");
		student.setAge(34);
		student.setGrade(12);
		student.setClassNum(2);
		student.getInfo();
		
		System.out.println("");
		
		employee.setName("Jane Doe");
		employee.setAge(34);
		employee.setTitle("Scientist");
		employee.getInfo();
	}

}
