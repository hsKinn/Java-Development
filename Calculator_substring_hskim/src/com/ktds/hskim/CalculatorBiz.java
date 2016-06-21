package com.ktds.hskim;

public class CalculatorBiz {
	
	private Input input;
	private CalculatorVO calVO;
	private String numberOne;
	private String numberTwo;
	private String operator;
	
	
	/**
	 * Getters / Setters
	 * @return
	 */
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	public CalculatorVO getCalVO() {
		return calVO;
	}
	public void setCalVO(CalculatorVO calVO) {
		this.calVO = calVO;
	}
	public String getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(String numberOne) {
		this.numberOne = numberOne;
	}
	public String getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(String numberTwo) {
		this.numberTwo = numberTwo;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}


	/**
	 * 생성자 선언
	 */
	public CalculatorBiz () {
		
		input = new Input();
		calVO = new CalculatorVO();
		numberOne = "";
		numberTwo = "";
		operator = "";
		
	} 
	
	
	/**
	 * 
	 * 
	 * Methods
	 * 
	 * 
	 */
	
	
	/**
	 * 계산기 프로그램 Method
	 */
	public void startCal () {
		
		System.out.println("Calculator Program" );
		System.out.println();
		
		while ( true ) {

			// 계산기 메뉴 출력
			calGreeting();
			
			// 입력된 값 변환
			translationCal();
			
			// 연산 후 출력
			calculation();
			
			// 종료 검사
			exitCheck();
			
		}
	} // startCal end
	
	
	/**
	 * 메뉴 출력 Method
	 */
	public void calGreeting () {
		
		boolean check = false;
		
		while ( true ) {
			
			System.out.println("계산할 숫자와 연산자 입력");
			System.out.println("양식 : ( 숫자  연산자  숫자 ) ");
			System.out.print("입력 : ");
			calVO.setInputCal(input.inputStr());
			
			
			// 연산자 체크
			for ( int i = 0; i < calVO.OPERATOR.length; i++ ) {
				
				if ( calVO.getInputCal().equals(calVO.OPERATOR[i]) ) {
					check = true;
				}
			}
			
			// 잘못된 연산자 입력 시
			if ( check = true ) {
				break;
			}
			else {
				System.err.println("잘못된 연산자 입력입니다");
				System.out.println();
			}
			
		} // while end
								
	} // calGreeting end

	
	
	/**
	 * 입력된 값 변환 Method
	 */
	public void translationCal () {
		

		
		// 공백 제거
		calVO.setInputCal( calVO.getInputCal().replace(" ", "") );
		
		numberOne = calVO.getInputCal().substring(0, calVO.getInputCal().indexOf("+"));
		
		if ( calVO.getInputCal().contains(calVO.OPERATOR[0]) ) {
			additionTranslate();
		}
		else if  ( calVO.getInputCal().contains(calVO.OPERATOR[1]) ) {
			subtrationTranslate();
		}
		else if ( calVO.getInputCal().contains(calVO.OPERATOR[2]) ) {
			multiplicationTranslate();
		}
		else if ( calVO.getInputCal().contains(calVO.OPERATOR[3]) ) {
			divisionTranslate();
		}
			
		
		// 피연산자 : String -> Integer 타입 변환 후 인스턴스 필드 초기화
		// 연산자 : 인스턴스 필드 초기화
		calVO.setNumberOne(Integer.parseInt(numberOne));
		calVO.setNumberTwo(Integer.parseInt(numberTwo));
		calVO.setOperator(operator);
		
	} // translationCal end
	
	
	/**
	 * Addition Translate Method
	 */
	public void additionTranslate () {
		numberOne = calVO.getInputCal().substring(0, calVO.getInputCal().indexOf( "+" ));
		numberTwo = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "+" ) + 1, calVO.getInputCal().length());
		operator = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "+" ), calVO.getInputCal().indexOf( "+" ) + 1);
	} // additionTranslate end
	
	
	/**
	 * Subtraction Translate Method
	 */
	public void subtrationTranslate () {
		numberOne = calVO.getInputCal().substring(0, calVO.getInputCal().indexOf( "-" ));
		numberTwo = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "-" ) + 1, calVO.getInputCal().length());
		operator = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "-" ), calVO.getInputCal().indexOf( "-" ) + 1);
	} // subtractionTranslate end
	
	
	/**
	 * Multiplication Translate Method
	 */
	public void multiplicationTranslate () {
		numberOne = calVO.getInputCal().substring(0, calVO.getInputCal().indexOf( "*" ));
		numberTwo = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "*" ) + 1, calVO.getInputCal().length());
		operator = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "*" ), calVO.getInputCal().indexOf( "*" ) + 1);
	} // multiplication Translate end
	
	
	/**
	 * Division Translate Method
	 */
	public void divisionTranslate () {
		numberOne = calVO.getInputCal().substring(0, calVO.getInputCal().indexOf( "/" ));
		numberTwo = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "/" ) + 1, calVO.getInputCal().length());
		operator = calVO.getInputCal().substring(calVO.getInputCal().indexOf( "/" ), calVO.getInputCal().indexOf( "/" ) + 1);
	}// division Translate end
	
	
	/**
	 * 연산 Method
	 */
	public void calculation () {
		
		if ( calVO.getOperator().equals("+") ) {
			System.out.println( calVO.getNumberOne() + " + " + calVO.getNumberTwo() + " = " + additionNumber() );
		}
		else if ( calVO.getOperator().equals("-") ) {
			System.out.println( calVO.getNumberOne() + " - " + calVO.getNumberTwo() + " = " + subtractionNumber() );
		}
		else if ( calVO.getOperator().equals("*") ) {
			System.out.println( calVO.getNumberOne() + " * " + calVO.getNumberTwo() + " = " + multiplicationNumber() );
		}
		else if ( calVO.getOperator().equals("/") ) {
			System.out.println( calVO.getNumberOne() + " / " + calVO.getNumberTwo() + " = " + divisionNumber() );
		}
		
	} // calculation end
	
	
	/**
	 * Addition Method
	 */
	public int additionNumber () {
		
		return calVO.getNumberOne() + calVO.getNumberTwo();
		
	} // additionNumber end
	
	
	/**
	 * Subtraction Method
	 */
	public int subtractionNumber () {
		
		return calVO.getNumberOne() - calVO.getNumberTwo();
		
	} // subtractionNumber end
	
	
	/**
	 * Multiplication Method
	 */
	public int multiplicationNumber () {
		
		return calVO.getNumberOne() * calVO.getNumberTwo();
		
	} // multiplicationNumber end
	
	
	/**
	 * Division Method
	 */
	public double divisionNumber () {
		
		return calVO.getNumberOne() / calVO.getNumberTwo();
		
	} // divisionNumber end
	
	
	/**
	 * Exit Check Method
	 */
	public void exitCheck() {
		
		int exit; 
		
		System.out.println("프로그램 종료? (0=exit) ");
		System.out.print("입력 : ");
		exit = input.inputInt();
		
		if ( exit == 0 ) {
			System.err.println("프로그램 종료");
			System.exit(exit);
		}
		
	} // exitCheck end
	
} // class end
