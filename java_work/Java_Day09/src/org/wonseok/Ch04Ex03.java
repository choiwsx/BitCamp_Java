package org.wonseok;



public class Ch04Ex03 {
	
	
	public void print(int  a)
	{
		System.out.println("프린트1 호출");
		System.out.println(a);
	}
	public void print(int  a,int b)
	{
		System.out.println("프린트2 호출");
		System.out.println(a);
		System.out.println(b);
	}
	public void print(int  a,int b, int c)
	{
		System.out.println("프린트3 호출");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
	
		Ch04Ex03 obj = new Ch04Ex03();
		obj.print(100);
		obj.print(1,2);
		obj.print(-1,-2,-3);
	}
}
