package com.ktds.hskim;

public class Market {
	
	private int appleCount = 15;
	private int money = 4000;
	public static final int APPLE_PRICE = 500;
	// 상수명은 대문자로
	
	public void start() {
		
		// 구매자 인스턴스 선언
		Customer 남준호 = new Customer();
		남준호.setMoney(5200);
		남준호.setAppleCount(0);
		
		while ( true ) {
			// 판매자에게 돈 지불
			남준호.pay(1000);
			this.money += 1000;
			
			// 판매자에게 사과 제공
			this.appleCount -= 1;
			남준호.getApple(1);
			
			// 거스름돈 제공
			// 거스름돈 변수 하나 생성하여 지불 금액에서 제외 후 제공
			int money = 1000 - ( Market.APPLE_PRICE * 1 );
			this.money -= money;
			남준호.takeMoney(money);
			
			// 구매자 정보 출력
			남준호.printMyInfo();
			
			if ( this.appleCount == 0 || 남준호.getMoney() < Market.APPLE_PRICE ) {
				System.out.println("못 팝니다.");
				break;
			}
				
		}
	}
	
	public static void main(String[] args) {
		Market market = new Market();
		// 자기 자신을 인스턴스화
		market.start();
		
	} // main
	
} // class
