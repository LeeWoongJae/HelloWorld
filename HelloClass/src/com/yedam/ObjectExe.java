package com.yedam;

public class ObjectExe {
		public static void main(String[] args) {
			
			
			
			
			
			
			
		//   클래스     변수     인스턴스 생성.
			Student student = new Student();
			
			//student.stdNum = 1001;
			student.setStdNum(1001);
			//student.stdName="kildong-Hong";
			student.setStdName("kildong-Hong");
			//student.engScore = 80;
			student.setEngScore(80);
			//student.mathScore = 86;
			student.setMathScore(86);
			student.study();
			student.introduce();
			System.out.println("이름은 : "+student.getStdName()+" 이고, 영어 점수는 "+student.getEngScore()+"점 이고,\n" // 
			+"수학점수는 "+student.getMathScore()+"점 입니다.\n");
			
			Student student2 = new Student(1002,"Min");
			
			//student2.stdNum = 1002;
			//student2.stdName="mingyu-Kil";
			//student2.engScore = -48;
			student2.setEngScore(-50);
			//student2.mathScore = -53;
			student2.setMathScore(-52);
			student2.study();
			student2.introduce();
			
			
			
		}
}
