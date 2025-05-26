package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// 객체 입출력 스트림.
// 기본타입 <=> 참조타입
// 객체는 직렬화를 통해서 기본 타입으로 변환
// Serializable (직렬화) 인터페이스, 직렬화인터페이스를 받은 구현 클래스가 되어지면 직렬화가 된다

// 기본 -> 객체
// Deserializable

// ★★★★★ 직렬화/역직렬화를 하려면  implements Serializable 필수 ★★★★★ 
class Product implements Serializable {
	String prodCode;
	public Product(String prodCode) {this.prodCode = prodCode;}
}
public class StreamExe4 {
	public static void main(String[] args) {
//		serial();
		try {
			// 기본 입력 스트림
			InputStream is = new FileInputStream("c:/temp/object.db");

			ObjectInputStream ois = new ObjectInputStream(is);
			
			List<Product> list = (List<Product>) ois.readObject(); // List캐스팅후 객체화 과정
			for(Product prod : list) {
				System.out.println("상품코드 : "+prod.prodCode);
			}
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of PROG");
	}
	
	static void serial() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("p001"));
		list.add(new Product("p002"));
		
		try {
			// 기본스트림
			OutputStream os = new FileOutputStream("c:/temp/object.db");
			// 객체 보조 스트림
			ObjectOutputStream oos = new ObjectOutputStream(os);

			// 객체를 스트림에 작성
			oos.writeObject(list); // 객체를 기본으로 변환
			
			oos.close();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
