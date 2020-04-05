package org.wonseok.view;

import java.util.HashMap;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		System.out.print("�����ο� ����� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		System.out.print("���� ������ �Է��ϼ��� > ");
		int Korean = scan.nextInt();
		System.out.print("���� ������ �Է��ϼ��� > ");
		int English = scan.nextInt();
		System.out.print("���� ������ �Է��ϼ��� > ");
		int Math = scan.nextInt();
		Dto dto = new Dto();
		dto.setName(name);
		dto.setKorean(Korean);
		dto.setEnglish(English);
		dto.setMath(Math);
		data.dto = dto;
		System.out.println("�Է� �Ϸ�!");
	}

}
