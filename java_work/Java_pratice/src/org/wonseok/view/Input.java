package org.wonseok.view;

import org.wonseok.model.People;

public class Input implements PhonebookView{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		People p = new People();
		System.out.println("***�Է� ���***");
		System.out.print("������ �Է��ϼ�>>");
		p.setName(scan.next());
		System.out.print("��ȣ�� �Է��ϼ�>>");
		p.setPhone(scan.next());
		
		data.people = p;
		System.out.println("�Է� �Ϸ�");
	}
	
	
}
