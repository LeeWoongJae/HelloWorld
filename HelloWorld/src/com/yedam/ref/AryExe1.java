package com.yedam.ref;

import java.util.Scanner;

public class AryExe1 {
	public static void main(String[] args) {
//		test();
//		test2();
//		test3();
//		test4();
//		aryTest();
		
		// Math.random 10~100  사이 점수 생성
		// 10명의 점수를 생성, 점수의 평균을 구하고,
		// 최고점수를 구하라
		// scoreAry 변수
		
		
		
		
//		int[]scoreAry = new int[10];
//		int max = 0;
//		int sum = 0;
//		double avg = 0;
//		for(int i=0;i<scoreAry.length-1;i++) {
//			scoreAry[i] = (int)(Math.random()*91)+10;
//			System.out.printf(" %d ",scoreAry[i]);
//			sum += scoreAry[i];
//			if(max < scoreAry[i]) {
//				
//				max = scoreAry[i];
//			}
//		}
//		avg = 1.0*sum/10;
//		System.out.printf("학생들의 평균 점수는 : %.1f이고, \n학생들중 최고점수는 %d입니다.",avg,max);
		
		
		
boolean run =  true;
		
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo==1) {
				// 학생수 를 입력하면 배열의 크기
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scn.nextLine());
				continue;
				 
			}
			else if(selectNo==2) {
				// 점수입력은 for문으로 하되 최대길이는 학생수만큼
				for(int i=0;i<studentNum;i++) {
					System.out.printf("scores[%d]>",i);
					int gap = Integer.parseInt(scn.nextLine());
					scores[i] = gap;
					continue;
				}
				
			}
			else if(selectNo==3) {
				// 점수리스트는 for문으로 서치해서 출력
				for(int i =0;i<studentNum;i++) {
					System.out.printf("scores[%d]>%d",i,scores[i]);  
				}
				continue;
			}
			else if(selectNo==4) {
				// 분석은 최고점수 , 평균점수 출력
				double avg = 0;
				int max=0;
				int sum = 0;
				for(int i=0;i<studentNum;i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = 1.0*sum/studentNum;
				System.out.printf("최고 점수: %d\n",max);
				System.out.printf("평균 점수: %.3f\n",avg);
			}else {
				run = false;
			}
									
		}// END OF while
		System.out.println("-----프로그램 종료-----");
		
		
		
		
		
	}// END OF MAIN
	
	
	
	
		
	



	public static void aryTest() {
		int[] ary = new int[] {10, 17, 22, 31, 55, 24};
		
		// 총합 , 평균
		int sum = 0,cnt = 0;
		for(int i=0;i<ary.length;i++) {
			if(ary[i] % 2 == 0) {
				sum += ary[i];
				cnt++;
				System.out.printf("SUM : %d , ary : %d\n",sum,ary[i]);
			}
		}
		
		double avg = 1.0*sum / cnt;
		System.out.printf("평균값 : %.1f\n",avg);
		
		
		//최고값
		int max = 0;
		for(int i=0;i<ary.length;i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		System.out.printf("max : %d\n",max);
//		if (max != 0) { // 밑의 코드들이 있을경우 밑의 코드는 실행 안되게
//			return;
//		}
		
		// Sorting
		int tmp = 0;
		for(int j=0;j<ary.length-1;j++) {
			// 큰 값 기준으로 정렬
			for(int i=0;i<ary.length-1;i++) {
				if(ary[i] > ary[i+1]) {
					tmp = ary[i];
					ary[i] = ary[i+1];
					ary[i+1] = tmp;
				}
			}
		}// END OF sorting For
		
		// 결과출력
		for(int i=0;i<ary.length;i++) {
			System.out.printf(" %d ",ary[i]);
		}
		
		
		
		
	}// END OF aryTest
	
	
		
		
	


	public static void test() {

		boolean isTrue = true;
		while (isTrue) {
			int fir = (int) (Math.random() * 6) + 1;
			int sec = (int) (Math.random() * 6) + 1;

			if (fir + sec == 5) {
				System.out.printf("{%d, %d}\n", fir, sec);
				isTrue = false;
			} else {
				continue;
			}

		}

	}

	public static void test2() {

		for (int x = 1; x <= 10; x++) {

			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.printf("{%d, %d}\n", x, y);
				}
			}

		}
	}

	public static void test3() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("");
			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test4() {
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < 6; j++) {
				if (i + j > 5) {System.out.printf(" ");}
				else {System.out.print("a");}
			}
			System.out.printf("\n");
		}

	}
}
