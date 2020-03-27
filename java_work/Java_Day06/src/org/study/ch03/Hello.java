package org.study.ch03;

import java.util.Scanner;

public class Hello {
	public static Scanner sc = new Scanner(System.in);
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;

	public static void main(String[] args) {
		// 월일을 입력받아서 1년의 남은 날자를 계산하는 프로그램만들기
		// for-each쓰지말기
		// 월일의 100일후 출력하기

		System.out.println("월을 입력하세요");
		month = sc.nextInt();
		System.out.println("날을 입력하세요");
		day = sc.nextInt();
		System.out.println("기준일로부터 며칠 후 날짜를 찾아볼까요?");
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
		System.out.print(mon + "월 ");
		System.out.println(year + days[mon - 1] + "일");

	}
	 
	 public static void test() {
	  // TODO Auto-generated method stub

	  
	  //total에 day요소값 누적. 1년은 365일입니다. 
	  
	//  for (int i = 0; i< 12; i++) {
	//   month = i+1;
	//   day = days[i];
	//   System.out.print(month+"월은 "+day+"일, ");
	//  }
	//  System.out.println();
	  
	  for(int k : days) {
	   int i = 1;
	   month = i;
	   day = k;
	   total += k;
	   //System.out.print(month+"월은 "+day+"일, ");
	   i++;
	  }
	  //System.out.println();
	  //System.out.println("1년은 "+days.length+"달, 총 "+total+"일 입니다.");
	  
	  
	  
	 }

	}
