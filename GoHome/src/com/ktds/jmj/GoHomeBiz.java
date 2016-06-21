package com.ktds.jmj;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GoHomeBiz {
	
	private List<GoHomeVO> gohomeList;
	private GoHomeVO gohome;
	private GoHomeManage manage;
	private Scanner input;
	private boolean result;
	private static Date curDate;
	private int choice;
	
	public GoHomeBiz() {
		this.gohomeList = new ArrayList<GoHomeVO>();
		this.input = new Scanner(System.in);
		this.manage = new GoHomeManage();
	}

	public List<GoHomeVO> getPhoneInfoList() {
		return gohomeList;
	}

	public void setPhoneInfoList(List<GoHomeVO> phoneInfoList) {
		this.gohomeList = gohomeList;
	}
	
	public int getChoice() {
		return choice;
	}

	public void setChoice() { // choice 에 대한 InputMismatchException예외처리
		while(true){
			try{
				this.choice = manage.inputScannerInt();
				break;
			}
			catch(InputMismatchException ime){
				System.out.println("1,2,3,4 중에 입력해주세요.");
			}
		}
	}
	
	/**
	 * 프로그램 실행부분
	 */
	public void startProgram(){
		// 초기화
		int choice = 0;
		String searchName = "";
		String deleteName = "";
		
		while( true ) {
			this.gohome = new GoHomeVO();
			System.out.println("등록하려면 1번, 검색하기 2번, 취소하려면 3번, 종료 4번");
			
			this.setChoice();
			choice = this.getChoice();
			
			if( choice == 1 ) {
				curDate = new Date();
				gohome = new GoHomeVO();
				System.out.println("이름을 입력하세요.");
				String name = input.next();
				
				gohome.setName(name);
				manage.reservationSeats();
				gohome.setCurDate(curDate);
				System.out.println(gohome.getName()+ "님 의 자리가 " + gohome.getCurDate() + "에 예약되었습니다.\n");
				String seatNum = manage.getRow() + "," + manage.getCol();
				gohome.setSeatNum(seatNum);
				//출력용 저장
				String printSeat = manage.getRow() + "번째 줄 " +manage.getCol() + "번째 칸에 예약중입니다.";
				gohome.setPrintSeat(printSeat);
				// 예약된 정보 추가	
				this.addNewGoHomeInfo(gohome);
			}
			else if ( choice == 2 ) {
				while(true){
					System.out.println("검색할 이름을 입력하세요.");
					searchName = input.next();
					if(checkScanner("^[가-힣a-zA-Z]*$", searchName)){
					}
					else{
						if ( this.result = this.getGoHomeByName(searchName) ){
							System.out.println("찾았다.\n");
							
							printInfo(); // 찾은정보 출력
							System.out.println("");
						}
						else {
							System.out.println("없다.");
						}
						break;						
					}
				}
			}
			else if ( choice == 3 ) {
				System.out.println("이름을 입력하세요.");
				while(true){
					deleteName = input.next();
					if ( checkScanner("^[가-힣a-zA-Z]*$", deleteName) ){
					}
					else{ 
						if ( this.result = this.deleteGoHomeByName(deleteName) ){ //존재하면
							manage.cancleSeats( getInfo(deleteName).getSeatNum() ); // 비행기 좌석 취소
							this.gohomeList.remove(getInfo(deleteName)); // 고객 정보 삭제
							System.out.println("예약이 취소되었습니다.");
							System.out.println(deleteName + "님의 정보가 삭제되었습니다.\n");
							break;
						}
						else{ //이름이 존재하지않으면
							System.out.println(deleteName+"의 정보가 없습니다.\n");
							break;
						}
					}//if
				}//while
			}//if
			else if ( choice == 4 ) {
				System.exit(0);
			}
		}//while
	}

	/**
	 * 스캐너할때 오류있는지 체크
	 * @param checkScan 정규표현식
	 * @param whatString 체크할 문자열
	 * @return
	 */
	public boolean checkScanner( String checkScan, String whatString ) {
		if ( !whatString.matches(checkScan) ) {
			System.out.println("재입력");
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Create
	 * @param phoneInfo
	 */
	public void addNewGoHomeInfo(GoHomeVO gohome) {
		this.gohomeList.add(gohome);
	}

	/**
	 * Read
	 * @param name
	 * @return
	 */
	public boolean getGoHomeByName( String name ) {
		//이름으로 사람을 검색함
		for ( GoHomeVO gohome : this.gohomeList ) {
			if ( gohome.getName().equals(name) ){
				this.gohome = gohome;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Delete
	 * @param name
	 * @return
	 */
	public boolean deleteGoHomeByName( String name ) {
		for ( GoHomeVO gohome : this.gohomeList ) {
			if( gohome.getName().equals(name) ) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 원하는 이름의 정보를 찾을 때
	 * @param name
	 * @return
	 */
	public GoHomeVO getInfo( String name ) {
		for ( GoHomeVO gohome : this.gohomeList ) {
			if ( gohome.getName().equals(name) ){
				this.gohome = gohome;
				return gohome;
			}
		}
		return new GoHomeVO();
	}
	
	/**
	 * 프린트 출력용
	 */
	public void printInfo(){
		System.out.println("이름 : " + this.gohome.getName());
		System.out.println("좌석 : " + this.gohome.getPrintSeat());
		System.out.println("예약시간 : " + this.gohome.getCurDate());
		
	}

}
