package org.wonseok;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0 ;
		System.out.println("������ �Է��ϼ���.(�������� -1�� �Է��ϼ���)");
		
		
		
		
		int n = scan.nextInt();
		
		while(n!=-1)
		{
			count++;
			sum += n;
			n = scan.nextInt();
		}
		if(count ==0)
			System.out.println("�Էµ� ������ �����ϴ�.");
		else
		{
			System.out.printf("������ ������ %d���̸�, ����� %.2f�Դϴ�.",count,(float)sum/count);
		}
		
		
		
	}
	public static void test(String[] args) {
		test:
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j==2)
					break test;
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}