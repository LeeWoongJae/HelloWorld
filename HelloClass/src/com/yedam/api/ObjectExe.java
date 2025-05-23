package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class ObjectExe {
	public static void main(String[] args) {
	
		// Array[than many] => collection (1. List 2.Set 3.Map)// Set >> interface
		
		int[] ary = new int[5];
		Set<Integer> set = new HashSet<Integer>();
		// Set interface 안에 int타입의 값을 저정 >> new 생성자를 통해서 HashSet<>으로 생성
		// 배열처럼 누적 저장
		
		for(int n : ary) {
			System.out.println("초기값 : "+n);
		}
		
		// 선언했던 클래스 // Set 컬렉션에서 Member 클래스 타입으로 members를 선언
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동",10));
		members.add(new Member("김민재",30));
		members.add(new Member("차인표",60));
		members.add(new Member("홍길동",10));
		for(Member mem : members) {
			System.out.println(mem.toString()); // overriding 해서 출력 포맷 변경
		}
		
		
		
		// 저장되는 순서가 없고 , 기본적으로 중복된값 허용 X => add로 들어가는 값들중 서로 같을경우에 [동일하다]로 정의
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		
		for(Integer num : set) {
			System.out.println(num);
			
		}
	}
	
	
	public static void exe1(){
		int num1 = 10 , num2 = 20;
		System.out.println(num1 == num2);
		
		String str1 = new String("Hello");
		String str2 = new String("Hello"); // 주소값을 가지는 인스턴스 생성
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		Member mem1 = new Member();
		mem1.memberName = "홍길동";
		mem1.age = 20;
		
		Member mem2 = new Member();
		mem2.memberName = "홍길동";
		mem2.age = 20;
		
		
		System.out.println(mem1 == mem2);
		System.out.println(mem1.equals(mem2));
	}
}	

