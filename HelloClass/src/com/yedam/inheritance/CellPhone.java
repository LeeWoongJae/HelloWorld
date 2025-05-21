package com.yedam.inheritance;

public class CellPhone {
	String model;
	String color;
	//생성자.
	
	CellPhone(){}
//	// 기본 생성자를 만들어두지 않았기 때문에 새로 정의된 생성자를 자식클래스가 사용하면 
//	// 정의되지 않은 생성자에 대해서 에러가 발생
//  // 생성자를 정의할때는 기본생성자는 기본으로 만들어두어야한다고 기억해두자
	CellPhone(String model , String color){
		this.model = model;
		this.color = color;
	}
	
	
	
	// 메소드.
	public void powerOn() {
		System.out.println("전원을 켜기");
	}
	public void powerOff() {
		System.out.println("전원을 끄기");
	}
	protected void call() {
		System.out.println("전화를 받는다");
	}

	// toString() 오버라이딩
	@Override
	public String toString() {
		return "CellPhone [model=" + model + ", color=" + color + "]";
	}
	
	
}
