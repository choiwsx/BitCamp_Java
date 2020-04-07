package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(modifyTitle);
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
		
		System.out.print("�� �̸��� �Է����ּ��� : ");
		String name = scan.next();
		System.out.print("�� ��ȭ��ȣ�� �Է����ּ��� : ");
		String phone = scan.next();
		
		data.dto = new Dto(idx, name, phone);
		
	}

}
