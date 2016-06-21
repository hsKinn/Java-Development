package com.ktds.jmj;

public class GoHomeProgram {
	
	private GoHomeManage manage;
	private GoHomeBiz biz;
	
	
	public GoHomeProgram() {
		this.manage = new GoHomeManage();
		this.biz = new GoHomeBiz();
	}
	
	/**
	 * 시작하는 부분
	 */
	public void startProgram() {
		manage.createSeats();
		System.out.println("========================================");

		System.out.println("어서오세요. 비행기 좌석 예약 프로그램입니다.");
		System.out.println("고객의 이름으로 예약을 관리합니다.");
		System.out.println("예약 취소시 고객의 정보도 사라집니다.");
		System.out.println("========================================");
		
		biz.startProgram();
	}

}
