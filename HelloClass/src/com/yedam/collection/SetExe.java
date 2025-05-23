package com.yedam.collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		// Set Collection
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("월요일");
		set.add("화요일");
		set.add("수요일");
		set.add("토요일");
		set.add("일요일");
		
		
		if(set.contains("홍길동")) {
			System.out.println(set.remove("홍길동")); // 삭제되었다면 true 아니면 false
		}
		
		//수정은 인덱스를 가지지 않음으로 불가능
		
		// 반복.
		Iterator<String> iter = set.iterator(); // 임시 순번을 매겨서 값을 찾을수 있다
		// 2. 임시 저장소에 저장  <- 1. set컬랙션을 반복시킬게요~
		while(iter.hasNext()) {
			// 다음 값을 가지고 있으면 == 값을 가지고 있을 동안
			
			String result = iter.next();
			System.out.println(result);
			// 홍길동이 remove되었음으로 나머지 요소들이 출력
			
		}
		
		
	}
}
