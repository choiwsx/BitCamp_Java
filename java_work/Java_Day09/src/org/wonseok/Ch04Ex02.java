package org.wonseok;

class Point1
{
//private�� ��ü ���ο����� ���� �����ϴ�.
	private int x;
	private int y;
//public�� ��ü �ܺ�(�ٸ� Ŭ����, �ٸ� ��Ű��)���� ���� ����.
	//ĸ��ȭ�� ���ؼ� ��� �ʵ�� private���� �����ϰ�
	//�׸��� ��� �޼ҵ�� public���� �����Ѵ�.
	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	
	//this�� ��ü �ڽ��� ����Ű�� ���� �����̴�.
	public void setX(int a)
	{
		this.x = a;
	}
	public void setY(int a)
	{
		this.y = a;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
}


public class Ch04Ex02 {
	public static void main(String[] args) {
		Point1 pt = new Point1();
		pt.setX(100);
		pt.setY(190);
		System.out.println(pt);
		System.out.println(pt.getX()+" "+pt.getY());
		
	}
}
