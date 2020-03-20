package org.comstudy21.ch01;


import java.io.IOException;
import java.util.Scanner;

public class Day02Ex05 {
	
	public static void main(String[] args) {
		System.out.printf("%c, %d\n", '0', (int)'0');
		System.out.printf("%c, %d\n", 'A', (int)'A');
		System.out.printf("%c, %d\n", 'a', (int)'a');
		
	}
	public static void test(String[] args) throws IOException{
		int age = 0;
		int name = 0;
		
		System.out.print("나이 입력 : ");
		age = System.in.read()-'0';
		System.in.read();
		System.in.read();
		
		System.out.print("이름 입력: ");
		name = System.in.read();
		
		System.out.printf("나이 : %d, 이름 : %s \n", age, name);		
	}
}
