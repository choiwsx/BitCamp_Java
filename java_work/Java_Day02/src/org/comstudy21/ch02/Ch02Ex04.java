package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex04 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double width=0, height=0; //�������� ����� �ʱ�ȭ �ʼ�.
		
		
		out.printf("���簢���� ���̸� ���մϴ�\n"
				+ "���� ���̸� �Է����ּ��� :");	
		width = scan.nextDouble();
		out.printf("���� ���̸� �Է����ּ��� :");
		height = scan.nextDouble();
		
		out.printf("���簢���� ���̴� %.2fcm^2�Դϴ�.", width * height);
		
	
		
	}
}

