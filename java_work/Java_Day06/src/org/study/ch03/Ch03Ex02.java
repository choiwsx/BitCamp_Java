package org.study.ch03;

import java.util.Scanner;



public class Ch03Ex02 {
	public static Scanner scan = new Scanner(System.in);

	 static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
	 static int month = 0;
	 static int day = 0;
	 static int total = 0;
	 static int total2 = 0;
	 
	 //월-일입력받고 100일 후 날짜를 출력하세요.
	 public static void main(String[] args) {
	  System.out.printf("월을 입력하세요 : ");
	  month = scan.nextInt();
	  System.out.printf("일을 입력하세요 : ");
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
	  System.out.printf(">>>%d월 %d일의 100일 후는 %d월 %d일 입니다.",firstm,day,tempm+1,count+1);

	 }
	
	public static void test3(String[] args) {
		int[] num ={1,2,3,4,5};
		int sum = 0;
		for(int k:num)
			sum += k;
		System.out.println("합은 "+sum);
	
		String[] names={"사과","딸기","별"};
		for(String s : names)
			System.out.print(s+" ");
		enum Weekt{월,화,수,목,금,토,일}
		for(Weekt day:Weekt.values())
			System.out.print(day + "요일");
		
		
	}
	
	
	public static void test2(String[] args) {
		
		
		int intArr[] = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++)
		{
			intArr[i] = scan.nextInt();
			if(intArr[i]>max)
				max = intArr[i];
		}
		System.out.printf("가장 큰 수는 %d입니다.\n",max);
		scan.close();
		
	}
	
	public static void test1(String[] args) {
		// 주소를 저장하는 배열을 선언.
		String[] addressArr = new String[3];
		//주소 3개를 저장하고 출력한다.
		//주소 문자열의 길이를 함께 출력한다.
		for(int i=0; i<addressArr.length; i++)
		{
			System.out.print("주소를 입력하세요>>");
			addressArr[i] = scan.nextLine();
		}
		for(int i=0; i<addressArr.length; i++)
		{
			System.out.printf("주소:%s, 주소 문자열 길이:%d\n",addressArr[i],addressArr[i].length());
		}

	}
}
