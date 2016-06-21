package com.ktds.hskim;

public class AddressBookInfo {
	
	/**
	 *  이름
	 */
	private String name;
	
	/**
	 * 나이
	 */
	private int age;
	
	/**
	 * 핸드폰 번호
	 */
	private String phoneNumber;
	
	/**
	 * 주소
	 */
	private String address;
	
	/**
	 * Counting
	 * @return
	 */
	public static int count;
	
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
