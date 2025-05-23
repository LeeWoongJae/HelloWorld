package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		str1 = new String(new byte[]{72, 101, 108, 108, 111});
		str1 = new String(new byte[]{72, 101, 108, 108, 111}, 0, 2);
		
		System.out.println(str1);
		System.out.println(str1.indexOf("o"));
		
		String aa = "010-1231-1234";
		aa.charAt(aa.indexOf("1")+1); // 010 - [1]231 - 1234
		
		 
		
	}
}
