package org.wonseok;



public class Ch04Ex03 {
	
	
	public void print(int  a)
	{
		System.out.println("����Ʈ1 ȣ��");
		System.out.println(a);
	}
	public void print(int  a,int b)
	{
		System.out.println("����Ʈ2 ȣ��");
		System.out.println(a);
		System.out.println(b);
	}
	public void print(int  a,int b, int c)
	{
		System.out.println("����Ʈ3 ȣ��");
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