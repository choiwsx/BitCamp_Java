package org.wonseok.controller;

import static org.wonseok.resource.R.*;

import org.wonseok.model.Dao;
import org.wonseok.model.People;

public class PhonebookController {
	public void service() {
		if (data.no == 0) {
			menu.display();
		}
		switch (data.no) {
		case 1:
			input.display();
			People dto = data.people;
			dao.Insert(dto);
			break;
		case 2:
			People[] pArr = dao.select();
			data.pArr = pArr;
			output.display();
			break;
		case 6:
			System.out.println("�ý����� �����մϴ�");
			System.exit(0);
			break;
		default:
			System.out.println("�ش���� �����ϴ�.");
		}

		data.no = 0;
		service();

	}

}
