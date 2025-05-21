package com.yedam.board;

public class Board {
	private int bNo; // 글번호
	private String writer; // 글작성자
	private String title; // 글제목
	private String contents; // 글내용
	
	
	
	public Board() {}
	public Board(int bNo, String writer, String title, String contents) {
		this.bNo = bNo;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		
	}
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	// 글번호 , 제목 , 작성자
	public void showInfo() {
		System.out.printf("%3d %12s\t%s\n",bNo, title, writer);
	}
	// 글 조회시 상세하게 보기
	public void showDetail() {
		String strFormat = "글번호: %d 작성자: %3s\n";
				strFormat+="제목: %3s\n내용: %3s\n";
		System.out.printf(strFormat,bNo,writer,title,contents);
	}
	
	
}
