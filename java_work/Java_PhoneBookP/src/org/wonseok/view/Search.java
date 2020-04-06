package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(searchTitle);
		data.dto = new Dto();
		System.out.print("�˻� �� �̸�: ");
		data.dto.setName(scan.next());
	}

	public void display(Dto[] arr)
	{
		System.out.println("---------�˻� ���--------");
		if(arr.length==0){
			System.out.println("�˻� ��� �׷� ����� �����ϴ�.");
			return;
		}
		for(Dto dto : arr)
		{
			System.out.println(dto);
		}
	}

}
