package java_day07;

import java.util.Random;
import java.util.Scanner;

public class Ch03Ex24 {
	
	public static final int ���� = 1;
	public static final int ���� = 2;
	public static final int �� = 3;
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	
	
	public static void main(String[] args) {
	
		int sysNum = ���� + random.nextInt(��);
		
		System.out.println(sysNum);
		System.out.printf("����� �Է� (1:����, 2:����, 3:��) :");
		int userNum = scan.nextInt();
		while(!(userNum >= ���� && userNum <= ��))
		{
			System.out.print("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���!\n");
			System.out.printf("����� �Է� : ");
			userNum = scan.nextInt();
		}
		if(userNum==sysNum)
		{
			System.out.println("��� : �����ϴ�!");
		}
		switch(userNum)
		{
		case ����:
			switch(sysNum){
			case ���� : System.out.println("��� : ����� �й�"); break;
			case ��: System.out.println("��� : ����� �¸�"); break;
			}
			break;
		case ����:
			switch(sysNum){
			case �� : System.out.println("��� : ����� �й�"); break;
			case ����: System.out.println("��� : ����� �¸�"); break;
			}
			break;
		case ��:
			switch(sysNum){
			case ���� : System.out.println("��� : ����� �й�"); break;
			case ����: System.out.println("��� : ����� �¸�"); break;
			}
			
		
		
		}
	}
}