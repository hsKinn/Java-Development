package com.ktds.hskim;

public class MakeException {
	
	/**
	 * 문자를 숫자로 변환
	 * 예외 상황 발생 시 조치를 취함
	 * 메소드가 책임을 짐
	 */
	public int parseInt ( String str ) {
		
		// 기존의 방식 try ~ catch
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException nfe) {
			return 0;
		}
	}
	
	/**
	 * throws
	 * 메소드에 throws를 통해 발생할 수 있는 예외 작성 ,(콤마)를 작성하여 작성 가능
	 * 예외 상황 발생 시 조치를 취하지 않음 
	 * 메소드가 책임을 지는게 아니고 호출자에게 책임을 넘김
	 */
	// 
	public int parseInt2 ( String str ) throws NumberFormatException {
	
		return Integer.parseInt(str);
	}
	
	/**
	 * throw 사용을 해서 책임을 나눔
	 * 메소드에서 예외 처리를 통해 예외 처리 하지만
	 * 예외 발생 시 return 하지 않고 호출자에게 넘김
	 * 
	 * throws만 사용하는 것은 책임 자체를 넘기는 것이고
	 * throw사용을 해서 예외 처리 하고 예외를 보내주는 것
	 * @throws InvalidNumberException 
	 */
	public int parseInt3 ( String str) {
		
		try {
			return Integer.parseInt(str);
		}
		catch ( NumberFormatException nfe ) {
			System.out.println("숫자로 바꿀 수 없습니다");
			// throw nfe;
			InvalidNumberException ine = new InvalidNumberException("숫자로 바꿀 수 없습니다");
			throw ine;
		}
	}
	
}
