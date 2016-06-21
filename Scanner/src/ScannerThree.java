import java.util.Scanner;

public class ScannerThree {
	
	public static void main(String[] args) {
		
		// int형 변수 두 개를 선언
		int numberOne;
		int numberTwo;
		
		// int형 변수 두 개를 Scanner 사용해 값을 저장
		Scanner console = new Scanner(System.in);
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰 지 알아보는 프로그램");
		
		System.out.print("첫 번째 숫자를 입력 : ");
		numberOne = console.nextInt();
		System.out.print("두 번째 숫자를 입력 : ");
		numberTwo = console.nextInt();
		
		// 첫 번째 입력한 숫자가 두 번째 입력한 숫자보다 큰 지 비교
		boolean compareResult = numberOne > numberTwo;
		
		// 결과 출력
		System.out.println(numberOne + " > " + numberTwo + " = " + compareResult);
				
	}
		
}
