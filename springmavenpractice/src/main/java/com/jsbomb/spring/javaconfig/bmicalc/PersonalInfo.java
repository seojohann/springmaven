package com.jsbomb.spring.javaconfig.bmicalc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfo {

	private String name;
	private double height;
	private double weight;
	private BmiCalculator bmiCalculator;
	private ArrayList<String> hobbies;
	
//	public PersonalInfo(PersonalInfo info) {
//		this.name = info.name;
//		this.height = info.height;
//		this.weight = info.weight;
//		this.bmiCalculator = info.bmiCalculator;
//		this.hobbies = info.hobbies;
//	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}
	
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public BmiCalculator getBmiCalculator() {
		return bmiCalculator;
	}
	
	@Autowired
	public void setBmiCalculator(BmiCalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	
	
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public void print() {
		System.out.println("name : " + this.name);
		System.out.println("height : " + this.height);
		System.out.println("weight : " + this.weight);
		System.out.println("hobbies : " + hobbies);
		bmiCalculator.checkBmi(weight, height);
	}
}
