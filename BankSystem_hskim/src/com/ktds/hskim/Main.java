package com.ktds.hskim;

public class Main {
	
	public void start() {
		
		// 인스턴스화
		BankBiz bankBiz = new BankBiz();
		bankBiz.startBank();
		
	} // start end
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	} // main end
	
} // class end
