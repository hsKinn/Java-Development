package com.ktds.ksk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaneReservationBiz {
	
	private HashMap<Integer, List<String> > seats;
	private List<String> seat;
	private List<PlaneReservationVO> reservationInfo;
	
	private static final int ROW = 2;
	private static final int CELL = 8;
	
	public PlaneReservationBiz() {
		seats = new HashMap<Integer, List<String>>();
		reservationInfo = new ArrayList<PlaneReservationVO>();
	}
	
	public HashMap<Integer, List<String>> getSeats() {
		return seats;
	}

	public void setSeats(HashMap<Integer, List<String>> seats) {
		this.seats = seats;
	}

	public List<String> getSeat() {
		return seat;
	}

	public void setSeat(List<String> seat) {
		this.seat = seat;
	}

	public List<PlaneReservationVO> getReservationInfo() {
		return reservationInfo;
	}

	public void setReservationInfo(List<PlaneReservationVO> reservationInfo) {
		this.reservationInfo = reservationInfo;
	}

	public void createSeats() {
		
		for( int i = 0; i < ROW; i++ ) {
			
			seat = new ArrayList<String>();
			
			for( int j = 0; j < CELL; j++ ) {
				seat.add("○");
			}
			
			seats.put(i, seat);
		}
	}
	
	public void printSeats(){
		
		for( int i = 0; i < ROW; i++ ) {
			
			seat = seats.get(i);
			
			for( String s : seat ) {
				System.out.print(s);
			}
			System.out.println("");
		}
		
	}
	
	public boolean confirmReservation(int row, int cell) {
		seat = seats.get(row);
		
		if(seat.get(cell).equals("○")) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public void insertReservationInfo(PlaneReservationVO vo) {
		reservationInfo.add(vo);
		seat = seats.get(vo.getReservationSeatRow());
		seat.set(vo.getReservationSeatCell(), "●");
	}
	
	public boolean reservationInfo(String name) {
		
		for( PlaneReservationVO vo : reservationInfo ) {
			if( vo.getName().equals(name) ){
				printReservationInfo(vo);
				return true;
			}
		}
		return false;
	}
	
	public void printReservationInfo(PlaneReservationVO vo) {
		System.out.println("이름 : " + vo.getName() );
		System.out.println("날짜 : " + vo.getDate() );
		System.out.println("좌석 : " + vo.getReservationSeatRow() + "," + vo.getReservationSeatCell());
	}
	
	public void removeReservation(String cancelName) {
		int removeRow;
		int removeCell;
		for( int i = reservationInfo.size()-1; i >=0; i--) {
			if( reservationInfo.get(i).getName().equals(cancelName) ) {
				removeRow=reservationInfo.get(i).getReservationSeatRow();
				removeCell=reservationInfo.get(i).getReservationSeatCell();
				seat=seats.get(removeRow);
				seat.set(removeCell, "○");
			}
		}
		
		
	}

}
