package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("�˻��ϰ� ���� ����� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		Dto dto = new Dto();
		dto.setName(name);
		data.dto = dto;
	}
	
	public void display(Dto[] dto)
	{
		for(Dto d : dto)
		{
			System.out.println(d);
		}
	}

}
