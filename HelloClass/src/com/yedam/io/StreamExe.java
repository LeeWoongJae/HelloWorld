package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamExe {
	public static void main(String[] args) {
		
		// original3.PNG (1.4MB) -> copy3.PNG
		try {
			InputStream is = new FileInputStream("c:/temp/original3.PNG");
			OutputStream os = new FileOutputStream("c:/temp/copy3.PNG");
			
			// 보조 스트림 연결 (버퍼 처리시간을 조금더 빠르게 처리할수 있다)
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			// 읽기
			while(true) {
				
				int data = bis.read();
				if(data == -1) { // 읽어들일 값이 없다면 중단
					break;
				}
				bos.write(data);
			}
			bos.close();
			bis.close();
			os.close();
			is.close();
			System.out.println("End of PROG");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}// end of main
	
	public static void copy() {
		// 입력 -> 출력.
		try {
			InputStream is = new FileInputStream("c:/temp/original3.png");

			// 출력(copy.png)
			OutputStream os = new FileOutputStream("c:/temp/copy3.png");

			// 한번에 읽기 쓰기 -> byte[] 크기만큼 처리
			 byte[] buf = new byte[10];
			 
			 long start = System.currentTimeMillis();
			while (true) {
				// https://hudi.blog/java-inputstream-outputstream/
				// 참고 자료 링크
				int data = is.read(buf); // buf 크기 단위로 읽어들이기 => 결과가 byte[] 안에 결과값이 들어간다
				if (data == -1) {// 처리한 결과가 있는가만 판단하는 data
					break;
				}
				os.write(buf); // 배열의 10크기만큼씩 읽어들이기

			} // end of while
			os.close();
			is.close();
			long end = System.currentTimeMillis();
			System.out.println("총 running time : "+(end - start));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End of Prog.");

	}

	// 화면에 읽어드리기
	public static void read() {
		// 입력(파일) => 바이트기반
		try {
			InputStream is = new FileInputStream("c:/temp/os1.db");

			// read() => 1byte 씩 읽기 => 읽을 값이 없으면 -1 반환

			while (true) {

				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);

			}
			is.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void write() {
		// 출력 스트림 (파일) => 바이트기반
		try {
			OutputStream os = new FileOutputStream("c:/temp/os1.db");
			byte b1 = 10;
			byte b2 = 20;
			byte b3 = 30;

			os.write(b1);
			os.write(b2);
			os.write(b3);
			os.close(); // 자원낭비를 최소화
		} catch (IOException e) { // file not found < IOException

			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}