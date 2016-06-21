package com.ktds.hskim;

public class Emart {
	
	public void start() {
		
		// 생성자 이용
		Seller 과일장수1 = new Seller( 50000, 20, 1500);
		// 따로 초기화를 해줄 필요 없다.
//		과일장수1.setAppleCount(20);
//		과일장수1.setMoney(50000);
//		과일장수1.setApplePrice(1500);
		
		Seller 과일장수2 = new Seller ( 5000, 1, 5000);
		
		Seller 과일장수3 = new Seller ();
		과일장수3.setAppleCount(10);
		과일장수3.setApplePrice(500);
		과일장수3.setMoney(0);
		// 기본 생성자가 아닌 사용자가 정의한 생성자가 있다면 기본 생성자 사용 못함
		
		
		Customer 백지경 = new Customer();
		백지경.setMoney(60000);
		백지경.setAppleCount(0);
		
		과일장수1.getMoneyFromCustomer(3000, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		System.out.println();
		
		과일장수1.giveApple(3000/과일장수1.getApplePrice() , 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		System.out.println();
		
		과일장수1.giveRemain(3000, 2, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		
		과일장수2.getMoneyFromCustomer(5000, 백지경);
		과일장수2.printMyInfo();
		백지경.printMyInfo();
		
		과일장수2.giveApple(5000/과일장수2.getApplePrice() , 백지경);
		과일장수2.printMyInfo();
		백지경.printMyInfo();
		System.out.println();
		
		과일장수2.giveRemain(5000, 1, 백지경);
		과일장수2.printMyInfo();
		백지경.printMyInfo();
	}
	
	
	public static void main(String[] args) {
		Emart mart = new Emart();
		mart.start();
	}
}
