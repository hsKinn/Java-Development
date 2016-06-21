package com.ktds.ksk;

import java.util.Scanner;

public class PlaneReservationInput {
	
	private Scanner input;
	private PlaneReservationBiz biz;
	private PlaneReservationVO vo;
	
	private String seatNumber;
	private String[] seatNumberCellAndRow;
	private int row;
	private int cell;
	
	public PlaneReservationInput() {
		
		input = new Scanner(System.in);
		biz = new PlaneReservationBiz();
	}
	public void inputCreateSeats(){
		biz.createSeats();
	}
	
	public void printMenu() {
		System.out.println("=====비향기 예약 서비스=====");
		System.out.println("1번 : 자리 예약");
		System.out.println("2번 : 예약 확인");
		System.out.println("3번 : 예약 취소");
		choiceMenu(input.nextInt());
	}
	
	public void choiceMenu(int choice) {
		if( choice == 1 ) {
			inputSeatNumber();
		}else if( choice == 2) {
			inputSearchReservationName();
		}else if( choice == 3 ) {
			inputRemoveReservationName();
		}
	}
	
	public void inputSeatNumber() {
		biz.printSeats();
		System.out.println("예약할 자리를 선택하시오.");
		seatNumber = input.nextLine().replace(" ", "");
		seatNumber = input.nextLine().replace(" ", "");
		
		seatNumberCellAndRow = seatNumber.split(",");
		row = Integer.parseInt(seatNumberCellAndRow[0]);
		cell = Integer.parseInt(seatNumberCellAndRow[1]);
		
		availableSeats(row, cell);
	}
	
	public void availableSeats(int row, int cell) {
		if(biz.confirmReservation(row, cell)) {
			System.out.println("예약자 성함, 날짜를 입력하시오.");
			inputReservationInfo(row, cell);
		}else{
			System.out.println("이미 예약된 좌석입니다.");
		}
	}
	
	public void inputReservationInfo(int row, int cell) {
		vo = new PlaneReservationVO();
		vo.setName(input.next());
		vo.setDate(input.nextLine());
		vo.setDate(input.nextLine());
		vo.setReservationSeatRow(row);
		vo.setReservationSeatCell(cell);
		
		biz.insertReservationInfo(vo);
		System.out.println("좌석이 예약되었습니다.");
		biz.printSeats();
	}
	
	public void inputSearchReservationName() {
		System.out.println("예약하신 성함을 입력하시오.");
		if(!biz.reservationInfo(input.next())){
			System.out.println("예약현황에 이름이 없습니다.");
		}
	}
	
	public void inputRemoveReservationName() {
		System.out.println("취소할 예약자의 성함을 입력하시오.");
		biz.removeReservation(input.next());
		System.out.println("취소하였습니다.");
	}

}
