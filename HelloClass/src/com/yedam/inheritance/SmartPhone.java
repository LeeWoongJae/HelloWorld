package com.yedam.inheritance;

public class SmartPhone extends CellPhone{
	
	int channel;
	
	SmartPhone(){}
	// 접근제한자는 해당하는 클래스와 같은 제한자로 지정됨으로 굳이 따로 정의하지 않아도 된다
	// https://devyihyun.tistory.com/114 << 접근제한 참고문
	SmartPhone(String model, String color , int channel) {
		super(model, color); // 부모의 생성자 정보를 가져와서 지정
		this.channel = channel; // 나머지는 자식 생성자에서 지정

	}

	void watch() {
		System.out.println(channel + "번을 시정합니다.");
	}
	
	// 접근제한자는 부모와 같이 맞추는게 좋다
	// 부모보다 강력한 접근제한자로 오버라이딩 정의는 불가능하다
	// ex > parentClass public // childClass default 불가능
	// ex > parentClass protected // childClass public 불가능
	//ex > parentClass private // childClass default 가능
	
	@Override
	public void powerOn() {
		System.out.println("🔆전원을 켭니다🔆");
	}
	
	
	@Override
	public void powerOff() {
		System.out.println("💥전원을 끕니다💥");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "channel = "+ channel+"]";
		// https://velog.io/@rhdmstj17/java.-super%EC%99%80-super-%EC%99%84%EB%B2%BD%ED%95%98%EA%B2%8C-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
		// super , super() 차이 이해 참고문
	}
	
	
}
