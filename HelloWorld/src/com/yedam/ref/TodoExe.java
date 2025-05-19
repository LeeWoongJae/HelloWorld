package com.yedam.ref;

import java.util.Scanner;

public class TodoExe {
	static Student[] scores = null; // 저장할 학생점수
		public static void main(String[] args) {
			
			int[][] numAry = new int[3][5];
			int arySum = 0;
			double aryAvg = 0;
			// 임의의 숫자 생성.
			for (int outer = 0; outer < numAry.length; outer++) {
				for (int inner = 0; inner < numAry[outer].length; inner++) {
					numAry[outer][inner] = (int) (Math.random() * 100) + 1;
					arySum += numAry[outer][inner]; // 각 raw의 column에 있는 값들을 순차적으로 더함
					System.out.printf("[%d][%d] > %d 길이>%d\n",outer,inner,numAry[outer][inner],numAry[outer].length);
					
				}// END OF INNER
				aryAvg = 1.0*arySum / numAry[outer].length; // 더한 값들을 배열의 raw길이만큼 나눔
				System.out.printf("numAry[%d]의 평균은 %.2f\n",outer,aryAvg);
				arySum=0; // 다음 raw의 합을 누적시키기위해 초기화
				
			}// END OF OUTER
			
				
			//scoreMaraton();
			init();
			
			boolean run = true; // 반복문 제어
			int studentNum = 0; // 학생수 증가
			
			Scanner scn = new Scanner(System.in);			
			
			while(run) {
				
				System.out.println("---------------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("---------------------------------------------------");
				System.out.println("메뉴 선택. >> ");
				int selectNo = Integer.parseInt(scn.nextLine());
				
				if(selectNo == 2 || selectNo==3 || selectNo==4) {
					if(scores == null) { // 선택이 2나 3이나 4을 입력했지만 학생수가 null일경우 다시 돌아가서 입력하도록 유도
						System.out.println("학생수를 입력하지 않았습니다. 돌아갑니다");
						continue;// while문을 다시 실행
					}
				}// 
				
				if(selectNo == 1) { // 학생수 지정
					System.out.println("학생수 입력. >>");
					studentNum = Integer.parseInt(scn.nextLine()); // 학생수 입력
					scores = new Student[studentNum]; // 총 학생수 적용
					
				}
				else if (selectNo == 2) { // 점수 기입
					for(int i=0;i<scores.length;i++) { // 학생수(배열의 크기) 만큼 반복문
						System.out.printf("score[%d] 이름 >> \n", i);
						String name = scn.nextLine();
						
						System.out.printf("scores[%d] 점수 >> \n",i);	
						int score = Integer.parseInt(scn.nextLine()); // 학생들 점수 입력
						
						
						System.out.printf("scores[%d] 키 >> \n",i);	
						double height = Double.parseDouble(scn.nextLine()); // 학생들 점수 입력
						
						System.out.printf("scores[%d] 성별 >> \n",i);	
						String gender = scn.nextLine(); // 학생들 점수 입력
						Gender gen = Gender.FEMALE;
						if(gender.substring(0,1).equalsIgnoreCase("m") || gender.substring(0,1).equals("남"))
						{gen = Gender.MALE;}
						else if(gender.substring(0,1).equalsIgnoreCase("f") || gender.substring(0,1).equalsIgnoreCase("w") || gender.substring(0,1).equals("여"))
						{gen = Gender.FEMALE;}
						
									
						Student std = new Student();
						std.stdName = name;
						std.score = score;
						std.height = height;
						std.gender = gen;
						
						
						scores[i] = std;
						
									
						//System.out.println(); // 줄바꿈
						}
					
				}
				else if (selectNo == 3) { // 학생들의 점수 확인
					// 점수의 합이 0 이면 다시 확인하고 입력하라고 유도 
					int sumChk = 0;
					for(int i=0;i<scores.length;i++) { // 점수의 합을 확인했더니 0 일경우를 확인하기 위한 for
						sumChk += scores[i].score;
					}
					if(sumChk == 0) { // 점수의 합이  0일 경우 다시 확인하는 작업의 if
						System.out.println("점수가 입력되지 않았거나 잘못된 기입방법입니다. 다시확인해주세요");
						continue;
					}
					
					System.out.println("검색할 성별 >> ");
					String searchGen = scn.nextLine();
					Gender gen = Gender.MALE;
					if(searchGen.substring(0,1).equalsIgnoreCase("m") || searchGen.substring(0,1).equals("남"))
					{gen = Gender.MALE;}
					else if(searchGen.substring(0,1).equalsIgnoreCase("f") || searchGen.substring(0,1).equalsIgnoreCase("w") || searchGen.substring(0,1).equals("여"))
					{gen = Gender.FEMALE;}
					for(int i=0;i<scores.length;i++) { // 학생수 만큼 점수 리스트 출력
						if(searchGen.equals("") || gen == scores[i].gender) 
						{System.out.printf("성별 [%s] scores[%d] %s님의 점수 > %d\n",
								           scores[i].gender,i,scores[i].stdName,scores[i].score);}
					}// END OF FOR
				}
				else if (selectNo == 4) {// 최고점수와 평균점수 출력
					int sum = 0;
					double max = 0;
					double avg = 0.0;
					Student maxStd = new Student(); // 최고점수를 얻은 학생의 정보를 누적하는 인스턴스
					for(int i = 0; i<scores.length;i++) {
						sum += scores[i].score;
						/*if(max < scores[i].score) {
							max = scores[i].score;
							maxStd.score = max;
							maxStd.stdName = scores[i].stdName; 
						} // 현재 최고점수보다 다음나올 점수가 클경우 최고점수를 업데이트
						*/
						
						if(max < scores[i].height) {
							max = scores[i].height;
							maxStd.height = max;
							maxStd.stdName = scores[i].stdName;
						} // 키가 제일 큰 사람기준으로 출력
					}
					avg = 1.0 * sum / scores.length;
					
					
					System.out.printf("제일 큰 키 : %.1f \n제일 큰 학생 : %s\n평균 점수 : %.2f.\n", maxStd.height,maxStd.stdName, avg);
				}
				else if (selectNo == 5) {
					run = !run;
					
				}else {
					System.out.print("선택하신 기능이 없습니다. 확인후 다시 입력해주세요!.\n");
					continue;
				}
				
				
			}// end of while
			System.out.println("END OF PROG.");
			
			
			
		}// END OF MAIN
		
		public static void init() { // dummy data
			
			Student s1 = new Student();
			s1.stdName = "kildong-Hong";
			s1.score = 80;
			s1.height = 159.8;
			s1.gender = Gender.MALE;
			
			Student s2 = new Student();
			s2.stdName = "Joan";
			s2.score = 85;
			s2.height = 168;
			s2.gender = Gender.FEMALE;
			
			
			Student s3 = new Student();
			s3.stdName = "JayPark";
			s3.score = 65;
			s3.height = 175.3;
			s3.gender = Gender.MALE;
			
						
			Student s4 = new Student();
			s4.stdName = "Cristian";
			s4.score = 88;
			s4.height = 163.2;
			s4.gender = Gender.FEMALE;
			
			scores = new Student[] {s1, s2, s3, s4};
			//stdAry = new Student[] {s1,s2,s3};// s1 s2 s3를 담는 인스턴스를 생성합니다.
			
			
		}// END OF init
		
		
		
		
		
		
		
			
		public static void scoreMaraton() { // 나의 풀이
			
			boolean run =  true;
			int studentNum = 0;
			int[] scores = null;
			Scanner scn = new Scanner(System.in);
			
			while(run) {
				System.out.println("-----------------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("-----------------------------------------------------");
				System.out.print("선택 > ");
				int selectNo = Integer.parseInt(scn.nextLine());
				
				if(selectNo==1) {
					// 학생수 를 입력하면 배열의 크기
					System.out.print("학생수>");
					studentNum = Integer.parseInt(scn.nextLine());
					scores = new int[studentNum]; 
					continue; // 어차피 조건 기능 구생하면 다시 와일문 시작이로 돌아가기 때문에 생략가능.
					
				}
				else if(selectNo==2) {
					// 점수입력은 for문으로 하되 최대길이는 학생수만큼
					for(int i=0;i<studentNum;i++) {
						System.out.printf("scores[%d]>",i);
						int gap = Integer.parseInt(scn.nextLine());
						scores[i] = gap;
						// gap이라는 변수를 다시 사용할것이 아니기 때문이 이부분은 생략하고 배열안에 바로바로 입력값을 기입
					}
					
				}
				else if(selectNo==3) {
					// 점수리스트는 for문으로 서치해서 출력
					for(int i =0;i<studentNum;i++) {
						System.out.printf("scores[%d]>%d\n",i,scores[i]);  
					}
					continue;
				}
				else if(selectNo==4) {
					// 분석은 최고점수 , 평균점수 출력
					double avg = 0;
					int max=0;
					int sum = 0;
					for(int i=0;i<studentNum;i++) {
						sum+=scores[i];
						if(max < scores[i]) {
							max = scores[i];
						}
					}
					avg = 1.0*sum/studentNum;
					System.out.printf("최고 점수: %d\n",max);
					System.out.printf("평균 점수: %.2f\n",avg);
				}else {
					run = !run;
				}
				
			}// END OF while
			System.out.println("-----프로그램 종료-----");
			
		} // END OF scoreMaraton
	
}// END OF CLASS