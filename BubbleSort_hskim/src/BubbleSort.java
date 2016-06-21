import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		int i, j;
		int loop = 1; // 프로그램 반복 변수
		int temp; // swqp 위한 변수
		int menu; // 오름차순, 내림차순 메뉴 변수
		int size = array.length; // array 사이즈 정의
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bubble Sorting"); // Title
		
		while ( loop == 1) {
			
			System.out.println();
			System.out.println("배열 입력");
						
			for ( i = 0; i < size; i++) {
				System.out.print("[" + i + "] index 입력 : ");
				array[i] = input.nextInt();
			} // Sorting 할 Array 정의
			
			System.out.println();
			System.out.println("정렬 전 Array");
			
			for (i = 0; i < size; i++) {
				System.out.print("[" + array[i] + "]  ");
			} // Sorting 전 Array 출력
			
			System.out.println();
			System.out.println("오름차순 정렬 : 1 / 내림차순 정렬 : 0");
			menu = input.nextInt();
			// 오름차순, 내림차순 입력
			
			if ( menu == 1 ) {
				System.out.println();
				System.out.println("오름차순 정렬 후 Array");
				
				for ( i = 0; i < size - 1; i++) {
					
					for ( j = 0; j < size - 1 - i; j++) {
						
						if ( array[j] > array[j+1] ) {
							temp = array[j];
							array[j] = array[j+1];
							array[j+1] = temp;
						}
					}
				} // 순차적으로 탐색 후 큰 값을 오른쪽으로 swap
				
				for ( i = 0; i < array.length; i++) {
					System.out.print("[" + array[i] + "]  ");
				} // 오름차순 Array 출력
				
			} // 오름차순 메뉴 종료
			
			else if ( menu == 0 ) {
				System.out.println();
				System.out.println("내림차순 정렬 후 Array");
				
				for ( i = 0; i < size - 1; i++) {
					
					for ( j = 0; j < size - 1 - i; j++) {
						
						if ( array[j] < array[j+1] ) {
							temp = array[j+1];
							array[j+1] = array[j];
							array[j] = temp;
						}
					}
				} // 순차적으로 탐색 후 작은 값을 왼쪽으로 swap
				
				for ( i = 0; i < array.length; i++) {
					System.out.print("[" + array[i] + "]  ");
				} // 내림차순 Array 출력
				
			} // 내림차순 메뉴 종료
			
			else System.out.println("잘못 입력되었습니다.");
			
			System.out.println();
			System.out.println();
			System.out.println("재시작 : 1 / 종료 : 0");
			System.out.print("입력 : ");
			loop = input.nextInt();
			
		} // while문 종료
		
		System.out.println();
		System.out.println("프로그램 종료합니다.");
	} // main
	 
} // class
