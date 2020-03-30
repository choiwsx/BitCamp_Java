package org.wonseok;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch03exam3 {

	static Scanner scan = new Scanner(System.in);
	
	static void test16()
	{
		String str[] = {"����","����","��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String user;
		while(true)
		{
			System.out.print("���� ���� ��!>>");
			user = scan.nextLine();
			int n = (int)(Math.random()*3);
			if(user.equals("�׸�"))
				break;
			switch(user)
			{
			case "����":
				if(str[n].equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.\n");
				else if(str[n].equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.\n");
				else
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �����ϴ�.\n");
				break;	
			case "����":
				if(str[n].equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �����ϴ�.\n");
				else if(str[n].equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.\n");
				else
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.\n");
				break;	
			case "��":
				if(str[n].equals("����"))
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.\n");
				else if(str[n].equals("����"))
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �����ϴ�.\n");
				else
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.\n");
				break;	
				
			}
			
			
			
		}
		System.out.println("������ �����մϴ�.");
	}
	
	
	
	static void test15()
	{
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		try{
			int n = scan.nextInt();
			int m = scan.nextInt();
			System.out.printf("%dx%d=%d",n,m,n*m);
		}
		catch(InputMismatchException e)
		{
			System.out.println("�Ǽ��� �ȵ˴ϴ�.");
			scan = new Scanner(System.in);
			main(null);
		}		
	}
	
	
	static void test14()
	{
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		String name;
		while(true){
			System.out.print("�����̸�>>"); 
			name = scan.nextLine();
			boolean flag = false;
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<course.length; i++)
			{
				if(course[i].equals(name))
				{
					flag = true;
					int temp = score[i] ;
					System.out.printf("%s�� ������ %d \n", course[i],temp);
				}
			}
			if(!flag)
				System.out.println("���� �����Դϴ�.");
		}
		
	}
	
	
	static void test13()
	{
		for(int i=1; i<100; i++)
		{
			int cnt = 0;
			if(i>10){
				cnt = (i/10)%3==0? cnt+1 : 0;
			}
			if((i%10)==3||(i%10)==6||(i%10)==9)
				cnt++;
			if(cnt==1)
				System.out.printf("%d �ڼ� ¦\n",i);
			else if(cnt==2)
				System.out.printf("%d �ڼ� ¦¦\n",i);
		}
		
	}
	
	
	static void test12(String args[])
	{
		int sum =0;
		for(int i=0; i<args.length; i++)
		{
			try
			{
				int temp = Integer.parseInt(args[i]);
				sum += temp;
			}catch(NumberFormatException e)
			{
				
			}
		}
		System.out.println(sum);
		
		
	}
	
	static void test11(String args[])
	{
		int sum =0;
		for(int i=0; i<args.length; i++)
		{
			int temp = Integer.parseInt(args[i]);
			sum += temp;
		}
		System.out.println(sum/args.length);
	}
	
	
	static void test10()
	{
		int[][] arr = new int[4][4];
		int count=0;
		while(count<10)
		{
			int temp = (int)(Math.random()*4);
			int temp2 = (int)(Math.random()*4);
			
			if(arr[temp][temp2]==0)
			{
				arr[temp][temp2] = (int)(Math.random()*10+1);
				count++;
			}
			
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	static void test9()
	{
		int[][] arr = new int[4][4];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	static void test8()
	{
		int num = 0;
		int intArr[] = new int [100];
		System.out.print("���� �?");
		num = scan.nextInt();
		for(int i=0; i<num; i++)
		{
			int temp = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++)
			{
				if(temp==intArr[j])
				{
					i--;
					break;
				}
			}
			intArr[i] = temp;
		}
		for(int i=0; i<num; i++)
		{
			if(i%10==0)
				System.out.println();
			System.out.print(intArr[i]+" ");
		}
		
	}
	
	static void test7()
	{
		int[] intArr = new int[10];
		for(int i=0; i<10; i++)
		{
			int temp = (int)(Math.random()*10+1);
			intArr[i] = temp;
		}
		System.out.print("������ ������ :");
		double sum =0;
		for(int i : intArr)
		{
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.printf("����� %.1f", sum/10 );
		
	}
	
	
	static void test6()
	{
		int money = 0;
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		money = scan.nextInt();
		for(int i=0; i<unit.length; i++)
		{
			if(money/unit[i]>0)
				System.out.printf("%d�� ¥�� : %d��\n",unit[i], money/unit[i]);
			money %= unit[i];
		}
		
		
		
	}
	
	
	static void test5()
	{
		int intArr[] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0; i<10; i++)
		{
			intArr[i] = scan.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int j=0; j<10; j++)
		{
			if(intArr[j]%3==0)
				System.out.print(intArr[j]+" ");
		}
		
	}
	
	
	
	static void test4()
	{
		char num;
		System.out.print("�ҹ��� ���ĺ��� �Է��Ͻÿ�>>");
		num = scan.next().charAt(0);
		int i = (int)num-96;
//		System.out.println((int)num-97);
		for(int j=0; j<i; j++)
		{
			for(int k=0; k<i-j; k++)
			{
				System.out.printf("%c ",k+97);
			}
			System.out.println();
		}
	}
	
	
	static void test3()
	{
		int num = 0;
		System.out.print("������ �Է��Ͻÿ�>>");
		num = scan.nextInt();
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void test2()
	{
		int[][] n = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i=0; i<n.length; i++)
		{
			for(int temp : n[i])
				System.out.print(temp+" ");
			System.out.println();
		}
		
	}
	
	static void test1(){
		int sum = 0, i = 0;
		int sum2 = 0, i2 = 0;
		for(i=0; i<100; i+=2)
		{
			sum += i;
		}
		do{
			sum2 += i2;
			i2 += 2;
		}while(i2<100);
		
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	public static void main(String[] args) {
		test15();
	}
}