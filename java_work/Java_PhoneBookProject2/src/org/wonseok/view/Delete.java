package org.wonseok.view;

import org.wonseok.model.Dto;

public class Delete implements View {

	@Override
	public void display() {
		if(data.map.size()==0)
		{
			return;
		}
		System.out.println(deleteTitle);
		System.out.print("���� �ϰ� ���� ����� Key���� �Է��ϼ��� > ");
		int idx = scan.nextInt();
		data.keynumber = idx;
	
	}

}