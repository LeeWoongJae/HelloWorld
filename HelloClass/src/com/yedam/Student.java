package com.yedam;



public class Student {
	// field 작성 (정보  꾸러미)
	private int stdNum;
	private String stdName;
	private double height;
	private int engScore;
	private int mathScore;
	// private : 생성자로 만들어진 인스턴스에서만 사용할수 있도록 지정한다
	
	// 생성자(객체 : instance의 초기화)
	public Student() {
		// new 생성자를 통해 만들어지면
		// 클래스명과 똑같은 기본생성자가 컴파일러를 통해 자동으로 만들어진다
		// 따로 생성을 안할경우에 자동생성
		
		
	}
	
	public Student(int stdNum , String stdName) {
		this.stdNum = stdNum;
		// this => 객체 자신을 가르킨다
		this.stdName = stdName;
	}
	
	public Student(int stdNum , int engScore , int mathScore) {
		this.stdNum = stdNum;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	// 메소드 (기능구현)
	void study() { // 단순 출력이기때문에 리턴할 값이 없어서 void 로 하고
		           // 인스턴스를 생성해서 호출할때는 static를 붙히지 않는다
	System.out.println("공부를 합니다.");
	}
	void introduce() {
		System.out.printf("학번은 %d이고, 이름은 %s입니다.\n",stdNum,stdName);
	}
	
	// 영어점수 , 수학점수를 저장할수있는 기능
	void setEngScore(int engScore) {
		if(engScore < 0 || engScore > 100) {
			return; // 바로 빠져 나간다
		}else
		this.engScore = engScore;
	}
	
	void setMathScore(int mathScore) {
		if(mathScore < 0 || mathScore > 100) {
			return; // 바로 빠져 나간다
		}else
		this.mathScore = mathScore;
	}
	
	int getEngScore() {
		return engScore;
	}
	int getMathScore() {
		return mathScore;
	}
	
	// 학번, 학생이름을 지정하는 메소드
	void setStdNum(int stdNum) {
		if(stdNum == 0 || stdNum < 0) {
			return; // void타입일때만 null값을 반환하여 메서드를 빠져나감
		}
		this.stdNum = stdNum;
	}
	void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	// 학번 , 학생이름 반환
	int getStdNum() {
		return stdNum;
	}
	String getStdName() {
		return stdName;
	}
	
}
