package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("�̸��� �Է��ϼ��� > ");
		String name = scan.next();
		System.out.print("��ȣ�� �Է��ϼ��� > ");
		String phone = scan.next();
		
		Dto dto = new Dto();
		dto.setName(name);
		dto.setPhone(phone);
		data.dto = dto;
		System.out.println("----�Է� �Ϸ�----");
		
	}

}