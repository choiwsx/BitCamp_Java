package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("�̸��� �Է����ּ���: ");
		Dto dto = new Dto();
		dto.setName(scan.next());
		System.out.print("��ȭ��ȣ�� �Է����ּ���: ");
		dto.setPhone(scan.next());

		data.dto = dto;
	
	}

}
