package com.yedam.board;

import java.util.Scanner;

public class BoardExe {
	// 필드 11
	private Board[] boards;
	// 메서드들에게 전부 접근하기위해서 배열 미리 선언
	Scanner scn = new Scanner(System.in);
	private int bno;
	// 생성자
	public BoardExe() {
		boards = new Board[100];
			
		boards[0] = new Board(10, "김주엽","오늘도..나는..","오늘도 나는 멍하니 걷고있다...");
		boards[1] =	new Board(11, "JONE","Finally..","Fine last Clover!");		
		}
		
		
	
	
	//메소드.
	void execute() {
		boolean run = true;
		
		while(run) {
			
				System.out.println("-----------------------------------------------");
				System.out.println("1. 글작성 | 2. 글수정 | 3. 글삭제 | 4. 글조회 | 5. 종료");
				System.out.println("-----------------------------------------------");
				System.out.println("메뉴를 선택해주세요.");
				int menu = Integer.parseInt(scn.nextLine());
				
				switch(menu) {
				case 1:{
					
					addBoard();break;
				} 
				case 2: {
					
					
					break;
				}
					
				case 3: {
					
					break;
				}
					
				case 4: {
					boardList();
					break;
				}
					
				case 5: {
					System.out.println("프로그램을 종료합니다.\n이용해 주셔서 감사합니다.");
					break;
				}
					
				
				
				
				}// END OF SWITCH
				
				
				
			
		}// END OF WHILE
		
	}// END OF execute
	
	void addBoard() {
			System.out.println("글 작성을 시작합니다 !");
			System.out.println("작성글의 번호를 입력 > ");
			int newBno = Integer.parseInt(scn.nextLine());
			System.out.println("작성자의 이름을 입력 > ");
			String writer = scn.nextLine();
			System.out.println("작성글의 제목을 입력 > ");
			String title = scn.nextLine();
			System.out.println("작성글의 내용을 입력 > ");
			String contents = scn.nextLine();
			
			Board newBoard = new Board(newBno, writer, title, contents);
			System.out.printf("%d %s %s %s",newBoard.getbNo(),newBoard.getWriter(),newBoard.getTitle(),newBoard.getContents());
			boards[bno++] = newBoard;
			System.out.println("글 작성 완료 👍");
			System.out.println("글 작성을 종료합니다 !");
	}// END OF addBoard
	
	void boardList() {
		System.out.println("글번호\t  제목\t\t작성자");
		System.out.println("=====================================");
		for(int i=0;i<boards.length;i++) {
			if(boards[i] != null) {
				
				boards[i].showInfo();
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("    상세보기 : 글번호입력, 메뉴로 이동(q)");
		System.out.println("-------------------------------------");
		String dtNo = scn.nextLine();
		if(dtNo.equals("q")) {
			return;
		}else {
			int changeNo = Integer.parseInt(dtNo);
			for(int i=0;i<boards.length;i++) {
				if(boards[i] != null && boards[i].getbNo() == changeNo) {
					boards[i].showDetail();
				}
			}
		}
		
		System.out.println();
		
		
	}
	
	
	
	
}// END OF CLASS
