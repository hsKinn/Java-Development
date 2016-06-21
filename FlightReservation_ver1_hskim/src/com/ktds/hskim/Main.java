package com.ktds.hskim;

public class Main {
	
	public void start() {
		
		ReservationMethod flight = new ReservationMethod();
		
		// Title
		System.out.println("Flight Reservation System");
		
		flight.startReservation();
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.start();
		
	} // main end
	
} // class end