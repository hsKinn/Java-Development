package com.ktds.hskim;

public class CustomerVO {
	
	/**
	 *  고객 이름
	 */
	private String name;
	
	/**
	 * 고객 핸드폰번호
	 */
	private String Phone;
	
	/**
	 * 고객 대출금
	 */
	private int loanMoney;
	
	/**
	 * 고객 담보
	 */
	private String security;
	
	/**
	 * 고객 대출 시간
	 */
	private Long loanSecond;

	
	/**
	 * Getter / Setter
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getLoan() {
		return loanMoney;
	}
	public void setLoan(int loan) {
		this.loanMoney = loan;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public long getLoanSecond() {
		return loanSecond;
	}
	public void setLoanSecond(long loanSecond) {
		this.loanSecond = loanSecond;
	}
	
} // class end
