package day16Test;

import java.util.Scanner;

public class Test {
	public static int a = 0 ;
	public static int b = 0 ;
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	String s = input();
	//더하기를 할 것인가 빼기를 할 것인가?
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
		System.out.println("----- 계산기 -----");
		System.out.println("첫번째 수를 입력하세요 ?");
		a=in.nextInt();
		in.nextLine();
		System.out.println("두번째 수를 입력하세요?");
		b = in.nextInt();
		in.nextLine();
		System.out.println("더하기 : + / 빼기 : - ");
		String sign = in.nextLine(); //클래스 영역에서 사용불가능, input메서드만 가능
		return sign;
	}
}
