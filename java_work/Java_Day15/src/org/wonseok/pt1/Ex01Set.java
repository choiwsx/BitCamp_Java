package org.wonseok.pt1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex01Set {
	public static void main(String[] args) {
		//key �� ���� index�� ���� Set ����
		//value�� �ߺ��� ����.
		//<> ��ȣ�� ���׸� : ���� Ÿ���� ������Ų��.
//		Set<String> set = new HashSet<String>();
//		set.add("��¡��");
//		set.add("�öѱ�");
//		set.add("��");
//		set.add("����");
//		set.add("�ź���");
//		set.add("����");
//		
//		System.out.println(set.size());
//		
//		
//		
//		//�迭�� ��ȯ
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