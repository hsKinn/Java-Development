
public class ForTest {
	
	public static void main(String[] args) {
		
		// for 문 중첩을 이용해 구구단 작성
		for ( int i = 2; i < 4; i++ ) {
			
			for ( int j = 1; j < 10; j++ ) {
				System.out.println( i + " * "+ j + " = " + (i * j) );
			}
		}
		
		
		// 하나의 for 문을 이용해서 "**********" 를 출력하세요
		for ( int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		// 계단 모양의 "*" 코드 출력
		for ( int i = 1; i < 6; i++) {
			for ( int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}				
		
		
		// ++ 연산 알아보기
		int numberOne = 0;
		
		System.out.println(numberOne++);
		System.out.println(numberOne);
		System.out.println(++numberOne);
		// 정수++은 먼저 값이 입력되고 나서 +1이 진행되지만
		// ++정수는 값이 먼저 +1이 진행되고 나서 값이 입력 됨
	}
}
