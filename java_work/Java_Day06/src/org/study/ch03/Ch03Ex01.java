package org.study.ch03;

public class Ch03Ex01 {
	
	public static void main(String[] args) {
		int[] scoreArr = null;
		int total = 0;//���� ����
		double avg = 0;//���
		scoreArr = new int[]{85,90,75,100,95};
		
		for(int i=0; i<scoreArr.length; i++)
		{
			total += scoreArr[i];
		}
		avg = total/scoreArr.length;
		System.out.printf("total=%d, avg=%.2f",total,avg);
		
		
	}
	
	public static void test2(String[] args) {
		//int[] a = {1,2,3,4,100};
		
		
		// new ������ �̿��ϸ� ����.
		// ���� �� �� �ֱ� - �Լ��� ���ڷ� �迭 ���ͷ� ���.
		int[] a;
		a = new int[]{1,2,3,40,100};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		//main �Լ��� �Ű������� �迭�̴�.
		main(new String[]{"kim","����","���α׷���"});
			
	}
	public static void test1(String[] args) {
		int[] a;
		a = new int[5];
		
		a[0] = 50;
		a[1] = 150;
		a[2] = 250;
		a[3] = 350;
		a[4] = 450;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}