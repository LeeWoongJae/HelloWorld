package com.yedam.condition;

import java.util.Scanner;

public class LoopExe {
	public static void main(String[] args) {

		hands();
		
	}// END oF MAIN
	
	
	public static void test() {
	// while vs do while
		boolean run = false;
		do {System.out.println("while문");}
		while(run);// END OF DO...WHILE
		System.out.println("END OF PROG");
	
	}// END OF TEST
	
	public static void hands() {
		// 가위 , 바위 , 보 게임
		// 각각 1, 2, 3
		int cpu = (int)(Math.random()*3)+1;
		boolean isTrue = true;
//		System.out.println(cpu);
			
		Scanner scn = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요\n");
		while(isTrue) {
			
			System.out.printf("1. 가위  2. 바위  3. 보  4. 종료\n");
			int my = Integer.parseInt(scn.nextLine());
			if(my == cpu) {// cpu가 나랑 같은걸 낼 경우
				System.out.println("Same");
				scn.close();
				isTrue = false;
			}
			else if(my == 4){
				System.out.println("게임을 종료합니다.");
				scn.close();
				isTrue = false;
			}
			else {
				if(cpu==1) {// cpu 가위 
					switch(my) {
					case 2:{System.out.println("You Win!");scn.close();isTrue = false;break;}
					case 3:{System.out.println("You Lose!");scn.close();isTrue = false;break;}
					}
				}else if(cpu==2) {// cpu 바위
					switch(my) {
					case 1:{System.out.println("You Lose!");scn.close();isTrue = false;break;}
					case 3:{System.out.println("You Win!");scn.close();isTrue = false;break;}
					}
				}else {// cpu 보
					switch(my) {
					case 1:{System.out.println("You Win!");scn.close();isTrue = false;break;}
					case 2:{System.out.println("You Lose!");scn.close();isTrue = false;break;}
					}
				}
			}// cpu와 내가 낸 것과 다른경우
			
		}// END OF WHILE
		
		
		
	}// END OF HANDS
	
	
	
}
