package day16Test;

import java.util.Scanner;

public class �̴�������Ʈ_�ι�° {
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
		System.out.println("������ �Է��ϼ���");
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
			System.out.println("���� ��ϵǾ����ϴ�");
		}
		if (b == 2) {
			System.out.println("�� ID�� �ϳ��� �۸� �ۼ� �� �� �ֽ��ϴ�");
		}
		menu();
	}

	public static void badword() {
		for (;;) {
			System.out.println("�Է� �ϼ��� >>>");
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
				System.out.println("����� ���ԵǾ� �ֽ��ϴ�");
			} else {
				System.out.println("�Խñ��� ��ϵǾ����ϴ�");
			}
		}
	}

	public static void info() {
		int a = 0;
		for (int i = 0; i < id.length; i++) {
			if (now[i] != null && id[i] != null) {
				if (now[i].equals(id[i])) {
					a++;
					System.out.println("���� �̿��� : " + id[a] + " �Խñ� : " + boardMsg[a]);
				}
			}
		}
		menu();
	}

	public static void mod() {
		info();
		System.out.println("���̵� �Է��ϼ���");
		String ID = in.nextLine();
		System.out.println("������ ������ �Է��ϼ���");
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
		System.out.println("ȸ������ ���� �����Ͻðڽ��ϱ� ?");
		System.out.println(" yes / no");
		String confirm = in.nextLine();
		if (confirm.equals("yes")) {
			System.out.println("���� �����Ǿ����ϴ�.");
			a = 1;
		}
	}

	public static void start() {
		System.out.println("1.ȸ������");
		System.out.println("2.�α���");
		System.out.println("3.ȸ�����");
		String number = in.nextLine();
		if (number.equals("1")) {
			regi();
		} else if (number.contentEquals("2")) {
			login();
		} else if (number.contentEquals("3")) {
			list();
		} else {
			System.out.println("�Է��� ��Ȯ���� �ʽ��ϴ�");
			start();
		}
	}

	public static void regi() {
		int a = 0;
		System.out.println("����Ͻ� ���̵� �Է��ϼ���");
		String ID = in.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
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
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
		}
		start();
	}

	public static void login() {
		int a = 0;
		int b = 0;
		System.out.println("���̵� �Է��ϼ���");
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
			System.out.println("��й�ȣ�� �Է��ϼ���");
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
				System.out.println("�α��ο� �����Ͽ����ϴ�");
				menu();
			} else if (b == 2) {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�");
				start();
			}

		} else if (a == 2) {
			System.out.println("�ش��ϴ� ID�� �����ϴ�");
			login();
		}

	}

	public static void list() {
		for (int i = 0; i < id.length; i++) {
			if (id[i] != null) {
				System.out.println("��ϵ� ȸ�� : " + id[i]);
			}
		}
		start();
	}

	public static void menu() {
		System.out.println("---- �޴� ----");
		System.out.println(" 1. �۾���         ");
		System.out.println(" 2. �۸��         ");
		System.out.println(" 3. ����            ");
		System.out.println(" 4. ����            ");
		System.out.println(" 5. �ʱ�ȭ��      ");
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
			System.out.println("�Է��� ��Ȯ���� �ʽ��ϴ�");
			menu();
		}
	}

	public static void main(String[] args) {
		for (;;) {
			start();
		}

	}

}
