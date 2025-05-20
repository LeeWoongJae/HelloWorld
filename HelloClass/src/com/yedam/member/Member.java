package com.yedam.member;

public class Member {

	private	String userId;
	private	String userName;
	private	String phone;
	private	int mileage;
	
	
	
	
	public Member() {}
	public Member(String userId , String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public Member(String userId, String userName, String phone, int mileage) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
		this.mileage = mileage;
	}
	
	// setter 구현
	void setUserId(String userId) {
		if(userId.equals("")) {
			return;
		}
		this.userId = userId;
	}
	void setUserName(String userName) {
		if(userName.equals("")) {
			return;
		}
		this.userName = userName;
	}
	void setPhone(String phone) {
		if(phone.equals("")) {
			return;
		}
		this.phone = phone;
	}
	void setMileage(int mileage) {
		if(mileage < 0 ) {
			return;
		}
		this.mileage = mileage;
	}
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s 마일리지는 %d",userName,phone,mileage);
	}
	
	// getter 구현
	String getUserId() {
		return userId;
	}
	
	String getUserName() {
		return userName;
	}
	String getPhone() {
		return phone;
	}
	public int getMileage() {
		return mileage;
	}
	
}
