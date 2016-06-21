package com.ktds.hskim;

public class BuyerVO {

	/**
	 * 대여자 이름
	 */
	private String name;
	
	/**
	 * 대여자 소유한 돈
	 */
	private int money;
	
	/**
	 * 보급형 자전거 보유 개수
	 */
	private int bottomCount;
	
	/**
	 * 중급형 자전거 보유 개수
	 */
	private int middleCount;
	
	/**
	 * 고급형 자전거 보유 개수
	 */
	private int topCount;
	
	/**
	 * 대여 시간
	 */
	private int rentTime;
	
	/**
	 * 반납 시간
	 */
	private int returnTime;

	
	/**
	 * Getter / Setter
	 * @return
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
	public int getBottomCount() {
		return bottomCount;
	}
	public void setBottomCount(int bottomCount) {
		this.bottomCount = bottomCount;
	}
	public int getMiddleCount() {
		return middleCount;
	}
	public void setMiddleCount(int middleCount) {
		this.middleCount = middleCount;
	}
	public int getTopCount() {
		return topCount;
	}
	public void setTopCount(int topCount) {
		this.topCount = topCount;
	}
	public int getRentTime() {
		return rentTime;
	}
	public void setRentTime(int rentTime) {
		this.rentTime = rentTime;
	}
	public int getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}

}

