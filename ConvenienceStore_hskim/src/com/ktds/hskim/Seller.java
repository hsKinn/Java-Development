package com.ktds.hskim;

import java.util.Scanner;

public class Seller {

	/**
	 * 판매자 보유 담배의 수
	 */
	private int marlCount;

	
	/**
	 * 구매자가 지불할 금액
	 */
	private int pay;
	
	
	/**
	 * 구매자가 구매하려는 개수
	 */
	private int buyNumber;
	
	/**
	 * Getter / Setter 정의
	 */
	
	public int getMarlCount() {
		return marlCount;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBuyNumber() {
		return buyNumber;
	}
	public void setBuyNumber(int buyNumber) {
		this.buyNumber = buyNumber;
	}
	public void setMarlCount(int marlCount) {
		this.marlCount = marlCount;
	}

	// Method 
	
	/**
	 * 소비자 나이 검사를 통해서 
	 * 20세 이상 true / 20세 미만 false
	 * 논리값 return
	 */
	public boolean idCheck(Buyer buyer) {
		// age 논리 검사
		boolean check = buyer.getAge() >= 20;
		System.out.println();
		
		if (buyer.getAge() >= 20) {
			System.out.println("당신은 " + buyer.getAge() + "살 이므로 구매가 가능 합니다");
			System.out.println();
			return check;
		} // 20세 이상인 경우 
		else {
			System.out.println("20세 미만이므로 판매 되지 않습니다");
			System.out.println();
			return check;
		} // 20세 미만인 경우
	} // idCheck
	
	
	/**
	 * 판매자 그리팅
	 * 고객에게 판매 가격과 재고 수량 공지
	 */
	public void greeting(Buyer buyer) {
		System.out.println("안녕하세요 " + buyer.getName() + "님 Marlboro 판매점입니다");
		System.out.println();
		System.out.println("판매 가격 : " + Main.MARL_PRICE);
		System.out.println("재고 수량 : " + marlCount);
		System.out.println();
	} // greeting
	
	
	/**
	 * 구매자 자금 체크
	 * 소지 금액이 담배 가격보다 낮다면 종료
	 * 편의점의 담배 재고가 부족하면 종료
	 */
	public void moneyCheck ( Buyer buyer ) {
		if (buyer.getMoney() < Main.MARL_PRICE) {
			System.out.println("소지금이 부족해서 구매할 수 없습니다.");
			System.out.println("프로그램 종료");
			// 종료 시 구매자 정보 출력
			buyer.printInfo();
			System.exit(1);
		} // 소지 금액 check (담배 가격보다 낮다면 종료)
		else if (this.getMarlCount() == 0) {
			System.out.println("재고가 부족합니다.");
			System.out.println("프로그램 종료");
			// 종료 시 구매자 정보 출력
			buyer.printInfo();
			System.exit(1);
		} // 재고 수량 Check (담배 재고가 부족하면 종료)
	}
	
	
	/**
	 * 판매 프로세스
	 * for문을 통해서 입력시 발생될 수 있는 잘못된 값들
	 * 반복을 통해 걸러낸다
	 */
	public void buyingMarl ( Buyer buyer, Scanner input ) {
		for (int i = 0; i < 1; i += 0) {
			// 구매 가능 개수 알리고 구매 수량 입력 받음
			System.out.println(buyer.getMoney() + "원 소지 중 " + marlCount + "개 구매 가능");
			System.out.print("구매 수량 입력 : ");
			buyNumber = input.nextInt();
			System.out.println();
			
			if ( buyNumber > marlCount || buyNumber <= 0 || buyer.getMoney() < (buyNumber * Main.MARL_PRICE ) ) {
				System.out.println("구매 가능한 수량이 아닙니다");
				System.out.println();
				continue;
			} // 구매하려는 수량이 재고보다 많은 경우 [재 반복]
			
			// 총 구매 금액 알리고 지불 받을 금액 입력
			System.out.println("총 " + (buyNumber * Main.MARL_PRICE) + "원 나왔습니다");
			System.out.print("지불 금액 입력 : ");
			pay = input.nextInt();
			
			if ( pay > buyer.getMoney() ) {
				System.out.println();
				System.out.println("소지 금액 범위 초과");
				System.out.println();
				continue;
			} // 보유 금액보다 큰 금액 입력 시[재 반복]
			else if ( pay < (buyNumber * Main.MARL_PRICE) ) {
				System.out.println();
				System.out.println("지불 하신 금액이 부족합니다.");
				System.out.println();
				continue;
			} // 지불 해야 할 금액보다 적은 금액 입력 시 [재 반복]
			else
				i++; // 정상적인 경우 i++을 통해 for문 종료
			
			// 판매자, 구매자 수량 감산 처리
			this.marlCount -= buyNumber;
			buyer.marlCount(buyNumber);
			
			// 구매자 금액 감산 처리
			buyer.pay(pay);
			
		} // for
	} // buyingMarl


	/**
	 * 소비자 잔액 제공
	 * 지불한 금액 - (구매한 수 * 말보루가격)
	 */
	public void giveRemain( Buyer buyer ) {
		int remain = (pay - (buyNumber * Main.MARL_PRICE));
		
		// 구매자 소지 금액 감산 처리
		buyer.takeRemain(remain);

		System.out.println();
		System.out.println(this.buyNumber + "개 구매해서 " + this.buyNumber * Main.MARL_PRICE + "원 나왔습니다");
		System.out.println(pay + "원 지불하셨고 잔돈은 " + remain + "원 입니다");
		System.out.println();
		
	} // giveRemain
	
	
	/**
	 * 프로그램 종료 문의
	 */
	public void repeatCheck ( Scanner input, Buyer buyer ) {
		System.out.println("재시작 : 1 / 종료 : 0");
		System.out.print("입력 : ");
		int check = input.nextInt();
		System.out.println();

		if (check == 0) {
			System.out.println("프로그램 종료");
			
			// 종료 시 구매자 정보 출력
			buyer.printInfo();
			System.exit(1);
		}
	} // repeatCheck
	
} // class