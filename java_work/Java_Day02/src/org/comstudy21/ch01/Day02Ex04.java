package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex04 {
	public static void main(String[] args) throws IOException{
		byte[] b = new byte[255];
		System.out.print("성명입력 : ");
		System.in.read(b);
		
		System.out.println(new String(b).trim());
		
		System.out.print("나이 입력: ");
		System.in.read(b);
		System.out.println(Integer.parseInt(new String(b)));
	}
}
