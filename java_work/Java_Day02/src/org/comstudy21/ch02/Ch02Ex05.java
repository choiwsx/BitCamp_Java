package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex05 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			
		double area=0; //���� ����.
		final double pi = 3.141592; // ������ ���.
		double r=0; // ���� ������.
		double line=0; //���� �ѷ�
		
		//���� �������� �Է¹޾Ƽ� �ѷ��� ���̿� ������ ����ϴ� ���α׷�.
		
		out.print("���� �������� �Է��ϼ��� : ");
		r = scan.nextDouble();
		
		area = pi * r * r;
		line = pi * r * 2;
		out.printf("�������� %.1f �� ���� ������ : %.2fcm^2�̸�, ���� �ѷ��� : %.2fcm�Դϴ�.", 
				r, area, line);
		
	}
}

