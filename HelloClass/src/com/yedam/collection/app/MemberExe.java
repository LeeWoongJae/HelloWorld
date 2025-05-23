package com.yedam.collection.app;

import java.util.Scanner;

public class MemberExe {
	static Member[] memList = null;
	public static void main(String[] args) {
		
		//test();
		
			
			
			boolean run = true;
			Scanner scn = new Scanner(System.in);
			memList = new Member[30];
			Member dummy1 = new Member("admin" , "이웅재" ,"010-2222-3333" , 1000 );
			Member dummy2 = new Member("user01" , "김수현" ,"010-1234-3123" , 100 );
			
			memList[0] = dummy1;		
			memList[1] = dummy2;
			
			
			
			
			while(run) {
				System.out.println(memList.length); 
				
				System.out.println("-------------------------------------------------------");
				System.out.println("1. 회원가입 | 2. 회원정보수정 | 3. 회원탈퇴 | 4. 회원조회 | 5. 종료");
				System.out.println("-------------------------------------------------------");
				System.out.println("메뉴 선택 >> ");
				int selectNo = Integer.parseInt(scn.nextLine());
				
				switch(selectNo) {
				case 1:{// 회원가입
					
					System.out.println("😀환영합니다😀");
					System.out.println("회원가입을 시작합니다");
					System.out.print("가입 종료를 원하시면 quit을 입력해주세요.\n진행을 원하신다면 엔터를 눌러주세요.");
					String chk = scn.nextLine();
					if((chk.equals("quit")) || !(chk.equals(""))){
						run=false;
					}
					else
					{
						for(int i=2;i<memList.length;i++){
								
									System.out.printf("[%d]가입하실 아이디를 입력해주세요.",i);
									String userId = scn.nextLine();
									
									System.out.printf("[%d]가입하실 이름을 입력해주세요.",i);
									String userName = scn.nextLine();
									
									System.out.printf("[%d]가입하실 전화번호를 입력해주세요.",i);
									String phone = scn.nextLine();
									
									System.out.printf("[%d]포인트를 입력해주세요.",i);
									int mileage = Integer.parseInt(scn.nextLine());
									
									Member mem = new Member(userId , userName, phone, mileage);
//									mem.setUserId(userId);
//									mem.setUserName(userName);
//									mem.setPhone(phone);
//									mem.setMileage(mileage);
									if((memList[i] == null)) {
										memList[i] = mem;
									}
									System.out.print("가입하실 계정이 더 있으시다면 Y를 입력해주세요\n없으시면 엔터를 눌러주세요.");
									String joinBrk = scn.nextLine();
									if(!(joinBrk.toLowerCase().equals("y")) || joinBrk.equals("")) {
										break;
									}
								
						
						}// END oF FOR
						
					}// END OF ELSE
				break;
				}
				case 2:{ // 회원 정보(전화번호) 수정
					System.out.println("수정하실 사용자의 이름을 입력해주세요");
					String selectName = scn.nextLine();
					for(int i=0;i<memList.length;i++) {
						if(memList[i].getUserName().equals(selectName)){
							System.out.println("수정하실 전화번호를 입력해주세요");
							String updatePnum = scn.nextLine();
							memList[i].setPhone(updatePnum);
							System.out.println("수정이 완료되었습니다.👍");
							break;
						}
					}
				break;}
				case 3:{ // 회원 탈퇴
					System.out.println("삭제하실 사용자의 이름을 입력해주세요");
					String selectName = scn.nextLine();
					for(int i=0;i<memList.length;i++) {
						if(!(selectName.equals("")) || (selectName.equals(memList[i].getUserName()))){
							
							memList[i].setUserId("");
							memList[i].setUserName("");
							memList[i].setPhone("");
							memList[i].setMileage(0);
							System.out.println("삭제되었습니다!");
							break;
						}else if(!(selectName.equals(memList[i].getUserName()))) {
							System.out.println("삭제하실 이용자의 이름이 존재하지 않습니다\n확인하시고 다시 시도해주세요.");
							break;
						}
					}
				break;}
				case 4:{ // 회원 정보 조회
					
					System.out.println("조회하실 사용자의 이름을 입력해주세요");
					String selectName = scn.nextLine();
					for(int i=0;i<memList.length;i++) {
						if(memList[i]!=null) {
							System.out.printf("%s\n",memList[i].getUserName());
							
							if(memList[i].getUserName().equals(selectName)){
								System.out.printf("ID : %s 이름 : %s \n전화번호 : %s 잔여포인트 : %d\n", memList[i].getUserId(),memList[i].getUserName(),memList[i].getPhone(),memList[i].getMileage());
								
							}else if (selectName=="") {
									
								System.out.printf("[%d]ID : %s 이름 : %s \n전화번호 : %s 잔여포인트 : %d\n",i,memList[i].getUserId(),memList[i].getUserName(),memList[i].getPhone(),memList[i].getMileage());
								
							}
							else {
								System.out.printf("입력하신 %s의 정보가 정확하지 않습니다\n확인하시고 다시 시도해주세요.",selectName);
								break;
							}	
							
						}
						
					}// END OF FOR
				break;}
				case 5:{run = false;}
				}// END OF SWITCH
				
				
			}// END OF WHILE
		
	}// END OF MAIN
	
}// END OF CLASS
