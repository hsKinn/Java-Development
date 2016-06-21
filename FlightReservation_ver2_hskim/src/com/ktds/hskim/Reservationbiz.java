package com.ktds.hskim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Reservationbiz {
	
	public static int COUNT = 0;

	/**
	 * 좌석 표현할 HashMap 선언
	 */
	private Map<Integer, List<String>> seatList;
	
	/**
	 * 사용자 정보
	 */
	private Map<String, List<String>> personList;
	
	/**
	 * 사용자 이름, 날짜
	 */
	private List<String> personInfo;
	
	/**
	 * 좌석 생성
	 */
	private List<String> seat;
	
	/**
	 * Scanner
	 */
	private Scanner input;
	
	/**
	 * 좌석 예매 메뉴
	 */
	private int menu;
	
	/**
	 * 생성할 좌석 열
	 */
	private int makeRow;
	
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
	 * 예약자 이름
	 */
	private String name;
	
	/**
	 * 예약 날짜
	 */
	private String date;
	
	
	
	public Reservationbiz () {
		personList = new HashMap<String, List<String>>();
		personInfo = new ArrayList<String>();
		seatList = new HashMap<Integer, List<String>>();
		seat = new ArrayList<String>();
		input = new Scanner ( System.in );
		menu = 0;
		makeRow = 0;
		makeColumn = 0;
		seatNumber = new String();
		row = 0;
		column = 0;
		check = false;
	}
	
	
	/**
	 * Getter / Setter
	 * @return
	 */
	
	public Map<Integer, List<String>> getSeatList() {
		return seatList;
	}
	public Map<String, List<String>> getPerson() {
		return personList;
	}
	public void setPerson(Map<String, List<String>> personList) {
		this.personList = personList;
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
	
	
	
	/**
	 * 
	 * Methods 
	 * 
	 */
	
	/**
	 * 1 프로그램 시작
	 * 
	 * 1-1 시작 메소드
	 */
	public void startReservation () {
		// 초기 좌석 생성
		inputFlight();
		
		// 좌석 메뉴 실행
		reservationMenu();
	}
	
	
	/**
	 * 1-2 생성 메뉴 초기
	 */
	public void inputFlight () {
		
		System.out.println();
		System.out.println("비행기 좌석 생성기");
		
		// 행 입력
		makeColumn();
		
		// 열 입력
		makeRow();
		
		// 입력 받은 행,열 값으로 좌석 생성
		makeSeat();
		
	} // inputTheater end
	
	
	/**
	 * 1-3 행 입력 메소드
	 */
	public void makeColumn () {
		
		while ( true ) {
			try {
				System.out.println();
				System.out.println("1 ~ 10 행 생성 가능");
				System.out.print("행 입력 : ");
				makeColumn = input.nextInt();
			}
			catch (InputMismatchException ime) {
				System.err.println("입력 오류! 숫자 입력");
			}
			
			if ( makeColumn > 0 && makeColumn <= 10 ) {
				break;
			}
			else {
				System.out.println();
				System.err.println("1 ~ 10 범위 내 입력");
			}
			
		} // while end
		
	} // makeColumn end
	
	
	/**
	 * 1-4 열 입력 메소드
	 */
	public void makeRow () {
		
		while ( true ) {
			try {
				System.out.println();
				System.out.println("1 ~ 10 열 생성 가능");
				System.out.print("열 입력 : ");
				makeRow = input.nextInt();
			}
			catch (InputMismatchException ime) {
				System.err.println("입력 오류! 숫자 입력");
			}
			
			if ( makeRow > 0 && makeRow <= 10 ) {
				break;
			}
			else {
				System.out.println();
				System.err.println("1 ~ 10 범위 내 값 입력");
			}
			
		} // while end
		
	} // makeRow end

	
	/**
	 * 1-5 좌석 생성 메소드
	 */
	public void makeSeat () {
		
		for ( int i = 0; i < makeColumn; i++ ) {
			
			// List Create
			seat = new ArrayList<String>();
			
			for ( int j = 0; j < makeRow; j++ ) {
				
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
	public void reservationMenu() {
		
		while ( true ) {
			
			// 메뉴 선택 받음
			menuSelect();
			
			// 메뉴 선택 분기
			if ( menu == 1 ) {
				printSeat();
			} // 1 좌석 보기
			else if ( menu == 2 ) {
				makeReservation();
			} // 2 좌석 예약
			else if ( menu == 3 ) {
				cancleMenu();
			} // 3 좌석 취소
			else if ( menu == 4 ) {
				System.out.println();
				System.err.println("프로그램 종료");
				System.exit(0);
			} // 4 종료
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
				System.out.println("Flight Seat Reservation System");
				System.out.println("1. 좌석 보기");
				System.out.println("2. 좌석 예약");
				System.out.println("3. 좌석 취소");
				System.out.println("4. 종료");
				
				System.out.print("메뉴 입력 : ");
				menu = input.nextInt();
				input = new Scanner ( System.in );
				break;
			}
			catch (InputMismatchException ime) {
				input = new Scanner ( System.in );
				System.err.println("입력 오류! 숫자 입력");
			}
			
		} // while end
		
	} // menuSelect end
	
	
	/**
	 * 2-3 좌석 출력 메소드
	 */
	public void printSeat () {
		
		System.out.println();
		
		for ( int i = 0; i < makeColumn; i++ ) {
			
			seat = seatList.get(i);
			
			for ( String s : seat ) {
				System.out.print(s);
			}
			
			System.out.println();
			
		} // for i end
		
	} // printSeat end
	
	
	/**
	 * 2-4 예약 체크 메소드
	 */
	public void makeReservation () {
		
		while ( true ) {
			
			if ( COUNT >= (makeRow * makeColumn) ) {
				System.out.println();
				System.err.println("더 이상 예약할 수 없습니다");
				System.err.println("프로그램을 종료합니다");
				System.exit(0);
			}
			
			// 좌석 입력
			System.out.println("예약 좌석 입력");
			inputSeat();
			
			// 유효한 좌석인지 체크
			if ( check = seatCheck(1) ) {
				break;
			}
			
		} // while end
		
		// 좌석 예약
		seatReservation();
		
	} // makeReservation end
	
	
	/**
	 * 2-5 예약 진행 메소드
	 */
	public void inputSeat () {
		
		while ( true ){
			
			System.out.println("입력 양식 = (행,열)");
			System.out.print("입력 : ");
			seatNumber = input.nextLine();
			input = new Scanner (System.in);
			
			if (seatNumber.length() == 3 && seatNumber.matches("^[0-9]{1}\\,[0-9]{1}$")) {
				break;
			}
			else {
				System.out.println();
				System.err.println("입력 오류! 재입력");
			}
			
		} // while
		
		// 공백 입력 시 제거
		seatNumber = seatNumber.replace(" ",  "");
		
		// ,(콤마) 기준으로 잘라 배열 입력
		String seatNumbers[] = seatNumber.split(",");
		
		try {
			row = Integer.parseInt(seatNumbers[0]);
			column = Integer.parseInt(seatNumbers[1]);
		}
		catch (NumberFormatException nfe) {
			System.out.println();
			System.err.println("입력 에러! 재입력");
		}
		
	} // inputSeat end
	
	
	/**
	 * 2-6 좌석 예약 메소드
	 */
	public void seatReservation () {
		
		System.out.println("예약자 등록");
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("날짜 입력 : ");
		date = input.next();
		
		personInfo = new ArrayList<String>();
		personInfo.add(name);
		personInfo.add(date);
		
		personList.put(seatNumber, personInfo);
		
		List<String> selectedSeats = seatList.get(row);
		selectedSeats.set(column, "◆");
		
		COUNT++;
		
		System.out.println();
		System.out.println("예약 정보");
		System.out.println(name + "님   날짜 : " + date);
		System.out.println("(" + seatNumber + ") 좌석 예약 완료");
		
	} // seatResevation end
	
	
	/**
	 * 2-7 예약 체크 메소드
	 */
	public boolean seatCheck (int check) {
		
		
		// 생성된 좌석 내 유효한 좌석 값인지 검사
		if ( column < 0 || makeColumn < (column + 1) || makeRow < 0 || makeRow < (row + 1) ) {
			System.out.println();
			System.err.println("잘못된 범위");
			return false;
		}
		
		List<String> selectedSeats = seatList.get(row);
		
		// 예약 과정 시 분기
		if ( check == 1 ) {

			if ( selectedSeats.get(column).contains("◇") ) {
				return true;
			}
			else {
				System.out.println();
				System.err.println("이미 선점된 좌석");
				return false;
			}
		}
		else {
			
			if ( selectedSeats.get(column).contains("◆") ) {
				return true;
			}
			else {
				System.out.println();
				System.err.println("예약 되지 않은 좌석");
				return false;
			}
		} // 취소 과정 시 분기
		
	} // seatCheck end
	
	
	/**
	 * 3 좌석 취소
	 * 
	 * 3-1 취소 메뉴 메소드
	 * 
	 */
	public void cancleMenu () {
		
		// 좌석 출력
		printSeat();
		
		while ( true ) {
			
			// 좌석 입력
			System.out.println("취소 좌석 입력");
			inputSeat();
			
			// 유효한 좌석인지 체크
			if ( check = seatCheck(2) ) {
				break;
			}
		} // while end
		
		seatCancle();
		
	} // cancleMenu end
	
	
	/**
	 * 3-2 예약 취소 메소드
	 */
	public void seatCancle () {
		
		List<String> canclePerson = personList.get(seatNumber);
		
		List<String> selectedSeats = seatList.get(row);
		selectedSeats.set(column, "◇");
		
		System.out.println();
		System.out.println(canclePerson.get(0) + "님   날짜 : " + canclePerson.get(1));
		System.out.println("(" + seatNumber + ") 좌석 취소 완료");
		COUNT--;
	} // seatResevation end
	
}
