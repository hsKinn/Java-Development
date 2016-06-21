package com.ktds.hskim;

import java.util.Random;
import java.util.Scanner;

public class Main {

	final static int EGG_PRICE = 1000;
	final static int EGG_COUNT = 1;
	
	public void start() {
		
		String name = "";
		int money = 0;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		Machine machine = new Machine();
		
		System.out.println("Egg Vending Machine");
		
		System.out.println();
		System.out.print("이름 입력 : ");
		name = input.next();
		
		Customer buyer = new Customer( name, random.nextInt(10000));
		
		System.out.println();
		System.out.println("현재 자판기에 " + machine.getEggCount() + "개의 계란이 있습니다.");
		System.out.println("가격은 " + EGG_PRICE + "이고 1개씩 구매 가능합니다.");
		System.out.println(buyer.getName() + " 님 반갑습니다.");
		
		while ( true ) {
			
			// 소지 금액 부족 검사 반복문
			if ( buyer.getMoney() < EGG_PRICE ) {
				System.out.println();
				System.out.println("소지금이 부족해서 못먹습니다.");
				System.out.println("프로그램 종료합니다.");
				break;
			}
			
			/*
			 * 입력 금액 검사 반복문
			 * 소지한 금액보다 많은 금액 입력 시 무한 루프
			 * 소지한 금액보다 적은 금액 입력 시 계산
			 */
			for ( int i = 0; i < 1; i += 0) {
				System.out.println();
				System.out.println("현재 " + buyer.getMoney() + "원 소지하고 있습니다.");
				System.out.print("자판기에 넣을 금액 입력 ( 0 : 종료) : ");
				money = input.nextInt();
				
				if ( money <= buyer.getMoney() ) i++;
				else System.out.println("소지 금액 범위를 초과했습니다.");
			}
				
			/*
			 *  종료 0 을 입력 했거나 입금한 금액이 계란 가격 보다 낮을 경우 검사
			 */
			if ( money == 0 ) {
				System.out.println();
				System.out.println("프로그램 종료합니다.");
				break;
			}
			else if ( money < EGG_PRICE ) { 
				System.out.println();
				System.out.println("입금 하신 금액이 부족합니다.");
				continue;
			}
			
			machine.sellEgg(money, buyer);
			machine.giveEgg(EGG_COUNT, buyer);
			machine.giveRemain(money, buyer);
			machine.printInfo(buyer);
		}
		
	}
	public static void main(String[] args) {
		Main vendingMachine = new Main();
		vendingMachine.start();
	} // main
} // class