package org.wonseok;

import java.util.Scanner;

public class Ch03exam2 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test12()
	{
		double a,b;
		String s;
		System.out.print("����>>");
		a = scan.nextDouble();
		s = scan.next();
		b = scan.nextDouble();
		if(s.equals("+"))
			System.out.println(a+b);
		else if(s.equals("-"))
			System.out.println(a-b);
		else if(s.equals("*"))
			System.out.println(a*b);
		else if(s.equals("/"))
		{
			if(b==0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else
			{
				System.out.println(a/b);
			}
		}
		
		switch(s)
		{
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			if(b==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(a/b);
		}
		
		
		
		
	}
		
		
	
	
	
	public static void test11()
	{
		int month = 0;
		System.out.print("���� �Է��ϼ���(1~12)>>");
		month = scan.nextInt();
		if(month>=3&&month<=5)
			System.out.println("��");
		else if(month>=6&&month<=8)
			System.out.println("����");
		else if(month>=9&&month<=11)
			System.out.println("����");
		else if(month==1||month==2||month==12)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		
		switch(month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
			default:
				System.out.println("�߸��Է�");
		}
		
		
	}
	
	
	public static void test10()
	{
		double x1,y1,r1,x2,y2,r2;
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�(x1,y1,r1 �� 3��)>>");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		r1 = scan.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�(x2,y2,r2 �� 3��)>>");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		r2 = scan.nextDouble();
		
		double distance = Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
//		System.out.println(distance);
		if(distance<=r1+r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� �Ȱ�ģ��.");
		
	}
	
	
	public static void test9()
	{
		double x,y;
		double x1,y1;
		double r;
		System.out.print("���� �߽�(x,y)�� ������ �Է�(�� 3���� ���� �Է�)>>");
		x = scan.nextDouble();
		y = scan.nextDouble();
		r = scan.nextDouble();
		System.out.print("Ȯ���ؾ��� ��(x1,y1)>>");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		double distance = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1, 2));
		if(distance<=r)
			System.out.printf("�� (%.1f,%.1f)�� �� �ȿ� �ִ�.",x1,y1);
		else
			System.out.printf("�� (%.1f,%.1f)�� �� �ȿ� ����.",x1,y1);
	
	}
	public static void test8()
	{
		int x1,y1,x2,y2;
		System.out.print("�� �� (x1,y1), (x2,y2)�� �Է��ϼ���(���� �� 4��)>>");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		if(x1>=100&&x1<=200&&y1>=100&&y1<=200)
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else if(x2>=100&&x2<=200&&y1>=100&&y2<=200)
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else if(x1<=100&&x2>=200&&y1<=100&&y2>=200)
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else
			System.out.println("�簢���� �Ȱ�Ĩ�ϴ�.");
		
	}
	
	
	public static void test7()
	{
		int x,y;
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x = scan.nextInt();
		y = scan.nextInt();
		if(x>100&&x<200&&y>100&&y<200)
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.\n",x,y);
		else
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.\n",x,y);
		
	}	
	
	public static void test6()
	{
		int number =0;
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		number = scan.nextInt();
		int cnt = (number/10)%3==0? 1:0;
		if((number%10)==3||(number%10)==6||(number%10)==9)
			cnt++;
		if(cnt==2)
			System.out.println("�ڼ�¦¦");
		else if(cnt==1)
			System.out.println("�ڼ�¦");
		else
			System.out.println(number);
	}
	
	
	public static void test5()
	{
		int a,b,c;
		System.out.print("���� 3�� �Է�>>");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a+b<c||a+c<b||b+c<a)
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else
			System.out.println("�ﰢ���� �˴ϴ�");
	}
	
	
	public static void test4()
	{
		int a,b,c;
		int mid = 0;
		System.out.print("���� 3�� �Է�>>");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a>b&&a>c)
		{
			if(b>c)
				mid = b;
			else
				mid = c;
		}
		if(b>a&&b>c)
		{
			if(a>c)
				mid = a;
			else
				mid = c;
		}
		if(c>a&&c>b)
		{
			if(b>a)
				mid = b;
			else
				mid = a;
		}
		System.out.println("�߰� ���� "+mid);
		
	}
	
	
	
	public static void test3()
	{
		int[] arr = {50000,10000,1000,100,50,10,1};
		int money = 0;

		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		money = scan.nextInt();
		String[] name = {"��������","������","õ����","���","���ʿ�","�ʿ�","�Ͽ�"};
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%s %d��\n",name[i],money/arr[i]); 
			money %= arr[i];
		}
	}
	
	
	public static void test2()
	{
		int num = 0;
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		num = scan.nextInt();
		if(num/10==num%10)
		{
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
	}
	
	
	public static void test1(){
		int won = 0;
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		won = scan.nextInt();
		float dollar = 1100.0f;
		
		System.out.printf("%d���� $%.1f�Դϴ�.\n",won, won/dollar);
		
	}
	
	
	public static void main(String[] args) {
		test12();
		
	}
}