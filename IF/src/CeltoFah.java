import java.util.Scanner;

public class CeltoFah {

	public static void main(String[] args) {

		// 섭씨 -> 화씨 F = C x 1.8 + 32
		// 화씨 -> 섭씨 C = (F - 32) / 1.8

		int typeChoice = 0;
		Scanner input = new Scanner(System.in);
		Convert converter = new Convert();

		System.out.println("온도 변환 프로그램");
		
		while ( true ) {
			
			System.out.println();
			System.out.println("1 : 섭씨 -> 화씨");
			System.out.println("2 : 화씨 -> 섭씨");
			System.out.println("3 : 종료");
			System.out.print("입력 : ");

			typeChoice = input.nextInt();

			if ( typeChoice == 1 ) {
				converter.convertCeltoFah(input);
			}

			else if ( typeChoice == 2 ) {
				converter.convertFahtoCel(input);
			}
			
			else if ( typeChoice == 3 ) {
				break;
			}

			
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} // while
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		// break; 문장이 없다면 while문 밖의 문장들은 에러 (무한 반복이므로 실행될 기회가 없음)
		
	} // main
	
} // class
/**
 * ※ 같은 이름의 변수 2번 선언? 변수들의 생명 주기 { } 안에서 사용되고 끝나면 사라진다. 그렇기 때문에 조건 1, 조건 2에서 같은
 * 이름의 변수가 선언이 되는 것 같은 이름이라도 다른 타입이라면 될까? 되지 않는다.
 */