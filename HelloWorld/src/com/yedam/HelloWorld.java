package com.yedam;

public class HelloWorld {
	public static void main(String[] args){
		// main method
		int sum = 0;
		System.out.println("Hellow, World");
		for(int i = 0; i<10; i++) {
			int count = i;
			sum += count;
		}
		System.out.println("I 값의 합은 : "+sum);
		
	}
}
