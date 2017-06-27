package com.jsbomb.spring.aop;

public abstract class Person {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("person name : " + name);
		System.out.println("person age : " + age);
	}
}
