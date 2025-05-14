package com.yedam;

public class HelloJava {
	// Hello Java ~
	public static void main(String[] args) {
		// INT : 정수 타입 
		// FLOAT , DOUBLE : 실수
		// BOOLEAN : 참과 거짓
		int num1 = 10;
		double num2 = 20; // 자동 형변환 발생 Promotion
		
		num1 = (int) num2;
		
		int num3 = 100;
		double num4 = 200;
		double sumNum = (double)num3 + num4;
		System.out.println("결과는 "+sumNum);
		System.out.println("결과는 "+ (20 + 30));
		
	}
	
	
}
