package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex06 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String name="";
		double Korean = 0 , English = 0 , Math = 0, avg = 0, sum = 0;
		out.print("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine();
		out.print("���� ������ �Է��ϼ��� : ");
		Korean = scan.nextDouble();
		out.print("���� ������ �Է��ϼ��� : ");
		English = scan.nextDouble();
		out.print("���� ������ �Է��ϼ��� : ");
		Math = scan.nextDouble();
		
		sum = Korean+English+Math;
		avg = sum/3.0;
		out.printf("%s�� ������ %.2f���̸�, ����� %.2f�� �Դϴ�. \n", name, sum, avg);
	}
}

//	out.println("----�ڱ�Ұ� �Է��ϱ�------");
//out.print("���̸� �Է��ϼ��� : ");
//age = scan.nextLine();
//out.print("��°��� �Է��ϼ��� : ");
//city = scan.nextLine();
//out.print("������ �Է��ϼ��� : ");
//major = scan.nextLine();
//out.print("������ �Է��ϼ��� : ");
//job = scan.nextLine();
//out.print("Ư�⸦ �Է��ϼ��� : ");
//specialty = scan.nextLine();
//out.print("Ű�� �Է��ϼ��� : ");
//height = scan.nextLine();
//out.print("�÷��� �Է��ϼ��� : ");
//eye = scan.nextLine();
//out.print("�������� �Է��ϼ��� : ");
//bloodType = scan.nextLine();
//out.print("�巡����� �Է��ϼ��� : ");
//future = scan.nextLine();
//
//
//out.println("===�ڱ�Ұ�===");
//out.printf("1. ���� : %s\n2. ���� : %d\n3. ��°� : %s\n4. ���� : %s\n5. ���� : %s\n6. Ư�� : %s\n7. Ű : %.2f\n8. �÷� : %.1f\n9. ������ : %s\n10. �巡��� : %s\n",
//			name,age,city,major,job,specialty,height,eye,bloodType,future);
//����, ����, ����, ���� ������ �Է¹޾Ƽ� ����, ����� ����ϴ� ���α׷�.
//�ڱ�Ұ��� ������ �Է� �޾Ƽ� ����ϱ�.
//String city="", major="", bloodType="",job="", specialty="", future="",age="",height="", eye=""; 
