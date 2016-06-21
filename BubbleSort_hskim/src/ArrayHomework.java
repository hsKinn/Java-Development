import java.util.Scanner;

public class ArrayHomework {
	
	public static void main(String[] args) {
		
		int avg[] = new int[10];
		int loop = 1; // 프로그램 재실행 변수
		int i;
		int sum = 0;
		double average = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Average");
		
		while ( loop == 1 ) {
			
			System.out.println();
			System.out.println("평균값 구할 10개의 정수 입력");
			System.out.println();
			
			for ( i = 0; i < avg.length; i++ ) {
				System.out.print("[" + i + "] index 입력 : ");
				avg[i] = input.nextInt();
			}
			
			System.out.println();
			System.out.println("입력된 Array");
			
			for ( i = 0; i < avg.length; i++ ) {
				sum += avg[i];
				System.out.print("[" + avg[i] + "] ");
			}
			average = (double) sum / avg.length;
			
			System.out.println();
			System.out.println();
			System.out.println("배열 총합 : " + sum + "  배열 평균 : " + average );
			System.out.println();
			
			System.out.println("재시작 : 1 / 종료 : 0");
			System.out.print("입력 : ");
			loop = input.nextInt();	
		} // while 종료
		
		System.out.println("프로그램 종료합니다.");		
	}
}
