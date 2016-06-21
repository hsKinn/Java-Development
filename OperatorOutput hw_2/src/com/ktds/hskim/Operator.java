package com.ktds.hskim;

import java.util.Scanner;

public class Operator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Output output = new Output();
		String operator;
		boolean loop = true;
		
		System.out.println("연산자 변환 (종료 : exit 입력) ");
		
		while ( loop == true ) {
			
			System.out.println();
			System.out.println("연산자 입력 : ");
			operator = input.next();
		
			output.Output(operator);
		
			System.out.println("Output : " + output.Output(operator));
			
			if ( operator.equalsIgnoreCase("exit") ) loop = false;
		
		} // while
		
	} // main
	
} // class
