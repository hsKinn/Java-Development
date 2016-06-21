package com.ktds.haneul;

import java.util.ArrayList;
import java.util.List;

public class AddressBookBiz {

	private List<AddressInfoVO> addressInfoList;

	public AddressBookBiz() {
		this.addressInfoList = new ArrayList<AddressInfoVO>();
	}

	public List<AddressInfoVO> getAddressInfoList() {
		return addressInfoList;
	}

	public void setAddressInfoList(List<AddressInfoVO> addressInfoList) {
		this.addressInfoList = addressInfoList;

	}

	public void addNewAddressBookInfo(AddressInfoVO addressInfo) {
		this.addressInfoList.add(addressInfo);
	}

	// 주소삭제
	public void NewDeleteBookInfo(String searchName) {

		// 1번째 인스턴스 제거

		for (int i = 0; i < addressInfoList.size(); i++) {
			if (addressInfoList.get(i).getName().equals(searchName)) {
				addressInfoList.remove(i);
				System.out.println("삭제하였습니다.");
			}
		}
	}

	// 주소를 검색
	public AddressInfoVO getAddressInfoByName(String name) {
		// for (AddressInfoVO addressInfo : this.addressInfoList) {
		// if (addressInfo.getName().equals(name)) {
		// return addressInfo;
		for (int i = 0; i < addressInfoList.size(); i++) {
			if (addressInfoList.get(i).getName().equals(name)) {
				return addressInfoList.get(i);
			}
		}
		System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
		return new AddressInfoVO();
	}

}
