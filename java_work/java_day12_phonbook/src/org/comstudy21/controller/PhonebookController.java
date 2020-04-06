package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.People;

public class PhonebookController {
	public void service() {
		if (data.no == 0) {
			menu.display();
		}
		switch (data.no) {
		case 1:
			input.display();
			// ���ҽ��� �ִ� �����͸� �𵨷� �ѱ��.
			People dto = data.people;
			dao.insert(dto);
			break;
		case 2:
			// ��� ���� �����ҽ����� �����͸� �����´�.
			People[] pArr = dao.select();
			data.pArr = pArr;
			output.display();
			break;
		case 6:
			System.out.println(">>> ���α׷� ����!");
			System.exit(0);
			break;
		default:
			System.out.println("�ش� �޴��� �غ� ���� �ʾҽ��ϴ�!");
		}

		data.no = 0;
		service();
	}
}