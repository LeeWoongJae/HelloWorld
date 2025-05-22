package com.yedam.interfaces;

public interface RemoteControl {
	// https://inpa.tistory.com/
	// 참고 자료  인터페이스 vs. 추상클래스 차이 검색
	
	
	public int MAX_VOLUME = 10;
	
	// 추상 메소드
	public void turnOn();
	public abstract void turnOff();
}
