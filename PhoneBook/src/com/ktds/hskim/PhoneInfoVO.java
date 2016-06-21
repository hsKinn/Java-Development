package com.ktds.hskim;

/**
 * VO : Value Object
 * 기능 없이 인스턴스 필드와 Getter / Setter만 가짐
 * 
 * 전화번호부 필드
 */
public class PhoneInfoVO {
	
	private String name;
	
	private String phoneNumber;
	
	private int age;
	
	/**
	 * Getter / Setter
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
