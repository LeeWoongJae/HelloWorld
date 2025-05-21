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
			new User("user02","password2","John"),
			new User("user03","password3","KimMon")
	};
	
	
	static boolean login(String uid , String pwd) {
		// 코드 작성
		boolean chk = true;
		for (int i = 0; i < users.length; i++) {
			if (users[i].getUserId().equals(uid) && users[i].getPassword().equals(pwd)) {
				// 아이디가 존재할 경우

				// 비밀 번호가 틀렸을 경우
				System.out.printf("환영합니다.\n[%3s] 고객님!\n", users[i].getUserName());
				break;

			} else {
				System.out.printf("고객님. 잘못된 비밀번호입니다.\n");
				chk = false;
				break;

			}

		}

		return chk;
	}
}
