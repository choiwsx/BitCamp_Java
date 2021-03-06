package org.wonseok;


class Shape{
	
	protected double res;
	
	public void area(){
		
//		return res;
	}
	
}

class Circle extends Shape{
	private int r;
	
	public Circle()
	{
		this.r = 1;
	}
	public Circle(int x)
	{
		this.r = x;
	}
	
	public void area()
	{
		res = Math.pow(this.r, 2)*Math.PI;
		System.out.println(res);
	}

}

class Rectangle extends Shape{
	private int W;
	private int h;
	
	public Rectangle()
	{
		this.W = 10;
		this.h = 5;
	}
	
	public Rectangle(int a, int b)
	{
		this.W = a;
		this.h = b;
	}
	
	public void area()
	{
		res =  this.W*this.h; 
		System.out.println(res);
	}
	
}
class Triangle extends Shape
{
	private int W;
	private int h;
	
	public Triangle()
	{
		this.W = 10;
		this.h = 5;
	}
	public Triangle(int a, int b)
	{
		this.W = a;
		this.h = b;
	}
	public void area()
	{
		res = this.W*this.h*0.5;
//		return res;
		System.out.println(res);
	}
	
}



public class Ch04Ex101 {
	
//	static void showShape(Shape s)
//	{
//		s.area();
//	}
	static void objshow(Object o)
	{
		if(o instanceof Shape)
		{
			((Shape)o).area();
		}
	}

	public static void main(String[] args) {
//		Shape ref = null;
//		ref = new Circle();
////		System.out.println("도형의 면적은" +ref.area());
//		ref.area();
//		ref = new Triangle();
////		System.out.println(ref.area());
//		ref.area();
//		
		Shape[] arr  =
			{
					new Circle(5), new Rectangle(10,10), new Triangle(10,20)
			};
		
		for(int i=0; i<arr.length; i++)
		{
			objshow(arr[i]);
		}
	
	}
	
	
}
