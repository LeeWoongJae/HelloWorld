package com.yedam.inheritance;

public class phoneExe {
	public static void main(String[] args) {
		
		// 부모의 요소가 바뀌면 상속받은 자식의 요소도 같이 바뀐다 (주의 요함)
		
		// parents
		CellPhone p1 = new CellPhone(); 
		// 생성자에서부터 인자값을 지정해서 만들어두면 다른 인스턴스를 생성할때 인자가 없어서 에러가 발생한다
		// 그러므로 인스턴스를 생성할때는 기본생성자를 기본으로 만들어두고 기타 다른 생성자를 추가적으로 만들어 두는 것이 좋다
		p1.model = "iBank001";
		p1.color = "red";
		p1.powerOn();
		p1.powerOff();
		
		// child
		CellPhone p2 = new SmartPhone();
		p2.model = "S25";
		p2.color = "blue";
		p2.powerOn();
		p2.powerOff();
		System.out.println(p2.toString());
		
		SmartPhone p3 = (SmartPhone)p2; // 캐스팅
		
		p3.channel = 2;
		p3.watch();
		
		
		if(p2 instanceof SmartPhone) { // p2가 SmartPhone의 인스턴스(형체)가 맞다면 실행 아니면 종료
			System.out.println("p2 instanceof SmartPhone 연습");
			p3.channel = 2;
			p3.watch();
			System.out.println(p3.toString());
		}
		
		if(p1 instanceof SmartPhone) {
			System.out.println("p1 instanceof SmartPhone 연습");
			p3 = (SmartPhone)p1;
			p3.channel = 3;
			p3.watch();
		}
		
		
		
				
	}
}
