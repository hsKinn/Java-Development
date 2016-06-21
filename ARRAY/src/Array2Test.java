//import java.util.Scanner;

public class Array2Test {
	
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		scanner.nextInt();
		// import 하지 않아도 java의 고유 패키지 사용 가능
		// 같은 패키지 내의 클래스 이름이 같다면
		
		Scanner hello = new Scanner();
		hello.sayHello();
		// 같은 패키지 내의 클래스는 그냥 사용하고 java의 Scanner는 위치 지정
		
		
		
		
		// 2차원 배열 선언
		String students[][] = new String[5][6];
		
		students[0][0] = "황소리";
		students[0][1] = "공정민";
		students[0][2] = "구본호";
		students[0][3] = "엄기표";
		students[0][4] = "조윤후";
		students[0][5] = "문석현";
		
		students[1][0] = "이람";
		students[1][1] = "배성진";
		students[1][2] = "전민정";
		students[1][3] = "조형근";
		students[1][4] = "황성재";
		students[1][5] = "김장호";
		
		students[2][0] = "김현섭";
		students[2][1] = "권순길";
		students[2][2] = "김동규";
		students[2][3] = "김하늘";
		students[2][4] = "양지한";
		students[2][5] = "남준호";
		
		students[3][0] = "김광민";
		students[3][1] = "백지경";
		students[3][2] = "이기연";
		students[3][3] = "조민제";
		students[3][4] = "유병훈";
		
		students[4][0] = "이승섭";
		students[4][1] = "백수경";
		students[4][2] = "안신미";
		students[4][3] = "오평화";
		students[4][4] = "김연";
		
		
		// for문 사용하여 출력
		System.out.println("#1 for문 사용하여 다차원 배열 출력");
		int teamCount = students.length;
		int studentCount = 0;
		
		for ( int i = 0; i < teamCount; i++ ) {
			//System.out.println(students[i].length);
			studentCount = students[i].length; // 각 팀이 가지는 인덱스 수
			System.out.println();
			System.out.println((i+1) + "조 명단");
			for ( int j = 0; j < studentCount; j++ ) {
				System.out.println(students[i][j]);
				
			}
		} // for문
		
		
		// 향상된 for문 사용하여 출력
		System.out.println();
		System.out.println("#2 향상된 for문 사용하여 다차원 배열 출력");
		
		for ( String[] team : students  ) {
			System.out.println();
			for ( String person : team ) {
				System.out.println(person);
			}
			
		} // 향상된 for문
		
	} // main
} // class
