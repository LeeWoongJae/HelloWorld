package com.yedam.ref;



public class NullExe {
	public static void main(String[] args) {
		String str1 = "killYOU";
		String str2 = null;
		
//		System.out.println(str2.toString());
		
		int[] intAry = {40, 50, 60};
		System.out.printf("배열의 크기 %d\n",intAry.length);
		
		
		for (int i = 0; i<3; i++) {
			System.out.printf("%d번째 값 : %d\n",i,intAry[i]);
			
		}// END OF FOR
		System.out.println();
		
		// double ary 선언
		// 10.2 , 23.2 , 34.5
		
		double[] aryDouble = new double[] {10.2 , 23.2, 34.5};
		
		for(int i=0;i<aryDouble.length;i++) {
			System.out.printf("%d번째 Double 배열 값 : %.1f\n",i,aryDouble[i]);
			
		}
		
		String[] strAry = new String[10];
		for(int i =0; i<strAry.length;i++) {
			System.out.printf("%d번째 String 배열의 값 : %s\n",i,strAry[i]);
		}
		
		
		
		
		
	}
}
