package com.ktds.hskim;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
	
	public void start() {
		
		// 현재 시간값 가져오기
		printCurrentMilliSecond();
		
		// 현재 날짜/시간 출력
		printCuurrentDateTime();
		
		// 현재 날짜/시간 출력
		printCurrentDateTimeByCalendar();
		
		// 2월 시간 값 출력
		printDateTimeByCalendar();
		
		// 시간 차 구하기
		printDateMinusDate();
		
		
		// 현재부터 경과 시간 알아보기
		printTwoDayAfter();
		
	}




	private void printCurrentMilliSecond() {
		long currentSecond = System.currentTimeMillis();
		System.out.println(currentSecond);
	}

	
	private void printCuurrentDateTime() {
		Date date = new Date();
		// 지역시간
		System.out.println(date.toLocaleString());
		// 표준시긴
		System.out.println(date.toGMTString());
	}
	
	
	private void printCurrentDateTimeByCalendar() {
		
		Calendar now = Calendar.getInstance();
		System.out.println( now.toString() );
		
		System.out.println( now.get( Calendar.YEAR ) );
		System.out.println( now.get( Calendar.MONTH ) + 1 );
		System.out.println( now.get( Calendar.DAY_OF_MONTH ) );
		System.out.println( now.get( Calendar.AM_PM ) );
		System.out.println( now.get( Calendar.HOUR ) );
		System.out.println( now.get( Calendar.HOUR_OF_DAY ) );
		System.out.println( now.get( Calendar.MINUTE ) );
		System.out.println( now.get( Calendar.SECOND ) );
		System.out.println( now.get( Calendar.MILLISECOND ) );
		// 요일
		System.out.println( now.get( Calendar.DAY_OF_WEEK ) );
		// 이달의 일자 수
		System.out.println( now.getActualMaximum( Calendar.DAY_OF_WEEK ) );
	}
	
	
	private void printDateTimeByCalendar() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, (2-1), 14, 10, 59, 45);
		
		System.out.println();
		System.out.println("2월 시간값");
		System.out.println( cal.get( Calendar.YEAR ) );
		System.out.println( cal.get( Calendar.MONTH ) + 1 );
		System.out.println( cal.get( Calendar.DAY_OF_MONTH ) );
		System.out.println( cal.get( Calendar.AM_PM ) );
		System.out.println( cal.get( Calendar.HOUR ) );
		System.out.println( cal.get( Calendar.HOUR_OF_DAY ) );
		System.out.println( cal.get( Calendar.MINUTE ) );
		System.out.println( cal.get( Calendar.SECOND ) );
		System.out.println( cal.get( Calendar.MILLISECOND ) );
		// 요일       
		System.out.println( cal.get( Calendar.DAY_OF_WEEK ) );
		// 이달의 일자 수   
		System.out.println( cal.getActualMaximum( Calendar.DAY_OF_WEEK ) );
	}
	
	
	private void printDateMinusDate() {
		
		Calendar now = Calendar.getInstance();
		System.out.println( now.toString() d);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, (2-1), 14, 10, 59, 45);
		
		// 밀리세컨드 값을 넣을 변수 선언하여 밀리세컨드 값을 초기화
		long dateTime1 = now.getTimeInMillis();
		long dateTime2 = cal.getTimeInMillis();
		
		System.out.println(dateTime2);
		System.out.println(dateTime1);
		
		long result = (dateTime2 - dateTime1) / 1000;
		System.out.println(result);
		
		// 초 / 분 / 시간 / 하루 = 일자 차이
		int date = (int) Math.round( (double) (result / 60 / 60 / 24) ) ;
		System.out.println("일자 : " +  date );
		
		int hour = (int) Math.round( (double) (result / 60 / 60 ) ) ;
		System.out.println("시간 : " +  hour );
		
		int minute = (int) Math.round( (double) (result / 60 ) ) ;
		System.out.println("분 : " +  minute );
		
	}
	
	
	// 이틀 경과 후 날짜 값
	// 이후 날짜던 이전 날짜이던 add로 계산
	private void printTwoDayAfter() {
		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_MONTH, 2);
		cal.add( Calendar.MONTH, 1);
		
		System.out.println();
		
		System.out.println("1달 2일 지난 후 ");
		System.out.println( cal.get( Calendar.YEAR ) );
		System.out.println( cal.get( Calendar.MONTH ) + 1 );
		System.out.println( cal.get( Calendar.DAY_OF_MONTH ) );
		System.out.println( cal.get( Calendar.AM_PM ) );
		System.out.println( cal.get( Calendar.HOUR ) );
		System.out.println( cal.get( Calendar.HOUR_OF_DAY ) );
		System.out.println( cal.get( Calendar.MINUTE ) );
		System.out.println( cal.get( Calendar.SECOND ) );
		System.out.println( cal.get( Calendar.MILLISECOND ) );
		// 요일       
		System.out.println( cal.get( Calendar.DAY_OF_WEEK ) );
		// 이달의 일자 수   
		System.out.println( cal.getActualMaximum( Calendar.DAY_OF_WEEK ) );
		
		
	}
	
	
	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		dateTime.start();
	}
}