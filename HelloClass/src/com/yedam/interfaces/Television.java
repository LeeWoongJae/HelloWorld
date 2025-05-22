package com.yedam.interfaces;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("테레비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("테레비를 끕니다");
	}

}
