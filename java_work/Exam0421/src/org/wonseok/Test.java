package org.wonseok;

class A{
	int x;
	public A() {
		this.x=10;
		// TODO Auto-generated constructor stub
	}
	protected void setx(){
		this.x = 100;
	}
}
class B extends A{
	
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setx()
	{
		this.x = 99;
	}
}


public class Test {

	public static void main(String[] args) {
		A a =  new B();
		a.setx();
		System.out.println(a.x);
	}
}
