package com.ktds.jhg;

import java.util.Scanner;

public class Store {
	

	final static int COST = 4700;
    Scanner scan = new Scanner(System.in);
    int numberOne ;
    int numberTwo ;
    int numberThree ;
    
	public void start(){
	
		Marketer marketer = new Marketer();
		marketer.setMoney(5000);
		marketer.setAge(20);
		marketer.setCigaretteCount(15);

	  Buy 조형근 = new Buy ();
	  System.out.println("얼마 내실 건가요?");
	  numberOne = scan.nextInt();
	  System.out.println("몇살이세요?");
	  numberTwo = scan.nextInt();
	  조형근.setMoney(numberOne);
	  조형근.setCigaretteCount(0);  
	  조형근.setAge(numberTwo);
	
	while ( true ){
		if ( marketer.getAge() > 조형근.getAge() ){
			System.out.println("미성년자에게는 담배를 판매 할 수 없습니다.");
			break;}
			
		else if ( marketer.getMoney() == 0 ){
			System.out.println("거스름 돈이 부족합니다.");
			break;
		}
		else if ( marketer.getCigaretteCount() == 0 ){
			System.out.println("담배가 다 떨어졌어요");
		    break;
		}
		else if ( 조형근.getMoney() < Store.COST ){
			System.out.println("금액이 부족하시네요");
		    break;
		}
	
		조형근.pay(5000);
		//marketer.setMoney(5000);
		//marketer.setCigaretteCount(marketer.getCigaretteCount()-1);
		조형근.cigaretteCount(1);
		
		int money = 5000 - (COST * 1);
		marketer.pay(COST);
		조형근.takeMoney(money);
		marketer.takeMoney(money);
		marketer.myInfo();
	}
	}
	
	

	public static void main(String[] args) {
	Store buy = new Store();
	buy.start();
	}
}
