package com.ktds.hskim;

public class NullPointerExceptionTest {
	
	public void start() {
		
		// NullPointerException 발생
		String str = null;
		
		// #1 방법 (사용하지 않음)
//		String str = new String("BBB");
		
		
		
		for ( int i = 0; i < 3; i++ ) {
			
			if ( str!= null && str.equals("AAA") ) {
				System.out.println("AAA");
			}
			else {
				System.out.println("에러");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		/*
		 * Primitive Type의 기본 값
		 * byte		0
		 * short	0
		 * int		0
		 * long		0L
		 * float		0.0F
		 * double	0.0D 혹은 0.0
		 * boolean	false
		 * char		''
		 * 타입들에는 자신만의 default 값이 있다
		 * 
		 * Reference Type의 기본 값
		 * String			null		
		 * Scanner			null
		 * System			null
		 * 우리가 생성한 클래스	null
		 * 등등 
		 * 참조형 변수들의 기본 값 = null
		 */
		
		NullPointerExceptionTest test = new NullPointerExceptionTest();
		test.start();
	}
}
