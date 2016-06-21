package com.ktds.hskim;

import java.util.Scanner;

public class PhoneBook {
	
	public void start() {
		
		Scanner input = new Scanner ( System.in );
		
		PhoneInfoVO phoneInfo = null;
		PhoneBookBiz biz = new PhoneBookBiz();
		
		int choice = 0;
		String searchName = "";
		
		while ( true ) {
			System.out.println("등록 : 1 / 검색 : 2");
			System.out.print("입력 : ");
			choice = input.nextInt();
			
			if ( choice == 1 ) {
				System.out.println("이름, 전화번호, 나이 순으로 입력");
				phoneInfo = new PhoneInfoVO();
				phoneInfo.setName( input.next() );
				phoneInfo.setPhoneNumber( input.next() );
				phoneInfo.setAge( input.nextInt() );
				
				
				// PhoneBookBiz의 addNew 메소드 
				biz.addNewPhoneBookInfo(phoneInfo);
			}
			else if ( choice == 2 ) {
				System.out.print("검색할 이름 입력 : ");
				searchName = input.next();
				
				phoneInfo = biz.getPhoneInfoByName(searchName);
				System.out.println(phoneInfo.getName());
				System.out.println(phoneInfo.getPhoneNumber());
				System.out.println(phoneInfo.getAge());
				
			}
			else {
				System.out.println("종료");
				break;
			}
			
		}
		
	} // start end
	
	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		book.start();
	} // main end

} // class end
