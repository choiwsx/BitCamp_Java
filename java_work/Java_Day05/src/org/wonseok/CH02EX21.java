package org.wonseok;

import java.util.Scanner;
import static java.lang.System.out;
public class CH02EX21 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		
	}
	public static void test1(String[] args) {
		//정수 3개를 입력 받는다.
		//정수 3개중에서 제일 큰 수, 제일 작은수를 판별해서 출력하기.
		// 단, 논리연산자 사용하지 않기.
		
		int a,b,c;
		int max, min1, mid;
		
		System.out.println("입력1>");
		a = scan.nextInt();
		System.out.println("입력2>");
		b = scan.nextInt();
		System.out.println("입력3>");
		c = scan.nextInt();
	
		//주말과제2
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
