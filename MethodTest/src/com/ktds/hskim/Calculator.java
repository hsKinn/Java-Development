package com.ktds.hskim;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		int numberOne = 0;
		int numberTwo = 0;
		String operator = "";
		String exit = "";
		boolean loop = true; // 프로그램 반복 변수
			
		Scanner input = new Scanner(System.in);
		Operator calcu = new Operator();
		// Operator 클래스 인스턴스화
		
		System.out.println("Calculator");
		
		while ( loop == true ) {
			
			System.out.println();
			System.out.println("계산식 입력 (중위표기법) ");
			System.out.print("입력(정수)  : ");
			numberOne = input.nextInt();
			
			for (int i = 0; i < 1; i += 0 ) {
				System.out.print("입력(+-*/) : ");
				operator = input.next();
				
				if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
					i++;
				}
				
				else System.out.println("다시 입력하세요");
			}
			
			System.out.print("입력(정수)  : ");
			numberTwo = input.nextInt();
			
			calcu.Calculator(numberOne, operator, numberTwo);
			
			System.out.println("종료 : exit / 재시작 : 1");
			System.out.print("입력 : ");
			exit = input.next();
			
			if ( exit.equalsIgnoreCase("exit") ) break;
		} // while
		
		System.out.println();
		System.out.println("프로그램 종료합니다.");
		input.close();
	} // main
	
} // class
