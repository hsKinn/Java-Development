package com.ktds.hskim;

import java.util.Scanner;

public class NumberFormatExceptionTest {
	
	// 문자를 숫자로 바꾸는 메소드 (자주 사용)
	public int parseInt ( String str ) {
		try {
			return Integer.parseInt(str);
		}
		catch ( NumberFormatException nfe ) {
			return 0;
		}
		
	}
	
	public void start() {

		Scanner input = new Scanner ( System.in );
		String numberString = input.next();
		
		// 문자 -> 정수 변환
		// 문자 -> long 변환
		// 문자 -> short 변환
		// 문자 -> int 변환
		try {
			int integerNumber = Integer.parseInt( numberString );
			System.out.println(integerNumber);
		}
		catch ( NumberFormatException nfe ) {
			System.out.println("숫자 변환에 실패했습니다");
			System.out.println(nfe.getMessage());
		}
		
		// 문자 -> 실수 변환
		// 문자 -> double 변환
		// 문자 -> float 변환

		// 문자 -> 논리 변환
		
	}
	
	
	public static void main(String[] args) {
		NumberFormatExceptionTest test = new NumberFormatExceptionTest();
		test.start();
	}
}
