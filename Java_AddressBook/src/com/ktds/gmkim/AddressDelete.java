package com.ktds.gmkim;

/**
 * 주소록 삭제 클래스
 */
public class AddressDelete {

	private String deleteName;
	
	//	생성자
	public AddressDelete () {
		deleteName = "";
	}

	/**
	 * 삭제
	 * 
	 * @param biz
	 * @param in
	 */
	public void deleteInfo ( AddressBookBiz biz, AddressInput in ) {
		
		System.out.println("삭제할 이름을 입력하세요.");
		deleteName = in.inputString();
		
		// deleteName 을 가진 Info 가 있으면 삭제
		if ( !biz.isAddressEmpty(deleteName)) {
			biz.removeAddressInfo( biz.returnAddressInfo(deleteName) );
			System.out.println(deleteName + "의 정보가 삭제되었습니다.");
		}
		else {
			System.out.println(deleteName + "의 정보는 존재하지 않습니다.");
		}
	}
}

