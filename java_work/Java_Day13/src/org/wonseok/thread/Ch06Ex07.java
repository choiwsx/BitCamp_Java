package org.wonseok.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class People {
	String name;
	int age;
	String addr;
	String job;
	String phone;
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", addr=" + addr + ", job=" + job + ", phone=" + phone + "]";
	}
	
	
}


public class Ch06Ex07 {
	
	public static void main(String[] args) {
		String str ="홍길동|25|서울시 종로구|프로그래머|010-3123-6789";
		StringTokenizer strtz = new StringTokenizer(str, "|");
		ArrayList<String> list = new ArrayList<>();
		while(strtz.hasMoreTokens())
		{
			list.add(strtz.nextToken());
		}
//		System.out.println(list);
		String[] arr = new String[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void test(String[] args) {
		//CSV 형식, TSV .. 
		String str ="홍길동|25|서울시 종로구|프로그래머|010-3123-6789";
		StringTokenizer strtz = new StringTokenizer(str, "|");

		String[] strArr = new String[strtz.countTokens()];
		int i = 0;
		while(strtz.hasMoreTokens())
		{
			strArr[i++] = strtz.nextToken();
		}
		
		for(String a : strArr)
			System.out.println(a);

	
		People p = new People();
		p.name = strArr[0];
		p.age = Integer.parseInt(strArr[1]);
		p.addr = strArr[2];
		p.job = strArr[3];
		p.phone = strArr[4];
		
//		p.toString();
		System.out.println(p);
	}
}
