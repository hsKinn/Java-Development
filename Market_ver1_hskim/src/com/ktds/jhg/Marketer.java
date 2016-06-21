package com.ktds.jhg;

public class Marketer {

	/*담배를 파는 편의점 프로그램
    만들어야 하는 클래스 : 3개
    소비자, 편의점, Main

    판매 조건 : 20세 미만 소비자에게는 판매 할 수 없다.
    종료 조건 : 편의점의 담배가 모두 떨어졌거나 소비자의 돈이 담배 가격보다 적을 때

   Scanner를 이용함.*/

	
	// 담배 . 돈. 담배 카운트. 머니카운트. 거스름돈. 나이  
	
	private int cigarette;
	private int money;
	private int age;
	

	public int getCigarette() {
		return cigarette;
	}
	public void setCigarette(int cigarette) {
		this.cigarette = cigarette;
	}
	public void setCigaretteCount ( int cigarette ){
		this.cigarette = cigarette;
	}
	public void setMoney ( int money ){
		this.money = money;
	}
	public int getCigaretteCount ( ){  // 리턴값
		return this.cigarette ;
	}
	public int getMoney ( ){       // setter and getter
		return this.money;
	}
	
	
	
	public void cigaretteCount ( int cigarette) // cigarette count, pay , take money, age,
	{
		this.cigarette -= cigarette; // cigarette Count
	}
	public void pay ( int money ){
		this.money -= money;        // pay money
	}
	public void takeMoney ( int money ){   // take money
		this.money += money;
	}
	
	public void setAge ( int age ){    // seller age
		this.age = age;
	}
	public int getAge (  ){
		return this.age ;
	}
	
	public void myInfo (  ){
		System.out.println("내가 가진 담배 수는 :" + this.cigarette);
	    System.out.println("내가 가진 금액은    :" + this.money);
	}
	
}

