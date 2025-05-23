package com.yedam.api;

public class SystemExe {
	public static void main(String[] args) {
		// 1970 ~ 현재까지 시간 누적을 담고있음 1/1000;
		long start = System.nanoTime(); //System.currentTimeMillis();
		int sum = 0;
		for(int i=0;i<100000000;i++) {
			sum += i;
		}
		long end = System.nanoTime(); //System.currentTimeMillis();
		System.out.println("더한 값은 "+sum+"이고, 걸린시간은 "+(end-start));
		
		
		
		long now = System.currentTimeMillis();
		System.out.println(now/1000); // 초단위로 쪼갠거 (뒤 3자리 없애기)
		long startSec = (now/1000);
//		System.out.println("초 단위:"+sec);
		long year = (startSec/(3600*24*365));
		System.out.println("총 년수:"+year); // 몇년
		long day = startSec%3600*24*365;
		day = day / 60 * 60 * 24;
		System.out.println("총 일수:"+day); // 몇일
		long hour = startSec / 3600;
		System.out.println("시간 :"+hour); // 몇시간 
		long min = startSec / 60;
		System.out.println("분 :"+min); // 몇분 
		long sec = startSec % 60;
		System.out.println("초 :"+sec); // 몇초 
		
		
	}
}
