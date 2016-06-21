package com.ktds.hskim;

public class CalculatorVO {
	
	public static final String OPERATOR[] = { "+", "-", "*", "/" };
	
	private String inputCal;
	
	private int numberOne;
	
	private int numberTwo;
	
	private String Operator;
	

	private int result;
	
	private double result2;

	
	/**
	 * Getters / Setters
	 * @return
	 */
	public String getInputCal() {
		return inputCal;
	}
	public void setInputCal(String inputCal) {
		this.inputCal = inputCal;
	}
	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public double getResult2() {
		return result2;
	}
	public void setResult2(double result2) {
		this.result2 = result2;
	}
	
}
