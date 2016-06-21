package com.ktds.hskim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public void start() {
		
		// ArrayList 선언
		List<Integer> score = new ArrayList<Integer>();
		List<String> grade = new ArrayList<String>();

		Scanner input = new Scanner(System.in);
		Calculation cal = new Calculation();
		
		// 점수 입력 메소드
		cal.inputScore(input, score);
		
		// 합계 계산 메소드
		cal.makeSum(score);
		
		// 평균 계산 메소드
		cal.makeAverage(score);
		
		// 학점 변환 메소드
		cal.makeGrade(score, grade);
		
		// 학점 출력 메소드
		cal.printGrade(score, grade);
		
	} // start
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
		
	} // main
	
} // class
