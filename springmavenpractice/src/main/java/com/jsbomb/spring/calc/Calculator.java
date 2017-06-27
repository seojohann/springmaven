package com.jsbomb.spring.calc;

public class Calculator {

	private Operator operator;
	private int op1;
	private int op2;
	
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	
	public void add() {
		operator.add(op1, op2);
	}
	
	public void subtract() {
		operator.subtract(op1, op2);
	}
	
	public void divide() {
		operator.divide(op1, op2);
	}
	
	public void multiply() {
		operator.multiply(op1, op2);
	}
}
