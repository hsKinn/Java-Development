package com.ktds.hskim;

import java.util.ArrayList;
import java.util.List;

public class BankBiz {
	
	/**
	 * 인스턴스 화
	 */
	private Input input;
	
	private BankVO bank;
	
	private CustomerBiz customerBiz;
	
	private List<CustomerVO> customer;
	
	/**
	 * 메뉴값
	 */
	private int menu;
	
	
	/**
	 * 생성자 초기화
	 */
	public BankBiz () {
		
		input = new Input();
		bank = new BankVO();
		customerBiz = new CustomerBiz( bank, customer );
		customer = new ArrayList<CustomerVO>();
		menu = 0;
		
	}
	
	
	/**
	 * 은행 메뉴 분기
	 */
	public void startBank () {
		
		while ( true ) {
			
			// 은행 메뉴
			bankGreeting();
			
			// 메뉴 입력
			menu = input.inputInt();
			
			if ( menu == 1 ) {
				customerBiz.createPerson();
			} // 통장 개설
			else if ( menu == 2 ) {
				customerBiz.checkInterest();
			} // 대출 조회
			else if ( menu == 3 ) {
				this.rePay();
			} // 상환 처리
			else if ( menu == 4 ) {
				this.bankRupt();
			} // 파산 신청
			else if ( menu == 5 ) {
				System.out.println();
				System.err.println("은행 종료");
				System.exit(0);
			} // 은행 종료
			else {
				elseMenu();
			} // 메뉴값 이외
			
		} // while end
		
	} // startBank end
	
	
	/**
	 * 은행 메뉴 출력
	 */
	public void bankGreeting () {

		System.out.println("Java Bank");
		System.out.println();
		System.out.println("1 통장 개설");
		System.out.println("2 대출 조회");
		System.out.println("3 상환 처리");
		System.out.println("4 파산 신청");
		System.out.println("5 은행 종료");
		System.out.print("입력 : ");
		
	} // bankGreeting end
	
	
	/**
	 * 상환 처리 메소드
	 */
	public void rePay () {
		
		List<CustomerVO> searchPerson = new ArrayList<CustomerVO>();
		
		CustomerVO person = new CustomerVO();
		
		System.out.println();
		System.out.println("상환 처리 메뉴");
		System.out.println("통장 개설 시 입력 이름");
		System.out.print("입력 : ");
		String rePayName = input.inputStr();

		searchPerson = bank.loanList.get(rePayName);
		
		person = searchPerson.get(0);
		
		System.out.println(person.getName() + "님 총 " + person.getLoan() + "원");
		System.out.println();
		System.out.print("상환 금액 입력 : ");
		int rePayMoney = input.inputInt();
		
		// 상환
		person.setLoan(person.getLoan()-rePayMoney);
		
		System.out.println(rePayMoney + "원 상환 처리 완료");
		
		bank.capital += rePayMoney;
		
		// 고객 리스트 삭제
		if ( person.getLoan() <= 0 ) {
			System.out.println("축하합니다! 모든 대출 금액 상환 완료");
			bank.loanList.remove(rePayName);
		}
		
	} // rePay end
	
	
	/**
	 * 파산 신청 메소드
	 */
	public void bankRupt () {
		
		List<CustomerVO> searchPerson = new ArrayList<CustomerVO>();
		
		CustomerVO person = new CustomerVO();
		
		System.out.println();
		System.out.println("파산 신청 메뉴");
		System.out.println("통장 개설 시 입력 이름");
		System.out.print("입력 : ");
		String bankRuptName = input.inputStr();
		
		searchPerson = bank.loanList.get(bankRuptName);
		
		person = searchPerson.get(0);
		
		System.out.println(person.getName() + "님 총 " + person.getLoan() + "원");
		System.out.println("담보 : " + person.getSecurity() + "의 소유권 박탈");
		System.out.println();
		
		bank.capital += person.getLoan();
		
		System.out.println("파산 처리 완료");
		
		bank.loanList.remove(bankRuptName);

	} // bankRupt end
	
	
	/**
	 * 예외 메뉴 값
	 */
	public void elseMenu() {
		System.err.println("유효한 메뉴값 아닙니다");
	}
	
	
	
}
