package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex03 {
	public static void main(String[] args) throws IOException{
		// System.in �ʵ带 �̿��ؼ� ������ �Է� �ޱ�.
		// Scanner�� �̿��ϸ� �� ����.
		
		//���̸� �Է� �޾Ƽ� ����Ѵ�.
		System.out.print("���� �Է�: ");
		int age = System.in.read() - '0';
		System.out.println(age);
		age = age*10;
		//age = System.in.read()-'0';
		System.out.println(age);
		// Ű������ �ƽ�Ű�ڵ�(�����ڵ�)�� �Է� �ȴ�.
		// 0 - 48
		// a - 97
		// A - 65
		
		//���̿� �̸��� �Է� �޾Ƽ� ���
		
	//	System.out.printf("����: %d\n", age);
	}
}
