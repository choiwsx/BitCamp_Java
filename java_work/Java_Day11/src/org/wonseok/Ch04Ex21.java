package org.wonseok;

class Super{
	String name;
	int x = 15;
	public Super() {
		// TODO Auto-generated constructor stub
		System.out.println("������ ������.");
	}
	public Super(String name)
	{
		this.name = name;
		System.out.println("����Ŭ������ ���� �ִ� ������."+name);
	}
	public void showData()
	{
		System.out.println("�θ�Ŭ������ �� ������ ȣ��");
		System.out.println("name = "+this.name);
	}
}

class Sub extends Super
{
	int y = 10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super("�ֿ���");
		System.out.println("���� Ŭ���� ������.");
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
