package com.ktds.hskim;

public class Seller {
	
	/*
	 * 	클래스 속성 정의
	 */
	private int money;
	private int appleCount;
	private int applePrice;
	
	/**
	 * 	생성자 작성 위치
	 * 	
	 */
	public Seller ( int money, int appleCount, int applePrice) {
		this.setMoney(money);
		this.setAppleCount(appleCount);
		this.setApplePrice(applePrice);
		
	} // 생성자 생성할 때 부터 데이터를 준다
	
	public Seller () {
		
	}
	
	
	/*
	 * 	Getter / Setter 정의
	 * 	Source ->  Generate Getters and Setters
	 * 	Alt - S - R 
	 */
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAppleCount() {
		return appleCount;
	}
	public void setAppleCount(int appleCount) {
		this.appleCount = appleCount;
	}
	public int getApplePrice() {
		return applePrice;
	}
	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}
	
	/**
	 * 	소비자에게 판매한 금액 받기
	 * 	소비자한테 바로 받기 때문에
	 * 	소비자가 필요함 (파라미터로 받아옴)
	 * 
	 */
	public void getMoneyFromCustomer( int money, Customer customer ) {
		this.money += customer.pay(money);
	} // pay 메소드를 리턴 타입있는 메소드로 변경해야함
	
	
	/**
	 * 소비자에게 사과 건내주기
	 * 
	 */
	public void giveApple( int appleCount, Customer customer) {
		this.appleCount -= appleCount;		
		customer.getApple(appleCount);
	}
	
	
	/**
	 * 소비자에게 거스름돈 주기
	 * 구매자가 지불한 돈, 구매자가 구매한 개수, 거스름돈
	 * 지불한 돈  - (구매한 개수 * 구매한 물건 가격)
	 */
	public void giveRemain( int money, int appleCount, Customer customer ) {
		int remain = money - ( appleCount * this.applePrice );
		this.money -= remain;
		customer.takeMoney(remain);
	}
	
	
	/*
	 * 	판매자 정보 출력
	 */
	public void printMyInfo() {
		System.out.println("판매자 보유 사과 : " + this.appleCount);
		System.out.println("판매자 보유 자금 : " + this.money);
	}
	
	
	
	
}
