package com.yedam.ref.app;

import java.util.Scanner;

import com.yedam.ref.Member;

// 회원 정보 추가 수정 조회 삭제
// 수정은 아이디를 조회하여 전화번호만 수정가능하게
// 삭제는 존재하지않는 키워드 입력시 존재하지 않는다는 알람 출력
// 조회는 이름기준으로 조회
public class MemberExe {
	static Member[] memList = null;
	public static void main(String[] args) {
		
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 회원가입 | 2. 회원정보수정 | 3. 회원조회 | 4. 회원탈퇴 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("메뉴 선택 >> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1)
			{ // 회원가입
				
				System.out.println("😀환영합니다😀");
				System.out.println("회원가입을 시작합니다");
				
				System.out.println("가입 종료를 원하시면 quit을 입력해주세요.\n진행을 원하신다면 엔터를 눌러주세요.");
				String chk = scn.nextLine();
				if((chk.equals("quit")) || !(chk.equals("")))
				{run=false;}
				else {
						for(int i=0;i<30;i++){
						
						System.out.printf("[%d]가입하실 아이디를 입력해주세요.",i);
						String userId = scn.nextLine();
						
						System.out.printf("[%d]가입하실 이름을 입력해주세요.",i);
						String userName = scn.nextLine();
						
						System.out.printf("[%d]가입하실 전화번호를 입력해주세요.",i);
						String phone = scn.nextLine();
						
						System.out.printf("[%d]포인트를 입력해주세요.",i);
						int mileage = Integer.parseInt(scn.nextLine());
						
						Member mem = new Member();
						mem.userId = userId;
						mem.userName = userName;
						mem.phone = phone;
						mem.mileage = mileage;
						
						System.out.print(mem);
						
						memList[i] = mem;
						
						System.out.println("가입하실 계정이 더 있으시다면 Y를 입력해주세요");
						String joinBrk = scn.nextLine();
						if(!(joinBrk.toLowerCase()=="y")) {
							break;
						}
						
					}// END oF FOR
					
				}
								
			}
			else if (selectNo == 2){// 회원정보 수정
				System.out.println("수정하실 사용자의 이름을 입력해주세요");
				String userName = scn.nextLine();
				for(int i=0;i<memList.length;i++) {
					if(!(userName=="") || (userName.equals(memList[i].userName))){
						System.out.println("수정하실 전화번호를 입력해주세요");
						String updatePnum = scn.nextLine();
						memList[i].phone = updatePnum; 
					}
				}
						
				break;}
			else if(selectNo == 3)
			{
				
				System.out.println("삭제하실 사용자의 이름을 입력해주세요");
				String userName = scn.nextLine();
				for(int i=0;i<memList.length;i++) {
					if(!(userName=="") || (userName.equals(memList[i].userName))){
						
						memList[i].userId = null;
						memList[i].userName = null;
						memList[i].phone = null;
						memList[i].mileage = 0;
						System.out.println("삭제되었습니다!");
					}else {
						System.out.println("삭제하실 이용자의 정보가 정확하지 않습니다\n확인하시고 다시 시도해주세요.");
					}
				}
				
				
				break;
			}
			else if(selectNo ==4) {
				System.out.println("조회하실 사용자의 이름을 입력해주세요");
				String userName = scn.nextLine();
				for(int i=0;i<memList.length;i++) {
					if(userName=="" || (userName.equals(memList[i].userName))){
						System.out.printf("ID : %s 이름 : %s \n전화번호 : %s 잔여포인트 : %d", memList[i].userId,memList[i].userName,memList[i].phone,memList[i].mileage);
					}else {
						System.out.println("조회하실 이용자의 정보가 정확하지 않습니다\n확인하시고 다시 시도해주세요.");
					}
				}
				
				
				
				break;
			}
			else if (selectNo == 5)
				run = false;
			}// END OF WHILE
		System.out.println("END OF PROG.");
		
	}// END OF MAIN
	
	
	
}// END OF CLASS
