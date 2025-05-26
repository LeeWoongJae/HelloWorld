package com.yedam.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExe {
	public static void main(String[] args) {
		// Stack 컬랙션
		Stack<String> books = new Stack<String>();
		// Last in First out
		books.push("이것이 자바다.");
		books.push("자바 스크립트 기초.");
		books.push("HTML/CSS");
		
		
		while(!books.isEmpty()) {
			
			System.out.println(books.pop());
		}
		
		// Queue interface
		Queue<String> orders = new LinkedList<String>();
		orders.offer("카페라떼");
		orders.offer("헤이즐넛");
		orders.offer("클드브류");
		
		while(!orders.isEmpty()) {
			System.out.println(orders.poll());
		}
		
		
		
	}// end of main
}

