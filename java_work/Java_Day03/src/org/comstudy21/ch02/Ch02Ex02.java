package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex02 {
	
	
	//��� �ʵ�
	static Scanner scan = new Scanner(System.in);
	
	
	//��� �޼ҵ�
	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� 80�� �̻��̸� Pass
		
//		int score = 0;
//		
//		while(true)
//		{
//			System.out.printf("������ �Է��ϼ��� : ");
//			score = scan.nextInt();
//			if(score==-1)
//			{
//				out.println("�ý�������");
//				break;
//			}
//			else if(score>=80)
//			{
//				out.println("pass");
//			}
//			else
//			{
//				out.println("Nonpass");
//			}
//		}
//		
		String score1 = "";
		
		while(true)
		{
			System.out.printf("������ �Է��ϼ���: ");
			score1 = scan.nextLine();
			if(score1.equals("end"))
			{
				out.println("�ý��� ����.");
				break;
			}
			int score1toint = Integer.parseInt(score1);
			if(score1toint>=80)
			{
				out.println("pass");
			}
			else
			{
				out.println("nonpass");
			}
			
			
		}
		
	}

}