package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(modifyTitle);
		System.out.print("�����ϰ� ���� ����� Idx���� �Է��ϼ��� > ");
		int idx = scan.nextInt();
		
		System.out.print("���� ���ϴ� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		System.out.print("���� ���ϴ� ��ȣ�� �Է��ϼ��� > ");
		String phone = scan.next();
		data.dto = new Dto(idx, name, phone);
		
	}

}
