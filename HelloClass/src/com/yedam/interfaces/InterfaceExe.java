package com.yedam.interfaces;

public class InterfaceExe {
	public static void main(String[] args) {
		final int num = 10;
		
		RemoteControl rc = new Television();
		//  인터페이스의 변수에   구현클래스의 인스턴스를 할당
		// ex > CellPhone phone = new SmartPhone
		rc.turnOn();
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.turnOff();
		
	}
}
