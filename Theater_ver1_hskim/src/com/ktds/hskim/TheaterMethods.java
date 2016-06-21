package com.ktds.hskim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TheaterMethods {
		
	/**
	 * TheaterField 객체 선언
	 */
	TheaterField theater;
	
	/**
	 * HashMap 선언
	 */
	private Map<Integer, List<String>> seatList;
	
	/**
	 * ArrayList 선언
	 */
	private List<String> seat;
	
	/**
	 * Scanner
	 */
	private Scanner input;
	
	/**
	 * 좌석 넘버
	 */
	private String seatNumber;
	
	
	/**
	 * 생성자 선언
	 */
	public TheaterMethods() {
		
		theater = new TheaterField();
		seatList = new HashMap<Integer, List<String>>();
		seat = new ArrayList<String>();
		input = new Scanner ( System.in );
		seatNumber = new String();
	}

	/**
	 * 프로그램 시작점
	 */
	public void startTheater () {
		
		// 초기 좌석 생성
		inputTheater();
		
		// 좌석 메뉴 실행
		theaterMenu();
	}
	
	
	/**
	 * TheaterMethods
	 *  
	 * 1. 좌석 생성
	 * 	1-1 좌석 메소드
	 * 	1-2 생성 열 입력 메소드
	 * 	1-3 생성 행 입력 메소드
	 * 	1-4 좌석 생성 메소드
	 * 
	 * 2. 좌석 메뉴 
	 * 	2-1 좌석 메뉴 메소드
	 * 	2-2 메뉴 선택 메소드
	 * 	2-3 좌석 출력 메소드
	 * 	2-4 예약 진행 메소드
	 * 	2-5 좌석 입력 메소드
	 * 	2-6 좌석 예약 메소드
	 * 	2-7 예약 체크 메소드
	 */
	
	
	/**
	 * 1. 좌석 생성
	 * 
	 * 1-1 좌석 메소드
	 * 
	 */
	public void inputTheater () {
		
		System.out.println();
		System.out.println("영화관 좌석 생성기");
		
		// 행 입력
		makeColumn();
		
		// 열 입력
		makeRow();
		
		// 입력 받은 행,열 값으로 좌석 생성
		makeSeat();
		
	} // inputTheater end
	
	
	/**
	 * 생성 행 입력 메소드
	 */
	public void makeColumn () {
		
		while ( true ) {
			try {
				System.out.println();
				System.out.println("1 ~ 10 행 생성 가능");
				System.out.print("행 입력 : ");
				theater.setMakeColumn(input.nextInt());
			}
			catch (InputMismatchException ime) {
				System.err.println("입력 오류! 숫자 입력");
			}
			
			if ( theater.getMakeColumn() > 0 && theater.getMakeColumn() <= 10 ) {
				break;
			}
			else {
				System.out.println();
				System.err.println("1 ~ 10 범위 내 입력");
			}
			
		} // while end
		
	} // makeColumn end
	
	
	/**
	 * 생성 열 입력 메소드
	 */
	public void makeRow () {
		
		while ( true ) {
			try {
				System.out.println();
				System.out.println("1 ~ 10 열 생성 가능");
				System.out.print("열 입력 : ");
				theater.setMakeRow(input.nextInt());
			}
			catch (InputMismatchException ime) {
				System.err.println("입력 오류! 숫자 입력");
			}
			
			if ( theater.getMakeRow() > 0 && theater.getMakeRow() <= 10 ) {
				break;
			}
			else {
				System.out.println();
				System.err.println("1 ~ 10 범위 내 값 입력");
			}
			
		} // while end
		
	} // makeRow end

	
	/**
	 * 좌석 생성 메소드
	 */
	public void makeSeat () {
		
		for ( int i = 0; i < theater.getMakeColumn(); i++ ) {
			
			// List Create
			seat = new ArrayList<String>();
			
			for ( int j = 0; j < theater.getMakeRow(); j++ ) {
				
				//List add
				seat.add("◇");
				
			} // for j end
			
			// Map put
			seatList.put(i,  seat);
			
		} // for i end

	} // makeSeat
	
	
	/**
	 * 2 좌석 출력
	 * 
	 * 2-1 좌석 메뉴 메소드
	 * 
	 */
	public void theaterMenu() {
		
		while ( true ) {
			
			// 메뉴 선택 받음
			menuSelect();
			
			// 메뉴 선택 분기
			if ( theater.getMenu() == 1 ) {
				printSeat();
			} // 1 좌석 보기
			else if ( theater.getMenu() == 2 ) {
				makeReservation();
			} // 2 좌석 예약
			else if ( theater.getMenu() == 3 ) {
				System.out.println();
				System.err.println("프로그램 종료");
				System.exit(0);
			} // 종료
			else {
				System.err.println("잘못된 메뉴");
			}
			
		} // while end
		
	} // theaterMenu end
	
	
	/**
	 * 2-2 메뉴 선택 메소드
	 */
	public void menuSelect() {
		
		while ( true ) {
			
			try {
				System.out.println("");
				System.out.println("Movie Seat Reservation System");
				System.out.println("1. 좌석 보기");
				System.out.println("2. 좌석 예약");
				System.out.println("3. 종료");
				
				System.out.print("메뉴 입력 : ");
				theater.setMenu(input.nextInt());
				break;
			}
			catch (InputMismatchException ime) {
				System.err.println("입력 오류! 숫자 입력");
			}
			
		} // while end
		
	} // menuSelect end
	
	
	/**
	 * 2-2 좌석 출력 메소드
	 */
	public void printSeat () {
		
		System.out.println();
		
		for ( int i = 0; i < theater.getMakeColumn(); i++ ) {
			
			seat = seatList.get(i);
			
			for ( String s : seat ) {
				System.out.print(s);
			}
			
			System.out.println();
			
		} // for i end
		
	} // printSeat end
	
	
	/**
	 * 2-3 예약 진행 메소드
	 */
	public void makeReservation () {
		
		while ( true ) {
			
			// 좌석 입력
			inputSeat();
			
			// 유효한 좌석인지 체크
			if ( theater.setCheck(seatCheck()) ) {
				break;
			}
		}
		
		// 좌석 예약
		seatResevation();
		
	} // makeReservation end
	
	
	/**
	 * 2-4 예약 좌석 입력 메소드
	 */
	public void inputSeat () {
		
		System.out.println();
		System.out.println("예약할 좌석을 입력하세요");
		System.out.println("행 : 1 ~ " + theater.getMakeColumn() + " 열 : 1 ~" + theater.getMakeRow());
		System.out.println("입력 양식 = (행,열)");
		System.out.print("입력 : ");
		seatNumber = input.nextLine();
		
		input = new Scanner ( System.in );
		
		// 공백 입력 시 제거
		seatNumber = seatNumber.replace(" ",  "");
		
		// ,(콤마) 기준으로 잘라 배열 입력
		String seatNumbers[] = seatNumber.split(",");
		
		try {
			theater.setColumn(Integer.parseInt(seatNumbers[1]));
			theater.setRow(Integer.parseInt(seatNumbers[0]));
		}
		catch (NumberFormatException nfe) {
			System.out.println();
			System.err.println("입력 양식 에러!");
		}
		
	} // inputSeat end
	
	
	/**
	 * 2-5 좌석 예약 메소드
	 */
	public void seatResevation () {
		
		List<String> selectedSeats = seatList.get(theater.getRow()-1);
		selectedSeats.set(theater.getColumn()-1, "◆");
		
		System.out.println();
		System.out.println(theater.getRow() + "행 " + theater.getColumn() + "열 좌석 예약 완료");
		
	} // seatResevation end
	
	
	/**
	 * 2-6 예약 체크 메소드
	 */
	public boolean seatCheck () {
		
		// 생성된 좌석 내 유효한 좌석 값인지 검사
		if ( theater.getColumn() <= 0 || theater.getMakeColumn() < theater.getColumn() || theater.getRow() <= 0 || theater.getMakeRow() < theater.getRow() ) {
			System.out.println();
			System.err.println("잘못된 범위");
			return false;
		}
		
		List<String> selectedSeats = seatList.get((theater.getRow()-1));
		
		if ( selectedSeats.get((theater.getColumn()-1)).contains("◇") ) {
			return true;
		}
		else {
			System.out.println();
			System.err.println("이미 선점된 좌석");
			return false;
		}
		
	} // seatCheck end
			
} // class end