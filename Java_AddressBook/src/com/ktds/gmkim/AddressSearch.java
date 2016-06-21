package com.ktds.gmkim;

/**
 * 검색 클래스
 */
public class AddressSearch {

	private String searchName;

//	기본생성자
	public AddressSearch() {
		searchName = "";
	}
	
//	정보 찾기
	public void searchInfo ( AddressBookBiz biz, AddressInput in ) {

		System.out.println("검색할 이름을 입력하세요.");

//		검색할 이름 입력
		searchName = in.inputString();
		
		if ( !biz.isAddressEmpty(searchName) ) {
			printInfo(biz.returnAddressInfo(searchName));
		}
		else {
			System.out.println("없습니다.");
		}
	}

//	찾는 정보가 존재하면 출력
	private void printInfo ( AddressBookVO info ) {
		
		System.out.println( info.getName() );
		System.out.println( info.getPhoneNumber() );
		System.out.println( info.getAddress() );
		System.out.println( info.getAge() );
	}
}
