import java.util.Scanner;

public class ScannerTwo {
	
	public static void main(String[] args) {
		
		// int형 변수 두개 정의
		int numberOne, numberTwo;
		
		
		// int형 변수들에 Scanner 이용해 값 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 두개를 더하는 프로그램입니다.");
		//println : 출력 후 다음줄로 넘어감 / print : 출력 후 그 줄에 머무름
		System.out.print("첫 번째 숫자를 입력 : ");
		numberOne = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력 : ");
		numberTwo = scanner.nextInt();
		
		
		// int형 변수 두개를 더해 다른 변수에 저장
		int additionResult = numberOne + numberTwo;
		
		
		// 두개를 더한 결과를 출력 
		System.out.println(numberOne + " + " + numberTwo + " = " + additionResult);
				
	}
}
