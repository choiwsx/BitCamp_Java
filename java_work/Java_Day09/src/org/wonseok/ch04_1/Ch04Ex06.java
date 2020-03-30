package org.wonseok.ch04_1;

import java.util.Scanner;

import org.wonseok.ch04.People;

public class Ch04Ex06 {

	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0; // ������ �Ͼ�� ���ҵȴ�.
	private int sequence = 0; // ��ü�� ������ �� ���� ���� ��� ����, idx�� ���.
	public static final Scanner scan = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("����Ʈ ������ ȣ.��.");
		while (true) {
			System.out.println();
			run();
		}
	}

	public void run() {
		// System.out.println("�޸��� ����");
		switch (menu()) {
		case 1: // �Է�
			input();
			break;
		case 2: // ���
			output();
			break;
		case 3: // �˻�
			search();
			break;
		case 4: // ����
			Modify();
			break;
		case 5: // ����
			delete();
			break;

		case 6: // ����
			System.out.println("����...");
			System.exit(0);
			break;

		default:
			System.out.println("�ش���׾����ϴ�");
		}

	}

	// pArr�� people ��ü�� �߰��Ѵ�.
	public void input() {
		// �� �̻� �Է��� �� ������ �ٷ� ������.
		if (top >= pArr.length) {
			System.out.println("�� �̻� �Է� �Ұ�.");
			return;
		}
		// 1. ��ü����
		People p = new People();
		p.setIdx(sequence++);
		// 2. ������ �ֱ�
		System.out.print("���� �Է�>>");
		p.setName(scan.next());
		System.out.print("��ȭ��ȣ �Է�>>");
		p.setPhone(scan.next());

		// 3. ��ü�� �迭 top ������ ���.
		pArr[top++] = p;

		System.out.println("�Է� �Ϸ�");

	}

	// ��� ���
	public void output() {
		// pArr�� ��Ҹ� top���� �ݺ��ؼ� ����Ѵ�.
		for (int i = 0; i < top; i++) {
			System.out.println(pArr[i].toString());
		}
		// for(People p : pArr)
		// System.out.println(p);

	}

	public void search() {

		System.out.print("�˻��غ������� �̸��� �Է��ϼ���>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j++] = pArr[i];
			}
		}
		if (j == 0) {
			System.out.printf("%s�̶�� �̸��� ���� ����� �����ϴ�.\n", searchName);
			return;
		}
		System.out.printf("�� %d���� ã�ҽ��ϴ�.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}
	}

	public void Modify() {
		System.out.print("�����ϰ����� �̸��� �Է��ϼ���>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j++] = pArr[i];
			}
		}
		if (j == 0) {
			System.out.printf("%s�̶�� �̸��� ���� ����� �����ϴ�.\n", searchName);
			return;
		}
		System.out.printf("�� %d���� ã�ҽ��ϴ�.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}

		boolean flag = false;
		while (!flag) {
			int ModifyNum = 0;
			System.out.print("�����ϰ� ���� ����� idx���� �Է����ּ���>>");
			ModifyNum = scan.nextInt();
			
			for (int i = 0; i < j; i++) {
				if (searchPeople[i].getIdx() == ModifyNum) {
					System.out.print("�����ϰ� ���� �̸��� �Է��ϼ���>>");
					searchPeople[i].setName(scan.next());
					System.out.print("�����ϰ� ���� ��ȭ��ȣ�� �Է��ϼ���>>");
					searchPeople[i].setPhone(scan.next());
					flag = true;
				}
			}
			if(!flag)
			{
				System.out.println("�������� �ʴ� idx���Դϴ�, �ٽ� Ȯ�����ּ���.");
			}
		}

	}

	public void delete() {
		System.out.print("�����ϰ����� �̸��� �Է��ϼ���>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j] = pArr[i];
				searchPeople[j++].setDeleIdx(i);
			}
		}
		if (j == 0) {
			System.out.printf("%s�̶�� �̸��� ���� ����� �����ϴ�.\n", searchName);
			return;
		}
		System.out.printf("�� %d���� ã�ҽ��ϴ�.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}

		boolean flag = false;
		while (!flag) {
			int deleNum = 999;
			System.out.print("�����ϰ� ���� ����� idx���� �Է����ּ���>>");
			deleNum = scan.nextInt();

			for (int i = 0; i < j; i++) {
				if (searchPeople[i].getIdx() == deleNum) {
					int deleIdx = searchPeople[i].getDeleIdx();
					for(int k=deleIdx; k<top;k++)
					{
						pArr[k] = pArr[k+1];
					}
					System.out.println("�����Ϸ�.");
					flag = true;
					
				}
			}
			if(!flag)
			{
				System.out.println("�������� �ʴ� idx���Դϴ�, �ٽ� Ȯ�����ּ���.");
			}
			top--;
		}
		
	}

	public int menu() {
		int no = 0;
		System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
		System.out.print("����: ");
		no = scan.nextInt();
		return no;
	}

	public static void main(String[] args) {
		new Ch04Ex06();
	}
}