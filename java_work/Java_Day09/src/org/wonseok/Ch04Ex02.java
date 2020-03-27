package org.wonseok;

class Point1
{
//private은 객체 내부에서만 접근 가능하다.
	private int x;
	private int y;
//public은 객체 외부(다른 클래스, 다른 패키지)에서 접근 가능.
	//캡슐화를 위해서 멤버 필드는 private으로 선언하고
	//그리고 멤버 메소드는 public으로 선언한다.
	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	
	//this는 객체 자신을 가리키는 참조 변수이다.
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
