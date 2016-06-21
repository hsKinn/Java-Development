package com.ktds.hskim;

public class Main {
	
	public void start() {
		
		/**
		 * 인스턴스화
		 */
		BuyerVO buyer = new BuyerVO();
		StoreVO bikeStore = new StoreVO();
		BuyerBiz buyBiz = new BuyerBiz(buyer);
		StoreBiz storeBiz = new StoreBiz(buyer, bikeStore);
		
		// Title
		System.out.println("Bike Rental Service");
		System.out.println();
		
		// 사용자 등록
		buyBiz.buyerSetting();
		
		// 대여 프로세스
		storeBiz.rentProcess();
		
	} // start end
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	} // main end
	
} // class end
