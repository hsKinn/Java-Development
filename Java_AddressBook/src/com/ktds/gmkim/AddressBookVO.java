package com.ktds.gmkim;

/**
 * VO : Value Object </br>
 * 기능없이 인스턴스 필드와 Getter/Setter만 가지고 있다.
 * 
 * @author gmKim
 * 
 */
public class AddressBookVO {

	private String name;
	private String phoneNumber;
	private String address;
	private int age;
	
	public AddressBookVO () {
		name = "";
		phoneNumber = "";
		address = "";
		age = 0;
	}

	// Getter, Setter - age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Getter, Setter - name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Getter, Setter - phoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Getter, Setter - address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
