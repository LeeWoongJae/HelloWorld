package com.yedam.ref;

import java.util.Scanner;

public class AryExe {
	public static void main(String[] args) {
//		strAry();
//		deleteAry();
		fMngApp();

	}// END OF MAIN

	// 문자열배열
	public static void strAry() {
		Scanner scn = new Scanner(System.in);
		String[] stringAry = new String[10];

		while (true) {

			System.out.print("이름을 입력하세요. (종료시 quit)>>\n");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}

			for (int i = 0; i < stringAry.length; i++) {
				if (stringAry[i] == null) {
					stringAry[i] = name;
					System.out.println("입력이 완료되었습니다.");
					break;
				} // END OF IF

			} // END OF FOR

		} // END OF WHILE
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null)
				System.out.printf("%d번째의 이름은 %s\n", i, stringAry[i]);
		}
		System.out.println("END OF PROG");

	}// END OF strAry

	public static void deleteAry() {
		Scanner scn = new Scanner(System.in);
		String[] stringAry = new String[10];

		stringAry[0] = "박춘봉";
		stringAry[1] = "최민식";
		stringAry[2] = "김기수";
		stringAry[3] = "김기린";

		System.out.print("삭제할 이름을 입력. >>\n");
		String name = scn.nextLine();
		for (int i = 0; i < stringAry.length; i++) {
			if ((stringAry[i] != null) && (stringAry[i].equals(name))) {
				stringAry[i] = null;
			}
		} // END OF FOR (equal chk)

		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null)
				System.out.printf("%d번째의 이름은 %s\n", i, stringAry[i]);
		} // END OF FOR (output)

		System.out.println("END OF PROG");

	}// END OF DELETEARY

	public static void fMngApp() { // 친구목록 전체적 관리 프로그램 구현
		Scanner scn = new Scanner(System.in);
		String[] fAry = new String[10];

		boolean run = true;
		while (run) {
			System.out.println("1.친구추가  2.목록  3.삭제  4.종료");
			System.out.println("기능을 선택해주세요! >>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: {
				System.out.println("추가할 이름을 입력해주세요 >> ");
				String name = scn.nextLine();
				// 배열에 추가
				for (int i = 0; i < fAry.length; i++) {
					if (fAry[i] == null) {
						fAry[i] = name;
						break;
					}
					if (fAry[i].equals(name)) {
						System.out.print("동일한 이름이 존재합니다.\n 추가하시겠습니까? 1 / 2 >>");
						int choice = Integer.parseInt(scn.nextLine());
						if (choice == 1) {
							if (fAry[i] == null) {
								fAry[i] = name;
								i++;
							}

						} else {
							System.out.println("취소되었습니다.");
							continue;
						}

					} // END OF INNER IF

				} // END OF FOR

			} // END OF CASE 1
				break;
			case 2: {
				System.out.println(fAry.length);
				for (int i = 0; i < fAry.length; i++) {
					if (fAry[i] != null) {
						System.out.printf("[%d]번째 이름 : %s\n", i, fAry[i]);
					}
					System.out.println(i);
				} // END OF FOR list output

			} // END OF CASE 2
				break;
			case 3: {
				System.out.println("삭제할 이름을 입력해주세요. >>");
				String name = scn.nextLine();
				for (int i = 0; i < fAry.length; i++) {
					if (fAry[i] != null) {
						if (fAry[i].equals(name)) {
							fAry[i] = null;
							System.out.printf("[%d]번째 [%s]님을 삭제 완료되었습니다!", i, fAry[i]);

						} else {
							System.out.println("찾을 사람이 목록에 존재하지 않습니다.\n확인해주십시오");
							break;
						}

					} // END OF IF
				} // END OF FOR delete name
			} // END OF CASE 3
				break;
			case 4: {
				System.out.println("프로그램을 종료합니다");
				run = false;
			} // END OF CASE 4

			}// END OF SWITCH

		} // END OF WHILE

		System.out.println("END OF FriendManageApp");

	}// END OF fMngApp

}// END OF CLASS
