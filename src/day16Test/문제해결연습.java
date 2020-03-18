package day16Test;

import java.util.Random;

public class 문제해결연습 {

	public static Random r = new Random();
	public static int[] myPoint = new int[3];
	public static int[] myBonus = new int[3];


	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			System.out.println(i + " 게임 시작");
			int point = r.nextInt(10) + 1;
			System.out.println(point);
			myPoint[i-1]=point;
			bonusPoint(point,i-1);
				
			
			// 보너스 점수 메소드 작성
			// 조건1 : point가 전게임에 나온 점수이면 두배의 점수를 획득(첫 게임은 해당없음)
			// 조건2 : point가 짝수이면 현재 point 점수의 반을 보너스로 획득
			// 조건3 : point가 3의 배수이면 무조건 -3점
		}
		// 총합을 구하는 메소드 작성
		sum();
	}
	private static void sum() {
		int totalsum=0;
		for(int i = 0 ; i < myPoint.length; i++) {
			System.out.println(myPoint[i]+"/"+myBonus[i]);
			totalsum = totalsum + myPoint[i]+myBonus[i];
		}
		System.out.println(totalsum);
	}
	private static void bonusPoint(int point, int k) {
		int bPoint = 0;
		for(int i = 0 ; i < k; i++) {
			if(myPoint[i]==point) {
				bPoint=1;
			}
		}
		if(bPoint==1) {
			myBonus[k]=point*2;
		}else if(point%2==0) {
			myBonus[k]=point/2;
		}else if(point%3==0) {
			myBonus[k]=-3;
		}
	}
	
	
}