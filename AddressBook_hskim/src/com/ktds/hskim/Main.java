package com.ktds.hskim;

public class Main {
	
	public void start() {
		
		AddressBookFunction addressBook = new AddressBookFunction();
		
		//Title
		System.out.println("AddressBook");
		
		addressBook.startBook();
		
	} // start end
	
	public static void main(String[] args) {
		Main addressBook = new Main();
		addressBook.start();
	
	} // main end
	
} // class end 
