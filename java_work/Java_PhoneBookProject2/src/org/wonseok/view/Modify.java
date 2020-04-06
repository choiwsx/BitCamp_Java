package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		if(data.map.size()==0)
		{
			return;
		}
		System.out.println(modifyTitle);
		System.out.print("�����ϰ� ���� ����� Key���� �Է��ϼ��� > ");
		int idx = scan.nextInt();
		data.keynumber = idx;
		if(!data.map.containsKey(idx))
		{
			System.out.println("�ش� Ű���� �����ϴ�, ���� ����");
			return;
		}
		System.out.print("���� ���ϴ� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		System.out.print("���� ���ϴ� ��ȣ�� �Է��ϼ��� > ");
		String phone = scan.next();
		data.dto = new Dto(name, phone);
	}

}