package com.ktds.jhg;

public class Maket {

	private int appleCount = 15;
	private int money = 4000;
	public static final int APPLE_PRICE = 500; // 상수값

	public void start() { // 진짜 로직은 start에 들어감

		Customer 배성진 = new Customer();
		배성진.setMoney(5300); // 5000이라는 데이터를 주겠다.
		배성진.setappleCount(0); // 사과가 하나도 없다.

		while (true) {

			if (this.appleCount == 0 || 배성진.getMoney() < Maket.APPLE_PRICE) {
				System.out.println("안팔아요");
				break;
			}
			// 소비자 에게서 돈을 받는다
			배성진.pay(1000);
			this.money += 1000;

			// 소비자 에게 사과를 준다.
			this.appleCount -= 1;
			배성진.getApple(1);

			// 거스름 돈을 남겨준다.
			int money = 1000 - (Maket.APPLE_PRICE * 1);
			this.money -= money;
			배성진.takeMoney(money);

			// 소비자의 정보를 출력한다.
			배성진.printMyInfo();

		}
	}

	public static void main(String[] args) { // 이 클래스는 실행시키는 역할 뿐임
		Maket market = new Maket(); // 자기 클래스를 자기가 인스턴트화 할 수 있음
		market.start();

	}

}
