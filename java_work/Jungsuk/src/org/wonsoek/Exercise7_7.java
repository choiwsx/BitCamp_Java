package org.wonsoek;

class Parent
{
	int x = 100;
	private int y = 10;
	private int z = 20;
	Parent()
	{
		this(200);
	}
	
	Parent(int x)
	{
		this.x = x;
	}
	
	int getX()
	{
		return x;
	}
	public void getyz()
	{
		System.out.println(this.y +" "+this.z);
	}
}

class Child extends Parent
{
	int x = 3000;
	
	Child() {
		// TODO Auto-generated constructor stub
		this(1000);
	}
	Child(int x)
	{
		this.x = x;
	}
	
	
}



public class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();

		c.getyz();
	}
}
