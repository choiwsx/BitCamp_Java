package org.study.ch03;

import java.util.Scanner;

public class Ch03Ex03 {
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
	
	

	public static void test9(String[] args) {
		System.out.printf("월을 입력하세요 : ");
		month = scan.nextInt();
		System.out.printf("일을 입력하세요 : ");
		day = scan.nextInt();
		total +=	days[month-1] - day;
		
		for(int i=month; i<12; i++)
		{
			total += days[i];
		}
		
		
		System.out.printf("총 남은 날짜는 %d일 입니다.",total);
		
	}
	
	
	
	public static void test(String[] args) {
		
		for(int i=0; i<days.length; i++)
		{
			total += days[i];
		}
		System.out.printf("1년은 총 %d일 입니다.\n", total);
		
		for(int d : days)
		{
			total2 += d;
		}
		System.out.printf("1년은 총 %d일 입니다.", total2);
		
		
		
	}
}
