package com.ktds.hskim;

/**
 * 	애완 동물 정보를 가지는 클래스
 * 	(클래스 이름 위에 마우스 올리면 설명나옴
 * 	/** (**이 2개 여야 함)
 */
public class Pet {
	
	/**
	 * 	애완 동물의 수는 2마리로 제한
	 *  클래스 필드 (public) 선언	 
	 */
	public static int petCount = 2;
	
	
	/**
	 * 	애완 동물의 종류
	 */
	private String type;
	
	
	/**
	 * 	애완 동물의 이름
	 */
	private String name;
	
	
	// Setter
	// void = 반환이 없음 -> return 생략
	// String = 메소드 입력 타입 -> 인자, 파라미터, 매개 변수
	public void setType( String type ) {
		this.type = type;
	}
	
	public void setName ( String name) {
		this.name = name;
	}
	
	
	// Getter
	// String = 반환 타입 (return type)
	// ()의 의미는 메소드(기능)
	public String getType() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}
