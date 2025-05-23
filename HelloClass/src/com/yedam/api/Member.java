package com.yedam.api;

public class Member {
	public String memberName;
	public int age;
	// 이름과 나이가 같다면 논리적으로 같은 사람인지 검증
	
	public Member() {}
	public Member(String memberName,int age) {
		this.memberName = memberName;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return age;
		// hashCode()가 중복된 수를 허용못하게 막아서 결과에 중복을 포함하는 자료는 제외하고 출력
	}
	
	@Override
	public String toString() {
		return "이름 : "+memberName+", 나이 :"+age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) { // 매개값의 유형을 비교하고 맞다면 조건 처리  
			Member member = (Member)obj;
			return this.memberName == member.memberName // 
					&& this.age == member.age;
		}
		
		return false; // Member가 아니라면 false 반환
	}
}
