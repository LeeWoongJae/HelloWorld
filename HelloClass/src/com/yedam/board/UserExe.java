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
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		try {
		for (int i = 0; i < users.length; i++) {

			if (!users[i].getUserId().equals(uid) || !users[i].getPassword().equals(pwd)) {
				// 아이디 또는 비밀번호가 불일치할 경우

				System.out.println("정보가 일치하지 않습니다.");
				// 루핑 3회를 실시하면서 확인
				for (int c = 1; c < 4; c++) {
					// 입력값을 다시 받아서
					System.out.print("아이디를 재입력 > ");
					uid = scn.nextLine();
					System.out.print("비밀번호를 재입력 > ");
					pwd = scn.nextLine();
					// 입력한 정보와 저장된 값이 같은지 체크
					if (users[i].getUserId() != null && users[i].getUserId().equals(uid)
							&& users[i].getPassword().equals(pwd)) {
						System.out.printf("환영합니다.\n[%3s] 고객님!\n", users[i].getUserName());
						chk = true;
						break;
					} else { // 일치하지 않으면 return값을 false로 고정
						System.out.println("정보가 일치하지 않습니다.");
						chk = false;
					}
					if (c > 3) { // 3번이 넘어가는 순간 for문 종료
						System.out.println("로그인 시도 3회 실패. 접속 종료");
						chk = false;
						break;
					}

				}
				// inner for문돌면서 결과를 저장하고 outter for문을 빠져나감 
				break;
			}

			else {
				// 재확인할 필요없이 바로 로그인시 딜레이를 주며 로그인 성공 메세지 출력 + true 리턴 
				Thread.sleep(2000);
				System.out.printf("\n\n환영합니다. [%3s] 고객님!\n", users[i].getUserName());
				chk = true;
				break;
			}

		} // end of login for
		} // end of try
		catch(Exception e) {System.out.format("%s%n",e);}
		
		return chk;
	}
}
