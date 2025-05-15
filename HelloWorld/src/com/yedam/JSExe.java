package com.yedam;


import java.util.*;


public class JSExe {
	public static void main(String[] args) {
		// test();
		// test2(); // 임의의 수를 생성, 1~ 100 사이의 임의의 값을 생성
		test2();
//		int num1 =20 , num2 = 30;
//		System.out.println(num1 == num2);
//		
//		String str1 = new String("Heo-ssu");
//		System.out.println(str1);
//		
//		
//		String str2 = new String("Heo-ssu");
//		System.out.println(str2);
//		
//		System.out.println(str1.equals(str2));

//		test3();
//		test4();
		test5();

	}// End of main

	public static void test() {
		int sum = 0;
		// 1~10 까지 누적해서 합
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1)
				sum += i;
		} // End of for
		System.out.println("홀수를 더한 결과는 : " + sum);
	}

	public static void test2() {
		int sum = 0;
		double cnt = 0;
//		int[] arr = new int[100];
//		for (int i = 0 ; i<6; i++) {
//			int a = 1 + (int)(Math.random()*100);
//			sum+= a;
//		}
//		System.out.println("test2의 결과값 : "+sum);
		for (int i = 0; i < 7; i++) {
			int a = (int) (Math.random() * 71) + 30;
//			arr[i] = a;
			sum += a;
			cnt = i;

		}
		System.out.println("cnt value : " + cnt);
		double result = (sum / cnt);
		System.out.println("SUM value : " + sum + " , 이고 " + "CNT value : " + cnt + "  >> sum / cnt = " + result);
		double tmp = 0;
		tmp = Math.round(result * 1000) / 1000;
		System.out.println("Math.round() : " + tmp);

//		System.out.println(Math.round(23.923 * 100) / 100.0);
//		System.out.println(Math.round(11.110 * 100));
//		System.out.println(Math.round(11.110 * 100) / 100);
//		System.out.println(Math.round(11.110 * 100) / 100.0);
//		 https://bullie.tistory.com/7 참고 자료
		System.out.println(String.format("String.format() : " + "%.2f", result));

	}// End of test2

	public static void test3() {
		/*
		 * String str3 = "30"; int num3 = 30; System.out.println(str3.equals(""+num3));
		 */

		// Integer.parseInt() << 문자를 숫자형으로 변환

		// 사용자의 입력값을 읽음
		int sum = 0;
		Scanner scn = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("점수 입력 > ");
			String value = scn.nextLine(); // 입력한 값을 문자열형태로 반환
			int score = Integer.parseInt(value);
			sum += score;
		}
		scn.close();
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("합계는 " + sum + ", 평균은 " + avg);

	}// End of test3

	public static void test4() {
		String[] list = new String[1000];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
	    boolean isfirst=true;
		String str = "나의 친구들을 소개합니다. \n";
		while (true) {
			System.out.println("message , or quit? > ");
			
			String msg = scn.nextLine();
			
			list[cnt] = msg;
			cnt++;
			
			if (msg.equals("quit")) {
				str += msg.replace(String.valueOf("quit"), "");
				str = str.substring(0,str.lastIndexOf(","));				
				str += " 입니다";		;
				scn.close();
				break;
			}else {
				str += msg + ",";	
			}
			/*
			if(isfirst) {
				str += msg;
				isfirst = false;
			}
			else {
				str += ", "+msg;
			}System.out.println(str);
			*/
			
			
			System.out.println("입력하신 값은 : " + msg);
		}
		System.out.println("End of program.");
		System.out.println(str);
//		System.out.println(cnt);
		
		
		/*for (int i = 0; i < cnt - 1; i++) {
			if(i == cnt-1) {
				
				System.out.println(list[cnt]+" 입니다"); 
				
			}
			else {
				System.out.print(list[i]+",");
			}
		}
		*/
		
		// 순차적으로 나온 결과값에 마지막에 ","가 포함되지 않게 출력하세요 (과제)
		
	}// End of test4
	public static void test5() {
		
		System.out.printf("%s %d\n","문자",30);
		System.out.println("문자열 출력!");
		System.out.printf("%s %d %.1f \n","Hongdong", 100, 100.231);
		System.out.printf("안녕하세요 이름은 %s 입니다\n 나이는 %d 이고, \n 무게는 %d 입니다","@@@",20,60);
		
		
		
	}// End of test5
	
	
	
}// End of JSExe
