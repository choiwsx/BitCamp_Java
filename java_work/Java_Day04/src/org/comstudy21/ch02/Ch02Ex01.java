package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int age = 0;
		String result = "�̼�����";
		String end = "";
//		System.out.printf("���̸� �Է����ּ��� :");
//		age = scan.nextInt();
//		//�̼�����, û��, ���, ����� ����.
//		if(age>65)
//		{
//			result = "���";
//		}
//		else if(age>40)
//		{
//			result = "���";
//		}
//		else if(age>19)
//		{
//			result = "û��";
//		}
//		System.out.printf("%d���� %s�Դϴ�.",age,result);
//		
		while(true)
		{
			System.out.printf("���̸� �Է����ּ���(���Ḧ ���ҽ� end�Է�) > ");
			end = scan.nextLine();
			if(end.equals("end"))
			{
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			age = Integer.parseInt(end);
			if(age<0||age>150)
			{
				System.out.println("���! ��ȿ�� �� ���� �����Դϴ�.");
				continue;			
			}
			if(age>65)
			{
				result = "���";
			}
			else if(age>40)
			{
				result = "���";
			}
			else if(age>19)
			{
				result = "û��";
			}else
			{
				result = "�̼�����";
			}
			System.out.printf("%d���� %s�Դϴ�.\n",age,result);
		}
		
		
		
	}
}