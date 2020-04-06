package org.wonseok.pt1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex01Set {
	public static void main(String[] args) {
		//key 도 없고 index도 없는 Set 구조
		//value의 중복이 없다.
		//<> 기호는 제네릭 : 사용될 타입을 고정시킨다.
//		Set<String> set = new HashSet<String>();
//		set.add("오징어");
//		set.add("꼴뚜기");
//		set.add("굴");
//		set.add("명태");
//		set.add("거북이");
//		set.add("명태");
//		
//		System.out.println(set.size());
//		
//		
//		
//		//배열로 변환
//		String[] arr = new String[set.size()];
//		set.toArray(arr);
//		
//		for(String s : arr)
//		{
//			System.out.println(s);
//		}
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		Random rand = new Random();
		
		while(set1.size()<6)
		{
			int tmp2 = (int)(Math.random()*45)+1;
			set1.add(tmp2);
		}
		
//		Iterator<Integer> iterator = set1.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		for(int a : set1)
		{
			System.out.println(a);
		}
			
	
	}
}
