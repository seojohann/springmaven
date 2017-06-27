package com.jsbomb.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jsbomb.spring.bmicalc.PersonalInfo;
import com.jsbomb.spring.calc.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String calculatorXml = "classpath:META-INF/calculator.xml";
		String bmiCalcXml = "classpath:META-INF/bmicalculator.xml";
		AbstractApplicationContext context =
				new GenericXmlApplicationContext(calculatorXml, bmiCalcXml);
		Calculator calculator = context.getBean(Calculator.class);
		
		calculator.add();
		calculator.subtract();
		calculator.divide();
		calculator.multiply();
		
//		configXml = "classpath:META-INF/bmicalculator.xml";
//		context = new GenericXmlApplicationContext(configXml);
		PersonalInfo info = context.getBean(PersonalInfo.class);
		
		info.print();
		
	}

}
