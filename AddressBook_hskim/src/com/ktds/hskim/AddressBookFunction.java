package com.ktds.hskim;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBookFunction {
	
	/**
	 * AddressBookInfo 클래스 List 선언
	 */
	private List<AddressBookInfo> addressBookInfoList;
	
	/**
	 * AddressBookInfo 객체
	 */
	private AddressBookInfo person;
	
	/**
	 * 검색 완료 or 삭제 완료 논리값
	 */
	private boolean result;
	
	/*
	 *  Scanner
	 */
	Scanner input;
	
	/**
	 * 메뉴값
	 */
	private int menu;
	
	
	/**
	 * 생성자 초기화
	 */
	public AddressBookFunction() {
		this.addressBookInfoList = new ArrayList<AddressBookInfo>();
		person = new AddressBookInfo();
		result = false;
		menu = 0;
		input = new Scanner (System.in);
	}

	/**
	 * Getter / Setter
	 * @return
	 */
	public List<AddressBookInfo> getAddressBookInfoList() {
		return addressBookInfoList;
	}
	public void setAddressBookInfoList(List<AddressBookInfo> addressBookInfoList) {
		this.addressBookInfoList = addressBookInfoList;
	}
	public AddressBookInfo getPerson() {
		return person;
	}
	public void setPerson(AddressBookInfo person) {
		this.person = person;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	
	
	/**
	 * 주소록 시작 메소드 
	 */
	public void startBook () {
		
		while ( true ) {
			
			menuGreeting();
			
			if ( menu == 1 ) {
				inputNewPersonInfo();
			} // menu 1 주소록 추가
			else if ( menu == 2 ) {	
				setSearchName();
			} // menu 2 주소록 검색
			else if ( menu == 3 ) {
				setRemoveName();
			} // menu 3 주소록 삭제
			else if ( menu == 4 ) {
				setModifyName();
			}
			else if ( menu == 5 ) {
				exitProgram();
			}
			else {
				elseMenu();
			} // 메뉴 이외의 정수 값일 때
			
		} // while end
		
	} //startBook end

	
	/**
	 * 메뉴 출력 메소드
	 */
	public void menuGreeting () {
		
		// while 숫자 아닌 문자 입력 시 반복
		while ( true ) {
			System.out.println();
			System.out.println("메뉴 선택  (총 " + AddressBookInfo.count + "명 입력)");
			System.out.println("1. 주소록 삽입");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 삭제");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 종료");
			System.out.println();
			System.out.print("입력 : ");
			
			// InputMismatchException 예외 처리
			try {
				menu = input.nextInt();
				break;
			} // try end
			catch ( InputMismatchException ime ) {
				input = new Scanner( System.in );
				System.out.println("숫자 재 입력");
				System.out.println();
			} // catch end
			
		} // while end
	
	} // menuGreeting end
	
	
	
	/**
	 * AddressBookFunction Methods
	 *  
	 * 1. 주소록 삽입
	 * 	1-1 삽입 메뉴 메소드
	 * 	1-2 배열 입력 메소드
	 * 	1-3 이름 입력 메소드
	 * 	1-4 나이 입력 메소드
	 * 	1-5 폰번 입력 메소드
	 * 	1-6 주소 입력 메소드
	 * 	1-7 입력 검사 메소드
	 * 
	 * 2. 주소록 검색
	 * 	2-1 검색 이름 입력 메소드 
	 *		(1-3 이름 입력 메소드)
	 **	2-2 배열 검색 메소드
	 *	2-3 배열 출력 메소드
	 *	
	 * 3. 주소록 삭제
	 * 	3-1 삭제 이름 입력 메소드
	 * 		(1-3 이름 입력 메소드)
	 * 		(2-2 배열 검색 메소드)
	 * 	3-2 배열 삭제 메소드
	 * 		
	 * 4. 주소록 수정
	 * 	4-1 수정 이름 입력 메소드
	 * 		(1-3 이름 입력 메소드)
	 * 		(2-2 배열 검색 메소드
	 * 	4-2 수정 메뉴 입력 메소드
	 * 	4-3 이름 수정 메소드
	 * 	4-4 나이 수정 메소드
	 * 	4-5 폰번 수정 메소드
	 * 	4-6 주소 수정 메소드
	 */
	
	
	/**
	 * 1. 주소록 삽입
	 * 
	 * 1-1 삽입 메뉴 메소드
	 * 추가할 사용자 정보 입력
	 * 주소록 배열에 add
	 * @param personInfo
	 */
	public void inputNewPersonInfo () {
		System.out.println();
		System.out.println("추가할 정보 입력");
		person = new AddressBookInfo();
		// 추가할 정보 입력 메소드
		setPersonName();
		setPersonAge();
		setPersonPhone();
		setPersonAddress();
		
		// 주소록 배열 add 메소드
		addNewAddressBookInfo(person);
	}

	
	/**
	 * 1-2 배열 입력 메소드
	 */
	public void addNewAddressBookInfo ( AddressBookInfo person ) {
		
		this.addressBookInfoList.add(person);
		AddressBookInfo.count++;
	} // addNewAddressBookInfo end
	
	
	/**
	 * 1-3 이름 입력 메소드
	 * 한글 입력 검사
	 */
	public void setPersonName () {
		while ( true ) {
			System.out.println();
			System.out.print("이름  : ");
			person.setName(input.next());
			input = new Scanner ( System.in );
			if ( (inputCheck(person.getName(), "^[가-힣a-zA-z]*$") == true ) ) {
				break;
			}
			
		} // while end 이름 입력 검사
		
	} // setPersonName end
	
	
	/**
	 * 1-4 나이 입력 메소드
	 * 숫자 입력 검사
	 */
	public void setPersonAge () {
		while ( true ) {
						
			// InputMismatchException 예외 처리
			try {
				System.out.println();
				System.out.print("나이 : ");
				person.setAge( input.nextInt() );
				input = new Scanner ( System.in );
				break;
			} // try end
			catch ( InputMismatchException ime ) {
				input = new Scanner ( System.in );
				System.out.println();
				System.err.println("입력 양식 오류!");
			} // catch end
			
		} // while end
	
	} // setPersonAge end
	
	
	/**
	 * 1-5 폰번 입력 메소드
	 * 번호 양식 입력 검사
	 * 숫자3자리 - 숫자3~4자리 - 숫자4자리
	 */
	public void setPersonPhone () {
		while ( true ) {
			System.out.println();
			System.out.print("핸드폰 번호  : ");
			person.setPhoneNumber(input.nextLine());
			input = new Scanner ( System.in );
			if ( (inputCheck(person.getPhoneNumber(), "^[0-9]{3}.[0-9]{3,4}.[0-9]{4}$")) == true ) {
				break;
			}
			else {
				System.err.println("입력 양식 오류!");
				System.out.println("양식 : 3자리-3~4자리-3자리 숫자");
			}
			
		} // while end 핸드폰 번호 입력 검사
		
	} // setPersonPhone end
	
	
	/**
	 * 1-6 주소 입력 메소드
	 * 한글 입력 검사
	 */
	public void setPersonAddress () {
		while ( true ) {
			System.out.println();
			System.out.print("주소  : ");
			person.setAddress(input.nextLine());
			input = new Scanner ( System.in );
			if ( (inputCheck(person.getAddress(), "^[가-힣a-zA-Z]*$")) == true ) {
				break;
			}
			
		} // while end 이름 입력 검사
		
	} // setPersonAddress end
	
		
	/**
	 * 1-7 입력 검사 메소드
	 * 검사할 변수 입력 받아 조건에 맞춰 검사
	 */
	public boolean inputCheck( String input, String regex ) {
		if ( input.matches(regex) ) {
			return true;
		}
		else {
			System.out.println();
			System.err.println("입력 양식 오류!");
			return false;
		}
	} // inputCheck end
	
	
	/**
	 * 2. 주소록 검색
	 * 
	 * 2-1 검색 메뉴 메소드
	 * 검색하려는 이름 입력 받아
	 * (1-3 이름 입력 메소드) 이용하여 입력 받고 검색
	 */
	public void setSearchName () {
		
		System.out.println("검색할 이름 입력");
		person = new AddressBookInfo();
		
		// (1-3 이름 입력 메소드)
		setPersonName();
		
		if ( searchBookByName() ) {
			printResult();
		}
		else {
			searchNothing();
		}
		
	} // setSearchName end
	
	
	/**
	 * 2-2 배열 검색 메소드
	 * 논리값을 리턴타입으로 
	 * 참 = 찾는 값 존재하는 경우
	 * 거짓 = 찾는 값 없는 경우
	 */
	public boolean searchBookByName () {
	
		for ( AddressBookInfo bookInfo : addressBookInfoList ) {
			if ( bookInfo.getName().equals(person.getName()) ) {
				person = bookInfo;
				return true;
			}
		}
		return false;
		
	} // searchBookByName end 
	
	
	/**
	 * 2-3 배열 출력 메소드
	 * 배열 검색 메소드에서 참인 경우
	 * 검색된 메소드를 출력
	 */
	public void printResult () {
		
		System.out.println(person.getName() + " 검색 결과");
		System.out.println("이   름 : " + person.getName());
		System.out.println("나   이 : " + person.getAge());
		System.out.println("핸드폰 : " + person.getPhoneNumber());
		System.out.println("주   소 : " + person.getAddress());
		System.out.println();
		
	} // printResult end
	
	
	/**
	 * 3. 주소록 삭제
	 * 
	 * 3-1 삭제 이름 입력 메소드
	 */
	public void setRemoveName () {
		
		System.out.println("삭제할 이름 입력");
		person = new AddressBookInfo();
		
		// (1-3 이름 입력 메소드)
		setPersonName();
		
		if ( searchBookByName() ) {
			removeBookByName();
		}
		else {
			searchNothing();
		}
	} // setRemoveName end
	
	
	/**
	 * 3-2 배열 삭제 메소드
	 */
	public void removeBookByName () {
		
		System.out.println(person.getName() + " 삭제");
		addressBookInfoList.remove(person);
		AddressBookInfo.count--;
		
	} // removeBookByName end
	
	
	/**
	 * 4 주소록 수정
	 * 
	 * 4-1 수정 이름 입력 메소드
	 */
	public void setModifyName () {
		
		System.out.println("수정할 이름 입력");
		person = new AddressBookInfo();
		
		// (1-3 이름 입력 메소드)
		setPersonName();
		
		if ( searchBookByName() ) {
			
			modifyMenu();
			
			if ( menu == 1 ) {
				nameModify();
			}
			else if ( menu == 2 ) {
				ageModify();
			}
			else if ( menu == 3 ) {
				phoneModify();
			}
			else if ( menu == 4 ) {
				addressModify();
			}
			else if ( menu == 5 ) {
				menuGreeting();
			}
			else {
				searchNothing();
			}
			
		}
		else {
			searchNothing();
		}
	}
	
	
	/**
	 * 4-2 수정 메뉴 입력 메소드
	 */
	public void modifyMenu () {
		
	// while 숫자 아닌 문자 입력 시 반복
			while ( true ) {
				
				System.out.println();
				System.out.println("삭제 메뉴 입력");
				System.out.println("1. 이   름");
				System.out.println("2. 나   이");
				System.out.println("3. 핸드폰");
				System.out.println("4. 주   소");
				System.out.print("입력 : ");

				// InputMismatchException 예외 처리
				try {
					menu = input.nextInt();
					break;
				} // try end
				catch ( InputMismatchException ime ) {
					input = new Scanner( System.in );
					System.out.println("숫자 재 입력");
					System.out.println();
				} // catch end
				
			} // while end
			
	} // modifyMenu end
	
	
	/**
	 * 4-3 이름 수정 메소드
	 */
	public void nameModify (  ) {
		
		System.out.println("이름 수정 메뉴");
		System.out.print("이름 입력 : ");
		String modifyName = input.next();
		input = new Scanner ( System.in );
		
		while ( true ) {
			if ( inputCheck(modifyName, "^[가-힣a-zA-z]*$") == true ) {
				break;
			}
		}
		
		for ( AddressBookInfo bookInfo : addressBookInfoList ) {
			if ( bookInfo.getName().equals(person.getName()) ) {
				person = bookInfo;
				bookInfo.setName(modifyName);
			}
		}
		
	} // nameModify end
	
	
	/**
	 * 4-4 나이 수정 메소드
	 */
	public void ageModify () {
		
		int modifyAge = 0;
		
		while ( true ) {
			
			// InputMismatchException 예외 처리
			try {
				System.out.println();
				System.out.println("나이 수정 메뉴");
				System.out.print("나이 입력 : ");
				modifyAge = input.nextInt();
				input = new Scanner ( System.in );
				break;
			} // try end
			catch ( InputMismatchException ime ) {
				input = new Scanner ( System.in );
				System.out.println();
				System.err.println("입력 양식 오류!");
			} // catch end
			
		} // while end
		
		for ( AddressBookInfo bookInfo : addressBookInfoList ) {
			if ( bookInfo.getName().equals(person.getName()) ) {
				person = bookInfo;
				bookInfo.setAge(modifyAge);
			}
		}
		
	} // nameModify end
	
	
	/**
	 * 4-4 폰번 수정 메소드
	 */
	public void phoneModify () {
		
		System.out.println("핸드폰 수정 메뉴");
		System.out.print("핸드폰 입력 : ");
		String modifyPhone = input.next();
		input = new Scanner ( System.in );
		
		while ( true ) {
			if ( inputCheck(modifyPhone, "^[0-9]{3}.[0-9]{3,4}.[0-9]{4}$") == true ) {
				break;
			}
		}
		
		for ( AddressBookInfo bookInfo : addressBookInfoList ) {
			if ( bookInfo.getName().equals(person.getName()) ) {
				person = bookInfo;
				bookInfo.setPhoneNumber(modifyPhone);
			}
		}
		
	} // nameModify end
	
	
	/**
	 * 4-5 주소 수정 메소드
	 */
	public void addressModify () {
		
		System.out.println("주소 수정 메뉴");
		System.out.print("주소 입력 : ");
		String modifyAddress = input.next();
		input = new Scanner ( System.in );
		
		while ( true ) {
			if ( inputCheck(modifyAddress, "^[가-힣a-zA-z]*$") == true ) {
				break;
			}
		}
		
		for ( AddressBookInfo bookInfo : addressBookInfoList ) {
			if ( bookInfo.getName().equals(person.getName()) ) {
				person = bookInfo;
				bookInfo.setAddress(modifyAddress);
			}
		}
		
	} // nameModify end
	
	
	/**
	 * 프로그램 종료 메소드
	 */
	public void exitProgram () {
		
		System.out.println("프로그램 종료합니다");
		System.exit(0);
		
	} // exitProgram end
	
	/**
	 * 검색 시 찾는 값 없는 경우
	 */
	public void searchNothing () {
		System.out.println();
		System.err.println("찾는 값이 없습니다");
		
	} // searchNothing end
	
	
	/**
	 * 메뉴 선택 시 해당되지 않는 메뉴일 경우
	 */
	public void elseMenu () {
		
		System.out.println("올바른 메뉴가 아닙니다");
		System.err.println();
		
	} // elseMenu end	
	
} // class end
