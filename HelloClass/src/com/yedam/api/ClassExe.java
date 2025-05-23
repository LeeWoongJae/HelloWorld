package com.yedam.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExe {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.yedam.api.Member");
			
			Member member = new Member();
			cls = member.getClass();
			
			
			System.out.println(cls.getName());
			
			Field[] clsAry = cls.getDeclaredFields();
			System.out.println("FIELD NAMES");
			for(Field filed : clsAry) {
				System.out.println(filed.getName()); // field 명
			}
			System.out.println("-------------------------------------");
			System.out.println("METHOD NAMES");
			Method[] methodAry = cls.getDeclaredMethods();
			for(Method method : methodAry) {
				System.out.println(method.getName()); // method 명
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
