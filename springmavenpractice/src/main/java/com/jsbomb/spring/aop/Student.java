package com.jsbomb.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person{

	
	private int grade;
	private int classNum;
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("student classroom # : " + grade + "-" + classNum);
	}
}
