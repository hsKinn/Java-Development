package com.ktds.hskim;

public class Buyer {
	
	/**
	 * 소비자 이름
	 */
	private String name;
	
	/**
	 * 	소비자 자금
	 */
	private int money;
	
	/**
	 * 	소비자 나이
	 */
	private int age;
	
	/**
	 * 	소비자 보유 담배의 수
	 */
	private int marlCount;
	
	public Buyer ( String name, int money, int age ) {
		this.setName(name);
		this.setMoney(money);
		this.setAge(age);
	} // 생성자 선언
	
	
	/**
	 * 	Getter / Setter 정의
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}	
	public void setMoney(int money) {
		this.money = money;
	}	
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}	
	public int getMarlCount() {
		return marlCount;
	}	
	public void setMarlCount(int marlCount) {
		this.marlCount = marlCount;
	}		
	
	//	Method 
		
	/**
	 * 	소비자 지불
	 */
	public int pay ( int money ) {
		this.money -= money;
		return money;
	}
	
	
	/**
	 * 	소비자 담배 구입
	 */
	public void buyMarl ( int marlCount ) {
		this.marlCount += marlCount;
	}
	
	
	/**
	 * 소비자 잔돈 회수
	 */
	public void takeRemain ( int money ) {
		this.money += money;
	}
	
	
	/**
	 * 소비자 보유 담배의 수
	 */
	public void marlCount ( int marlCount ) {
		this.marlCount += marlCount;
	}
	
	
	/**
	 * 소비자 정보 출력
	 */
	public void printInfo () {
		System.out.println();
		System.out.println(this.getName() + "님은 " + this.getMarlCount() + "개 구매하셨습니다");
		System.out.println("현재 소지 금액은 " + this.getMoney() + "원 입니다");
	}
	
} // class