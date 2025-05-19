package com.yedam.ref;

// 배열 + 기본타입 : 저수 , 실수
// 배열 + 참조타입(클래스) : 학생이름 , 점수

public class AryExe3 { // 클래스의 시작
	
	static Student[] stdAry; 
	
	public static void main(String[] args) { // 메인의 시작
		
		init();// 선언한 메서드를 실행하여 초기값을 생성합니다.
		int sum = 0 ;
		double max = 0.0;
		//String maxStd = null;
		Student  student = new Student();
		for(int i=0;i<stdAry.length;i++) { // 생성된 인스턴스 기준으로 정보를 출력
			System.out.printf("이름 : %s // 점수: %d\n",stdAry[i].stdName,stdAry[i].score);
			sum += stdAry[i].score;
//			if(student.score < stdAry[i].score) // 점수가 높은사람을 저장
//			{student.score = stdAry[i].score;
//			 student.stdName = stdAry[i].stdName; } 
			if(max<stdAry[i].height) {
				max = stdAry[i].height;
				student.score = stdAry[i].score;
				student.stdName = stdAry[i].stdName;
				student.gender = stdAry[i].gender;
			}
			
			
		}
		double avg = 1.0*sum / stdAry.length;
		// System.out.printf("현재의 인스턴스 점수는 : %d\n",student.score); // 초기점수를 확인
//		System.out.printf("점수 총합 : %d \n최고 점수 : %d \n평균 점수 : %.2f\n",sum ,student.score ,avg);
		System.out.printf("최고 점수 : %d \n평균 점수 : %.2f\n",student.score ,avg);
		System.out.printf("키가 큰 학생은 %s 입니다.",student.stdName);

		
		
		
	}// END OF MAIN
	
	public static void init() {
		
		Student s1 = new Student();
		s1.stdName = "kildong-hong";
		s1.score = 80;
		s1.height = 159.8;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.stdName = "mingyu";
		s2.score = 85;
		s2.height = 182;
		s2.gender = Gender.MALE;
		
		
		Student s3 = new Student();
		s3.stdName = "JayPark";
		s3.score = 65;
		s3.height = 175.3;
		s3.gender = Gender.MALE;
		
		
		Student s4 = new Student();
		s4.stdName = "cristian";
		s4.score = 88;
		s4.height = 163.2;
		s4.gender = Gender.FEMALE;
		
		
		stdAry = new Student[] {s1,s2,s3};// s1 s2 s3를 담는 인스턴스를 생성합니다.
		
		
	}// END OF init
	
	
	public static void test() {
		
		// 같은 패키지 안에 데이터 타입이 Student인 s1 인스턴스 생성
		
		// kildong-hong 80
		Student s1 = new Student(); // new 생성자로 값들을 담을수 있는 instance 생성 s1은 인스턴스의 주소값을 가짐
		
		s1.stdName = "kildong-hong";
		s1.score = 80;
		
		// minkyou
		Student s2 = new Student();
		s2.stdName = "mingyu";
		s2.score = 85;
		
		Student[] students = {s1, s2};
		students[0].stdName = "홍길동";
		
		
		System.out.printf("Name : %s , Score : %d\n",s1.stdName, s1.score);
		
		
	}// END OF TEST
	
}// END OF CLASS


