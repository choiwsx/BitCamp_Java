package org.wonseok;

import java.util.Scanner;

public class Ch03exam2 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test12()
	{
		double a,b;
		String s;
		System.out.print("연산>>");
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
				System.out.println("0으로 나눌 수 없습니다.");
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
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(a/b);
		}
		
		
		
		
	}
		
		
	
	
	
	public static void test11()
	{
		int month = 0;
		System.out.print("달을 입력하세요(1~12)>>");
		month = scan.nextInt();
		if(month>=3&&month<=5)
			System.out.println("봄");
		else if(month>=6&&month<=8)
			System.out.println("여름");
		else if(month>=9&&month<=11)
			System.out.println("가을");
		else if(month==1||month==2||month==12)
			System.out.println("겨울");
		else
			System.out.println("잘못입력");
		
		switch(month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
			default:
				System.out.println("잘못입력");
		}
		
		
	}
	
	
	public static void test10()
	{
		double x1,y1,r1,x2,y2,r2;
		System.out.print("첫번째 원의 중심과 반지름 입력(x1,y1,r1 총 3개)>>");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		r1 = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력(x2,y2,r2 총 3개)>>");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		r2 = scan.nextDouble();
		
		double distance = Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
//		System.out.println(distance);
		if(distance<=r1+r2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안겹친다.");
		
	}
	
	
	public static void test9()
	{
		double x,y;
		double x1,y1;
		double r;
		System.out.print("원의 중심(x,y)과 반지름 입력(총 3개의 숫자 입력)>>");
		x = scan.nextDouble();
		y = scan.nextDouble();
		r = scan.nextDouble();
		System.out.print("확인해야할 점(x1,y1)>>");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		double distance = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1, 2));
		if(distance<=r)
			System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x1,y1);
		else
			System.out.printf("점 (%.1f,%.1f)는 원 안에 없다.",x1,y1);
	
	}
	public static void test8()
	{
		int x1,y1,x2,y2;
		System.out.print("두 점 (x1,y1), (x2,y2)를 입력하세요(숫자 총 4개)>>");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		if(x1>=100&&x1<=200&&y1>=100&&y1<=200)
			System.out.println("사각형이 겹칩니다.");
		else if(x2>=100&&x2<=200&&y1>=100&&y2<=200)
			System.out.println("사각형이 겹칩니다.");
		else if(x1<=100&&x2>=200&&y1<=100&&y2>=200)
			System.out.println("사각형이 겹칩니다.");
		else
			System.out.println("사각형이 안겹칩니다.");
		
	}
	
	
	public static void test7()
	{
		int x,y;
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		x = scan.nextInt();
		y = scan.nextInt();
		if(x>100&&x<200&&y>100&&y<200)
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.\n",x,y);
		else
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.\n",x,y);
		
	}	
	
	public static void test6()
	{
		int number =0;
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		number = scan.nextInt();
		int cnt = (number/10)%3==0? 1:0;
		if((number%10)==3||(number%10)==6||(number%10)==9)
			cnt++;
		if(cnt==2)
			System.out.println("박수짝짝");
		else if(cnt==1)
			System.out.println("박수짝");
		else
			System.out.println(number);
	}
	
	
	public static void test5()
	{
		int a,b,c;
		System.out.print("정수 3개 입력>>");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a+b<c||a+c<b||b+c<a)
			System.out.println("삼각형이 안됩니다.");
		else
			System.out.println("삼각형이 됩니다");
	}
	
	
	public static void test4()
	{
		int a,b,c;
		int mid = 0;
		System.out.print("정수 3개 입력>>");
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
		System.out.println("중간 값은 "+mid);
		
	}
	
	
	
	public static void test3()
	{
		int[] arr = {50000,10000,1000,100,50,10,1};
		int money = 0;

		System.out.print("금액을 입력하시오>>");
		money = scan.nextInt();
		String[] name = {"오만원권","만원권","천원권","백원","오십원","십원","일원"};
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%s %d매\n",name[i],money/arr[i]); 
			money %= arr[i];
		}
	}
	
	
	public static void test2()
	{
		int num = 0;
		System.out.print("2자리수 정수 입력(10~99)>>");
		num = scan.nextInt();
		if(num/10==num%10)
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
	}
	
	
	public static void test1(){
		int won = 0;
		System.out.print("원화를 입력하세요(단위 원)>>");
		won = scan.nextInt();
		float dollar = 1100.0f;
		
		System.out.printf("%d원은 $%.1f입니다.\n",won, won/dollar);
		
	}
	
	
	public static void main(String[] args) {
		test12();
		
	}
}
