package org.wonseok;

public class Point {
	//x,y 멤버변수 
	int x,y;
	
	//기본 생성자
	public Point() {
		this(1,1); //1,1로 생성
	}
	
	// 매개변서 x,y 생성자
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//toString 메서드
	@Override
	public String toString() {
		return "x="+x+",y="+y; 
	}
	
	//static 함수 Q6
	static double getDistance(Point p1, Point p2)
	{
		int a = p1.x - p2.x; 
		int b = p1.y - p2.y;
		double d = Math.sqrt(a*a+b*b);
		return d; // p1과 p2의 거리 반환
	}
	
	//Q7
	public double getDistance(Point p)
	{
		return getDistance(this, p); // 위에 작성했던 static 함수 호출해서 값 얻기.
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Point)
		{																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
			Point tmp = (Point)obj; //캐스팅.
			if(tmp.x==this.x&&tmp.y==this.y) // 두 객체의 좌표가 같으면.
			{
				return true;
			}
		}
		return false;
	}
}
