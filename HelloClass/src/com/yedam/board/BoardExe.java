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
		boards[2] = new Board(12, "이칠이","TEST","TEST LINEs");
		boards[3] = new Board(13, "박봉수","Ocean","산은 산이요.. 바다는 바다다");
		boards[4] = new Board(14, "최도엽","재밌는 자바","자바가 재밌는 이유");
		boards[5] = new Board(15, "김지수","인덱스 5","1111");
		boards[6] = new Board(16, "오정태","인덱스 6","2222");
		boards[7] = new Board(17, "박문수","인덱스 7","3333");
		boards[8] = new Board(18, "이재명","인덱스 8","4444");
		boards[9] = new Board(19, "안철수","오늘은 기분이 좋아","5555");
		boards[10] = new Board(20, "BAEK","더미가 너무 많아","1234");
		boards[11] = new Board(21, "BAE","더미 2","1234");
		boards[12] = new Board(22, "BEE","더미 3","1234");
		boards[13] = new Board(23, "LA","더미 4","1234");
		
		}
		
		boolean loginChk() {
			int cnt = 1;
			for(int i=0;i<3;i++) {
				
				String uid = welcomeMsg("아이디를 입력>");
				String pwd = welcomeMsg("비밀번호를 입력>");
				if(!UserExe.login(uid, pwd)) {
					
					System.out.printf("[%d]회 실패했습니다 정보를 다시 확인하세요.\n",cnt);
					if(i == 3) {
						//System.out.println("로그인 3회 실패.");
						return false;
					}
					cnt++;
					continue;
				}
				// 로그인 정보가 정확할시 리턴(if> !loginChk() ==> return 처리)
				return true;
			}// end of for
			// 3번의 기회를 넘어서면 false 리턴(if> !loginChk() ==> return 처리)
			return false;
			
		}
	
	
	//메소드.
	void execute() {
		boolean run = true;
		if(!loginChk()) {
			return;
		}
		
		while(run) {
				int menu  = 0;
				System.out.println("-----------------------------------------------");
				System.out.println("1. 글작성 | 2. 글수정 | 3. 글삭제 | 4. 글조회 | 5. 종료");
				System.out.println("-----------------------------------------------");
				try {
				    menu = navIntMsg("메뉴를 선택해주세요.");
				}
				catch(NumberFormatException e){
					System.out.println("1 ~ 5 중에 선택해주세요.");
					continue;
				}
				switch(menu) {
				case 1:{
					addBoard();break;
				}
				
				case 2: {
					modifyBoard();break;
				}
				
				case 3: {
					removeBoard();break;
				}
				
				case 4: {
					boardList();break;
				}
				
				case 5: {
					String deadCon = navMsg("프로그램을 종료합니다. 종료하시려면 엔터를 입력해주세요");
					if (deadCon=="") {
						System.out.println("프로그램을 종료합니다.\n이용해 주셔서 감사합니다.");
						run = false;
						break;
						
					}
					
				}

				}// END OF SWITCH
			
		}// END OF WHILE
		
	}// END OF execute
	
	void addBoard() {
		try {
			
			int newBno = nextSeq();
			String writer = navMsg("작성자의 이름을 입력");
			String title = navMsg("작성글의 제목을 입력");
			String contents = navMsg("작성글의 내용을 입력");
			
			Board newBoard = new Board(newBno, writer, title, contents);
			boards[bno++] = newBoard;
			Thread.sleep(3000); // 3초 지연
			System.out.println("글 작성 완료 👍");
			System.out.println("글 작성을 종료합니다 !");
		}catch(Exception e){
			System.err.format("addBoard -> Exception: %s%n", e);
		}// END OF CATCH
	}// END OF addBoard

	void boardList() {
		// Page 정렬
		int page = 1;
		
		// while 사용하여서 사용자가 q를 누를때까지 목록변환
		while(true) {
			int start = (page - 1) * 5;
			int end = (page) * 5;

			System.out.println("글번호\t  제목\t\t작성자");
			System.out.println("=====================================");
			for (int i = start; i < end; i++) {
				if (boards[i] != null) {
					boards[i].showInfo();
				}
			}
			System.out.println("-----------------------------------------");
			System.out.println(" 상세보기 : 글번호입력, 뒤로(p), 앞으로(n), 메뉴로 이동(q)");
			System.out.println("-----------------------------------------");
			String dtNo = navMsg("입력해주세요.");
			if (dtNo.toLowerCase().equals("q")) {
				break;
			} else if (dtNo.toLowerCase().equals("n")) {
				page++;
			}else if (dtNo.toLowerCase().equals("p")) {
				page--;
			}
			else {
				int changeNo = Integer.parseInt(dtNo);
				Board searchBoard = getBoard(changeNo);
				if (searchBoard == null) {
					System.out.println("조회된 결과값이 없습니다.");
					return;
				}
				searchBoard.showDetail();
			}
		} // END OF WHILE
		System.out.print("\n");
		
		
	}// END OF boradList
	
	void modifyBoard() {
		try {
			
			int bNo = navIntMsg("수정할 글번호 입력!");
			Board result = getBoard(bNo);
			if(result == null) 
				{
					System.out.println("조회한 글번호가 존재하지 않습니다.");
					return;
				}
			
			String title = navMsg("수정할 제목 입력");
			String contents = navMsg("수정할 내용 입력");
			
			result.setTitle(title);
			result.setContents(contents);
			Thread.sleep(3000);
			System.out.println("수정이 완료 되었습니다.");
		}catch(Exception e) {System.out.printf("modifyBoard -> Exception Error : %s",e);}
		
				
	}// END OF modifyBoard
	
	void removeBoard() {
		try {
			
			int bNo = navIntMsg("삭제하실 글번호를 입력해주세요.");
			
			if(!(bNo == 0)) {
				for(int i=0;i<boards.length;i++) {
					if(boards[i] != null && boards[i].getbNo()==bNo) {
						String choice = navMsg("정말로 삭제하시겠습니까? (y / n) / 엔터를 눌러도 삭제됩니다.");
						if(choice.toLowerCase().equals("n")) {
							return;
						}else if(choice == "" || choice.toLowerCase().equals("y")) {
							
							boards[i] =null;
							Thread.sleep(2000);
							System.out.println("삭제가 완료 되었습니다.");
							break;
							}
						}
					else {
						System.out.println("삭제하실 글번호가 존재하지 않습니다.\n다시 확인해 주십시오.");
						return;
					}
				}// END OF FOR
			}// END OF inputing bNo CHECK IF
		}catch(Exception e) {System.out.printf("removeBoard -> Exception Error : %s",e);}
	}// END OF removeBoard
	
	// 단건조회
	// 글번호를 확용해서 배열에서 조회하고 board 반환
	Board getBoard(int bNo) {
		for(int i=0;i<boards.length;i++) {
			if(boards[i] != null && boards[i].getbNo() == bNo) {
				return boards[i];
			}
		}
		return null; // 조건을 충족하는 값이 없음으로 null 반환
		
	}// END OF GETBOARD
	
	// 사용자의 입력값을 반환
	String navMsg(String msg) {
		System.out.print(msg + " >> ");
		return scn.nextLine();
	}
	
	// 수정시 안내메세지 + 선택할 글번호 반환
	int navIntMsg(String msg) {
		System.out.print(msg + " >> ");
		return Integer.parseInt(scn.nextLine());
	}
	
	
	int nextSeq() {
		int max = 0;
		for(int i = 0; i < boards.length; i++) {
			if(boards[i]!=null && max < boards[i].getbNo()) {
				max = boards[i].getbNo();
			}
		}
		return max + 1;
	}
	
	
	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				}
				if (boards[i].getbNo() < boards[i + 1].getbNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	} // end of sort.
	
	static String welcomeMsg(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		return scn.nextLine();
	}
	
	
	
}// END OF CLASS
