package com.yedam.board;

import java.util.Scanner;



// 클래스를 생성 가능하지만 public으로는 생성 불가
class User{
	private String userId;
	private String password;
	private String userName;
	public User(String userId, String password, String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
	}
	//getter
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}
}


public class UserExe {
	static User[] users = {
			new User("user01","password1","홍길동"),
			new User("user02","pwd","John"),
			new User("user03","pwd","KimMon")
			};
	

	static boolean login(String uid , String pwd) {
		// 코드 작성
		try {
		for (int i = 0; i <users.length; i++) {
			
			if (users[i].getUserId().equals(uid) && users[i].getPassword().equals(pwd)) {
				Thread.sleep(2000);
				System.out.printf("\n\n환영합니다. [%3s] 고객님!\n", users[i].getUserName());
				return true;
			
				}// END OF inner if
			
			} // end of login for
		
		} // end of try
		catch(Exception e) {System.out.format("%s%n",e);}
		return false;
	}

}