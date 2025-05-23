package com.yedam.inheritance;

public abstract class Animal {
	// 추상 클래스(가상)
	// Animal 클래스는 인스턴스는 생성 불가
	String kind;
	
	public void breathe() { 
		// 메서드의 접근제한은 상속받은 자식에게도 동일하게 고정적으로 정의된다
		System.out.println("숨을 쉽니다");
	}
	
	// 추상 메서드 > 상속받는 자식 클래스에서 재정의를 한다
	public abstract void sound(); 
}
