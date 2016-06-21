package com.ktds.hskim;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMethod {
	
	/**
	 * menu
	 */
	private int flag;
	
	/**
	 * 영어
	 */
	private String english;

	/**
	 * 한글
	 */
	private String korean;
	
	/**
	 * Scanner, Map<String, String> 선언
	 */
	private Scanner input;
	
	private Map<String, String> dictionary;
	
	/**
	 * 생성자 선언 
	 * 생성자를 통해 초기화
	 */
	public DictionaryMethod() {
		input = new Scanner (System.in);
		dictionary = new HashMap<String, String>();
	} 

	/**
	 * Getter / Setter
	 * @return
	 */
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	
	
	// Methods
		
	/**
	 * 실행 메소드
	 * 입력 받은 메뉴 값으로 각각의 메소드로 분기 시킴
	 */
	public void startDic () {
		
		while ( true ) {
			
			menuGreeting();
			
			if ( flag == 1 ) {
				inputDiction();
			} // menu 1 단어 추가
			else if ( flag == 2 ) {
				searchDiction();
			} // menu 2 단어 검색
			else if ( flag == 3 ) {
				deleteDiction();
			} // menu 3 단어 삭제
			else if ( flag == 4 ) {
				exitProgram();
			} // menu 4 프로그램 종료
			else {
				elseFlag();
			} // 메뉴 이외의 정수 값일 때
			
		} // while end
		
	} //startDic end

	
	/**
	 * 메뉴를 안내하고 입력 받는 메소드
	 * InputMismatchException 예외 처리를 통해
	 * 정수 외 문자 입력하면 예외 처리
	 */
	public void menuGreeting () {
		
		// while 숫자 아닌 문자 입력 시 반복
		while ( true ) {
			System.out.println("메뉴 선택");
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 조회");
			System.out.println("3. 단어 삭제");
			System.out.println("4. 사전 종료");
			System.out.println();
			System.out.print("입력 : ");
			
			// InputMismatchException 예외 처리
			try {
				flag = input.nextInt();
				input = new Scanner( System.in );
				break;
			} // try end
			catch ( InputMismatchException ime ) {
				input = new Scanner( System.in );
				System.out.println("예외 발생! 숫자 재 입력");
				System.out.println();
			} // catch end
			
		} // while end
		
	} // menuGreeting end
	
	
	/**
	 * 1. 단어 추가 메소드
	 */
	public void inputDiction() {
		
		while ( true ) {
			System.out.println();
			System.out.println("등록할 영어 단어 입력하세요");
			System.out.print("입력 : ");
			english = input.nextLine();
			input = new Scanner( System.in );
			
			if ( validateCheck("^[a-zA-z]*$") ) {
				
			}
			else {
				break;
			}
		} // while end (영어 입력 검사)
		
		while ( true ) {
			System.out.println();
			System.out.println("등록할 영어의 한국어 뜻을 입력하세요");
			System.out.print("입력 : ");
			korean = input.nextLine();
			input = new Scanner( System.in );
			
			if ( validateCheck("^[가-힣]*$") ) {
				
			}
			else {
				break;
			}

		} // while end (한국어 입력 검사)
		
		// Map의 put 메소드를 통해 key, value 입력
		dictionary.put(english, korean);
		System.out.println();
		System.out.println(english + " = " + korean + "단어 등록");
		System.out.println();
		
	} // inputDiction end
	
	
	/**
	 * 영어, 한국어 입력 검사 메소드
	 */
	public boolean validateCheck( String regex ) {
		if ( !english.matches(regex) ) {
			System.out.println();
			System.out.println("재 입력");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * 2. 단어 검색 메소드
	 */
	public void searchDiction() {
		
		while ( true ) {
			System.out.println("찾을 영어 단어를 입력하세요");
			System.out.print("입력 : ");
			english = input.nextLine();
			input = new Scanner( System.in );
			
			if ( validateCheck("^[a-zA-z]*$") ) {
				
			}
			else {
				break;
			}
		} // while end (영어 입력 검사)
		
		// Map의 get을 통해 Key값으로 value 검색
		korean = dictionary.get(english);
		if ( korean == null ) {
			System.out.println("해당 단어는 존재하지 않습니다");
			System.out.println();
		} 
		else {
			System.out.println(english + "의 뜻 : " + korean);
			System.out.println();
		} 
		
	} // searchDiction end
	
	
	/**
	 * 3. 단어 삭제 메소드
	 */
	public void deleteDiction() {
		
		while ( true ) {
			System.out.println("삭제할 영어 단어를 입력하세요");
			System.out.print("입력 : ");
			english = input.nextLine();
			input = new Scanner( System.in );
			
			if ( validateCheck("^[a-zA-z]*$") ) {
				
			}
			else {
				break;
			}
		} // while end (영어 입력 검사)

		korean = dictionary.get(english);
		if ( korean == null ) {
			System.out.println("해당 단어는 존재하지 않습니다.");
			System.out.println();
		}
		else {
			dictionary.remove(english);
			System.out.println(english + "를(을) 삭제했습니다");
			System.out.println();
		}
		
	} // deleteDiction end
	
	
	/**
	 * 프로그램 종료 메소드
	 */
	public void exitProgram() {
		
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	} // exitProgram end
	
	
	/**
	 * 메뉴 선택 시 해당되지 않는 메뉴일 경우
	 */
	public void elseFlag() {
		
		System.out.println("올바른 메뉴가 아닙니다");
		System.out.println();
	} // elseFlag end	
	
} // class end