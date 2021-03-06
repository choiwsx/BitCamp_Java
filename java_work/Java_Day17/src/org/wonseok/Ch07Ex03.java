package org.wonseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

class Student
{
	int id;
	String tel;
	public Student(int id, String tel)
	{
		this.id = id;
		this.tel = tel;
	}
}

class CollectionsEx{
	static void printList(LinkedList<String> l)
	{
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext())
		{
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
}


class GStack<T>
{
	int tos;
	Object[] stk;
	public GStack() {
		// TODO Auto-generated constructor stub
		tos =0;
		stk = new Object[10];
	}
	public void push(T item)
	{
		if(tos ==10)
			return;
		stk[tos] = item;
		tos++;
	}
	public T pop(){
		if(tos==0)
			return null;
		tos--;
		return (T)stk[tos];
	}
}


public class Ch07Ex03 {	
	
	public static void main(String[] args) {
		
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("Busan");
		stringStack.push("LA");
		
		for(int i=0; i<3; i++)
			System.out.println(stringStack.pop());

		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		for(int i=0; i<3; i++)
			System.out.println(intStack.pop());
	}
	
	
	public static void test4(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
	
		Collections.sort(myList);
		CollectionsEx.printList(myList);
		Collections.reverse(myList);
		CollectionsEx.printList(myList);
		
		int idx = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+idx+"번쨰 요소입니다.");
		
	}
	
	
	public static void test3(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("황기태", new Student(1,"010-1111-1111"));
		map.put("이재문", new Student(2,"010-2222-2222"));
		map.put("김남윤", new Student(3,"010-3333-3333"));
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("검색할 이름?");
			String name = scan.nextLine();
			if(name.equals("exit"))
				break;
			Student stud = map.get(name);
			if(stud==null)
				System.out.println(name+"은 없는 사람입니다");
			else
				System.out.println("id"+stud.id+", 전화 : "+stud.tel);
			
		}
	}
	
	public static void test2(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("해쉬맵의 요소 개수: "+javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			String name= it.next();
			int score = javaScore.get(name);
			System.out.println(name+":"+score);
		}
		
	}
	
	public static void test(String[] args) {
	
			HashMap<String, String> dic = new HashMap<String, String>();
			dic.put("baby", "아기");
			dic.put("love", "사랑");
			dic.put("apple", "사과");
			
			Scanner scan = new Scanner(System.in);
			while(true)
			{
				System.out.print("찾고 싶은 단어는?");
				String eng = scan.next();
				if(eng.equals("exit"))
				{
					System.out.println("종료합니다.");
					break;
				}
				String kor = dic.get(eng);
				if(kor==null)
					System.out.println(eng+"는 없는 단어입니다.");
				else
					System.out.println(kor);
				
			}
			
			
			}
}
