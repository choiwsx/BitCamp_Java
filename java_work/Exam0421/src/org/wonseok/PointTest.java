package org.wonseok;

public class PointTest {
	public static void main(String[] args) {
		
		
		Point p = new Point(3, 5);
		Point p2 = new Point(2, 4);
		System.out.println("p1 좌표 : "+p.toString());
		
		
		Point p5 = new Point(3,5);
		
		System.out.println("p2 좌표 : "+p2.toString());
		System.out.println("p5 좌표 : "+p5.toString());
		
		System.out.println("p1과 p2의 거리 : "+p.getDistance(p2));// 3,5 7,5 거리
		System.out.println("p1과 p2의 거리(static메서드) : "+Point.getDistance(p, p2)); //static 메서드 호출
		System.out.println("p1과 p5의 거리(static메서드) : "+Point.getDistance(p, p5));
		
		System.out.println("p1과 p2 equals : " +p.equals(p2)); 
		System.out.println("p1과 p5 equals : " +p5.equals(p));
		
		
		Point3D p3 = new Point3D();
		Point3D p4 = new Point3D(2,3,4);
		
		System.out.println("Point3D 기본생성자 : " + p3.toString());
		System.out.println("Point3D (2,3,4) : " + p4.toString());

	
	}
}
