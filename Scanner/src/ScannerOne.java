import java.util.Scanner; // Scanner 사용을 위한 추가

public class ScannerOne {
	
	public static void main(String[] args) { 
		
		// 변수의 선언과 동시에 값의 초기화
		int numberOne = 15;
		
		System.out.println(numberOne);
		
		
		// 변수 선언
		int numberTwo;
		// 선언된 변수에 값 초기화
		numberTwo = 35;
		
		System.out.println(numberTwo);
		
		
		// 변수를 선언
		int numberThree;
		// Scanner 이용해 변수의 값 초기화
		Scanner input = new Scanner(System.in); // Scanner 선언
		numberThree = input.nextInt(); // nextInt() : 다음 입력되는 정수를 Scan
			
		System.out.println(numberThree + " 입력");	
		
	}
}
