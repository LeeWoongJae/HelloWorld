package com.yedam;

import com.yedam.member.Member;

public class CalculatorExe {
	public static void main(String[] args) {
		Calculator star = new Calculator();
		int num1 = 10;
		String str = "🔆";
		String startStar = star.printStar(num1,str);
		System.out.print(startStar);
		
		double sum = star.add(num1, 10.5);
		int[] numAry = {10, 20, 30};
		sum = star.add(numAry);
		System.out.println(sum);
		// double 타입으로 sum을 생성했기 때문에 결과값이 실수타입으로 나온다
		
		//Member[] 중에서 mileage가 큰 회원을 반환
		Member[] members = {
				new Member("user11" , "홍길동", "010-1111-2222",12474),
				new Member("user22" , "홍길삼", "010-1122-1111",11632),
				new Member("user33" , "홍길사", "010-1133-1231",11632),
				new Member("user44" , "홍길오", "010-1144-2231",12474)
			
		};
		Member member = star.getMaxMileage(members);
		member.showInfo();
		
	}
}
