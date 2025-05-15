package com.yedam.condition;

import java.util.Scanner;

public class IfExe {
	public static void main(String[] args) {
//		test();
		randomGame();
		
		
	}
	
	public static void test() {
		
		int score = 80;
		
		/*
		// if 
		if(score >= 90) {
			System.out.println("Your grade : A! 😄");
		}else if(score>=80){
			System.out.println("Your grade : B! 😄");
		}else if(score>=70){
			System.out.println("Your grade : C! 😄");
		}else {
			System.out.println("😄");
		}// END OF IF
		*/
		
		// switch
		int miniSc = score /10;
		switch(miniSc) {
		case 10:
		case 9:
			System.out.println("A 입니다.");break;
		case 8:
			System.out.println("B 입니다.");break;
		case 7:
			System.out.println("C 입니다.");break;
		default : System.out.println("GO BACK!!!");break;
			
		}// END OF SWITCH
		
	}// END OF TEST
	
	public static void randomGame() {
		// 1~1000 사이의 임의의 값을 생성.
		// 567
		// 500을 입력
		// 입력한 값과 크기를 비교후 크다 작다 같다 출력
		// 600을 입력 .. 반복 하면서 정확한 정답을 입력할 때까찌 무한 반복
		// 정답을 맞추면 축하메세지와 합께 프로그램 종료 출력
					
			Boolean isTrue = true;
			int cnt = 0;
			int ranVal = (int)(Math.random()*1000)+1;
			int limit = 30;
			Scanner scn = new Scanner(System.in);
			System.out.printf("랜덤한 값이 지정되었습니다.\n제한시간은 30초입니다.\n정답을 맞추세요 >> \n");
				while(isTrue) {
					    limit--;
					    if(limit != 0) {
					    	int nxt = Integer.parseInt(scn.nextLine());
					    	if(nxt == ranVal) {// 정답을 맞췄을경우 IF
								System.out.printf("축하합니다! 정답을 맞추셨습니다. %d번 시도하셨습니다.\n",cnt);
								scn.close();
								isTrue = false;
							}else { // 정답을 맞추지 못했을 경우
								if(nxt > ranVal) { // 입력한 값이 정답보다 클 경우
									cnt++;
									System.out.printf("입력한 값이 정답보다 큽니다!\n");
								}else if(nxt < ranVal){ // 입력한 값이 정답보다 작을 경우
									cnt++;
									System.out.printf("입력한 값이 정답보다 작습니다!\n");
									
								}
							}	
					    	
					    }// END OF limit
					    else { // 시간이 전부 소모될 경우
					    	System.out.println("TIME OUT! 다음기회에.");
					    	scn.close();
					    	isTrue = false;
					    }
																				
					}// END OF WHILE
	}// END OF randomGame
			
}// END OF CLASS
