package com.jsbomb.spring.javaconfig.bmicalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ContextConfiguration(classes=BmiCalculatorConfig.class)
@ComponentScan(basePackages="com.jsbomb.spring.javaconfig")
public class MainJavaConfig {

	@Autowired
	private PersonalInfo personalInfo;
	
	public static void main(String[] args) {
		
		MainJavaConfig main;
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(
						MainJavaConfig.class, BmiCalculatorConfig.class);


		main = context.getBean(MainJavaConfig.class);
		main.run(context);
		
	}
	
	public void run(ApplicationContext context) {
//		personalInfo = context.getBean(PersonalInfo.class);
		personalInfo.print();
	}
}
