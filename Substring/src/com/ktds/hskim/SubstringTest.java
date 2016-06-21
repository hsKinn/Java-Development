package com.ktds.hskim;

public class SubstringTest {
	
	private void start() {
		
		String welcome = "Hello, World";
		System.out.println(welcome);
		
		System.out.println(welcome.length());
		
		String world = welcome.substring(7, 13);
		
		// 공백의 위치 + 1(다음위치) ~ 길이(끝) 까지 
		world = welcome.substring(welcome.indexOf(" ") + 1);
		System.out.println(world);
		
		// 처음부터 ,앞 까지 제거
		String hello = welcome.substring(0, welcome.indexOf(",") );
		System.out.println(hello);
		
		String str = welcome.substring(4, 8);
		System.out.println(str);
		
		
		str = welcome.substring( welcome.indexOf("o") );
		System.out.println(str);
		
		str = welcome.substring( welcome.lastIndexOf("o") );
		System.out.println(str);
		
		// 개인정보 모자이크
		String id = welcome.substring(0, 3);
		for ( int i = 0; i < 5; i++ ) {
			id += "*";
		}
		System.out.println(id);
		
	}
	
	
	public static void main(String[] args) {
		SubstringTest substringTest = new SubstringTest();
		substringTest.start();
	}
	
}
