package org.comstudy21.view;

public class Menu implements PhonebookView {

	@Override
	public void display() {
		System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
		System.out.print("Choice: ");
		int no = scan.nextInt();
		data.no = no;
		// resource ���� �Ŀ� �ٽ� Controller�� ���� ����.
	}

}