package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class StudentMap{
	private String stdName;
	private int stdScore;
	
	// 생성자
	public StudentMap(String stdName, int stdScore) {
		this.stdName = stdName;
		this.stdScore = stdScore;
		
	}
	
	// hashCode , equals
	@Override
	public int hashCode() {
	
		return stdScore;
		//return stdName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentMap) {
			StudentMap std = (StudentMap)obj;
			return this.stdName.equals(std.getStdName())
					&& this.stdScore == std.getStdScore();
		}
		return false;
	}
	
	
	
	
	// getter
	public String getStdName() {
		return stdName;
	}
	public int getStdScore() {
		return stdScore;
	}
	
	
}

public class MapExe {
	public static void main(String[] args) {
		// 학생이름(중복되지 않는다는 가정) , 반 >> 키값은 중복불가
		Map<StudentMap, String> map ;
		map = new HashMap<StudentMap , String>();
		map.put(new StudentMap("kildong",70), "햇님반");
		map.put(new StudentMap("minsuuu",50), "달님반");
		map.put(new StudentMap("siuuuuu",60), "별님반");
		map.put(new StudentMap("kokouuu",100), "햇님반");
		
		// 반복문 >> 데이터 한건한건 가져오려면 Set컬랙션으로 변환해서 (키 값이 객체일경우) 
		String keyword = "kildong";
		int score = 70;
		
		System.out.println(new StudentMap(keyword , score) == new StudentMap(keyword , score)); 
		// 생성자에 의해 만들어지는 인스턴스들의 해쉬값(논리적 주소값)은 서로 다르다
		
		if(map.containsKey(new StudentMap(keyword , score))) {
			System.out.println("반 : "+map.get(new StudentMap(keyword , score)));
			// 비교되는 인스턴스와 출력될때 만들어지는 인스턴스는 논리적으로 중복됨으로 중복을 제외하고 값을 반환
			// ArrayList<> list >> ==> .get(i).getClassNum()
			// Map key == new StudentMap(...) 
			// Map value == "..."~
		}
		
		//Set<StudentMap> set = map.keySet();
		//Iterator<StudentMap> iter = set.iterator();
//		while(iter.hasNext()) {
//			// 반복할 다음값을 가지고 있는지
//			
//			StudentMap std = iter.next();
//			// 존재하는 값을 무작위로 담아서 저장
//			
//			if(std.getStdName().equals(keyword)) {
//				// 가져온 무작위 객체중에 같은 이름이 있다면 점수를 출력
//				System.out.println("점수 : "+std.getStdScore());
//				String cls = map.get(std);
//				System.out.printf("학생: %s , 반 : %s , 점수 : %d ",std.getStdName(), cls, std.getStdScore());
//				
//			}
//		}// end of while
		
	}// end of main
	public static void exe2() {	
		// Map<String , String> 선언
		Map<String , String> map;
		map = new HashMap<String, String>();
		map.put("user01", "1111");
		map.put("user02", "1122");
		map.put("user03", "1333");
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("아이디를 입력 >>");
			String id = scn.nextLine();
			System.out.print("비밀번호를 입력 >>");
			String pwd = scn.nextLine();
			
			if (map.containsKey(id)) {
				// ex >> String.equals()

				// 아이디의 존재를 확인했으니 pwd를 검토
				if (map.get(id).equals(pwd)) {
					// map.get(i)와 같은 id를 검토하여 컬렉션안에 있던 값과 입력한 값을 비교
					System.out.println("정상적으로 로그인 되었습니다");
					break;

				} 
				System.out.println("비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}

		}// End of while
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(map); 
		System.out.println(json); 
		
	}
	
	public static void exe(){
		// Map collection
		// {Key : Value} => Entry
		// ex>  Map<String , Integer>
		Map<String , Integer> map = new HashMap<String , Integer>();
		
		// 1. 객체 추가 -> 중복된값은 저장불가 -> 덮어쓰기
		map.put("kildong-Hong", 80);
		map.put("Minsu", 70);
		map.put("kildong-Hong", 86);
		map.put("parkChul", 75);
		map.put("Lee", 15);
		
		
		
		// 5. 자바 객체(map) -> JSON 문자열 출력
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(map); // toString()과 비슷하게 변환 
		System.out.println(json); // json문자열로 출력하면 키와 값이 json타입으로 출력
		
		
//		map.remove("kildong-Hong");
//		map.remove("Lee");
		
		
		
		// 2. 조회 (key -> value)
		Integer score = map.get("Minsu");
		score = map.get("kildong-Hong");
		System.out.println(score);
		
		
		
		// 3. 반복
		map.keySet();
		Set<String>keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next(); //반복할 요소 획득
			Integer value= map.get(key);
			System.out.printf("키 값 : %s / 값 : %d\n" , key, value);
		}
		
		
		// 4. {key : value} return => Map.Entry 타입
		Set<Entry<String, Integer>> entryset = map.entrySet();
		// Set컬렉션을 생성 하는데 key value가 String Integer인 Entry컬랙션으로 생성
		
		Iterator<Entry<String, Integer>> iter2 = entryset.iterator(); // Set컬랙션이기때문에 반복자를 사용
		while(iter2.hasNext()) {
			Entry<String , Integer> entry = iter2.next();
			System.out.printf("키 값 : %s / 값 : %d\n" , entry.getKey(), entry.getValue());
			
		}
		
		
		
		
	}
	
}
