package org.wonseok;

import java.util.Scanner;

abstract class Converter {

	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();

	}

}

// ----3번 문제-------
class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}

// ----4번 문제------
class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// -----5번 문제-----
class ColorPoint extends Point {

	String color;

	public ColorPoint(int x, int y, String color) {

		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);

	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의  (" + getX() + "," + getY() + ")의 점";
	}
}

// ------6번 문제------
class ColorPoint6 extends Point {

	String color;

	public ColorPoint6() {
		super(0, 0);
		this.color = "BLACK";
	}

	public ColorPoint6(int x, int y) {
		super(x, y);
	}

	public ColorPoint6(int x, int y, String color) {

		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);

	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의  (" + getX() + "," + getY() + ")의 점";
	}
}

// -----7번 문제------
class Point3D extends Point {
	public int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}

	public void moveUp() {
		this.z++;
	}

	public void moveDown() {
		this.z--;
	}

	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}

}

// ----8번 문제------
class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 || y < 0)
			super.move(0, 0);
	}

	protected void move(int x, int y) {
		if (x < 0 || y < 0) {
			super.move(getX(), getY());
		} else {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}

}

interface Stack {
	int length();// 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱에 실수 저장

	boolean push(String val); // 스택의 톱에 저장된 실수 리턴
}

class StringStack implements Stack {
	int size;
	int top = 0;
	String[] stack;
	
	public StringStack()
	{
		
	}
	@Override
	public int length() {
		top++;
		return top;
	}

	@Override
	public int capacity() {
		return size-top;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		
		String s = stack[top];
		top--;
		return s;
	}

	@Override
	public boolean push(String val) {
		if(size<=top)
		{
			return false;
		}
		stack[top] = val;
		this.length();
		return true;
	}

}

public class Homework {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run();
		
//		Km2Mile toMile = new Km2Mile(1.6);
//		toMile.run();
		
//		
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("Red");
//		String str = cp.toString();
//		System.out.println((str + "입니다."));
//		
//		ColorPoint6 zeroPoint = new ColorPoint6();
//		System.out.println(zeroPoint.toString()+"입니다. ");
//		
//		ColorPoint6 cp = new ColorPoint6(10, 10);
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"입니다.");
		
//		Point3D p = new Point3D(1,2,3);
//		System.out.println(p.toString() + "입니다. ");
//		
//		p.moveUp();
//		System.out.println(p.toString() + "입니다. ");
//		
//		p.moveDown();
//		p.move(10,10);
//		System.out.println(p.toString() + "입니다. ");
//		
//		p.move(100, 200,300);
//		System.out.println(p.toString() + "입니다. ");
//		
//		PositivePoint p = new PositivePoint();
//		p.move(10, 10);
//		System.out.println(p.toString() + "입니다. ");
//		
//		p.move(-5, 5);
//		System.out.println(p.toString() + "입니다. ");
//		
//		PositivePoint p2 = new PositivePoint(-10,-10);
//		System.out.println(p2.toString() + "입니다. ");
		StringStack stack = new StringStack();
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		stack.size = scan.nextInt();
		while(stack.size>stack.top)
		{
			System.out.print("문자열 입력>>");
			String temp = scan.next();
			if(temp.equals("그만"))
			{
				break;
			}
			if(!stack.push(temp))
			{
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
			
		}
		
	}
}
