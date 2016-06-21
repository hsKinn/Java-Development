package com.ktds.hskim;

public class Customer {
	
	private int eatCount;
	private String name;
	private int money;
	
	/**
	 * 생성자 설정
	 */
	public Customer ( String name, int money ) {
		this.setName(name);
		this.setMoney(money);
	}
	

	/**
	 * Getter / Setter 설정
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEatCount() {
		return eatCount;
	}
	public void setEatCount(int eatCount) {
		this.eatCount = eatCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	/**
	 * 	고객이 돈을 지불하는 메소드
	 */
	public int pay ( int money ) {
		this.money -= money;
		return money;
	}
	
	
	/**
	 * 	고객이 계란을 먹는 횟수
	 */
	public void eatEgg ( int eatCount ) {
		this.eatCount += eatCount;
	}
	
	/**
	 * 	고객이 잔돈을 받는 메소드
	 */
	public void takeRemain ( int money ) {
		this.money += money;
	}
}