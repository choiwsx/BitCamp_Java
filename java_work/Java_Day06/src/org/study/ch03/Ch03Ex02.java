package org.study.ch03;

import java.util.Scanner;



public class Ch03Ex02 {
	public static Scanner scan = new Scanner(System.in);

	 static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
	 static int month = 0;
	 static int day = 0;
	 static int total = 0;
	 static int total2 = 0;
	 
	 //��-���Է¹ް� 100�� �� ��¥�� ����ϼ���.
	 public static void main(String[] args) {
	  System.out.printf("���� �Է��ϼ��� : ");
	  month = scan.nextInt();
	  System.out.printf("���� �Է��ϼ��� : ");
	  day = scan.nextInt();
	  int count = 100;
	  count = count - (days[month-1] - day+1);
	  System.out.println(count);
	  int tempm = 0;
	  int firstm = month;
	  for(int i = 0; i<4; i++)
	  {
	   if(month+i>11)
	   {
	    month = 0;
	    i = 0;
	   }
	   count -= days[month+i];
	   if(count < 0){
	    tempm = month+i;
	    break;
	   }
	  }
	  count += days[tempm];
	  System.out.printf(">>>%d�� %d���� 100�� �Ĵ� %d�� %d�� �Դϴ�.",firstm,day,tempm+1,count+1);

	 }
	
	public static void test3(String[] args) {
		int[] num ={1,2,3,4,5};
		int sum = 0;
		for(int k:num)
			sum += k;
		System.out.println("���� "+sum);
	
		String[] names={"���","����","��"};
		for(String s : names)
			System.out.print(s+" ");
		enum Weekt{��,ȭ,��,��,��,��,��}
		for(Weekt day:Weekt.values())
			System.out.print(day + "����");
		
		
	}
	
	
	public static void test2(String[] args) {
		
		
		int intArr[] = new int[5];
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++)
		{
			intArr[i] = scan.nextInt();
			if(intArr[i]>max)
				max = intArr[i];
		}
		System.out.printf("���� ū ���� %d�Դϴ�.\n",max);
		scan.close();
		
	}
	
	public static void test1(String[] args) {
		// �ּҸ� �����ϴ� �迭�� ����.
		String[] addressArr = new String[3];
		//�ּ� 3���� �����ϰ� ����Ѵ�.
		//�ּ� ���ڿ��� ���̸� �Բ� ����Ѵ�.
		for(int i=0; i<addressArr.length; i++)
		{
			System.out.print("�ּҸ� �Է��ϼ���>>");
			addressArr[i] = scan.nextLine();
		}
		for(int i=0; i<addressArr.length; i++)
		{
			System.out.printf("�ּ�:%s, �ּ� ���ڿ� ����:%d\n",addressArr[i],addressArr[i].length());
		}

	}
}
