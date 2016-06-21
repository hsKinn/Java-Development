package com.ktds.hskim;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculation {
	
	/**
	 * 입력 받기 위한 점수
	 */
	private int score;
	
	/**
	 * 입력된 점수들의 합계
	 */
	private int scoreSum;
	
	/**
	 * 입력된 점수들의 평균
	 */
	private int scoreAverage;
	
	/**
	 * 입력된 점수로 환산된 학점
	 */
	private String scoreGrade;

	public int getScoreSum() {
		return scoreSum;
	}
	public void setScoreSum(int scoreSum) {
		this.scoreSum = scoreSum;
	}
	public int getScoreAverage() {
		return scoreAverage;
	}
	public void setScoreAverage(int scoreAverage) {
		this.scoreAverage = scoreAverage;
	}
	public String getScoreGrade() {
		return scoreGrade;
	}
	public void setScoreGrade(String scoreGrade) {
		this.scoreGrade = scoreGrade;
	}	
	
	/**
	 * 0 ~ 100점 까지의 점수 10개를 입력 받는다
	 * 허용된 범위가 아니면 반복을 통해 재 입력
	 * @param input
	 * @param score
	 */
	public void inputScore ( Scanner input, List<Integer> score ) {
		
		System.out.println("10개의 점수를 입력하세요 (0~100) ");
		System.out.println();
		
		// 10번 입력 받는 for
		for ( int i = 1; i < 11; i++ ) {
			
			// 입력 범위 내 재 입력  while
			while ( true ) {
				
				System.out.print(i + "번 입력 : ");
				
				// 예외 발생 시 try ~ catch로 재 입력  while
				while ( true ) {
					try {
						this.score = input.nextInt();
						break;
					}
					catch ( InputMismatchException ime ) {
						input = new Scanner(System.in);
						System.out.println();
						System.out.println(ime.getMessage() + " 예외 발생! 숫자로 재 입력");
						System.out.print(i + "번 입력 : ");
					}
				} // while 예외 발생 시 재 입력 while
				
				if ( this.score >= 0 && this.score <= 100) {
					score.add(this.score);
					break;
				} // 정상 입력
				else {
					System.out.println();
					System.out.println("범위 오류! (0~100) 재 입력");
				} // 입력 범위 초과
				
			} // while 입력 범위 내 검사 while
			
		} // for 10번 입력 받는 for
		
		System.out.println();
		System.out.println("입력된 점수");
		
		for ( int i = 0; i < score.size(); i++ ) {
			System.out.print("[" + score.get(i) + "]  ");
		} // 입력된 점수 출력
		
	} // inputScore
	
	/**
	 * 합계 계산 메소드
	 * @param score
	 */
	public void makeSum ( List<Integer> score ) {
		
		for ( int i = 0; i < 10; i++) {
			this.scoreSum += score.get(i);
		} // 10개의 점수 총합 계산
		
		System.out.println();
		System.out.println("입력된 점수 총합 : " + this.scoreSum);
		System.out.println();
		
	} // makeSum
	
	
	/**
	 * 평균 계산 메소드
	 * @param score
	 */
	public void makeAverage ( List<Integer> score ) {
		
		this.scoreAverage = this.scoreSum / score.size();
		
		System.out.println();
		System.out.println("입력된 점수 평균 : " + this.scoreAverage);
		System.out.println();
		
	} // makeAverage
	
	/**
	 * 학점 변환 메소드
	 * @param score
	 * @param grade
	 */
	public void makeGrade ( List<Integer> score, List<String> grade ) {
		
		for ( int i = 0; i < score.size(); i++ ) {
			if ( score.get(i) >= 90 ) {
				grade.add("A");
			}
			else if ( score.get(i) >= 80 ) {
				grade.add("B");
			}
			else if ( score.get(i) >= 70 ) {
				grade.add("C");
			}
			else if ( score.get(i) >= 60 ) {
				grade.add("D");
			}
			else if ( score.get(i) < 60 ) {
				grade.add("F");
			}
		
		} // for
		
	} // makeGrade
	
	/**
	 * 학점 출력 메소드
	 * @param score
	 * @param grade
	 */
	public void printGrade ( List<Integer> score, List<String> grade ) {
		
		for ( int i = 0; i < score.size(); i++ ) {
			System.out.println("[" + (i+1) + "] 번 점수 : " + score.get(i) + " 학점 : " + grade.get(i));
		}
	}
}
