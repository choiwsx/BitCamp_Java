package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		if(data.map.size()==0)
		{
			return;
		}
		System.out.println(modifyTitle);
		System.out.print("�����ϰ� ���� ����� Key���� �Է��ϼ��� > ");
		int idx = scan.nextInt();
		data.keynumber = idx;
		if(!data.map.containsKey(idx))
		{
			System.out.println("�ش� Ű���� �����ϴ�, ���� ����");
			return;
		}
		System.out.println();
		System.out.print("�����ϰ� ���� �̸��� �Է��ϼ��� > ");
		String name = scan.next();
		System.out.print("�����ϰ� ���� ���� ������ �Է��ϼ��� > ");
		int Korean = scan.nextInt();
		System.out.print("�����ϰ� ���� ���� ������ �Է��ϼ��� > ");
		int English = scan.nextInt();
		System.out.print("�����ϰ� ���� ���� ������ �Է��ϼ��� > ");
		int Math = scan.nextInt();
		
		Dto dto = new Dto();
		dto.setName(name);
		dto.setKorean(Korean);
		dto.setEnglish(English);
		dto.setMath(Math);
		data.dto = dto;
	}

}
