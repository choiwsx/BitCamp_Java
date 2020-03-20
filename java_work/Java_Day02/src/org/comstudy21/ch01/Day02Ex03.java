package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex03 {
	public static void main(String[] args) throws IOException{
		// System.in 필드를 이용해서 데이터 입력 받기.
		// Scanner를 이용하면 더 편리함.
		
		//나이를 입력 받아서 출력한다.
		System.out.print("나이 입력: ");
		int age = System.in.read() - '0';
		System.out.println(age);
		age = age*10;
		//age = System.in.read()-'0';
		System.out.println(age);
		// 키보드의 아스키코드(유니코드)가 입력 된다.
		// 0 - 48
		// a - 97
		// A - 65
		
		//나이와 이름을 입력 받아서 출력
		
	//	System.out.printf("나이: %d\n", age);
	}
}
