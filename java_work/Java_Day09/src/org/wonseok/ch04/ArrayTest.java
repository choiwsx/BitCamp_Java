package org.wonseok.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		People[] pArray = new People[3];
	
		String name;
		String phone;
		//People ��ü�� �����͸� �����ϰ� ����ض�
		for(int i=0; i<pArray.length; i++)
		{
			System.out.print("������ �Է��ϼ���>>");
			name = scan.nextLine();
			System.out.print("��ȭ��ȣ�� �Է��ϼ���>>");
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