package com.ktds.jmj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GoHomeManage {

	private static Map<Integer, List<String>> seats;
	private Scanner input;
	private List<String> seat;
	private int row;
	private int col;
	
	public GoHomeManage(){
		this.seats = new HashMap<Integer, List<String>>();
		this.input = new Scanner(System.in);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Map<Integer, List<String>> getSeats() {
		return seats;
	}

	public void setSeats(Map<Integer, List<String>> seats) {
		this.seats = seats;
	}
	
	/** 
	 * Scanner함수
	 * @return
	 */
	public String inputScanner() {
		input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public int inputScannerInt(){
		input = new Scanner(System.in);
		return input.nextInt();
	}
	
	/**
	 * 초기 좌석 생성
	 * @return
	 */
	public Map<Integer, List<String>> createSeats() {
		for ( int j = 0; j < 2; j++){
			this.seat = new ArrayList<String>();
			for( int i = 0; i < 8; i++ ) {
				seat.add("○");
			}
			seats.put(j,seat);
		}
		return seats;
	}
	
	/**
	 * 좌석 출력
	 */
	public void printSeats() {
		for ( int i = 0; i < 2; i++ ){
			this.seat = this.seats.get(i);
			for ( String s : seat ) {
				System.out.print(s);
			}
			System.out.println("");
		}
	}
	
	/**
	 * 예약!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	public void reservationSeats() {
		while(true){
			//seatNum 뽑아내기
			System.out.println("예약할 좌석을 (x,y)형식으로 입력하세요.(x번째 줄 y번째 자리)");
			printSeats();
			System.out.println("8칸씩 2줄의 좌석있다.");
			
			String seatNum = inputScanner();
			System.out.println("");
			
			seatNum = seatNum.trim();
			
			seatNum = seatNum.replace(" ", ""); 
			
			String seatNumbers[] = seatNum.split(","); 
			
			this.setRow(Integer.parseInt(seatNumbers[0]));
			this.setCol(Integer.parseInt(seatNumbers[1]));
			
			// 존재하지 않는 좌석을 입력했다면 return으로 함수빠져나가기?
			if ( checkRow(this.row) || checkCol(this.col)){
				System.out.println("존재하지 않는 좌석입니다.");
			}
			else{
				if (ischeckSeat()){
					System.out.println("이미 예약된 자리야");
					printSeats();
				}
				else {
					// 안된좌석이라면 예약 궈궈
					List<String> selectedSeats = getSeats().get(this.row-1);
					selectedSeats.set(this.col-1, "●");
					
					System.out.println(row + "번째 줄 " + col + "번째 칸의 자리가 예약되었습니다.");
					printSeats();
					break;
				}
			}
		}
	}
	
	/**
	 * 예약된 좌석인지 확인
	 * @return
	 */
	public boolean ischeckSeat(){
		for (int i = 0; i < 2; i++) {
			List<String> checkList = getSeats().get(this.row-1);
			for ( String s : checkList ){
				if (checkList.get(this.col-1).equals("●") ){
					
					return true; // 되었다면 return으로 함수빠져나가기?
				}
				
			}
		}
		return false;
	}
	
	public void cancleSeats(String seatNum) {
		seatNum = seatNum.trim();
		
		seatNum = seatNum.replace(" ", ""); 
		
		String seatNumbers[] = seatNum.split(","); 
		
		this.setRow(Integer.parseInt(seatNumbers[0]));
		this.setCol(Integer.parseInt(seatNumbers[1]));
		
		List<String> selectedSeats = getSeats().get(row-1);
		selectedSeats.set(col-1, "○");
		
		printSeats();
		
	}
	
	//범위안에 입력받은 좌석 숫자가 맞나
	public boolean checkCol (int num){
		if ( num <= 0 || num >= 9){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkRow (int num){
		if ( num <= 0 || num >= 3){
			return true;
		}
		else {
			return false;
		}
	}

}
