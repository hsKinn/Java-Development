package com.ktds.hskim;

public class Customer {
	
/*	구매자 클래스
 *	사과와 돈을 가짐 (정수형)
 *	
 *	#1 돈 지불하기
 *	#2 사과 받아오기
 * 	#3 거스름돈 받기
 */
	
	
	/**
	 * 	구매자의 소지 금액
	 */
	private int money;
	
	/**
	 * 	구매자 소유한 사과의 수
	 */
	private int appleCount;
	
	public void setMoney ( int money ) {
		this.money = money;
		// 현재 클래스 money에 파라미터 money 대입
	}
	
	public void setAppleCount ( int appleCount ) {
		this.appleCount = appleCount;
	}
	
	public int getMoney () {
		return this.money;
	} // this가 없어도 인스턴스 필드로 인지 됨
	
	public int getAppleCount() {
		return this.appleCount;
	}
	
	
	/**
	 * 	구매자의 관점에서 구매하기
	 * 	money 만큼 금액을 지불함
	 */
	public int pay ( int money ) {
		this.money -= money;
		return money;
		// this.money(소지 금액)에서 지불 금액이 차감
	}
	
	/**
	 * 	사과를 가져온다
	 */
	public void getApple ( int appleCount ) {
		this.appleCount += appleCount;
	}
	
	/**
	 * 	거스름 돈 받기
	 */
	public void takeMoney ( int money ) {
		this.money += money;
	}
	
	/**
	 * 	구매자의 정보 출
	 */
	public void printMyInfo () {
		System.out.println("구매자 소유 사과 : " +  this.appleCount);
		System.out.println("구매자 소지 금액 : " + this.money);
	}
	
	
	
}
