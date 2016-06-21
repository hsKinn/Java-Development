package com.ktds.hskim;

import java.util.Scanner;

public class sayHello {
	
	public static void main(String[] args) {
		
		String name = " ";
		String address = " ";
		int age = 0;
		
		Scanner input = new Scanner(System.in);
		Hello hello = new Hello();
		
		System.out.println("Greeting");
		System.out.println();
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("사는 곳 입력 : ");
		address = input.next();
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		System.out.println();
		hello.Greeting(name, address, age);
		
	}
	
	
}
