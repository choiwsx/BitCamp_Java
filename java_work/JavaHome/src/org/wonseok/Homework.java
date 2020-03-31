package org.wonseok;

import java.util.Scanner;

abstract class Converter
{
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
		scanner.close();	
		
		
	}
	
	
}

//----3�� ����-------
class Won2Dollar extends Converter
{
	public Won2Dollar(double ratio)
	{
		this.ratio = ratio;
	}


	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	
}

//----4�� ����------
class Km2Mile extends Converter
{

	public Km2Mile(double ratio)
	{
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
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

class Point
{
	private int x,y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y ) { this.x = x; this.y = y;}
}

//-----5�� ����-----
class ColorPoint extends Point
{

	String color;
	public ColorPoint(int x, int y, String color) {
		
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y)
	{
		move(x,y);
		
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	@Override
	public String toString() {
		return color+"����  ("+getX()+","+getY()+")�� ��";
	}
}
// ------6�� ����------
class ColorPoint6 extends Point
{

	String color;
	public ColorPoint6()
	{
		super(0,0);
		this.color = "BLACK";
	}
	
	public ColorPoint6(int x,int y)
	{
		super(x,y);
	}
	
	
	public ColorPoint6(int x, int y, String color) {
		
		super(x, y);
		this.color = color;
	}
	
	
	public void setXY(int x, int y)
	{
		move(x,y);
		
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	@Override
	public String toString() {
		return color+"����  ("+getX()+","+getY()+")�� ��";
	}
}
// -----7�� ����------
class Point3D extends Point
{
	public int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+getX()+","+getY()+","+z+")�� ��";
	}
	
	public void moveUp()
	{
		this.z++;
	}
	public void moveDown()
	{
		this.z--;
	}
	public void move(int x, int y, int z)
	{
		move(x,y);
		this.z = z;
	}
	
}
// ----8�� ����------
class PositivePoint extends Point
{

	public PositivePoint()
	{
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0||y<0)
			super.move(0,0);
	}
	
	protected void move(int x, int y)
	{
		if(x<0||y<0)
		{
			super.move(getX(),getY());
		}
		else
		{
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")�� ��";
	}
	
}

public class Homework {
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
//		System.out.println((str + "�Դϴ�."));
//		
//		ColorPoint6 zeroPoint = new ColorPoint6();
//		System.out.println(zeroPoint.toString()+"�Դϴ�. ");
//		
//		ColorPoint6 cp = new ColorPoint6(10, 10);
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"�Դϴ�.");
		
//		Point3D p = new Point3D(1,2,3);
//		System.out.println(p.toString() + "�Դϴ�. ");
//		
//		p.moveUp();
//		System.out.println(p.toString() + "�Դϴ�. ");
//		
//		p.moveDown();
//		p.move(10,10);
//		System.out.println(p.toString() + "�Դϴ�. ");
//		
//		p.move(100, 200,300);
//		System.out.println(p.toString() + "�Դϴ�. ");
//		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�. ");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�. ");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "�Դϴ�. ");
		
		
		
	}
}
