
public class IFTest {

	public static void main(String[] args) {
		
		int money = 1200;
		
		if ( money >= 1200 ) {
			System.out.println("캔 커피를 삽니다.");
			// if의 조건이 True일 때 실행되는 문장
		}
		
		int age = 27;
		
		if ( age >= 30 ) {
			System.out.println("당신의 나이는 30대 입니다.");
		}	// 비교 연산자 사용
		else {
			System.out.println("당신의 나이는 30대가 아닙니다.");
		} // if의 조건이 거짓(False)일 때,
		
		if ( age >= 30 && money >= 1200 ) {
			System.out.println("캔 커피를 사는 30대");
			// 논리 연산자 사용 ( 비교 논리 비교 ) && (and)
		} // else가 없다면 거짓(False)시 지나침
		
		// Q.1 나이가 20세 이상이고, 현재 가진 금액이 4,500원 이상 일 때,
		// "담배를 삽니다" 라고 출력하는 명령문
		// Q.3 두 조건이 아닐 때 "담배를 못삽니다" 출력 
		System.out.println();
		System.out.println("Q.1, Q.3");
		
		if ( age >= 20 && money >= 4500) {
			System.out.println("담배를 삽니다.");
		}
		else System.out.println("담배를 못삽니다.");
		
		
		// Q.2 성별을 저장하는 변수 생성 후  (남자 = 0, 여자 = 1) 
		// 성별이 남자 : "남탕으로 가세요"
		// 성별이 여자 : "여탕으로 가세요"  출력
		System.out.println();
		System.out.println("Q.2 성별 저장하여 IF 사용");
		int sex = 0; // 남자
		
		if ( sex == 0) {
			System.out.println("남탕으로 가세요");
		}
		else System.out.println("여탕으로 가세요");
		
		
		// Q.4 IF 중첩하기  학점 프로그램
		System.out.println();
		System.out.println("Q.4 IF 중첩하여 학점으로 변환");
		
		int score = 77;
		
		if ( score >= 90 && score <= 100 ) {
			System.out.println("A학점");
		}
		else if ( score >= 80 && score <= 89 ) {
			System.out.println("B학점");
		}
		else if ( score >= 70 && score <= 79 ) {
			System.out.println("C학점");
		}
		else if ( score >= 60 && score <= 69) {
			System.out.println("D학점");
		}
		else System.out.println("F학점");
		
		
		// Q.5 두 점수의 평균을 구해 평균값이 50점 이상이라면 "대기" 출력
		// 75점 이상이라면 "합격", 100점 이상이라면 "수석 합격" 출력
		System.out.println();
		System.out.println("Q.5 평균 구해 합격 여부 출력");
		
		int numberOne = 100;
		int numberTwo = 100;
		int avg = ( numberOne + numberTwo ) / 2;
		
		if ( avg == 100 ) {
			System.out.println("수석 합격");
		}
		
		else if ( avg >= 75 ) {
			System.out.println("합격");
		}
		
		else System.out.println("대기");
		
		
		// Q.6 IF에서 문자열 구분하기
		System.out.println();
		System.out.println("Q.6 IF에서 문자열 구분");
		
		String operator = "+";
		
		if ( operator.equals("+") ) {
			System.out.println("더하기");
		}
		// 문자열 비교는 ==로도 가능하지만 String변수.equals("문자")로 비교
	}	
}
