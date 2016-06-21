package com.ktds.gmkim;

/**
 * 수정 
 */
public class AddressModify {

	private String modifyName;

//	기본생성자
	public AddressModify() {
		modifyName = "";
	}
	
//	정보 찾기
	public void modifyInfo ( AddressBookBiz biz, AddressBookVO info, AddressInput in ) {

//		수정할 사람의 이름 입력
		System.out.println("수정할 사람의 이름을 입력하세요.");
		modifyName = in.inputString();
		
		if ( !biz.isAddressEmpty(modifyName) ) {
		
			info = biz.returnAddressInfo(modifyName);
			
			// 모든 인스턴스는 각자의 메모리를 가지고 있기 때문에
			// function 에 최신화 시키지 않아도 알아서 등록된다.
			System.out.println("이름과 전화번호 주소 나이를 순서대로 입력하세요.");
			info.setName(in.inputString());
			info.setPhoneNumber(in.inputString());
			info.setAddress(in.inputString());
			info.setAge(in.inputInt());
		}
		else {
			System.out.println("그 사람은 없습니다.");
		}
	}
}
