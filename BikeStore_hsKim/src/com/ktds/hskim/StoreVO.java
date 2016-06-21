package com.ktds.hskim;

public class StoreVO {
	
	/**
	 * 보급형 자전거 대여 가격
	 * 10분 = 1000원
	 */
	public static final int BOTTOM_PRICE = 1000;
	
	/**
	 * 중급형 자전거 대여 가격
	 * 10분 = 2000원
	 */
	public static final int MIDDLE_PRICE = 2000;
	
	/**
	 * 고급형 자전거 대여 가격
	 * 10분 = 5000원
	 */
	public static final int TOP_PRICE = 5000;
	
	/**
	 * 보급형 자전거 보유 개수
	 */
	private int bottomCount = 10;
	
	/**
	 * 중급형 자전거 보유 개수
	 */
	private int middleCount = 3;
	
	/**
	 * 고급형 자전거 보유 개수
	 */
	private int topCount = 2;
	
	/**
	 * 상점의 돈 
	 */
	private int storeMoney;
	
	
	/**
	 * Getter / Setter
	 * @return
	 */
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

	public int getStoreMoney() {
		return storeMoney;
	}

	public void setStoreMoney(int storeMoney) {
		this.storeMoney = storeMoney;
	}
	
}
