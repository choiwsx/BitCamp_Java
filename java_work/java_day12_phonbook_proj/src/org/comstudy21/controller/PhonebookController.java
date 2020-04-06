package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.People;

public class PhonebookController {
	People[] pArr;
	public void search()
	{
		search.display();
		// �˻�� �̿��ؼ� dao���� �˻�
		data.pArr = dao.select(data.people);
		// �˻������ resource ��Ƶΰ� �ٽ� ��� �̵�
		search.display(data.pArr);
	}
	public void service() {
		if(data.no==0)
		{
			menu.display();
		}
		switch(data.no)
		{
		case 1: 
			input.display(); 
			People dto = data.people;
			dao.insert(dto);
			break;
		case 2:
			data.pArr = dao.select();
			//������� ���ҽ����� �����͸� �����´�.
			output.display();
			break;
		case 3:
		
			search();
			break;
			
		case 4:
			search();
			// modify���� idx(People)�� �Է� �޾Ƽ� resource�� ��Ƶΰ�
			modify.display();
			
			
			// controller������ resource�� idx(People)�� �޾Ƽ� dao�� ���� ������� ����.
			dao.modify(data.people);
			break;
		
		case 5:
			search();
			delete.display();
			if(data.people==null)
			{
				System.out.println("���� ����� �����ϴ�.");
				return;
			}
			dao.delete(data.people);
			break;
		case 6: System.out.println(">>>���α׷� ����"); System.exit(0); break;
		default : System.out.println("�ش���� �����ϴ�.");
		}
		
		
		data.no = 0;
		service();
	}
}
//LALPCJ7E8H3104763