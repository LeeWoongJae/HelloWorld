package com.yedam.operator;

import java.util.Scanner;

public class ScannerExe {
	public static void main(String[] args) {
	boolean isTrue = true;
	Scanner scn = new Scanner(System.in);
	int bank = 0;
	/*
	while(isTrue) {
		System.out.println("1.메뉴  2.메뉴  3.메뉴  4.종료");
		int select = Integer.parseInt(scn.nextLine()); // Integer.parseInt()
		if(select == 1) { System.out.println("1번 메뉴를 선택했습니다.😀"); }
		else if(select == 2) { System.out.println("2번 메뉴를 선택했습니다.😀"); }
		else if(select == 3) { System.out.println("3번 메뉴를 선택했습니다.😀"); }
		else if(select == 4) { System.out.println("종료 합니다.😀"); scn.close(); break;//isTrue=false;
		}		
		else {System.out.println("메뉴의 번호를 정확히 지정해주세요!"); }
	}// End of while
	*/
	
	while(isTrue) {
		System.out.println("1.입금  2.출금  3.잔액조회  4.종료");
		int select = Integer.parseInt(scn.nextLine()); // Integer.parseInt()
		if(select == 1) {System.out.println("입금하실 금액을 입력해주세요.");
		
			int inputMoney = Integer.parseInt(scn.nextLine());
			if(!(bank>=100000)) {
				if((bank + inputMoney)<100000 || (bank + inputMoney)==100000) {
					// 잔액 + 입금액이 10만원보다 적거나 잔액+입금액이 10만원이 될 경우.
					bank += inputMoney;
					System.out.printf("입력하신 %d원이 입금완료하였습니다.\n", inputMoney);
				   }
				else if((bank + inputMoney)>100000) {
					// 잔액 + 입금액이 10만원을 넘을 경우.
					System.out.printf("계좌의 잔액한도는 100,000원입니다.\n");
				}
			}// 잔액이 10만원보다 적을때 if 끝
			else {System.out.printf("계좌의 입금한도가 초과하였습니다.\n");}
		}// 입금 if 끝
		else if(select == 2) { System.out.println("출금하실 금액을 입력해주세요.😀");
		
			int outputMoney = Integer.parseInt(scn.nextLine());
			if(bank>=outputMoney) { // 잔액보다 출금액이 크거나 같으면
				bank -= outputMoney;
				System.out.printf("입력하신 %d원이 출금완료하였습니다.\n",outputMoney);
			}else {System.out.printf("잔액이 부족하여 출금이 불가합니다.\n");}// 잔액이 0원 미만이 될 경우
		}// 출금 if
		else if(select == 3) { System.out.println("잔액을 조회합니다.😀"); 
			System.out.printf("계좌에 남은 금액은 %d원 입니다.\n",bank);
		
		}// 잔액조회 if
		else if(select == 4) { System.out.println("종료 합니다.😀"); scn.close(); break;//isTrue=false;
		}// 종료 if		
		else {System.out.println("메뉴의 번호를 정확히 지정해주세요!"); }
	}// End of while
	
	System.out.println("End of Program!");
	
	
	}// End of main
	
	
}// End of ScannerExe
