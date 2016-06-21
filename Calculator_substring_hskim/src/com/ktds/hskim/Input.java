package com.ktds.hskim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	/**
	 * Scanner 선언
	 */
	private Scanner input;
	
	/**
	 * 생성자 
	 */
	public Input () {
		this.input = new Scanner ( System.in );
	} // 생성자 end
	
	
	/**
	 * String 입력
	 * @return
	 */
	public String inputStr () {
		
		input = new Scanner ( System.in );
		return input.nextLine();
		
	} // inputString end
	
	
	/**
	 * Int 입력
	 * @return
	 */
	public int inputInt () {
		
		input = new Scanner ( System.in ) ;
		
		while ( true ) {
			
			try {
				return input.nextInt();
			}
			catch (InputMismatchException ime) {
				input = new  Scanner(System.in);
				System.out.println("정수로 다시 입력 하세요.");
			}
			
		}
		
	} // inputInt end
	
} // class end