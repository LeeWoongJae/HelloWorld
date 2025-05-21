package com.yedam.ref;

public class CalculatorExe {
	// 실행
	 public static void main(String[] args) {
		 // static이 붙어있다면 메모리상에 클래스와 동시에 로드되어져있어서
		 // 인스턴스를 따로 만들지 않아도 사용가능
		 // ex) [Class] cls = new [Class]() 
		 // >> [Class].method() 가능
		 
		// Class >> Calculator >> int sum(...){...}
		int a = 10 , b = 20;
		Calculator cal = new Calculator();
		cal.sum(a, b);
		
		// Class >> Calculator >> static int sum(...){...}
		Calculator.sum(a, b);
		
	}// END OF MAIN
	 
	 void printStar() {
		 System.out.println("*");
	 }
}
