package org.wonseok;

import java.util.Scanner;
import static java.lang.System.out;
public class CH02EX21 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		
	}
	public static void test1(String[] args) {
		//���� 3���� �Է� �޴´�.
		//���� 3���߿��� ���� ū ��, ���� �������� �Ǻ��ؼ� ����ϱ�.
		// ��, ���������� ������� �ʱ�.
		
		int a,b,c;
		int max, min1, mid;
		
		System.out.println("�Է�1>");
		a = scan.nextInt();
		System.out.println("�Է�2>");
		b = scan.nextInt();
		System.out.println("�Է�3>");
		c = scan.nextInt();
	
		//�ָ�����2
		if(a>b)
		{
			if(a>c)
			{
				max = a;
					if(c>b)
						mid = b;
					else
						mid = c;
			}
			else//(a<c)
			{
				max = c;
				mid = a;
			}
			
		}
		else//a<b
		{
			if(b>c)
			{
				max = b;
				if(c>a)
					mid = c;
				else
					mid = a;
			}
			else//b<c
			{
				max = c;
				mid = b;
			}
		}
		if(a<b)
		{
			if(a<c)
			{
				min1 = a;
				if(b>c)
					mid = c;
				else
					mid = b;
			}
			else//a>c
			{
				min1 = c;
				mid = a;
			}
		}
		else//b<a
		{
			if(b<c)
			{
				min1 = b;
				if(a<c)
					mid = a;
				else
					mid = c;
			}
			else//b>c
			{
				min1 = c;
				mid = b;
			}
		}
		
		System.out.printf("Min : %d, Max : %d, Mid : %d",min1, max, mid);
		
		
		
		
	}
}