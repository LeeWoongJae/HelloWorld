package com.yedam.ref;

// 2차원 배열 

public class AryExe2 {
	public static void main(String[] args) {
		
		int[][] intAry = {
				          {16, 22, 31},
				          {28, 38, 12}
				         };
		// intAry[0] => {16, 22, 31}; -->   intAry[0][1] => 22 	
		// intAry[1] => {28, 38, 12};		
		intAry[0][2] = 44;
		for(int raw=0; raw<intAry.length; raw++) { // 2차원 배열 출력
			for(int col=0;col<intAry[raw].length;col++) {
				System.out.printf("intAry[%d][%d] => %d\n",raw, col, intAry[raw][col]);
			}
		}
		
		int[][] ary2 = new int[3][4];
		int sum = 0;
		for(int raw=0;raw<ary2.length;raw++) {
			for(int col=0;col<ary2[raw].length;col++) {
				ary2[raw][col] = (int)(Math.random()*100)+1;
				if(raw == 1) {
					sum += ary2[raw][col]; 
				}
				System.out.printf("ary2[%d][%d] => %d\n",raw, col, ary2[raw][col]);
			}
		}// END OF FOR
		System.out.printf("ary2[1] 요소의 합 == > %d\n",sum);
		
		
	}// END OF MAIN
	
}// END OF CLASS
