package org.wonseok;

import java.util.Scanner;

public class Ch06Ex01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String name = null;
		while (true) {
			try {
				System.out.println("name = " + name.toString());
				break;
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				System.out.println("���� �߻� : ���ڿ��� �Է� ���� �ʾҽ��ϴ�.");
				System.out.println("���� �Է� : ");
				name = scan.next();
				continue;
			}
		}
		System.out.println("���α׷� ����!");
		scan.close();

	}
}