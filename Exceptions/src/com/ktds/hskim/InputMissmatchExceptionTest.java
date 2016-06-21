package com.ktds.hskim;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class InputMissmatchExceptionTest {
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.println("정수를 입력");
		System.out.print("입력 : ");
		
		// 예외 발생 하지 않을 때 까지 반복
		while ( true ) {
			// 예외 발생 여부는 모르지만 실행
			try {
				// 예외 발생 가능성이 있는 코드
				number = input.nextInt();
				break;
			}
			// try 내부의 코드가 InputMismatchException 던진다면
			// 예외를 받아온다.
			// catch가 실행되는 동안 Program이 종료되지 않음
			catch ( InputMismatchException ime ) {
				// Scanner의 버그로 인해 다시 초기화
				input = new Scanner(System.in);
				System.out.println("예외 발생! 잘못된 입력");
				System.out.println("정수만 입력하세요");
				System.out.print("입력 : ");
				
				// 쓰면 안되는 코드
				// 예외의 구체적인 정보를 알 고 싶을 때 쓴다
				// 구체적인 정보를 알고 난 뒤에는 반드시 지워야 한다
				// 쿼리의 정보가 나오기 때문에 해킹 위험이 있다.
				//ime.printStackTrace();
				
				// 애용해야 하는 코드
				// 어떤 예외가 발생했는지 간략히 알려준다
				System.out.println();
				System.out.println(ime.getClass().getName() + "예외가" + ime.getMessage() +  "때문에 에러 발생");
			}
		}
		
		System.out.println("입력된 정수 : " + number);
	}

	public static void main(String[] args) {
		
		InputMissmatchExceptionTest test = new InputMissmatchExceptionTest();
		test.start();
	}
	
}