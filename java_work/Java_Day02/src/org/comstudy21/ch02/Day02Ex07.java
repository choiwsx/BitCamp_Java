package org.comstudy21.ch02;


import static java.lang.System.out;
import java.util.Scanner;


public class Day02Ex07 {
	private int test2 = 10;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int testv = 20;
		
		int cnt01 = 10, price = 0, cnt02 = 0;
		
		out.print("cnt01 �Է�: ");
		cnt01 = scan.nextInt();
		
		out.printf("������ ���뿡 %d�ڷ� �ִ�.\n",cnt01);
		
		out.print("price �Է�: ");
		price = scan.nextInt();
		
		out.printf("������ �Ѵٽ��� %d�� �̴�.\n",price);

		out.print("cnt02 �Է�: ");
		cnt02 = scan.nextInt();
		
		
		out.printf("������ �Ѵٽ����� %d�ڷ簡 ����ִ�.\n",cnt02);
	
	}
}

