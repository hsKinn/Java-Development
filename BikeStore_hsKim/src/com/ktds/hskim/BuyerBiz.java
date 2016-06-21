package com.ktds.hskim;

public class BuyerBiz {
	
	/**
	 * 인스턴스 선언
	 */
	BuyerVO buyer;
	inputScanner input;
	
	
	/**
	 * 생성자 선언
	 * @param buyer
	 */
	public BuyerBiz ( BuyerVO buyer ) {
		this.buyer = buyer;
		input = new inputScanner();
	}
	
	
	/**
	 * 
	 * 사용자 정보 입력
	 * 
	 */
	public void buyerSetting () {
		
		buyer.setBottomCount(0);
		buyer.setMiddleCount(0);
		buyer.setTopCount(0);
		
		System.out.println("사용자 정보 등록");
		
		System.out.print("이   름 : ");
		buyer.setName( input.inputStr() );
		
		System.out.print("소지금 : ");
		buyer.setMoney(  input.inputInt() );
		
	} // buyerSetting
	
} // class end
