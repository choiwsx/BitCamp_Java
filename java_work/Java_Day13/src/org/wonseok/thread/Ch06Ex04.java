package org.wonseok.thread;


class Point
{
	int x;
	int y;
	public Point() {

	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		if(this.x == ((Point)obj).x&&this.y==((Point)obj).y)
//			return true;
		if(obj instanceof Point)
		{
			Point pt = (Point)obj;
			if(this.x == pt.x&&this.y==pt.y)
				return true;			
		}
			
			
		return false;
		
	}
	
}


public class Ch06Ex04 {
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		System.out.println(p1.equals(p2));
	}
}
