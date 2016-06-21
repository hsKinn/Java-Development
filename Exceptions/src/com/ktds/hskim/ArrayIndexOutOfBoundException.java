package com.ktds.hskim;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundException {
	
	public void start() {
		caseOne();
		caseTwo();
	}
	
	public void caseOne() {
		// 일반적인 배열 사용
		System.out.println("#1 1차원 배열을 이용");
		// 배열
		int numbers[] = new int[5];
		
		// 배열 값 입력
		for ( int i = 0; i < numbers.length; i++ ) {
			numbers[i] = i;
		}
		
		
		try {
			// ArrayIndexOutOfBoundsException 예외 발생
			numbers[5] = 10;
		}
		catch ( ArrayIndexOutOfBoundsException aioobe ) {
			System.out.println(aioobe.getMessage() + "번 인덱스는 존재하지 않습니다");
		}
		
		
		// 출력
		for ( int number : numbers ) {
			System.out.println(number);
		}
		System.out.println();
	}
		
	public void caseTwo() {
		// 컬렉션 프레임워크 사용한 배열	
		System.out.println("#2 컬렉션 프레임워크 배열을 이용");
		List<Integer> numbers = new ArrayList<Integer>();
		for ( int i = 0; i < 5; i++ ) {
			numbers.add(i);
		}
		
		
//		for ( int number : numbers ) {
//			System.out.println(number);
//		}
//
//		// ArrayIndexOutOfBoundsException 예외 발생
//		System.out.println(numbers.get(5));
		
		
		// i <= numbers.size(); 를 한다면 에러가 발생
		// index는 0부터 시작해서 4까지 인데 <= 를 하게 되면 5까지 증가함
		for ( int i = 0; i < numbers.size(); i++ ) {
			System.out.println(numbers.get(i));
		}
	}
		
	
	
	public static void main(String[] args) {
		ArrayIndexOutOfBoundException test = new ArrayIndexOutOfBoundException();
		test.start();
	}
}
