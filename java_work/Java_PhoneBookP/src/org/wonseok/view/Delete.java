package org.wonseok.view;

import org.wonseok.model.Dto;

public class Delete implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(deleteTitle);
		if(data.dtoArr.length==0)
		{
			return;
		}
		System.out.print("���� ���ϴ� ����� idx�� �Է����ּ���. ");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.dtoArr.length; i++)
		{
			if(data.dtoArr[i].getIdx()==idx)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("�׷� ����� �����ϴ�.");
			data.dto = new Dto(0, null, null);
			return;
		}
		

		data.dto = new Dto(idx, null, null);
	}

}
