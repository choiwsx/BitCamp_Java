package org.comstudy21.ch02;


import static java.lang.System.out;
import java.util.Scanner;


public class Day02Ex07 {
	private int test2 = 10;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int testv = 20;
		
		int cnt01 = 10, price = 0, cnt02 = 0;
		
		out.print("cnt01 입력: ");
		cnt01 = scan.nextInt();
		
		out.printf("연필이 필통에 %d자루 있다.\n",cnt01);
		
		out.print("price 입력: ");
		price = scan.nextInt();
		
		out.printf("연필이 한다스는 %d원 이다.\n",price);

		out.print("cnt02 입력: ");
		cnt02 = scan.nextInt();
		
		
		out.printf("연필이 한다스에는 %d자루가 들어있다.\n",cnt02);
	
	}
}

