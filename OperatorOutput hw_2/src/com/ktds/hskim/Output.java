package com.ktds.hskim;

public class Output {
	
	public String Output ( String operator ) {
		
		if ( operator.equals("+") ){ 
			String output = "더하기";
			return output;
		}
		
		else if ( operator.equals("-") ){ 
			String output = "빼기";
			return output;
		}
		
		else if ( operator.equals("*") || operator.equals("X") ) { 
			String output = "곱하기";
			return output;
		}
		
		else if ( operator.equals("/") ) { 
			String output = "나누기";
			return output;
		}
		
		else if ( operator.equalsIgnoreCase("exit")) {
			String  output = "종료합니다.";
			return output;
		}
		
		else {
			String  output = "잘못 입력되었습니다.";
			return output;
		}
	}
}
