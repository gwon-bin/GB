package day16Test;

import java.util.Random;

public class �����ذῬ�� {

	public static Random r = new Random();
	public static int[] myPoint = new int[3];
	public static int[] myBonus = new int[3];


	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			System.out.println(i + " ���� ����");
			int point = r.nextInt(10) + 1;
			System.out.println(point);
			myPoint[i-1]=point;
			bonusPoint(point,i-1);
				
			
			// ���ʽ� ���� �޼ҵ� �ۼ�
			// ����1 : point�� �����ӿ� ���� �����̸� �ι��� ������ ȹ��(ù ������ �ش����)
			// ����2 : point�� ¦���̸� ���� point ������ ���� ���ʽ��� ȹ��
			// ����3 : point�� 3�� ����̸� ������ -3��
		}
		// ������ ���ϴ� �޼ҵ� �ۼ�
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