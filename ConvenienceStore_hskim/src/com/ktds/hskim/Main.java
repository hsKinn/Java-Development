package com.ktds.hskim;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static final int MARL_PRICE = 2500;

	public void start() {

		String name = "";
		int age = 0;
		int money = 0;
		
		boolean menu; // 프로그램 반복 변수
		boolean check; // 소비자 age check

		Random rand = new Random(); // 소지금 랜덤값으로 발생
		Scanner input = new Scanner(System.in);
		Seller seller = new Seller();
		
		// 편의점 담배 개수 초기화
		seller.setMarlCount(10);
		
		// Title
		System.out.println("Convenience Store");
		System.out.println();

		System.out.print("이름 입력 : ");
		name = input.next();
		
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		// 소비자 인스턴스 생성 파라미터 (이름, 자금(난수), 나이)
		Buyer buyer = new Buyer(name, rand.nextInt(100000), age);
		
		// 소비자 age check (true = 진행 / false = 종료)
		if ( check = seller.idCheck(buyer) ) ;
		else{
			System.out.println("종료합니다");
			System.exit(1);
		}
		
		// 판매 허용시  판매 안내 문구 output
		seller.greeting(buyer);
		
		// loop start
		while ( menu = true ) {
			
			// 구매자 자금 확인
			seller.moneyCheck(buyer);
					
			// 구매자 구매하기
			seller.buyingMarl(buyer, input);
			
			// 판매자 잔돈주기
			seller.giveRemain(buyer);

			// 프로그램 반복 문의 및 종료 메세지
			seller.repeatCheck(input, buyer);

		} // while

	} // start

	public static void main(String[] args) {
		Main ConvenienceStore = new Main();
		ConvenienceStore.start();
	} // main

} // class
