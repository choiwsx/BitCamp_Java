package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		data.dto = new Dto();
		System.out.print("�˻��� ����� �̸��� �Է��ϼ��� : ");
		data.dto.setName(scan.next());
	}
	
	
	public void display(Dto[] dto)
	{
		if(dto.length==0){
			System.out.println("�˻��� ����� �����ϴ�.");
			return;
		}
		for(int i=0; i<dto.length; i++)
		{
			System.out.println(dto[i].toString());
		}
		
		
	}

}
