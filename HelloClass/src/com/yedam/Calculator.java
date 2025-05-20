package com.yedam;

import com.yedam.member.Member;

public class Calculator {
	// field
	// method
	// 생성자
	
	// " * "을 출력하는 메소드 구현
	String printStar(int count, String str){
		String result = "";
		for(int i=0;i<count;i++) {
			//System.out.println(str);
			result += str+"\n";
		}
		return result;
	}// END OF printStar
	
	// method overloading
	int add(int a, int b){return a + b;}
	// 같은 이름의 메소드를 재정의(인자값변동 등등)
	double add(int s1, int s2, int s3){return s1 + s2 + s3;}
	// double add(int s1, int s2){return s1 + s2;} // 불가능
	// int add(int s1 , int s2) {return s1 + s2;} // 변수명이 달라도 불가능 , 데이터 타입 기준으로 중복체크되기 때문
	double add(double a , double b){return a + b;}
	
	
	double add(int[] ary) {
		int sum = 0;
		for(int i=0;i<ary.length;i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	Member getMaxMileage(Member[] ary) {
		Member max = null;
		int maxPoint = 0;
		for(int i=0; i<ary.length;i++) {
			Member tmp = ary[i];
			if(maxPoint < tmp.getMileage()) {
				maxPoint = tmp.getMileage();
				max = tmp;
			}
		}
		return max;
	}
	
	
}
