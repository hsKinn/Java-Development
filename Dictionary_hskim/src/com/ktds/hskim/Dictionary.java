package com.ktds.hskim;

public class Dictionary {
	
	public void start() {
		
		// 인스턴스화
		DictionaryMethod dicmethod = new DictionaryMethod();
		
		// Title
		System.out.println("English to Korean Dictionary");
		System.out.println();

		// Dictionary 실행
		dicmethod.startDic();
		
	}// start end
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		dic.start();
	} // main end
}