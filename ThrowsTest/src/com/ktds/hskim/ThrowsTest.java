package com.ktds.hskim;

public class ThrowsTest {
	
	public void start() {
		
		MakeException makeException = new MakeException();
		
		int number = 0;
		number = makeException.parseInt("1234");
		
			
		// throws 선언을 통해 예외가 발생하면 메소드는 상관하지 않고
		// 호출자에게 넘긴다
		try {
			number = makeException.parseInt2("DEF");
		}
		catch(NumberFormatException nfe) {
			System.out.println("호출 실패");
			number = 0;
		}
		
		System.out.println(number);
		
		number = makeException.parseInt3("DEF");
		
		
		// 예외 발생하면 메소드가 예외 처리를 하고
		// 예외를 다시 한번 호출자에게 던져진다 (throw)
//		try {
//			number = makeException.parseInt3("DEF");
//		}
//		catch(NumberFormatException nfe) {
//			System.out.println("호출 실패!!!!");
//			number = 0;
//		}
//		
//		System.out.println(number);
		
		
		
		
	} // start end
	
	public static void main(String[] args) {
		ThrowsTest test = new ThrowsTest();
		test.start();
	} // main end
}	
