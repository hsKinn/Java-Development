package com.ktds.hskim;

public class Machine {

	public static final int MAX_QUANTITY = 15;

	private String[] cola;
	private String[] sprite;
	private String[] fanta;

	private int colaPrice;
	private int spritePrice;
	private int fantaPrice;

	private int money;
	
	/**
	 * 구매자가 자판기에 넣은 금액
	 */
	private int customerMoney;

	public String[] getCola() {
		return cola;
	}
	public void setCola(String[] cola) {
		this.cola = cola;
	}
	public String[] getSprite() {
		return sprite;
	}
	public void setSprite(String[] sprite) {
		this.sprite = sprite;
	}
	public String[] getFanta() {
		return fanta;
	}
	public void setFanta(String[] fanta) {
		this.fanta = fanta;
	}
	public int getColaPrice() {
		return colaPrice;
	}
	public void setColaPrice(int colaPrice) {
		this.colaPrice = colaPrice;
	}
	public int getSpritePrice() {
		return spritePrice;
	}
	public void setSpritePrice(int spritePrice) {
		this.spritePrice = spritePrice;
	}
	public int getFantaPrice() {
		return fantaPrice;
	}
	public void setFantaPrice(int fantaPrice) {
		this.fantaPrice = fantaPrice;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {

		this.money = money;
	}
	public int getCustomerMoney() {
		return customerMoney;
	}
	public void setCustomerMoney(int customerMoney) {
		this.customerMoney = customerMoney;
	}
	
	
	// Methods
	
	/**
	 * 콜라 수량 셋팅
	 */
	public void setColaQuantity(int quantity) {
		if (!this.isExceedQuantity(quantity)) {
			this.cola = new String[quantity];
			this.setDrink(this.cola, "콜라");
		}
	}
	
	
	/**
	 * 스프라이트 수량 셋팅
	 * @param quantity
	 */
	public void setSpriteQuantity(int quantity) {
		if (!this.isExceedQuantity(quantity)) {
			this.sprite = new String[quantity];
			this.setDrink(this.sprite, "스프라이트");
		}
	}

	/**
	 * 환타 수량 셋팅
	 * @param quantity
	 */
	public void setFantaQuantity(int quantity) {
		if (!this.isExceedQuantity(quantity)) {
			this.fanta = new String[quantity];
			this.setDrink(this.fanta, "환타");
		}
	}

	/**
	 * 음료 수량 셋팅시 최대 수량 검사
	 * @param quantity 입력 수량
	 * @return 입력수량 > 최대 수량의 결과
	 */
	private boolean isExceedQuantity(int quantity) {
		boolean isExceed = quantity > Machine.MAX_QUANTITY;
		if (isExceed) {
			System.out.println("최대 용량 : " + Machine.MAX_QUANTITY);
		}

		return isExceed;
	}
	
	/**
	 * 음료 개수, 이름 셋팅
	 * @param drink 인스턴스 필드 (cola, sprite, fanta)
	 * @param name 음료의 이름
	 */
	private void setDrink( String drink[], String name ) {
		for ( int i = 0; i < drink.length; i++ ) {
			drink[i] = name;
		}
	}
	
	
	/**
	 * 자판기 돈 삽입
	 * @param money 자판기 넣은 금액
	 * @param customer 돈을 넣는 고객
	 */
	public void getMoney(int money, People customer) {
		this.money += money;
		
		this.customerMoney = 0;
		this.customerMoney = money;
		
		customer.pay(money);
	}
	
	/**
	 * 메뉴 출력
	 */
	public void printMenu() {
		
		System.out.println("상품을 선택하세요");
		System.out.println("1. 콜라 (" + this.getColaPrice() + ") : " + this.getDrinkQuantity(1) + "개");
		System.out.println("2. 스프라이트 (" + this.getSpritePrice() + ") : " + this.getDrinkQuantity(1) + "개");
		System.out.println("3. 환타 (" + this.getFantaPrice() + ") : " + this.getDrinkQuantity(1) + "개");
		System.out.print("선택 : ");
		
	}
	
	/**
	 * 각 음료의 수량을 얻어옴
	 * @param drinkNumber
	 * @return
	 */
	private int getDrinkQuantity(int drinkNumber) {
		
		if ( drinkNumber == 1 ) {
			return getDrinkQUantity(this.cola, "콜라");
		}
		else if ( drinkNumber == 2 ) {
			return getDrinkQUantity(this.sprite, "스프라이트");
		}
		else if ( drinkNumber == 3 ) {
			return getDrinkQUantity(this.fanta, "환타");
		}
		
		return 0;
	}
	
	private int getDrinkQUantity(String drinks[], String drinkName) {
		
		int drinkQuantity = 0;
		
		for ( String drink : drinks ) {
			
			// 배열 이름 중 하나가 drinkName과 같다면 수량 증가
			if ( drink.equals(drinkName)  ) {
				drinkQuantity++;
			}
		}
		
		return drinkQuantity;
	}
	
	/**
	 * 음료를 구매자에게 준다.
	 * @param drinkNumber
	 * @param quantity
	 * @param customer
	 * @return
	 */
	public int giveDrink(int drinkNumber, int quantity, People customer) {
		
		if ( drinkNumber == 1 ) {
			
			/*
			 *  1. 구매자가 넣은 금액이 (음료가격 X 수량)만큼 되는지 확인
			 *     만약 금액이 모자르면 구매 불가
			 *  2. 음료 소비자에게 준다
			 *  3. 거스름돈을 소비자에게 준다
			 */
			
			// 1
			if ( this.customerMoney >= (this.getColaPrice() * quantity) ) {
				// 2 
				this.saleDrink(this.cola,  quantity);
				customer.addCola(quantity);
				
				// 3
				int remainMoney = this.customerMoney - (this.getColaPrice() * quantity);
				customer.getRemainMoney(remainMoney);
			}
			
			else {
				System.out.println("금액이 모자랍니다");
				customer.getRemainMoney(this.customerMoney);
			}
			
			
		}
		else if ( drinkNumber == 2 ) {
			
			/*
			 *  1. 구매자가 넣은 금액이 (음료가격 X 수량)만큼 되는지 확인
			 *     만약 금액이 모자르면 구매 불가
			 *  2. 음료 소비자에게 준다
			 *  3. 거스름돈을 소비자에게 준다
			 */
			
			// 1
			if ( this.customerMoney >= (this.getSpritePrice() * quantity) ) {
				// 2 
				this.saleDrink(this.sprite,  quantity);
				customer.addSprite(quantity);
				
				// 3
				int remainMoney = this.customerMoney - (this.getSpritePrice() * quantity);
				customer.getRemainMoney(remainMoney);
			}
			
			else {
				System.out.println("금액이 모자랍니다");
				customer.getRemainMoney(this.customerMoney);
			}
			
			
		}
		else if ( drinkNumber == 3) {
			/*
			 *  1. 구매자가 넣은 금액이 (음료가격 X 수량)만큼 되는지 확인
			 *     만약 금액이 모자르면 구매 불가
			 *  2. 음료 소비자에게 준다
			 *  3. 거스름돈을 소비자에게 준다
			 */
			
			// 1
			if ( this.customerMoney >= (this.getFantaPrice() * quantity) ) {
				// 2 
				this.saleDrink(this.fanta,  quantity);
				customer.addFanta(quantity);
				
				// 3
				int remainMoney = this.customerMoney - (this.getFantaPrice() * quantity);
				customer.getRemainMoney(remainMoney);
			}
			
			else {
				System.out.println("금액이 모자랍니다");
				customer.getRemainMoney(this.customerMoney);
			}
			
			
		}
		else {
			System.out.println("존재하지 않는 메뉴 입니다");
		}

		return 0;
	}
	
	
	private void saleDrink(String drinks[], int quantity) {
		
		int saleCount = 0;
		
		for ( int i = 0; i < drinks.length; i++ ) {
			
			if ( saleCount == quantity ) {
				break;
			}
			
			if ( !drinks[i].equals("판매됨") ) {
				drinks[i] = "판매됨";
				saleCount++;
			}
			
		}
		
	}
	
	
	
}
