package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		if(data.dtoArr.length==0)
		{
			System.out.println("���� ������ ����� �����ϴ�.");
			return;
		}
		
		
		System.out.print("���� �ϰ� ���� ����� idx ���� �Է��ϼ��� >");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.dtoArr.length; i++)
		{
			if(idx==data.dtoArr[i].getIdx())
			{
				flag = true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println("���� ���� �ʴ� idx���Դϴ�.");
			data.dto = new Dto(0, null, null);
			return;
		}
		
		System.out.print("�����Ͻ� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		
		System.out.print("�����Ͻ� ��ȣ�� �Է��ϼ��� > ");
		String phone = scan.next();
		
		data.dto = new Dto(idx, name, phone);
		
		
		
	}

}
