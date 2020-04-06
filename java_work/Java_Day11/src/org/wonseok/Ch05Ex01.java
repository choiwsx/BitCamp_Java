package org.wonseok;

import Point.Point3D;


public class Ch05Ex01 {
	public static void main(String[] args) {
		// Point3d로 객체를 생성 하면 수퍼 클래스의 멤버인 x,y에도 접근 가능.
		Point3D pt = new Point3D();
		pt.x = 10;
		pt.y = 20;
		pt.z = 30;
		System.out.println(pt.x+" "+pt.y+" "+pt.z);
	}
}
