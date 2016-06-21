package com.ktds.hskim;

public class Main {
	
	public void start() {
		
		TheaterMethods methods = new TheaterMethods();
		
		// Title
		System.out.println("Theater Ticket Reservation");
		
		// Theater Start
		methods.startTheater();
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.start();
		
	} // main end
	
} // class end