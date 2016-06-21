import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println("#1 while 사용하기");
		while ( i < 10 ) {
			
			System.out.print(i + " ");
			i++;		
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("#2 while 제대로 사용하기");
		Scanner input = new Scanner(System.in);
		String inputValue = "";
		
		boolean isRunning = true;
		
		while ( isRunning ) {
			
			System.out.println("출력 중... 종료 하시려면 exit 입력");
			inputValue = input.next();
			
			//equalsIgnoreCase : 대소문자 가리지 않는 문자열 비교
			if ( inputValue.equalsIgnoreCase("exit") ) {
				isRunning = false;
			} // if
			
		} // while
		
	}
}
