package org.wonseok.controller;

import org.wonseok.resource.Data;
import org.wonseok.view.Search;

import static org.wonseok.resource.R.*;

import org.wonseok.model.Dto;

public class Controller {

	public static void search(){
		viewArr[3].display(); // �˻� �Է�
		data.dtoArr = dao.select(data.dto);
		((Search) viewArr[3]).display(data.dtoArr);

	}

	public static void service() {
		try {
			viewArr[data.no].display();

			switch (data.no) {
			case 1:
				viewArr[data.no].display();
				// �Է¹��� data.dao �����͸� dao �� �ѱ��.
				dao.insert(data.dto);

				break;
			case 2:
				data.dtoArr = dao.selectAll();
				// dao���� �����͸� ������ �� �Ŀ� ��� �̵�.
				viewArr[data.no].display();
				break;
			case 3:
				search();
				break;
			case 4:
				search();
				viewArr[data.no].display();
				dao.update(data.dto);
				break;
			case 5:
				search();
				viewArr[data.no].display();
				if (data.dto.getIdx() != 0)
					dao.delete(data.dto);
				break;
			case 6:
				System.out.println(":::::���α׷� ����:::::");
				System.exit(0);

				break;
			default:
				System.out.println("�ش���� �����ϴ�!");
			}

			// viewArr[data.no].display();
		} catch (NullPointerException e) {
			System.out.println("���� : �޴��� �غ� ���� �ʾҽ��ϴ�.");
			data.no = 0;
		} catch (Exception e) {
			System.out.println("���� : �ش� ���� �����ϴ�.");
			data.no = 0;
		}
		data.no = 0;

		service();

	}
}
