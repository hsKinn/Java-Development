package com.ktds.hskim;

public class People {
	
	private int money;
	private int colaQuantity;
	private int spriteQuantity;
	private int fantaQuantity;
	
	/**
	 * Getter / Setter
	 * @return
	 */
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getColaQuantity() {
		return colaQuantity;
	}
	public void setColaQuantity(int colaQuantity) {
		this.colaQuantity = colaQuantity;
	}
	public int getSpriteQuantity() {
		return spriteQuantity;
	}
	public void setSpriteQuantity(int spriteQuantity) {
		this.spriteQuantity = spriteQuantity;
	}
	public int getFantaQuantity() {
		return fantaQuantity;
	}
	public void setFantaQuantity(int fantaQuantity) {
		this.fantaQuantity = fantaQuantity;
	}
	
	// 돈 넣기, 음료 받기, 거스름돈 받기
	
	/**
	 * 구매자 돈 지불
	 * @param money
	 * @return
	 */
	public int pay ( int money ) {
		this.money -= money;
		return money;
	}
	
	public void addCola (int quantity) {
		this.colaQuantity += quantity;
	}
	
	public void addSprite (int quantity) {
		this.spriteQuantity += quantity;
	}
	
	public void addFanta (int quantity) {
		this.fantaQuantity += quantity;
	}
	
	public void getRemainMoney (int money) {
		this.money += money;
	}
	
	/**
	 * 소비자 정보 출력
	 */
	public void printMyInfo() {
		System.out.println("구매자 소유 자금 : " + this.getMoney());
		System.out.println("구매자 구입 콜라 : " + this.getColaQuantity());
		System.out.println("구매자 구입 스프라이트 : " + this.getSpriteQuantity());
		System.out.println("구매자 구입 환타 : " + this.getFantaQuantity());
	}
	
	
}
