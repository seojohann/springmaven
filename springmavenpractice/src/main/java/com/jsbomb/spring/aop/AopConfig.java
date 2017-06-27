package com.jsbomb.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
	
	@Bean
	public Student student() {
		Student student = new Student();
		
		student.setName("john doe");
		student.setAge(34);
		student.setGrade(12);
		student.setClassNum(3);
		
		return student;
	}
	
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		
		employee.setName("jane doe");
		employee.setAge(34);
		employee.setTitle("scientist");
		
		return employee;
	}
	
	@Bean
	public AopLog aopLog() {
		return new AopLog();
	}
}
