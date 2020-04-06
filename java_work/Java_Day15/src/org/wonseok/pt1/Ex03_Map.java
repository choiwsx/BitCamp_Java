package org.wonseok.pt1;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void display();
}

class Input implements View {

	@Override
	public void display() {
		System.out.println(" �Է±��  ");

	}

}

class Output implements View {

	@Override
	public void display() {
		System.out.println(" ��±��  ");

	}

}

class End implements View {

	@Override
	public void display() {
		System.out.println("���α׷� ����");
		System.exit(0);
	}

}

public class Ex03_Map {

	static Hashtable<Integer, View> mapping = new Hashtable<>();
	static {
		mapping.put(1, new Input());
		mapping.put(2, new Output());
		mapping.put(3, new End());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("�Է�(1), ���(2), �˻�(3), ����(4), ����(5)");
			int no = scan.nextInt();
			if (no < 1 || no > mapping.size()) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			} else {
				mapping.get(no).display();
			}
		}

	}

	public static void test(String[] args) {
		// map �������̽��� ��� �޾Ƽ� -> HashTable �÷��� Ŭ����
		// Key : Value �� ������ ��Ұ� �����ȴ�.
		Hashtable<String, String> map = new Hashtable<>();
		map.put("ȫ�浿", "010-1111-1111");
		map.put("��浿", "010-2222-1111");
		map.put("ȫ���", "010-3333-1111");
		map.put("�ڱ浿", "010-4444-1111");

		System.out.println(map);
		System.out.println(map.get("��浿"));
	}
}