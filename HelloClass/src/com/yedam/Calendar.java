package com.yedam;

import java.util.Scanner;

public class Calendar {
	
	 static boolean isLeapYear(int year) {
		 // https://blog.naver.com/heartflow89/220966558486
		 // 윤년 구하기 참고
		 
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					if (year % 400 == 0) {
						return true;
					} else {return false;}
				} else {return false;}
			}return false;
		}
	
	
	static void showMonth() {
		// sun Mon Tue Wed Thu Fri Sat
		// ===========================
		//                  1   2   3
		// ...
		boolean run = true;
		
		
		while(run) {
			int searchMon = navMsg("보고싶은 달을 입력하세요.");
			switch(searchMon) {
			case 1:
			{
				dayList();
				for (int i = 1; i <= 3; i++) {
					System.out.printf("%4s", " ");
				}
				for (int i = 1; i <= 31; i++) {
					System.out.printf("%4d", i);
					if ((i + 3) % 7 == 0) {
						System.out.println();
					}
				}
				break;
			}
				
			case 2:
			{
				dayList();
				for(int i=1;i<=6;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if((i+6)%7==0) {System.out.println();}
					}
				
				break;
			}
				
			case 3:{
				
				dayList();
				for(int i=1;i<=6;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 31; i++) {
				System.out.printf("%4d", i);
				if((i+6)%7==0) {System.out.println();}
					}
			
				break;
			}
			case 4:{
				
				dayList();
				for(int i=1;i<=2;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if((i+2)%7==0) {System.out.println();}
					}
		
				break;
			}
				
			case 5:{
				dayList();
				for(int i=1;i<=4;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 31; i++) {
				System.out.printf("%4d", i);
				if((i+4)%7==0) {System.out.println();}
					}
								
				break;}
			
			case 6:{
				dayList();
				
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if(i%7==0) {System.out.println();}
					
				}
				
				
				break;}
			case 7:{
				dayList();
				for(int i=1;i<=2;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 31; i++) {
				System.out.printf("%4d", i);
				if((i+2)%7==0) {System.out.println();}
					}
				
				
				break;}
			case 8:{
				dayList();
				for(int i=1;i<=5;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 31; i++) {
				System.out.printf("%4d", i);
				if((i+4)%7==0) {System.out.println();}
					}
			
				
				break;}
			case 9:{
				dayList();
				for(int i=1;i<=1;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if((i+1)%7==0) {System.out.println();}
					}
				
				break;}
			case 10:{
				dayList();
				for(int i=1;i<=3;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if((i+3)%7==0) {System.out.println();}
					}
				
				break;}
			case 11:{
				dayList();
				for(int i=1;i<=6;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 30; i++) {
				System.out.printf("%4d", i);
				if((i+6)%7==0) {System.out.println();}
					}
				
				break;}
			case 12:{
				dayList();
				for(int i=1;i<=1;i++) {
					System.out.printf("%4s"," ");
				}
				for (int i = 1; i <= 31; i++) {
				System.out.printf("%4d", i);
				if((i+1)%7==0) {System.out.println();}
					}
				
				break;}
			
				
			default : run = false;
				break;
			
			}
			
		}
		
		
	}// END OF showMonth()
	static int navMsg(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.printf("\n%s\n",a);
		return Integer.parseInt(scn.nextLine());
	}
	
	static void dayList() {
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("==================================");
		
	}
	
	
	
}
