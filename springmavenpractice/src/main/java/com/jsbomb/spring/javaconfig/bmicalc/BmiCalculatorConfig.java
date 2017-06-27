package com.jsbomb.spring.javaconfig.bmicalc;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.jsbomb.spring.javaconfig.bmicalc")
public class BmiCalculatorConfig {

	@Bean
	public BmiCalculator bmiCalculator() {
		BmiCalculator calculator = new BmiCalculator();
		calculator.setNormal(23.0);
		calculator.setObesity(30.0);
		calculator.setOverWeight(25.0);
		calculator.setUnderWeight(20.0);
		
		return calculator;
	}
	
	@Bean
	public PersonalInfo personalInfo() {
		PersonalInfo info = new PersonalInfo();
		info.setName("john doe");
		info.setHeight(175);
		info.setWeight(73);
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("video game");
		hobbies.add("sports");
		info.setHobbies(hobbies);
		info.setBmiCalculator(bmiCalculator());
		
		return info;
	}
}
