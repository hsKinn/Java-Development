package com.ktds.hskim;

public class Street {
	
	
	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.setColaQuantity(15);
		machine.setSpriteQuantity(5);
		machine.setFantaQuantity(7);
		
		machine.setColaPrice(1300);
		machine.setSpritePrice(1100);
		machine.setFantaPrice(1200);
		
		People customer = new People();
		customer.setColaQuantity(0);
		customer.setSpriteQuantity(0);
		customer.setFantaQuantity(0);
		customer.setMoney(3000);
		
		
		while ( true ) {
			
			/*
			 * 소비자의 돈이 떨어진 다면 종료
			 */
			if ( customer.getMoney() <= 0 ) {
				break;
			}
			
			machine.getMoney(3000, customer);
			machine.printMenu();
			machine.giveDrink(1, 1, customer);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
