package com.ktds.hskim;

public class Calculator {
	
	public void start() {
	
		CalculatorBiz calBiz = new CalculatorBiz();
		calBiz.startCal();
		
	} // start end
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.start();
		
	} // main end
	
} // class end
