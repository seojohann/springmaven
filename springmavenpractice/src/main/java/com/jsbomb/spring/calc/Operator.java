package com.jsbomb.spring.calc;

public class Operator {

	
	public void add(int op1, int op2) {
		int result = op1 + op2;
		System.out.println("adding " + op1 + " + " + op2 + " = " + result);
	}
	
	public void subtract(int op1, int op2) {
		int result = op1 - op2;
		System.out.println("subtracting " + op1 + " - " + op2 + " = " + result);
	}
	
	public void divide(int op1, int op2) {
		int result = op1 / op2;
		System.out.println("dividing " + op1 + " / " + op2 + " = " + result);
	}
	
	public void multiply(int op1, int op2) {
		int result = op1 * op2;
		System.out.println("multiplying " + op1 + " * " + op2 + " = " + result);
	}
}
