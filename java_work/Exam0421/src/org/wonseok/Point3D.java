package org.wonseok;

public class Point3D extends Point{
	int z;
	
	//기본 생성자
	public Point3D() {
		this(1,1,1);
	}
	
	// x,y,z 가 매개변수인 생성자.
	public Point3D(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "x="+x+", y="+y+", z="+z;
	}
}
