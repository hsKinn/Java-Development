package com.ktds.gmkim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressInput {

	private Scanner scanner;

//	기본 생성자
	public AddressInput () {
		scanner = new Scanner( System.in );
	}
	
	public int inputInt() {
		
		scanner = new Scanner( System.in );

//		InputMismatchException
		while ( true ) {
			
			try {
//				정수 입력
				return scanner.nextInt();
			}
			catch (InputMismatchException ime) {
//				정수가 아니면 다시 입력
				scanner = new Scanner(System.in);
				System.out.println("정수로 다시 입력 하세요.");
			}
		}
	}
	
	public String inputString () {
		
		scanner = new Scanner( System.in );
		
		return scanner.nextLine();
	}
}
