package org.wonseok;

import java.util.Scanner;

 abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}



class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}

}

class Circle extends Shape {

	public void draw() {
		System.out.println("Circle");
	}

}



public class GraphicEditor {
	private Shape start;
	private Shape cur;
	private Shape tail;
	
	Scanner scan = new Scanner(System.in);
	
	private int menu()
	{
		System.out.print("삽입(1) 삭제(2) 모두 보기(3) 종료(4)>> ");
		
		
		
		return scan.nextInt();
	}
	
	public GraphicEditor() {
		// TODO Auto-generated constructor stub
		start = null;
		tail = null;
	}

	public void run()
	{
		while(true)
		{
			switch(menu())
			{
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				print(); 
				break;
			case 4:
				finish();
				break;
				
				default:
					System.out.println("해당 사항 없습니다!");
			}
		}
	}
	private void finish() {
		// TODO Auto-generated method stub
		System.out.println("finish");
		System.exit(0);
	}

	private void print() {
		// TODO Auto-generated method stub
		Shape s = start;
		while(s!=null)
		{
			s.draw();
			s = s.getNext();
		}
	}

	private Shape Circle() {
		// TODO Auto-generated method stub
		return null;
	}

	private Shape Rect() {
		// TODO Auto-generated method stub
		return null;
	}

	private Shape Line() {
		// TODO Auto-generated method stub
		return null;
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 도형의 위치 >>");
		int idx = scan.nextInt()-1;
		Shape cur = start;
		Shape tmp = start;
		if(idx==0)
		{
			start = start.getNext();
			return;
		}
		for(int i=0; i<idx; i++)
		{
			tmp = cur;
			cur = cur.getNext();
		}
		tmp.setNext(cur.getNext());
		
	}

	private void insert() {
		// TODO Auto-generated method stub
		System.out.println("Line(1) Rect(2) Circle(3)>>");
		Shape newNode;
		switch(scan.nextInt())
		{
		case 1:
			newNode =  new Line(); break;
		case 2:
			 newNode = new Rect(); break;
		case 3:
			 newNode = new Circle(); break;
		default:
			System.out.println("해당 사항 없습니다."); return;
		}
		if(start==null)
		{
			start = newNode;
			tail = start;
			return;
		}
		tail.setNext(newNode);
		tail = tail.getNext();
	}

	private static void Print(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
//		Line line = new Line();
		GraphicEditor g  = new GraphicEditor();
		g.run();
	}
}
