package org.study.ch03;

import java.util.Scanner;

public class Hello {
	public static Scanner sc = new Scanner(System.in);
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� 1���� ���� ���ڸ� ����ϴ� ���α׷������
		// for-each��������
		// ������ 100���� ����ϱ�

		System.out.println("���� �Է��ϼ���");
		month = sc.nextInt();
		System.out.println("���� �Է��ϼ���");
		day = sc.nextInt();
		System.out.println("�����Ϸκ��� ��ĥ �� ��¥�� ã�ƺ����?");
		int dday = sc.nextInt();
		
		
		int mon = 0;
		int year = 0;

		for (int i = 0; i < month - 1; i++) {
			year += days[i];
		}
		year += day;
		year += dday;

		if (year > 365) {
			year -= 365;
		}
		for (int i = 0; year > 0; i++) {
			year -= days[i];
			mon++;
		}
		System.out.print(mon + "�� ");
		System.out.println(year + days[mon - 1] + "��");

	}
	 
	 public static void test() {
	  // TODO Auto-generated method stub

	  
	  //total�� day��Ұ� ����. 1���� 365���Դϴ�. 
	  
	//  for (int i = 0; i< 12; i++) {
	//   month = i+1;
	//   day = days[i];
	//   System.out.print(month+"���� "+day+"��, ");
	//  }
	//  System.out.println();
	  
	  for(int k : days) {
	   int i = 1;
	   month = i;
	   day = k;
	   total += k;
	   //System.out.print(month+"���� "+day+"��, ");
	   i++;
	  }
	  //System.out.println();
	  //System.out.println("1���� "+days.length+"��, �� "+total+"�� �Դϴ�.");
	  
	  
	  
	 }

	}
