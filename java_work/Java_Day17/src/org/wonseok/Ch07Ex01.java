package org.wonseok;

import java.util.Vector;

public class Ch07Ex01 {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		System.out.println(v);
		
		
		
	}
}
