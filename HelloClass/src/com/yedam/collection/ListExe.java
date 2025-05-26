package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

import com.yedam.api.Member;






// List colletion 
// 참고 자료 : https://prohannah.tistory.com/85
public class ListExe {
	public static void main(String[] args) {
		
		// 10~100 임의의 값으로 생성
		List<Student> numbers = new ArrayList<>();
		int sum=0;
		double avg = 0.0;
		for(int i=1;i<=10;i++) {
			int rndScore = (int)(Math.random()*91)+10;
			//System.out.printf(rndScore+" ");
			numbers.add(new Student(1000+i,rndScore));
		}
		for(int i=0;i<numbers.size();i++) {
			sum+=numbers.get(i).getScore();
			System.out.println((i+1)+"번째 학생의 점수 : "+numbers.get(i).getScore());
		}
		avg = 1.0*sum / numbers.size();
		System.out.println("합계점수 : "+sum+"점 이고, 평균점수 : "+avg+"점 입니다.");
		
		
		
	}
	public static void exe2() {
		List<Member> members = new ArrayList<>();
		
		// insert
		Member member = new Member("김구라", 16);
		
		members.add(new Member("홍길동", 10));
		members.add(member);
		members.add(new Member("박진후", 25));
		
		// remove
		//members.remove(member);
		
		//search
		String search = "김구라";
		
		for(int i=0;i<members.size();i++) {
			if(members.get(i).memberName.equals(search)) { // Member 클래스에 있는 필드 접근제한을 public 으로 바꿔서 패키지가 서로 다르더라도 접근 가능하게 풀고
														   // 컬렉션에서 필드값을 비교하여 결과를 반환     
				members.remove(i);
			}
			System.out.println(members.get(i));
		}
		
		/*
		 * 자바 컬렉션에서 .get() 메소드의 반환 타입이 String일 경우, 
		 * toString() 메소드를 사용할 필요가 없습니다. String 클래스는 기본적으로 toString() 메소드를 구현하고 있으며, 
		 * 이 메소드는 문자열 값 자체를 반환합니다. 
		 * 따라서 String 객체의 값을 얻기 위해 `toString()`을 호출할 필요가 없습니다.
		 *  
		 */
		
		
//		for(int i=0;i<members.size();i++) {
//			System.out.println(members.get(i));
//		}
		
		
	}
	public static void exe1() {
		// Interface         concrete class(구현 클래스)
		List<String> list = new ArrayList<String>(); // List or ArrayList [parent] > ArrayList [child]
		list.add("10");
		list.add(new String("Hello"));
		list.add(1,"20");
		
		for(String item : list) {
			// Object item으로 구조를 정의했을경우
			//String result = (String)item; // Object -> String으로 자식 캐스팅
			System.out.println(item);
		}
		
		// 변경
		list.set(1, "World");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
