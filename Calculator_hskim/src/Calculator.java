import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		int numberOne; 
		int numberTwo; 
		int menu = 1;  // 프로그램 메뉴 (반복, 종료)
		String operator; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculator");
		
		while ( menu == 1) {
			
			System.out.println();
			System.out.println("계산할 값 입력");
			System.out.print("숫자 1 : ");
			numberOne = scan.nextInt(); 
			System.out.print("숫자 2 : ");
			numberTwo = scan.nextInt(); 
			System.out.println(); 
						
			System.out.print("연산 입력 (+,-,*,/) : ");
			operator = scan.next(); 
			
			System.out.println();
			if ( operator.equals("+") ) {
				int result = numberOne + numberTwo;
				System.out.println("덧셈 (+) 연산 결과");
				System.out.println(numberOne + " + " + numberTwo + " = " + result);
			} // 입력된 기호가 '+' 이라면 덧셈 연산
			
			else if ( operator.equals("-") ) {
				int result = numberOne - numberTwo;
				System.out.println("뺄셈 (-) 연산 결과");
				System.out.println(numberOne + " － " + numberTwo + " = " + result);
			} // 입력된 기호가 '-' 이라면 뺄셈 연산
			
			else if ( operator.equals("*") ) {
				int result = numberOne * numberTwo;
				System.out.println("곱셈 (*) 연산 결과");
				System.out.println(numberOne + " × " + numberTwo + " = " + result);
				
			} // 입력된 기호가 '*' 이라면 곱셈 연산
			
			else if ( operator.equals("/") ) {
				double result = (double) numberOne / (double) numberTwo;
				System.out.println("나눗셈 (/) 연산 결과");
				System.out.println(numberOne + " ÷ " + numberTwo + " = " + result);
				
			} // 입력된 기호가 '/' 이라면 나눗셈 연산
			
			else  	System.out.println("잘못 입력되었습니다."); // 사칙연산 외 입력한 경우
			
			System.out.println();
			System.out.println("재시작 : 1 / 종료 : 0");
			System.out.print("입력 : "); // 프로그램 반복을 하기 위한 메뉴 값 입력
			menu = scan.nextInt();
		} // While문을 통해 menu 변수에 1이 입력될 때까지 반복
		
		System.out.println();
		System.out.println("종료되었습니다.");
	}
}