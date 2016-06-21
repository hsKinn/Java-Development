
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 5개의 문자열 배열 선언
		String list[] = new String[5];
		
		// 각각의 배열에 문자열 입력
		list[0] = "김현섭";
		list[1] = "남준호";
		list[2] = "김동규";
		list[3] = "김하늘";
		list[4] = "양지한";
		
		// #1 배열 출력
		System.out.println("#1 배열 출력");
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		System.out.println(list[3]);
		System.out.println(list[4]);
		System.out.println();
		
		// #2 for문 이용 배열 출력
		System.out.println("#2 For문 이용한 배열 출력");
		for(int i = 0; i < list.length; i++) {
			System.out.println("list[" + i + "]" + " = " + list[i]);
		}
		System.out.println("array size = " + list.length);
		System.out.println();
		
		// 향상된 for문으로 배열 출력
		for ( String name : list ) {
			System.out.println(name);
		}
		System.out.println();
		// 배열이름.length로 배열의 크기 가능
		
		
		// #3 배열 인덱스 값 선언과 동시에 초기화하기
		// 인덱스 개수 지정해 줄 필요 없음
		System.out.println("#3 배열 인덱스 값 선언 초기화");
		int scores[] = new int[] { 10, 20, 50 };
		
		// 향상된 for문으로 배열 출력
		for ( int score : scores) {
			System.out.println(score);
		}
		
		System.out.println();
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 배열 출력 응용
//		int index = 0;
//		
//		System.out.println(list[index++]);
//		System.out.println(list[index++]);
//		System.out.println(list[index++]);
//		System.out.println(list[index++]);
//		System.out.println(list[index++]);
// 		Ctrl + / = 여러 줄 주석처리
	}
}
