package com.ktds.gmkim;

import java.util.ArrayList;
import java.util.List;

/**
 * 주소록 관리
 */
public class AddressBookBiz {

	// 객체 및 변수 생성
	private List<AddressBookVO> addressBook;
	private int choice;

	private AddressBookVO info;
	private AddressCreate create;
	private AddressSearch search;
	private AddressDelete delete;
	private AddressModify modify;
	private AddressInput in;

	// 생성자
	public AddressBookBiz() {

		// 객체 및 변수 초기화
		this.addressBook = new ArrayList<AddressBookVO>();
		choice = 0;

		this.info = new AddressBookVO();
		this.create = new AddressCreate();
		this.search = new AddressSearch();
		this.delete = new AddressDelete();
		this.modify = new AddressModify();
		this.in = new AddressInput();
	}

	// Getter, Setter - addressBook
	public List<AddressBookVO> getAddressBook() {
		return addressBook;
	}
	public void setAddressBook(List<AddressBookVO> addressInfoList) {
		this.addressBook = addressInfoList;
	}

	// Getter, Setter - choice
	public int getChoice() {
		return this.choice;
	}
	public void setChoice() {
		this.choice = in.inputInt();
	}

	// Add
	public void addAddressInfo(AddressBookVO info) {
		this.addressBook.add(info);
	}

	// Remove
	public void removeAddressInfo(AddressBookVO info) {
		this.addressBook.remove(info);
	}

	/**
	 * 프로그램 시작
	 */
	public void startProgram() {

		while (true) {

			System.out.println("등록 1번, 검색 2번, 삭제 3번, 수정 4번, 종료 0번");

			// 번호 입력
			this.setChoice();
			choice = this.getChoice();

			if (choice == 1) {
				info = new AddressBookVO();
				create.createInfo(info, this, in);
			}
			else if (choice == 2) {
				search.searchInfo(this, in);
			}
			else if (choice == 3) {
				delete.deleteInfo(this, in);
			}
			else if (choice == 4) {
				modify.modifyInfo(this, info, in);
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}
	}

	/**
	 * name 과 같은 이름을 가진 정보가 있으면 해당 Info 반환
	 * 
	 * @param name
	 * @return
	 */
	public AddressBookVO returnAddressInfo(String name) {

		for (AddressBookVO vo : this.getAddressBook()) {
			if (vo.getName().equals(name)) {
				return vo;
			}
		}
		return new AddressBookVO();
	}

	/**
	 * name 과 같은 이름을 가진 정보가 있는지 확인
	 * 
	 * @param name
	 * @return
	 */
	public boolean isAddressEmpty(String name) {

		for (AddressBookVO vo : this.getAddressBook()) {

			if (vo.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
}
