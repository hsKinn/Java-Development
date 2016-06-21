package com.ktds.hskim;

public class Operator {
	
	public void Calculator ( int numberOne, String operator, int numberTwo) {
			
		if ( operator.equals("+") ) {
			System.out.println();
			int result = numberOne + numberTwo;
			System.out.println("결과 : " + numberOne + " " + operator + " " + numberTwo + " = " + result );
			System.out.println();
		}
		
		else if ( operator.equals("-") ) {
			System.out.println();
			int result = numberOne - numberTwo;
			System.out.println("결과 : " + numberOne + " " + operator + " " + numberTwo + " = " + result );
			System.out.println();
		}
		
		else if ( operator.equals("*") ) {
			System.out.println();
			int result = numberOne * numberTwo;
			System.out.println("결과 : " + numberOne + " " + operator + " " + numberTwo + " = " + result );		
			System.out.println();
		}
		
		else if ( operator.equals("/") ){
			System.out.println();
			double result = (double) numberOne / numberTwo;
			System.out.println("결과 : " + numberOne + " " + operator + " " + numberTwo + " = " + result );
			System.out.println();
		}
		
		else {
			System.out.println();
			System.out.println("잘못 입력되었습니다.");
			System.out.println();
		}
		
		
		
	} // Calculator
	
} // class
