package org.wonseok.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		People[] pArray = new People[3];
	
		String name;
		String phone;
		//People 객체에 데이터를 저장하고 출력해라
		for(int i=0; i<pArray.length; i++)
		{
			System.out.print("성명을 입력하세요>>");
			name = scan.nextLine();
			System.out.print("전화번호을 입력하세요>>");
			phone = scan.nextLine();
			pArray[i] = new People(i,name,phone);
		}
		
//		for(int i=0; i<pArray.length; i++)
//		{
//			System.out.println(pArray[i].toString());		
//		}
		System.out.println(Arrays.toString(pArray));
		
		
	}
}
