package com.ktds.haneul;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressBook {

	public void start() {

		AddressInfoVO ad = new AddressInfoVO();

		Scanner input = new Scanner(System.in);

		int choice = 0;
		String searchName = "";

		AddressInfoVO addressInfo = null;

		// 메소드 클래스 인스턴스화
		AddressBookBiz biz = new AddressBookBiz();

		while (true) {

			try {
				System.out.println("주소등록 1번,주소찾기 2번,주소삭제 3번 ");
				choice = input.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			} finally {
				input.nextLine();
			}

			if (choice == 1) {
				addressInfo = new AddressInfoVO();

				System.out.println("이름을 입력해 주세요.");

				addressInfo.setName(input.next());
				System.out.println("나이를 입력해 주세요.");

				addressInfo.setAge(input.nextInt());
				System.out.println("전화번호를 입력해 주세요.");
				addressInfo.setPhoneNumber(input.next());
				System.out.println("주소를 입력해 주세요.");
				addressInfo.setAddress(input.next());

				biz.addNewAddressBookInfo(addressInfo);
				System.out.println("등록되었습니다.");

			} else if (choice == 2) {
				System.out.println("검색할 이름을 입력하세요.");
				searchName = input.next();

				addressInfo = biz.getAddressInfoByName(searchName);
				System.out.println(addressInfo.getName());
				System.out.println(addressInfo.getPhoneNumber());
				System.out.println(addressInfo.getAge());
				System.out.println(addressInfo.getAddress());

			} else if (choice == 3) {

				System.out.println("삭제 하고싶은 주소록 이름을 입력하세요.");
				searchName = input.next();

				biz.NewDeleteBookInfo(searchName);

			} else {
				System.out.println("잘못 입력하셨습니다.");

			}

		}
	}

	public static void main(String[] args) {

		// 메인 클래스 인스턴스화
		AddressBook addressBook = new AddressBook();
		addressBook.start();

	}

}
