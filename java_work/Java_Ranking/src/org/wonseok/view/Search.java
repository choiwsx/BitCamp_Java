 package org.wonseok.view;

import java.util.HashMap;
import java.util.Map;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		System.out.println(searchTitle);
		if(dao.map.size()==0)
		{
			System.out.println("����� ����� �Ѹ��� �����ϴ�.");
			return;
		}
		
		for(int i=1; i<searchArr.length; i++)
		{
			System.out.printf("%d.%s ",i,searchArr[i]);
		}
		System.out.println();
		System.out.print("�˻��ϰ� ���� �׸��� �Է��ϼ��� > ");
		int searchNum = scan.nextInt();
		data.searchNumber = searchNum;
	}
	
	public void display(HashMap<Integer, Dto> map)
	{
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			System.out.println("key=" + key + " : " + value.toString());
		}
	}


	public void display(int searchNumber) {
		// TODO Auto-generated method stub
		switch(searchNumber)
		{
		case 1:
			System.out.print("�˻��ϰ� ���� �̸��� �Է��ϼ��� > ");
			String name = scan.next();
			Dto dto = new Dto();
			dto.setName(name);
			data.dto = dto;
			break;
			
		case 2:
			System.out.print("���� ���� ���� �̻��� �л��� �˻��ϰ� ������ ������ �Է��ϼ��� > ");
			int Korean = scan.nextInt();
			Dto dto2 = new Dto();
			dto2.setKorean(Korean);
			data.dto = dto2;
			break;
		case 3:
			System.out.print("���� ���� ���� �̻��� �л��� �˻��ϰ� ������ ������ �Է��ϼ��� > ");
			int English = scan.nextInt();
			Dto dto3 = new Dto();
			dto3.setEnglish(English);
			data.dto = dto3;
			break;
		case 4:
			System.out.print("���� ���� ���� �̻��� �л��� �˻��ϰ� ������ ������ �Է��ϼ��� > ");
			int Math = scan.nextInt();
			Dto dto4 = new Dto();
			dto4.setMath(Math);
			data.dto = dto4;
			break;
		case 5:
			System.out.print("��� ���� �̻��� �л��� �˻��ϰ� ������ ������ �Է��ϼ��� > ");
			double avg = scan.nextDouble();
			Dto dto5 = new Dto();
			dto5.setAvg(avg);
			data.dto = dto5;
			break;
		}
		
	}
	

}