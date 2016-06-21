package com.ktds.hskim;

public class PetStore {
	
	public static void main(String[] args) {
		
		System.out.println("최대 생성 가능한 애완 동물 수 : " + Pet.petCount + "마리");
		System.out.println();
				
		// 인스턴스 정의
		// dog, cat 이름만 다를뿐 같은 인스턴스
		Pet dog = new Pet();
		Pet cat = new Pet();
		
		// 인스턴스에서도 클래스 필드 접근 가능
		// 클래스 필드의 값도 바뀜
		dog.petCount++;
		cat.petCount++;
		System.out.println(Pet.petCount + "마리");
		System.out.println();
		
		// 인스턴스 속성, 기능 접근 하기 위해
		// 인스턴스명.속성 = ""; 로 정의
/*		dog.type = "개";
		dog.name = "바둑이";
		
		cat.type = "고양이";
		cat.name = "나비";
		public만 이용 가능
*/		
		// private에서 객체 이용하기
		// 객체 정의 setType, setName 메소드 이용
		dog.setType("개");
		dog.setName("바둑이");
		
		cat.setType("고양이");
		cat.setName("나비");
		
		// 객체 출력 getType, getName 메소드 이용
		System.out.println("애완 동물 종류 : " + dog.getType() + ", " + "이름 : " + dog.getName());
		System.out.println();
		System.out.println("애완 동물 종류 : " + cat.getType() + ", " + "이름 : " + cat.getName());
		
	}
	
}
