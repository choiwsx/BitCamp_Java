package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		Dto dto = new Dto();
		System.out.print("���� �Է�:");
		dto.setName(scan.next());
		System.out.print("��ȭ��ȣ �Է�:");
		dto.setPhone(scan.next());
		
		data.dto = dto;
		System.out.println("---------���� �Է� �Ϸ�!!-------");
		
	}

}
