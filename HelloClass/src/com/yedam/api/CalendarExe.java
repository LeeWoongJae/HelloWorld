package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	
	public static void main(String[] args) {
		
		makeCalendar(2025, 4);
//		cld();
		
	}
	
	public static void makeCalendar(int year, int month) {
		Calendar now = Calendar.getInstance();
		now.set(year, (month-1), 1); // yyyy / mm / 1 일
		//now.set(Calendar.YEAR ,year);
		int emp = 0;
		emp = now.get(Calendar.DAY_OF_WEEK)-1;
		//System.out.println(emp);
		System.out.printf("       %d년       %02d월    \n",year,month);
		System.out.println("=====================================");
		System.out.println("SUN   MON   TUE   WED  THU   FRI  SAT");
		System.out.println("=====================================");
		
			for(int i=1;i<=emp;i++) {
				System.out.printf("%5s"," ");
			}
			for(int i=1;i<=now.getActualMaximum(Calendar.DATE);i++) {
				System.out.printf("%5d",i);
				if((emp+i)%7==0)System.out.println();
			}
			System.out.println("\n=====================================");
	}// END OF makeCalendar
	
	
	public static void date() {
		Date today = new Date();
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());
		System.out.println(today.toString());
		
		// 2025-05-12 13:22:37 으로 형식을 변경해보자
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		// 생성자의 매개값으로 포맷지정
		String timeStr = sdf.format(today);
		System.out.println(timeStr);
		
		try {
			today = sdf.parse("2025-08-01 09:00:00");
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);
	}
	public static void cld(){
		// Calendar 클래스 생성
		Calendar now = Calendar.getInstance();
		now.set(2025, 4, 1); // 2025 / 1 / 1 일
		now.set(Calendar.YEAR , 2025);
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek) {
		case 1: System.out.println("SUNDAY"); break;
		case 2: System.out.println("MONDAY"); break;
		case 3: System.out.println("TUESDAY"); break;
		}
		
		System.out.printf("년도 %d | 월 : %d월 | 날짜 : %d일 | 요일 : %d | 말일 : %d\n",
				now.get(Calendar.YEAR),//
				now.get(Calendar.MONTH),//
				now.get(Calendar.DATE),//
				now.get(Calendar.DAY_OF_WEEK),//
				now.getActualMaximum(Calendar.DATE)// 각 월에 마지막날을 반환 (윤년 적용)
				
				);
			
	}
}
