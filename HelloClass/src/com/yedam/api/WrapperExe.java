package com.yedam.api;



public class WrapperExe {
	public static void main(String[] args) {
		int num = 10;
		
		Integer num2 = 20; // 앞으로 삭제될 유형이기때문에(new Integer(20)) 미리 취소선으로 표시
		num = num2.intValue();
		
		String str= "10";
		num = Integer.parseInt(str);
		
		double num3 = Double.parseDouble(str);
		num3 = Float.parseFloat(str);
		
		Integer num4 = new Integer(10);
		Integer num5 = new Integer(10);
		
		System.out.println(num4.intValue() == num5.intValue());
		
		
		
	}// end of main
}// end of class
