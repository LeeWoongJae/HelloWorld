package com.yedam;

import java.util.Scanner;

public class ObjectExe {
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			int year = 0;
			while(true) {
				System.out.println("년도를 입력 (종료 0)>");
				try {
					year = Integer.parseInt(scn.nextLine());
						
				}catch(Exception e) {
					if(year==0) {break;}
					System.out.println("확인하시고 입력하세요.");
					continue;
				}
				
				if(Calendar.isLeapYear(year)) {
					System.out.println("윤년입니다.");
				}else {
					System.out.println("평년입니다.");
					
				}	
						
				
				
			}// end of while
			
			//"2010"년은 평년입니다.
			//"2000"년은 윤년입니다.
			
		//   클래스     변수     인스턴스 생성.
			Student student = new Student();
			
			student.setStdNum(1001);
			student.setStdName("kildong-Hong");
			student.setEngScore(80);
			student.setMathScore(86);
			student.study();
			student.introduce();
			System.out.println("이름은 : "+student.getStdName()+" 이고, 영어 점수는 "+student.getEngScore()+"점 이고,\n" // 
			+"수학점수는 "+student.getMathScore()+"점 입니다.\n");
			
			Student student2 = new Student(1002,"Min");
			
			//student2.stdNum = 1002;
			//student2.stdName="mingyu-Kil";
			//student2.engScore = -48;
			student2.setEngScore(-50);
			//student2.mathScore = -53;
			student2.setMathScore(-52);
			student2.study();
			student2.introduce();
			
			
		}
}
