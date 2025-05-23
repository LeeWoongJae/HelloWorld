package com.yedam.api;

public class StringUtil {
	public static String getGender(String ary){
		String str = "";
		char chk = ary.charAt(6);
		if((chk !='-') && chk !=' ') {
			
			switch (chk) {
			case '1':
			case '3':
				str = "남성";
				break;
			case '2':
			case '4':
				str = "여성";
				break;
				}
		}
		if(chk =='-' || chk ==' ') {
			chk = ary.charAt(7);
			switch (chk) {
			case '1':
			case '3':
				str = "남성";
				break;
			case '2':
			case '4':
				str = "여성";
				break;
				}
		}
			

			return str;
	}
	public static String getExtName(String ary) {
		String indx = null;
		indx = ary.substring(ary.indexOf(".")+1 , ary.length());
		String preName = ary.substring(ary.lastIndexOf("/") , ary.length());
		//str = ary.substring(ary.indexOf(".") + 1, ary.length());
		
		
		return indx;
	}
}
