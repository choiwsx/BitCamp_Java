package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.dtoArr.length==0)
		{
			System.out.println("�׷� ����� �����ϴ�.");
			return;
		}
		
		System.out.print("���� ���ϴ� ����� idx�� �Է����ּ��� > ");
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
			System.out.println("�Է��� idx�� ����� �����ϴ�.");
			data.dto = new Dto(0,null,null);
		}
		
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		String name = scan.next();
		
		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
		String phone = scan.next();
		
		
		data.dto = new Dto(idx, name, phone);
		

	}

}
