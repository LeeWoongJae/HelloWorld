package com.yedam.interfaces;

public class Radio implements RemoteControl{
	// RemoteControl를 구현하는 클래스로 
	
	@Override
	public void turnOn() {
		System.out.println("radio ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("radio OFF");
		
	}
	
	
}
