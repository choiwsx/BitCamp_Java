package org.homework;

import java.util.Scanner;

public class Ch02homework {
	static Scanner scan = new Scanner(System.in);

	static void println(String message)
	{
		System.out.println(message);
	}
	static void print(String message)
	{
		System.out.print(message);
	}
	
	static void print(int number)
	{
		System.out.print(number);
	}
	
	public static void main(String[] args) {
		int a,b,c;
		int max,mid,min;
		
		// �Ű� ������ �μ� ����.
		
		print("���� �Է�1 : ");
		a = scan.nextInt();
		print("���� �Է�2 : ");
		b = scan.nextInt();
		print("���� �Է�3 : ");
		c = scan.nextInt();
	
		
		if(a>b)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		if(c>max)
		{
			mid = max;
			max = c;	 
		{
			if(c<min)
			{
				mid = min;
				min = c;
			}
			else
			{
				mid = c;
			}
		}
		System.out.printf("%d %d %d ",min,mid,max);
		
		
	}
	
	
	public static void test2(String[] args) {
		
		int cnt = 5;
		
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(j<cnt || j>=9-cnt?"*":" ");
				
			}
			cnt = i<4? cnt-1 : cnt+1;
			System.out.println();
		}
		
		
		
	}
	
	public static void test1(String[] args) {

		int ran = (int) (Math.random() * 50) + 1;
		//System.out.println(ran);
		int count = 5;
		System.out.println("------------------------------");
		System.out.println("\tGAME\t");
		System.out.println("------------------------------");

		System.out.println("���� ���ڰ� �����Ǿ����ϴ�.");

		int min = 0;
		int max = 51;
		int playernum = 0;
		char choice = 'a';
		while (count > -1) {
			System.out.printf("�÷��̾�, ���ڸ� ���纸����.(%d~%d) :", min+1, max-1);
			playernum = scan.nextInt();
			if (ran == playernum) {
				System.out.println(">>>�����Դϴ�!!");
				System.out.println("------------------");
				do {
					System.out.println();
					System.out.printf("����Ͻðڽ��ϱ�(y/n)?");
					scan.nextLine();
					choice = scan.next().charAt(0);
					if (choice == 'y') {
						main(null);
					}
					if (choice == 'n') {
						System.out.println("������ �����մϴ�.");
						System.exit(0);
					}
					System.out.printf("yȤ��n�� �Է����ּ���.");
				} while (choice != 'y' || choice != 'n');
			} else if (playernum < min+1 || playernum > max-1) {
				System.out.printf(">>> ������ �ʰ� �Ͽ����ϴ�. �ٽ� �Է��ϼ���.\n");
				continue;
			} else {
				if (ran > playernum) {
					System.out.printf(">>> %d�� �ʹ� ���� �����Դϴ�.\n", playernum);
					System.out.printf(">>> ��ȸ�� %d�� ���ҽ��ϴ�.\n", count);
					min = playernum;
				} else {
					System.out.printf(">>> %d�� �ʹ� ū �����Դϴ�.\n", playernum);
					System.out.printf(">>> ��ȸ�� %d�� ���ҽ��ϴ�.\n", count);
					max = playernum;
				}
				count--;
			}
		}
		// ���� �ʰ�
		System.out.println("------------------------------");
		System.out.println("��ȸ�� ��� ����Ͽ����ϴ�.");
		System.out.println("��ǻ�� ��.");

		do {
			System.out.println();
			System.out.printf("����Ͻðڽ��ϱ�(y/n)?");
			scan.nextLine();
			choice = scan.next().charAt(0);
			if (choice == 'y') {
				main(null);
			}
			if (choice == 'n') { 
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.printf("yȤ��n�� �Է����ּ���.");
		} while (choice != 'y' || choice != 'n');
	}
}

/**
 * �ָ�����4 ��������, ����ڰ� ������ Ƚ���ȿ� ���߱�
 * 
 */
// ���� ���� ���� �����ϱ�