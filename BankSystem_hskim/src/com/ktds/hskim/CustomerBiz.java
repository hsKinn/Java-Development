package com.ktds.hskim;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerBiz {
	
	/**
	 * 인스턴스 화
	 */
	private Input input;
	
	private BankVO bank;
	
	private List<CustomerVO> customer;
	
	private CustomerVO person;
	
	private Date date;
	
	private Calendar second;
	
	private Calendar interest;
	
	
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	public BankVO getBank() {
		return bank;
	}
	public void setBank(BankVO bank) {
		this.bank = bank;
	}
	public List<CustomerVO> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerVO> customer) {
		this.customer = customer;
	}
	public CustomerVO getPerson() {
		return person;
	}
	public void setPerson(CustomerVO person) {
		this.person = person;
	}

	
	
	/**
	 * 생성자
	 */
	public CustomerBiz ( BankVO bank, List<CustomerVO> customer ) {
		
		input = new Input();
		this.bank = bank;
		this.customer = customer;
		person = new CustomerVO();
		date = new Date();
		second = Calendar.getInstance();
		interest = Calendar.getInstance();
		
	}
		
	
	/**
	 * 고객 생성 메소드
	 */
	public void createPerson() {
		
		// 인스턴스 초기화
		person = new CustomerVO();
		customer = new ArrayList<CustomerVO>();
		
		System.out.println();
		System.out.println("고객 정보 입력");
		
		// 이름 입력
		setPersonName();
		
		// 핸드폰 입력
		setPersonPhone();
		
		// 대출 금액 입력
		setLoan();
		
		// 담보 입력
		setSecurity();
		
		// 대출 일자 입력
		setLoanDate();
		
		// 안내 문구 출력
		guide();
		
		// Map 추가
		setPersonMap();
		
	} // createPerson end
	
	
	/**
	 * 입력 검사 메소드
	 */
	public boolean inputCheck( String input, String regex ) {
		
		if ( input.matches(regex) ) {
			return true;
		}
		else {
			System.out.println();
			System.err.println("입력 양식 오류!");
			return false;
		}
	} // inputCheck end
	
	
	/**
	 * 이름 입력 검사
	 */
	public void setPersonName () {
		
		while ( true ) {
			
			System.out.println();
			System.out.print("이      름 : ");
			
			person.setName(input.inputStr());
			if ( (inputCheck(person.getName(), "^[가-힣a-zA-z]*$") == true ) ) {
				break;
			}
			
		} // while end 이름 입력 검사
		
	} // setPersonName end
	
	
	/**
	 * 전화번호 입력 검사
	 * 3자리 - 3~4자리 - 4자리
	 */
	public void setPersonPhone () {
		
		while ( true ) {
			
			System.out.print("전화번호 : ");
			person.setPhone(input.inputStr());
			
			if ( (inputCheck(person.getPhone(), "^[0-9]{3}.[0-9]{3,4}.[0-9]{4}$")) == true ) {
				break;
			}
			else {
				System.err.println("입력 양식 오류!");
				System.err.println("양식 : 3자리-3~4자리-3자리 숫자");
			}
			
		} // while end 핸드폰 번호 입력 검사
		
	} // setPersonPhone end
	
	
	/**
	 * 대출 금액 입력 검사
	 */
	public void setLoan () {
	
		while ( true ) {
			
			System.out.print("대출금액 : ");
			person.setLoan(input.inputInt());

			if ( !checkLoan(person.getLoan()) ) {
				bank.capital -= person.getLoan();
				break;
			}
			
		} // while end
		
	} // setLoan end
	
	
	/**
	 * 대출 금액 검사메소드
	 */
	public boolean checkLoan ( int loanMoney ) {

		if ( loanMoney > bank.capital || loanMoney >= 100000000 ) {
			System.err.println("대출 한도 초과!");
			System.out.println();
			return true;
		}
		else {
			return false;
		}
		
	} // checkLoan end
	
	
	
	/**
	 * 담보 입력 검사
	 */
	public void setSecurity () {

		while ( true ) {
			
			System.out.print("담      보 : ");
			person.setSecurity(input.inputStr());
			
			if ( (inputCheck(person.getSecurity(), "^[가-힣a-zA-z]*$") == true ) ) {
				break;
			}
			
		} // while end 이름 입력 검사
		
	} // setSecurity end
	
	
	/**
	 * 날짜 입력 메소드
	 */
	public void setLoanDate () {
		
		System.out.print("대출일자 : " + date.toLocaleString());
		System.out.println();
		
		person.setLoanSecond(second.getTimeInMillis()/1000);
		
	} // setLoanDate end
	
	
	/**
	 * 안내 문구 출력
	 */
	public void guide () {
		
		System.out.println();
		System.out.println(person.getName() + "님 반갑습니다");
		System.out.println(person.getLoan() + "원 대출 실행");
		System.out.println();
		System.out.println("은행 대출 가능 잔액 : " + bank.capital);
		System.out.println();
		
	} // guide end
	
	
	/**
	 * 고객 입력 메소드
	 */
	public void setPersonMap () {
		
		customer.add(person);
		
		Map<String, List<CustomerVO>> loanList = new HashMap<String, List<CustomerVO>>();
		
		bank.loanList.put(person.getName(), this.customer);
		
	} //setPersonMap end
	
	
	
	/**
	 * 이자 확인 메뉴
	 */
	public void checkInterest () {

		// 인스턴스 초기화
		List<CustomerVO> searchPerson = new ArrayList<CustomerVO>();
		person = new CustomerVO();
		interest = Calendar.getInstance();
		
		// 이자 확인 메뉴 출력
		interestGreeting();
		
		// 검색할 이름 입력
		String searchName = input.inputStr();
		
		// HashMap에서 검색 후 List 삽입
		searchPerson = bank.loanList.get(searchName); 
		
		// List 검색
		for ( CustomerVO searchInfo : searchPerson ) {
			if ( searchInfo.getName().equals(searchName)) {
				person = searchInfo;
			}
		} // for end
		

		
		
		// 이자 계산
		long interestTime = (interest.getTimeInMillis()/1000);
		int result = (int) ( ( interestTime - person.getLoanSecond() ) / 5 );
		int interestMoney = (int) (person.getLoan() * Math.pow(1.1, (double)result));
		
		person.setLoan(interestMoney);
		
		// 사용자 정보 출력
		System.out.println("성함 : "+ person.getName() + "님 대출 금액 : " + person.getLoan() + "원");
		System.out.println("연락처 : " + person.getPhone() + "담보 : " +  person.getSecurity());
		
	} // checkInterest
	
	
	/**
	 * 이자 메뉴 출력
	 */
	public void interestGreeting () {
		
		System.out.println();
		System.out.println("대출 조회 메뉴");
		System.out.println("통장 개설 시 입력 이름");
		System.out.print("입력 : ");
		
	} // interestGreeting end
	
	
	
	
	
} // class end
