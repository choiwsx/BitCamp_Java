package org.wonseok.q2;

import java.util.Vector;

class Test {
	int x ;
	public Test() {
		this.x = 1;
	}
}

public class MyVectorTest {
	public static void main2(String[] args) {
		Vector v = new Vector<>(5);
		v.add(2);
		v.add(4);
		v.add(4);
		v.add("문자열");
		v.add(4);
		v.add(4);
		v.add("문자열");
		v.add(4);
		v.add(4);
		v.add(4);
		Test t = new Test();
		v.add(t);
		System.out.println(v.size());
//		System.out.println(v.capacity());
		System.out.println(v.toString());
//		System.out.println(v.indexOf(5));
		v.remove(2);
		v.remove(2);
		System.out.println(v.toString());
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
	public static void main(String[] args) {
		MyVector mv = new MyVector();
//		mv.add(2);
//		mv.add(4);
//		mv.add("문자열");
//		mv.add(2);
//		mv.add(4);
//		mv.add("문자열");
//		mv.add(2);
//		mv.add(4);
//		mv.add("문자열");
//		mv.add(2);
//		mv.add(4);
//		mv.add("문자열");
//		mv.add(2);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
//		mv.add(4);
		for(int i=0; i<1000; i++)
		{
			mv.add(""+i);
		}
		
		Test t = new Test();
//		mv.add(t);
//		
		System.out.println(mv.size());
		System.out.println(mv.capacity);
		System.out.println(mv.isEmpty());
	
//		System.out.println(mv.get(2));
		System.out.println(mv.toString());
		System.out.println(mv.indexOf(t));
		mv.remove("999");
		System.out.println(mv.toString());
//		mv.remove(9);
		System.out.println(mv.toString());
		System.out.println(mv.size());
		System.out.println(mv.capacity);
	}
}
