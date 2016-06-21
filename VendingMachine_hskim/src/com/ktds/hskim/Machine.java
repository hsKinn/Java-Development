package com.ktds.hskim;

public class Machine {
	
	private int eggCount = 30;
	private int money = 0;
	
	/**
	 * Getter / Setter 설정
	 */
	public int getEggCount() {
		return eggCount;
	}
	public void setEggCount(int eggCount) {
		this.eggCount = eggCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 계란 판매하여 수익 얻는 메소드
	 */
	public void sellEgg ( int money, Customer customer) {
		this.money += customer.pay(money);
	}

	/**
	 * 돈을 지불한 고객에게 계란을 주는 메소드
	 */
	public void giveEgg ( int eggCount, Customer customer) {
		this.eggCount -= eggCount;
		customer.eatEgg(eggCount);
	}
	
	/**
	 * 돈을 지불한 고객에게 나머지 잔돈을 주는 메소드
	 */
	public void giveRemain ( int money, Customer customer) {
		int remain = money - ( 1 * Main.EGG_PRICE);
		System.out.println();
		System.out.println("입금 하신 " + money + "원에서 남은 잔돈 " + remain + "원 입니다.");
		this.money -= remain;
		customer.takeRemain(remain);
	}
	
	/**
	 * 자판기 기계의 정보 출력
	 */
	public void printInfo ( Customer customer ) {
		System.out.println();
		System.out.println("현재 남은 계란 : " + this.eggCount);
		System.out.println("누적 수익 : " + this.money);
		System.out.println(customer.getName() + "님 현재까지 " + customer.getEatCount() + "번 드셨습니다.");
		System.out.println();
	}
}