package day16Test;

import java.util.Scanner;

public class 미니프로젝트_두번째 {
	public static Scanner in = new Scanner(System.in);
	public static String id[] = new String[5];
	public static int pw[] = new int[5];
	public static String badWord[] = { "18,", "dog" };
	public static int boardNum[] = new int[5];
	public static String boardMsg[] = new String[5];
	public static String now[] = new String[id.length];

	public static void write() {
		int a = 0;
		int b = 0;
		System.out.println("내용을 입력하세요");
		String post = in.nextLine();
		for (int i = 0; i < boardMsg.length; i++) {
			if (now[i] != null && id[i] != null) {
				if (boardMsg[i] == null && now[i].equals(id[i])) {
					a++;
					System.out.println(a);
					if (boardMsg[a] == null) {
						boardMsg[a] = post;
						b = 1;
					} else if (boardMsg[a] != null) {
						b = 2;

					}
				}
			}
		}
		if (b == 1) {
			System.out.println("글이 등록되었습니다");
		}
		if (b == 2) {
			System.out.println("한 ID당 하나의 글만 작성 할 수 있습니다");
		}
		menu();
	}

	public static void badword() {
		for (;;) {
			System.out.println("입력 하세요 >>>");
			String post = in.nextLine();
			boolean ck = false;
			for (int i = 0; i < badWord.length; i++) { // 1
				String chk = badWord[i];
				if (post.indexOf(chk) != -1) {
					ck = true;
					break;
				}

				// if(isBad) break;
			}
			if (ck) {
				System.out.println("금지어가 포함되어 있습니다");
			} else {
				System.out.println("게시글이 등록되었습니다");
			}
		}
	}

	public static void info() {
		int a = 0;
		for (int i = 0; i < id.length; i++) {
			if (now[i] != null && id[i] != null) {
				if (now[i].equals(id[i])) {
					a++;
					System.out.println("현재 이용자 : " + id[a] + " 게시글 : " + boardMsg[a]);
				}
			}
		}
		menu();
	}

	public static void mod() {
		info();
		System.out.println("아이디를 입력하세요");
		String ID = in.nextLine();
		System.out.println("수정할 내용을 입력하세요");
		String post = in.nextLine();
		for (int i = 0; i < id.length; i++) {
			if (ID.equals(id[i])) {
				boardMsg[i] = post;
			}
		}
	}

	public static void del() {
		info();
		int a = 0;
		System.out.println("회원님의 글을 삭제하시겠습니까 ?");
		System.out.println(" yes / no");
		String confirm = in.nextLine();
		if (confirm.equals("yes")) {
			System.out.println("글이 삭제되었습니다.");
			a = 1;
		}
	}

	public static void start() {
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.회원목록");
		String number = in.nextLine();
		if (number.equals("1")) {
			regi();
		} else if (number.contentEquals("2")) {
			login();
		} else if (number.contentEquals("3")) {
			list();
		} else {
			System.out.println("입력이 정확하지 않습니다");
			start();
		}
	}

	public static void regi() {
		int a = 0;
		System.out.println("등록하실 아이디를 입력하세요");
		String ID = in.nextLine();
		System.out.println("비밀번호를 입력하세요");
		int PW = in.nextInt();
		in.nextLine();
		for (int i = 0; i < id.length; i++) {
			if (id[i] == null) {
				id[i] = ID;
				pw[i] = PW;
				a = 1;
				break;
			}
		}
		if (a == 1) {
			System.out.println("회원가입이 완료되었습니다");
		}
		start();
	}

	public static void login() {
		int a = 0;
		int b = 0;
		System.out.println("아이디를 입력하세요");
		String ID = in.nextLine();
		for (int i = 0; i < id.length; i++) {
			if (ID.equals(id[i])) {
				a = 1;
				break;
			} else if (!ID.equals(id[i])) {
				a = 2;
			}
		}
		if (a == 1) {
			System.out.println("비밀번호를 입력하세요");
			int PW = in.nextInt();
			in.nextLine();
			for (int i = 0; i < pw.length; i++) {
				if (PW == (pw[i])) {
					now[i] = id[i];
					b = 1;
					break;
				} else if (PW != (pw[i])) {
					b = 2;
				}
			}
			if (b == 1) {
				System.out.println("로그인에 성공하였습니다");
				menu();
			} else if (b == 2) {
				System.out.println("비밀번호가 맞지 않습니다");
				start();
			}

		} else if (a == 2) {
			System.out.println("해당하는 ID가 없습니다");
			login();
		}

	}

	public static void list() {
		for (int i = 0; i < id.length; i++) {
			if (id[i] != null) {
				System.out.println("등록된 회원 : " + id[i]);
			}
		}
		start();
	}

	public static void menu() {
		System.out.println("---- 메뉴 ----");
		System.out.println(" 1. 글쓰기         ");
		System.out.println(" 2. 글목록         ");
		System.out.println(" 3. 수정            ");
		System.out.println(" 4. 삭제            ");
		System.out.println(" 5. 초기화면      ");
		System.out.println("------------");
		String number = in.nextLine();
		if (number.equals("1")) {
			write();
		} else if (number.equals("2")) {
			info();
		} else if (number.equals("3")) {
			mod();
		} else if (number.equals("4")) {
			del();
		} else if (number.equals("5")) {
			start();
		} else {
			System.out.println("입력이 정확하지 않습니다");
			menu();
		}
	}

	public static void main(String[] args) {
		for (;;) {
			start();
		}

	}

}
