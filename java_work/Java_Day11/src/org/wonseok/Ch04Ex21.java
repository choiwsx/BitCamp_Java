package org.wonseok;

class Super{
	String name;
	int x = 15;
	public Super() {
		// TODO Auto-generated constructor stub
		System.out.println("수퍼의 생성자.");
	}
	public Super(String name)
	{
		this.name = name;
		System.out.println("슈퍼클래스의 인자 있는 생성자."+name);
	}
	public void showData()
	{
		System.out.println("부모클래스의 쇼 데이터 호출");
		System.out.println("name = "+this.name);
	}
}

class Sub extends Super
{
	int y = 10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super("최원석");
		System.out.println("서브 클래스 생성자.");
	}
	
	public void showData()
	{
		super.showData();
//		System.out.println("name = "+super.name);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}



public class Ch04Ex21 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.showData();
		
		Super s = new Sub();

		Sub sd = (Sub)s;
		sd.setY(20);
		System.out.println(sd.y);
	}
}
