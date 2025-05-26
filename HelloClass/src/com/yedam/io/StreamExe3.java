package com.yedam.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import com.yedam.collection.Student;

// 학생 (추가, 수정, 삭제, 목록)
// StudentList.txt으로 저장
// add() , modify() , remove(), list()
// 추가 : 이름 점수 입력
// 수정 : 이름을 입력하면 점수 수정
// 삭제 : 이름을 입력하면 삭제
// 목록
// 종료시 저장
public class StreamExe3 {
	
	static Scanner scn = new Scanner(System.in); // 정적필드는 정적메소드 안에서 호출가능
	static List<Student> studentList = new ArrayList<>(); // static 은 인스턴스를 만들지 않더라도 메모리영역에서 로드가 됌
	public static void main(String[] args) {
		try {
			init();
		} catch (NoSuchElementException e) {
			// 더이상 읽어들일 값이 없다 
		}
		catch (IOException e) {e.printStackTrace();}
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생추가 | 2. 점수수정 | 3. 학생삭제 | 4. 학생목록 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("메뉴 선택 >");
			String menu = scn.nextLine();
			switch(menu) {
			case "1": // 학생추가
				add();
				break;
			case "2": // 점수수정
				modify();
				break;
			case "3": // 학생삭제
				//remove();
				break;
			case "4": // 학생목록
				//list();
				break;
			case "5":
				run = false;
				save();
				// 종료되는 시점에 수정했던 모든 작업들이 덮어쓰기로 저장 (LIKE snapshot -> commit)
				break;
			}
		}// end of while
		
		System.out.println("End of Program");
	}// end of main
	
	static void add() { // 학생추가
		
		System.out.println("학생 번호 입력 >");
		int sno = Integer.parseInt( scn.nextLine());
		System.out.println("학생 점수 입력 >");
		int score = Integer.parseInt( scn.nextLine());
		
		Student student = new Student(sno , score);
		if(studentList.add(student)) {
			System.out.println("추가 완료!!!");
		}
		
	}
	
	static void modify() {
		System.out.println("수정할 학생 번호 입력 >");
		int sno = scn.nextInt();
		
		System.out.println("수정할 학생 점수 입력 >");
		int score = scn.nextInt();
		scn.nextLine(); // 값을 입력하고 후 오는 엔터를 처리(엔터를 만나기전까지만 스캐너가 읽고 엔터를 처리하는건 
						// break를 만나 스위치문을 빠져나온 후 메뉴를 고르는 스캐너에서 처리되어진다 
						// 그렇기 때문에 nextLine이 아닌경우는 따로 nextLine을 추가해주어야한다)
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getStudentNo() == sno) {
				studentList.get(i).setScore(score);
				System.out.println("수정이 완료되었습니다.");
			}
		}
		
		
		
	}
	static void save() {// 리스트 저장
		try {
			Writer wr = new FileWriter("c:/temp/studentList.txt");
			for(Student std : studentList) {
				String txt = std.getStudentNo() + " " + std.getScore() + "\n";
				wr.write(txt);
			}
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 초기화
	static void init() throws IOException, NoSuchElementException { // 해당메소드에 발생한 예외를 메소드를 호출한 곳에 책임전가
		Scanner scan = new Scanner(new File("c:/temp/studentList.txt"));
		while(true) {
			String txt = scan.nextLine();
			String[] strAry = txt.split(" ");
			
			// studentList 컬렉션에 계속 추가
			studentList.add(new Student( Integer.parseInt(strAry[0]),//
					                         Integer.parseInt(strAry[1]) 
					                       )
					       );
			
		}// end of while
	}
	
	
	
	
}// end of StreamExe3
