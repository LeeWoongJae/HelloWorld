package com.yedam.operator;

import java.util.Scanner;

public class OperatorExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("보고싶은 달력의 월을 입력하세요 >> ");
		int month = scn.nextInt();
//		test();
//		test1();
//		test2();
//		test3();
		test4(month);
		test5();
	}
	public static void test() {
		// 증감 연습
		//byte a1 = 10;
		char ch1 = 'A';
		System.out.println((int)ch1);
		ch1 = '가';
		for(int i =1; i<=26;i++) {
			System.out.printf("%s %d \n",ch1,(int)ch1);
			ch1++;
		}
		
	}// End of test
	
	public static void test1() {
		
		byte n1 = 10;
		byte n2 = 20;
		byte sum = (byte) (n1 + n2);
		long n3 = 3000000000L;
		System.out.println(Long.MAX_VALUE);
		System.out.println(n3);
		
	}// End of test1
	
	public static void test2() {
		
		int num1 = 10;
		int num2 = 20;
		
		
		int result = ++num1 + num2;
		System.out.println(num1); // 11
		System.out.println(result); // 11+20 => 31
		int result2 = num1 + num2++; // 11+20
		System.out.println(result2); //11+20 => 31
		System.out.println(num2); // 21
		
		boolean isTrue = true;
		if(!isTrue) {System.out.println("거짓입니다!");}
		
		
		
	}// End of test2
	
	public static void test3() {
		
		boolean isTrue = true;
		
		for(int i=1;i<11;i++) {
			if(isTrue) {System.out.printf("%d\n",i);}
		}// End of for
		
		isTrue = !isTrue;
				
	}// End of test3
	
	
	// Month  정보를 입력하면 "공란" 반환하는 메소드.getSpace
	public static int getSpace(int month) {
		int space = 0;
		if( month == 3) {space = 6;}
		else if(month == 4) {space = 2;}
		else if(month == 5) {space = 4;}
		else if(month == 7) {space = 2;}
		return space;
	}// End of getSpace
	
	public static int getLastDate(int month) {
		int lastDate = 0;
		switch(month) {
		case 2: lastDate = 28;break;
		case 4: 
		case 6:
		case 9:
		case 11:
			lastDate = 30; break;
		default: lastDate = 31;break;
		}
		return lastDate;
	}// End of lastDate
	
	
	public static void test4(int month) {
		System.out.printf(" Sun Mon Tue Wed Tur Fri Sat\n");
		//빈 공란 찍기
		int m = month;
		int space=getSpace(m);
		int lastDate = getLastDate(m);
		for(int i=1;i<=space;i++) {
			System.out.printf("%4s"," ");
		}
		
		// Day 
		for(int d= 1; d<=lastDate;d++) {
			System.out.printf("%4d",d);
			if((d+space)%7==0) {System.out.println();}
		}
		
				
	}// End of test4
	
	
	public static void test5() {
		
		String pass= "";
		int score = (int)(Math.random()*101);
//		if(score > 60) { pass = "pass!"; }
//		else {pass="To be next";}
		
		// 3항 연산자
		pass = (score>60) ? (score>85) ? "\nExcellent!" : "\npass" : (score<20) ? "\nTo be next" : "\ngood";
		System.out.println(pass);
		
	}// end of test5
	
	
	
}// End of main
