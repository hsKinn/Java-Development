package com.ktds.gmkim;

/**
 * Create Class
 */
public class AddressCreate {

	// 기본생성자
	public AddressCreate() {

	}

	/**
	 * 등록
	 * 
	 * @param info
	 * @param biz
	 * @param in
	 */
	public void createInfo(AddressBookVO info, AddressBookBiz biz, AddressInput in) {

		System.out.println("이름과 전화번호 주소 나이를 순서대로 입력하세요.");

		// 입력후 Add
		biz.addAddressInfo( this.inputInfo(info, in) );
	}

	/**
	 * 등록할 정보 입력
	 * 
	 * @param info
	 */
	private AddressBookVO inputInfo(AddressBookVO info, AddressInput in) {

		info.setName(in.inputString());
		info.setPhoneNumber(in.inputString());
		info.setAddress(in.inputString());
		info.setAge(in.inputInt());

		return info;
	}
}
