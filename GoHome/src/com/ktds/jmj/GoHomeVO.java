package com.ktds.jmj;

import java.util.Date;

public class GoHomeVO {
	
	private String name;
	private String seatNum;
	private String printSeat;
	
	public String getPrintSeat() {
		return printSeat;
	}
	public void setPrintSeat(String printSeat) {
		this.printSeat = printSeat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public Date getCurDate() {
		return curDate;
	}
	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}
	
	private static Date curDate;
	
	


}
