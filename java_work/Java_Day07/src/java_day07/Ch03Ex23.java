package java_day07;

import java.util.Scanner;

public class Ch03Ex23 {
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int total = 0;
	static Scanner scan = new Scanner(System.in);
	static int month = 0;
	static int day = 0;
	
	static void println(String msg)
	{
		System.out.println(msg);
	}
	
	static void print(String msg)
	{
		System.out.print(msg);
	}
	
	public static void main(String[] args) {
		print("월을 입력해주세요>>");
		month = scan.nextInt();
		print("일을 입력해주세요>>");
		day = scan.nextInt();
		//100일 될때까지 누적
		
		total = days[month-1]-day;
		int i = 0;
		for(i=month; total<100; i++)
		{
			i = i%12;
			total += days[i];
		}
		int nm = i;
		int nd = days[i-1]-(total-100);
		System.out.printf("%d %d",nm,nd);
		
		
	}
	
	
	public static void test05(String[] args) {
		print("월을 입력해주세요>>");
		month = scan.nextInt();
		print("일을 입력해주세요>>");
		day = scan.nextInt();
		
		total = 100 - (days[month-1] - day);
		int i = month%12;
		while(days[i]<total)
		{
			total -= days[i++];
			i = i %12;
		}
		
		int nextDay = total;
		int nextMonth = i+1;
		
		System.out.printf("100일 후는 %d월 %d일 입니다.",nextMonth, nextDay);
		
		
		
	}
	
	
	public static void test04(String[] args) {
		print("월을 입력해주세요>>");
		month = scan.nextInt();
		print("일을 입력해주세요>>");
		day = scan.nextInt();

		//1년은 total일 남았습니다.
		total = days[month-1]-day;
		for(int i=month; i<12; i++)
		{
			total+=days[i];
		}
		System.out.printf("1년은 총 %d일 남았습니다.",total);
	}
	
	
	
	public static void test03(String[] args) {
		print("월을 입력해주세요>>");
		month = scan.nextInt();
		print("일을 입력해주세요>>");
		day = scan.nextInt();
		
		for(int i=0; i<month-1; i++)
		{
			total += days[i];
		}
		total += day;                       
		
		System.out.println(total);
		
	}
	
	
	
	public static void test02(String[] args) {
		print("월을 입력해주세요>>");
		month = scan.nextInt();
		println(month+"월은 "+Integer.toString(days[month-1])+"일까지 있습니다.");
		
		
		
	}
}
