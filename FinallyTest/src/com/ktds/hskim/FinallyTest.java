package com.ktds.hskim;

public class FinallyTest {
	
	public void start() {
		
		try {
			int number = Integer.parseInt("123");
			
			String str = null;
			str.length();
			
			System.out.println(number);
		}
		catch (NumberFormatException | NullPointerException nfe) {
			
			if ( nfe instanceof NumberFormatException ) {
				System.out.println("숫자 변환 실패");
			}
			else if ( nfe instanceof NullPointerException ) {
				System.out.println("잘못된 참조");
			}
			
		}
//		catch (NullPointerException npe) {
//			System.out.println("잘못된 참조, 객체 Null 확인");
//		}
		finally {
			System.out.println("숫자 변환 종료");
		}
	} // start end
	
	public static void main(String[] args) {
		FinallyTest test = new FinallyTest();
		test.start();
	} // main end
}
