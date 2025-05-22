package com.yedam.exception;


// 일반예외 - 컴파일러가 에러부분을 파악.
// 실행예외 - 실행시점에 에러가 발생하는 경우.


public class ExceptionExe {
	
	public static void main(String[] args) {
		String numStr = "10";
		numStr = "a";
		int num = 0;		
		try {
			num = Integer.parseInt(numStr);
			
		}catch(NumberFormatException e){
			System.out.printf("숫자형식예외발생 : %s\n",e);
		}
		
		System.out.println(num);
		
			try {
				Class.forName("java.util.Scanner11");
			} catch (ClassNotFoundException e) {
				//System.out.printf("[ Exception : %s\n",e+" ]");
				System.err.println(e.getMessage());
				
				//e.printStackTrace();
			}
			
		
		
//		catch(ClassNotFoundException e){
//			System.out.printf("일반예외발생 : %s%n",e);
//		}
		
		System.out.println("END OF PROG");
		
	}// end of main
	
}
