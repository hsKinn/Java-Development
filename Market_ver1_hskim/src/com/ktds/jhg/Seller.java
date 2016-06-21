package com.ktds.jhg;

public class Seller {
	
	private int money;
	private int applecount;
	private int appleprice;
	
/*	메소드의 파라미터 개수가 다른 경우
	메소드의 파라미터 종류가 다른 경우
	를 메소드 오버로딩 이라 부른다.
	
	public Seller(){
		
	}                            */
	       //기본 생성자. 클래스 이름과 같아야함
	public Seller( int money, int appleCount, int applePrice ){
		
		this.setMoney(money);
		this.setAppleconunt(appleCount);
		this.setAppleprice(applePrice);
	}
	
	public int getMoney(int money){
		return 0;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAppleconunt() {
		return applecount;
	}
	public void setAppleconunt(int appleconunt) {
		this.applecount = appleconunt;
	}
	public int getAppleprice() {
		return appleprice;
	}
	public void setAppleprice(int appleprice) {
		this.appleprice = appleprice;
	}
	
	public void getMoneyFromCustomer ( int money, Customer customer  ) {    //  customer 에서  pay를 사용하기 때문에 메소드에 추가해야함
		this.money += customer.pay( money );        // 소비자가 지불한 돈을 받는 구조기 때문에  배성진.pay(money);
		
	}
	public void giveApple ( int appleCount, Customer customer ) {  // 소비자가 받는 사과  Customer에서 직접 받기 때문에 메소드 선언
		this.applecount -= appleCount;                             
		customer.getApple(appleCount);
	}
	public void giveRemain( int money, int appleCount, Customer customer ){    // 구매자가 지불한돈, 소비자가 가져간 사과, 거스름돈
		int remain = money - ( appleCount * this.appleprice );
	    this.money -= remain;
		customer.takeMoney(remain);
	}
	
	public void printMyInfo(){
		System.out.println("판매자가 가진 사과의수 :" + this.applecount);
		System.out.println("판매자가 가진 금액 : " + this.money);
	}
	
	
	
}
