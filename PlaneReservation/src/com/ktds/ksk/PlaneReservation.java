package com.ktds.ksk;



public class PlaneReservation {
	
	public void start() {
		
		PlaneReservationInput inputInfo = new PlaneReservationInput();
		
		inputInfo.inputCreateSeats();
		
		while(true) {	
			
			inputInfo.printMenu();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		PlaneReservation plane = new PlaneReservation();
		plane.start();
		
	}

}
