package com.ktds.hskim;

public class Computer {
	
	// 사칙연산 정수 두개 파라미터 받아 출력하는 메소드
	public void printAddition( int numberOne, int numberTwo ) {	
		//int additionResult = numberOne + numberTwo;
		//System.out.println(additionResult);		
	}
	
	public void printSubtraction ( int numberOne, int numberTwo) {
		int subtractionResult = numberOne - numberTwo;
		System.out.println(subtractionResult);
	}
	
	public void printMultiplication ( int numberOne, int numberTwo) {
		int multiplicationResult = numberOne * numberTwo;
		System.out.println(multiplicationResult);
	}
	
	public void printDivision ( int numberOne, int numberTwo) {
		double divisionResult = (double) numberOne / numberTwo;
		System.out.println(divisionResult);
	}
	
	
	// 사칙연산 정수 두개 파라미터 받아 return 하는 메소드
	public int computeAddition ( int numberOne, int numberTwo) {
		int computeResult = numberOne + numberTwo;
		return computeResult;
	}
	
	public int computeSubtraction ( int numberOne, int numberTwo) {
		int computeResult = numberOne - numberTwo;
		return computeResult;
	}
	
	public int computeMultiplication ( int numberOne, int numberTwo) {
		int computeResult = numberOne * numberTwo;
		return computeResult;
	}
	
	public double computeDivision ( int numberOne, int numberTwo) {
		return (double) numberOne / numberTwo;
	} // division 연산 후 바로 return
	
	
}
