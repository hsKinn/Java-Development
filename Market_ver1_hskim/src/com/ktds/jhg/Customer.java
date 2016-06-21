package com.ktds.jhg;

public class Customer {
	
	// 구매자.   돈과 사과  
	// 사과의 갯수
	
	/**구매자가 가지고 있는 금액*/
	private int money;

	/**구매자가 가지고 있는 사과의 수*/
	private int appleCount;
	
	public void setMoney ( int money ){ // 파라미터와  위의 필드 이름은 같지만 엄연히 다르다
		this.money = money;
	   //인스턴스 필드를 구분하는 this       a = b    =   a  (변하는 b값 적용됨)
	}	
				public void setappleCount ( int appleCount ){
			this.appleCount = appleCount;  // 셋터      
		}
                
				public int getMoney (  ){
					return this.money;  // 겟터는 리턴 돌려줘야 함.  money 로 리턴 되는 값
				}
				//
				public int getAppleCount (  ){
					return this.appleCount;  // 겟터는 리턴 돌려줘야 함
				}
				
				// 하나의 행위마다 하나의 메소드가 있어야함 . 돈을 준다. 물건을 가져온다. 거스름돈 받는다 = 3개의 메소드
				
			  public int pay ( int money ) {  // 지불될 돈 파라미터 생성
				  this.money -= money;
			      return money;              // int 니까 return money;
			  }
			  public void getApple ( int appleCount ) {  // 받을 사과의 수 파라미터 생성
				  this.appleCount += appleCount;
			  }
			  public void takeMoney ( int money ) {  // 거스름 돈 파라미터 생성
				  this.money += money;
			  }
			  public void printMyInfo (  ) {  // 구매자의 정보
				  System.out.println( "구매자가 가진 사과의 수 :" + this.appleCount);
				  System.out.println( "구매자가 가진 돈 :" + this.money);
			  }




}

