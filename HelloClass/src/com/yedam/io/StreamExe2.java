package com.yedam.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class StreamExe2 {
	public static void main(String[] args) {
		Scanner scn = null;
		try {
			scn = new Scanner(new File("c:/temp/writer.txt"));
			// 읽어들일 파일을 인스턴스로 만들어온다
			while(true) {
				String data = scn.nextLine();
				String[] strAry = data.split(" "); // 공란(구분자)을 기준으로 요소를 자른다
				System.out.println(strAry[0]+", "+strAry[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			scn.close(); // 작업이 끝나면 리소스 반환
		}
		System.out.println("End of PROG");
	}// END OF MAIN
	
	public static void read() {
		// char 입력스트림
		try {
			Reader reader = new FileReader("c:/temp/writer.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			System.out.println();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("End of Program");
	}
		public static void write() {
			
			try {
				Writer wr = new FileWriter("c:/temp/writer.txt");
				wr.write('A');
				wr.write('S');
				wr.write('D');
				wr.write('F');
				wr.write('테');
				wr.write('스');
				wr.write('트');
				wr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("End of Program");
	}
} // end of StreamExe2

