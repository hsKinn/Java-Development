package com.ktds.hskim;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public void start() {
		
		List<String> list = new ArrayList<String>();
		
		// List add
		list.add("남준호");
		list.add("김현섭");
		list.add("김광민");
		list.add("김하늘");
		list.add("백지경");
		
		//List get
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		System.out.println( list.get(3) );
		System.out.println( list.get(4) );
		
		// List size
		System.out.println( list.size() );
		
		// List search ver1.
		for ( int i = 0; i < list.size(); i++ ) {
		
			if ( list.get(i).equals("김현섭") ) {
				System.out.println("찾음");
				break;
			} // if
		} // for
		
		// List search ver2.
		for ( String name : list ) {
			if ( name.equals("김현섭") ) {
				System.out.println("찾음");
			}
		}
		
		// List만의 간단한 Search
		if ( list.contains("김현섭") ) {
			System.out.println("찾음");
		}
		
		// List의 인덱스 번호 찾기
		System.out.println(list.indexOf("김현섭"));
		System.out.println(list.get(list.indexOf("김현섭")));
		
		// List remove
		list.remove(2);
		list.remove("김현섭");
		
	} // start
	
	public static void main(String[] args) {
		ListTest test = new ListTest();
		test.start();
	} // main
} // class
