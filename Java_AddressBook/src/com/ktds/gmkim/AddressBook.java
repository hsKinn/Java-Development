package com.ktds.gmkim;

/**
 * Main 
 */
public class AddressBook {

	public void start() {
		
//		주소록 객체 생성
		AddressBookBiz func = new AddressBookBiz();

//		프로그램 시작
		func.startProgram();
	}
	
	public static void main(String[] args) {
		AddressBook test = new AddressBook();
		test.start();
	}
}
