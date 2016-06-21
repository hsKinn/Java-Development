package com.ktds.jhg;

public class Emart {

	public void start(){
		
		Seller 과일장수1 = new Seller( 50000, 20, 1500 );
		Seller 과일장수2 = new Seller (5000, 1, 5000);
/*		Seller 과일장수3 = new Seller();    Seller 13 ~ 16 line
		과일장수3.setAppleconunt(10);
		과일장수3.setAppleprice(500);
		과일장수3.setMoney(0);               */
		
		
		/*과일장수1.setAppleconunt(20);
		과일장수1.setMoney(50000);
		과일장수1.setAppleprice(1500);*/    // 매우 번거롭다.   7번 line 과 같은 기능,  Seller 10~14 과 같은 기능
		
		Customer 배성진 = new Customer();
		배성진.setMoney(60000);
		배성진.setappleCount(0);
		
		과일장수1.getMoneyFromCustomer(3000, 배성진);
		과일장수1.printMyInfo();
		배성진.printMyInfo();
		
		과일장수1.giveApple(1, 배성진);
		과일장수1.printMyInfo();
		배성진.printMyInfo();
		
		과일장수1.giveRemain(3000, 1, 배성진);
		과일장수1.printMyInfo();
		배성진.printMyInfo();
		
		과일장수2.getMoneyFromCustomer(5000, 배성진);  // 배성진이라는 인스턴스를 썼으니까 컨트롤+ 클릭하면  Customer customer로 대입된걸 알수 있다.
		과일장수2.printMyInfo();                      // 인스턴스 -> 인스턴스 대입된거임
		배성진.printMyInfo();
		
		과일장수2.giveApple(1, 배성진);
		과일장수2.printMyInfo();
		배성진.printMyInfo();
		
		과일장수2.giveRemain(5000, 1, 배성진);
		과일장수2.printMyInfo();
		배성진.printMyInfo();
		
		
	}
	
	public static void main(String[] args) {
		Emart mart = new Emart();
		mart.start();
	}
}
