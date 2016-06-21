package com.ktds.hskim;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
/*		computer.printAddition(5, 4);
		computer.printSubtraction(10, 6);
		computer.printMultiplication(2, 4);
		computer.printDivision(10, 3);
*/		
		int additionResult = computer.computeAddition( 100, 200 );
		System.out.println(additionResult);
		
		int subtractionResult = computer.computeSubtraction( 50, 1 );
		System.out.println(subtractionResult);
		
		int multiplicationResult = computer.computeMultiplication(4, 5);
		System.out.println(multiplicationResult);
		
		double divisionResult = computer.computeDivision(10, 2);
		System.out.println(divisionResult);
	
	} // main
} // class
