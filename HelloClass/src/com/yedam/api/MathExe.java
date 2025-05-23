package com.yedam.api;

public class MathExe {
	public static void main(String[] args) {
		System.out.println(Math.abs(-100));
		
		//  소숫점자리를 올림 or 버림
		System.out.println(Math.floor(12.3)); // 버림
		System.out.println(Math.ceil(12.3)); // 올림 -> .1이상 있으면 올림
		System.out.println(Math.round(12.3)); // 반올림 -> 정수로 반환
		
		// 크기비교 -> 서로 비교(ceil메소드로 13.0이된 값이 큰값으로 반환)
		System.out.println(Math.max( Math.ceil(12.3), Math.floor(12.3) ));
		
		int a = 198;
		String bb = Integer.toString(a);
		
		System.out.println(bb.equals("198") ? "String" : "Int");
		
		
	}
}
