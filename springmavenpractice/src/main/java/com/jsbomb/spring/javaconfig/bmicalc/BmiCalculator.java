package com.jsbomb.spring.javaconfig.bmicalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BmiCalculator {
	
	private double underWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	public void checkBmi(double weight, double height) {
		
		double bmi = weight / (height * height * 0.0001);
		
		System.out.println("your BMI is : " + bmi);
		if (bmi > obesity) {
			System.out.println("You are obese");
		} else if (bmi > overWeight) {
			System.out.println("You are over-weight");
		} else if (bmi > normal) {
			System.out.println("You are normal");
		} else {
			System.out.println("You are under-weight");
		}
		
	}

	
	public void setUnderWeight(double underWeight) {
		this.underWeight = underWeight;
	}
	
	
	public void setNormal(double normal) {
		this.normal = normal;
	}

	
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
}
