package day16Test;

import java.util.Scanner;

public class Test {
	public static int a = 0 ;
	public static int b = 0 ;
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	String s = input();
	//���ϱ⸦ �� ���ΰ� ���⸦ �� ���ΰ�?
	if(s.equals("+")) {
		add(a,b);
	}else if(s.equals("-")) {
		minus(a,b);
		}
	}
	private static void minus(int a2, int b2) {
		System.out.println(a2-b2);
	}
	private static void add(int a2, int b2) {
		System.out.println(a2+b2);
	}
	private static String input() {
		System.out.println("----- ���� -----");
		a=in.nextInt();
		in.nextLine();
		System.out.println("�ι�° ���� �Է��ϼ���?");
		b = in.nextInt();
		in.nextLine();
		System.out.println("���ϱ� : + / ���� : - ");
		String sign = in.nextLine(); //Ŭ���� �������� ���Ұ���, input�޼��常 ����
		return sign;
	}
}
