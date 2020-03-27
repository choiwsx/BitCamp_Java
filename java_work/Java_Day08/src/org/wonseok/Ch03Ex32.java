package org.wonseok;

public class Ch03Ex32 {
	static int c2 = 10;
	static int d2 = 20;
	
	
	static int sum(int a, int b)
	{
		return a+b;
	}
	static void swap(int a, int b)
	{
		int temp = 0;
		temp = a;
		b= a;
		a = temp;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c =sum(a,b);
		swap(a,b);
		swap(c2,d2);
		System.out.println(a+" "+b);
		System.out.println(c);
		System.out.println(a+" "+b);
		System.out.println(c2+" "+d2);
	}
}
