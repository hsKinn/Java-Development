package com.ktds.hskim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TheaterField {
	
	/**
	 * 좌석 표현할 HashMap 선언
	 */
	private Map<Integer, List<String>> seatList = new HashMap<Integer, List<String>>();
	/**
	 * 좌석 생성
	 */
	private List<String> seat = new ArrayList<String>();
	
	/**
	 * Scanner
	 */
	private Scanner input = new Scanner ( System.in );
	
	/**
	 * 좌석 예매 메뉴
	 */
	private int menu = 0;
	
	/**
	 * 생성할 좌석 열
	 */
	private int makeRow = 0;
	
	/**
	 * 생성할 좌석 행
	 */
	private int makeColumn;
	
	/**
	 * 입력 받을 좌석 번호
	 */
	private String seatNumber;
	
	/**
	 * 예약 좌석 열
	 */
	private int row;
	
	/**
	 * 예약 좌석 행
	 */
	private int column;
	
	/**
	 * 예약 체크 논리값
	 */
	private boolean check;
	
	
	/**
	 * Getter / Setter
	 * @return
	 */
	
	public Map<Integer, List<String>> getSeatList() {
		return seatList;
	}
	public void setSeatList(Map<Integer, List<String>> seatList) {
		this.seatList = seatList;
	}
	public List<String> getSeat() {
		return seat;
	}
	public void setSeat(List<String> seat) {
		this.seat = seat;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	public int getMakeRow() {
		return makeRow;
	}
	public void setMakeRow(int makeRow) {
		this.makeRow = makeRow;
	}
	public int getMakeColumn() {
		return makeColumn;
	}
	public void setMakeColumn(int makeColumn) {
		this.makeColumn = makeColumn;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public boolean isCheck() {
		return check;
	}
	public boolean setCheck(boolean check) {
		return this.check = check;
	}
	
}
