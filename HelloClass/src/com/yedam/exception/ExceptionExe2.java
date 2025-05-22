package com.yedam.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExe2{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1. menu | 2. quit");
			System.out.println("Choose menu number >");
			int menu = 0;
			
			while(true) {
				
			try {
				
				menu = Integer.parseInt(scn.nextLine());
			}catch(NumberFormatException e ) {
				System.out.println("1. menu | 2. quit");
				System.out.println("Choose menu number >");
				continue;// 메뉴 번호가 맞을때까지 계속
			}catch(NoSuchElementException e){
				System.out.printf(e.getMessage());
				// backUp() > scanner.close() 로 닫아두지 않으면 backUp에서 어떤 값을 넣어도 무한히 루프 처리를 돌게되는 에러가 발생
				
			}
			break;// 정상적으로 실행됐을경우 반복문 종료
			}
				switch(menu) {
				case 1:
				{
					backUp();
					break;
				}
				case 2:
					run = false;
					break;
				default : 
					System.out.println("존재하지 않는 메뉴입니다");
					
				    break;
				}
				
				
		}
		
	}
	public static void backUp() {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력 >");
		String str = scn.nextLine();
		try {
			System.out.println(str.toString());
			int num = Integer.parseInt("a");
			
		}catch(NullPointerException | NumberFormatException e){
			// 두개 이상의 예외를 처리할때 이어 붙혀서 작성 가능
			// 예외 처리과정이 같으면 사용하지만 그렇게까지 사용할것같진 않음
			System.out.printf("Null or NumFormat Exception err\n");
		}finally {
			// 예외 발생 여부 상관없이 무조건 실행
			scn.close();
			// scanner의 resource 관리 => JVM으로 뿌리기 전 메모리 관리측에서 생각하면서 해주어야한다
		}
		
		System.out.println("END OF PROG");
	}
}
