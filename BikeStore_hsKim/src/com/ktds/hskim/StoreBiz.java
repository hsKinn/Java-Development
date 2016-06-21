package com.ktds.hskim;

public class StoreBiz {
	
	/**
	 * 인스턴스 선언
	 */
	StoreVO bikeStore;
	BuyerVO buyer;
	inputScanner input;
	
	/**
	 * 메뉴값
	 */
	private int menu; 
	
	
	/**
	 * 생성자
	 */
	public StoreBiz ( BuyerVO buyer, StoreVO bikeStore ) {
		
		this.buyer = buyer;
		this.bikeStore = bikeStore;
		input = new inputScanner();
		menu = 0;
	
	}
	
	
	/**
	 * 렌탈 정보 출력
	 * @see www.naver.com
	 */
	public void rentProcess () {
		
		// TODO 수정처리
		System.out.println();
		System.out.println("서울숲 자전거 대여소");
		System.out.println("보유 자전거 / 가격 확인");
		
		// 상점 메뉴 메소드
		rentMenu();
		
	} // rentProcess end
	
	
	/**
	 * 상점 메뉴 메소드
	 */
	public void rentMenu () {
		
		while ( true ) {
			
			// 상점 정보 소개
			Greeting();
			
			System.out.print("입력 : ");
			menu = input.inputInt();
			
			
			if ( menu == 1 ) {
				bottomCheck();
			}
			else if ( menu == 2 ) {
				middleCheck();
			}
			else if ( menu == 3 ) {
				topCheck();
			}
			else if ( menu == 4 ) {
				returnBike();
			}
			else if ( menu == 5 ) {
				exitProgram();
			}
			else {
				elseMenu();
			}
			
		} // while end
	
	} // rentMenu end
	
	
	/**
	 * 상점 정보 소개 메소드
	 */
	public void Greeting () {
		
		System.out.println("1 보급형 자전거 : " + this.bikeStore.getBottomCount() + "대 가격(10분당) : " + this.bikeStore.BOTTOM_PRICE + "원");
		System.out.println("2 중급형 자전거 :  " + this.bikeStore.getMiddleCount() + "대 가격(10분당) : " + this.bikeStore.MIDDLE_PRICE+ "원");
		System.out.println("3 고급형 자전거 :  " + this.bikeStore.getTopCount() + "대 가격(10분당) : " + this.bikeStore.TOP_PRICE+ "원");
		System.out.println("4 자전거 반납");
		System.out.println("5 프로그램 종료");
		System.out.println();
		
	} // Greeting end
	
		
	/**
	 * 보급형 자전거 대여 체크
	 * 
	 * 보유 금액 부족이나 보유 수량 부족시 알림
	 * 
	 */
	public void bottomCheck () {
		
		System.out.println();
		System.out.println("보급형 자전거 대여");
		System.out.println();
		
		if ( bikeStore.getBottomCount() > 0) {
			if ( this.buyer.getMoney() < this.bikeStore.BOTTOM_PRICE ) {
				System.err.println("금액이 부족합니다");
				System.out.println();
			}
			else {
				
				inputRentTime();
				
				int rentTime = (this.buyer.getMoney() / this.bikeStore.BOTTOM_PRICE) * 10;
				
				checkRentTime(rentTime);
				
				bikeStore.setBottomCount( bikeStore.getBottomCount()-1 );
				buyer.setBottomCount( buyer.getBottomCount()+1 );
			}

		}
		else {
			System.out.println();
			System.err.println("수량이 부족합니다");
			System.err.println("다른 종류를 선택하세요");
		}
		
	} // bottomCheck end
	
	
	/**
	 * 중급형 자전거 대여 체크
	 * 
	 * 보유 금액 부족이나 보유 수량 부족시 알림
	 * 
	 */
	public void middleCheck () {
		
		System.out.println();
		System.out.println("중급형 자전거 대여");
		System.out.println();
		
		if ( bikeStore.getMiddleCount() > 0) {
			if ( buyer.getMoney() < bikeStore.MIDDLE_PRICE ) {
				System.err.println("금액이 부족합니다");
				System.out.println();
				
			}
			else {
				
				inputRentTime();
				
				int rentTime = (buyer.getMoney() / bikeStore.MIDDLE_PRICE) * 10;
				
				checkRentTime(rentTime);
				
				bikeStore.setMiddleCount( bikeStore.getMiddleCount()-1 );
				buyer.setMiddleCount( buyer.getMiddleCount()+1 );
			}
		}
		else {
			System.out.println();
			System.err.println("수량이 부족합니다");
			System.err.println("다른 종류를 선택하세요");
		}
		
	} // middleCheck end
	
	
	/**
	 * 고급형 자전거 대여 체크
	 * 
	 * 보유 금액 부족이나 보유 수량 부족시 알림
	 * 
	 */
	public void topCheck () {
		
		System.out.println();
		System.out.println("고급형 자전거 대여");
		System.out.println();
		
		if ( bikeStore.getTopCount() > 0) {
			if ( buyer.getMoney() < bikeStore.TOP_PRICE ) {
				System.err.println("금액이 부족합니다");
				System.out.println();
			}
			else {
				
				inputRentTime();
				
				int rentTime = (buyer.getMoney() / bikeStore.TOP_PRICE) * 10;
				
				checkRentTime(rentTime);
				
				bikeStore.setTopCount( bikeStore.getTopCount()-1 );
				buyer.setTopCount( buyer.getTopCount()+1 );
			}
		}
		else {
			System.out.println();
			System.err.println("수량이 부족합니다");
			System.err.println("다른 종류를 선택하세요");
		}
	
	} // topCheck end
	
	
	/**
	 * 렌탈 시간 입력
	 * 
	 * 문자열 입력 받아 split 통해 시간 값 변환
	 */
	public void inputRentTime () {
		
		while ( true ) {
			
			System.out.println("대여 시작 시간 입력 ");
			System.out.print("입력 (시:분) : ");
			String time = input.inputStr();
			
			time = time.replace(" ",  "");
			
			String timeNumbers[] = time.split(":");
			
			try {
				int hour = Integer.parseInt(timeNumbers[0]);
				int minute = Integer.parseInt(timeNumbers[1]);
				
				buyer.setRentTime( (hour * 60) + minute );
				
				break;
			}
			catch (NumberFormatException nfe) {
				System.out.println();
				System.err.println("입력 에러! 재입력");
			}
			
			
		} // while end
		
	} // inputRentTime end
	
	
	/**
	 * 예약 시간과 소지금으로 대여 가능한 시간, 최대 반납시간 알림
	 */
	public void checkRentTime (int rentTime) {
		
		System.out.println();
		System.out.println("예약 시간 : " + (buyer.getRentTime() / 60) + "시 " + (buyer.getRentTime() % 60) + "분");
		System.out.println("최대 " + rentTime + "분 대여 가능");
		System.out.println();
		System.out.println("반납 시간 : " + ((buyer.getRentTime()+rentTime) / 60) + "시 " + ((buyer.getRentTime()+rentTime) % 60) + "분 이전");
		System.out.println();
	
	} // checkRentTime end
	
	
	/**
	 * 자전거 반납 메뉴 메소드
	 */
	
	public void returnBike () {
		
		// 반납 시간 입력 메소드
		inputReturnTime();
		
		// 사용자 총 자전거 대여 개수
		int bottomCount = buyer.getBottomCount();
		int middleCount = buyer.getMiddleCount();
		int topCount = buyer.getTopCount();
		
		// 사용자 총 렌탈 시간 (가장 최근에 입력된 시간에서 계산 됨)
		int rentTime = buyer.getRentTime();
		int returnTime = buyer.getReturnTime();
		int result = returnTime - rentTime;
		
		// 사용자 총 지불 비용
		int bottomMoney = ( bottomCount * bikeStore.BOTTOM_PRICE) * ( bottomCount * result / 10);
		int middleMoney = ( middleCount * bikeStore.MIDDLE_PRICE) * ( middleCount * result / 10);
		int topMoney = ( topCount * bikeStore.TOP_PRICE) * ( topCount * result / 10);
		
		System.out.println();
		System.out.println("총 대여 자전거");
		System.out.println("보급형 : " + bottomCount + "개 " +  bottomMoney + "원" );
		System.out.println("중급형 : " + middleCount + "개 " + middleMoney + "원" );
		System.out.println("고급형 : " + topCount + "개 " + topMoney + "원" );
		System.out.println();
		
		/**
		 * 비용 계산
		 * 
		 * 사용자-- 상점++
		 */
		bikeStore.setStoreMoney(bikeStore.getStoreMoney() + bottomMoney + middleMoney + topMoney);
		buyer.setMoney(buyer.getMoney() - bottomMoney - middleMoney - topMoney);
		
		/**
		 * 자전거 계산
		 * 
		 * 사용자 -- 상점 ++
		 */
		bikeStore.setBottomCount(bikeStore.getBottomCount() + bottomCount);
		bikeStore.setMiddleCount(bikeStore.getMiddleCount() + middleCount);
		bikeStore.setTopCount(bikeStore.getTopCount() + topCount);
		buyer.setBottomCount(0);
		buyer.setMiddleCount(0);
		buyer.setTopCount(0);
		
		//사용자 소지금 출력
		System.out.println("당신의 소지금 : " + buyer.getMoney());
		System.out.println("상점의 수익금 : " + bikeStore.getStoreMoney());
		System.out.println();
		
	} // returnBike end
	
	
	/**
	 * 반납 시간 입력 메소드
	 */
	public void inputReturnTime () {
		
		while ( true ) {
			
			System.out.println("반납 시간 입력 ");
			System.out.print("입력 (시:분) : ");
			String time = input.inputStr();
			
			time = time.replace(" ",  "");
			
			String timeNumbers[] = time.split(":");
			
			try {
				int hour = Integer.parseInt(timeNumbers[0]);
				int minute = Integer.parseInt(timeNumbers[1]);
				
				buyer.setReturnTime( (hour * 60) + minute );
				
				break;
			}
			catch (NumberFormatException nfe) {
				System.out.println();
				System.err.println("입력 에러! 재입력");
			}
			
		} // while end
		
	} // inputReturnTime end
	
	
	/**
	 * 프로그램 종료 메소드
	 */
	private void exitProgram () {
		
		System.out.println();
		System.err.println("프로그램 종료");
		System.exit(0);
		
	} // exitProgram end
	
	
	/**
	 * 메뉴값 잘못 입력
	 */
	private void elseMenu () {
		
		System.out.println();
		System.err.println("올바른 메뉴값 아닙니다");
		System.out.println();
		
	} // elseMenu end
	
} // class end
