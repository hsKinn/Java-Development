package com.ktds.ksk;

public class PlaneReservationVO {
	
	private String name;
	private String date;
	private int reservationSeatRow;
	private int reservationSeatCell;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getReservationSeatRow() {
		return reservationSeatRow;
	}
	public void setReservationSeatRow(int reservationSeatRow) {
		this.reservationSeatRow = reservationSeatRow;
	}
	public int getReservationSeatCell() {
		return reservationSeatCell;
	}
	public void setReservationSeatCell(int reservationSeatCell) {
		this.reservationSeatCell = reservationSeatCell;
	}
	
}
