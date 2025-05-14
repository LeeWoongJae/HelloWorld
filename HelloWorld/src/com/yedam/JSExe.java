package com.yedam;

public class JSExe {
	public static void main(String[] args) {
        // test();
		test2();
		// 임의의 수를  생성,    1~ 100 사이의 임의의 값을 생성
		int sum = 0;
		for (int i = 0 ; i<6; i++) {
			int a = 1 + (int)(Math.random()*100);
			sum+= a;
		}
		System.out.println(sum);
	}// End of main
	
	public static void test(){
		int sum = 0;
		// 1~10 까지 누적해서 합
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 1) sum += i;
		}// End of for
		System.out.println("홀수를 더한 결과는 : " + sum);
	}
	
	
}// End of JSExe
