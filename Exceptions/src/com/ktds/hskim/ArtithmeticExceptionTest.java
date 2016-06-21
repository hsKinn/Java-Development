package com.ktds.hskim;

import java.util.Scanner;

public class ArtithmeticExceptionTest {
	
	public void start() {
		
		Scanner input = new Scanner ( System.in );
		
		int numberOne = 0;
		int numberTwo = 0;
		double result = 0.0;
		
		System.out.println("첫번째 숫자 입력 : ");
		numberOne = input.nextInt();
		
		System.out.println("두번째 숫자 입력 : ");
		numberTwo = input.nextInt();
		
		try {
			result = numberOne / (double) numberTwo;
		}
		catch ( ArithmeticException ae ) {
			System.out.println(ae.getMessage());
		}
		
		System.out.println("결과 : " + result);
	}
	
	public static void main(String[] args) {
		ArtithmeticExceptionTest test = new ArtithmeticExceptionTest();
		test.start();
	}
}
