package org.homework;

import java.util.Scanner;

public class pr {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean conti = true;

		while (conti) {

			int goal = (int) (Math.random() * 100) + 1; 
			int count = 3;
			int min = 1;
			int max = 100;
			boolean conti3 = true;

			System.out.println("���̷ο� ������ ���۵Ǿ����ϴ�.");
			System.out.printf("������ȸ�� �� %dȸ�Դϴ�.\n",count);  // ������� ���� �� �ʱ�ȭ�ϱ�

			while (count!=0) {

				System.out.printf("������ ������ %d~%d�����Դϴ�.", min, max); 
				System.out.println("������ �Է����ּ���.");
				int input = sc.nextInt();
				sc.nextLine();
				
				// ������� �Է¹޴� �κ�
												
				
			
				if (min <= input && input <= max) {	
					if (input == goal) {
						System.out.println("�����մϴ� �����Դϴ�.");
						count=0;
					} else {
						count--;
						if (count == 0) {
							System.out.printf("Ʋ�Ƚ��ϴ�.������ %d �����ϴ�.\n",goal);
							System.out.println("��ȸ�� ��� ����ϼ̽��ϴ�.");
							System.out.println("-----GAME OVER-----");
						} else {
							if (input > goal) {
								max = input - 1;
								System.out.println("����! �ʹ� ū �����Դϴ�.");
								System.out.printf("%d���� ��ȸ�� ���ҽ��ϴ�.\n", count);
							} else {
								min = input + 1;
								System.out.println("�ο�! �ʹ� ���� �����Դϴ�.");
								System.out.printf("%d���� ��ȸ�� ���ҽ��ϴ�.\n", count);
							}
						}

					}
				} else {
					System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");	}
					//������� ���ϴ� �κ�
			} // while 2����
			
			
			
			while (conti3) {
				String game;
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				System.out.println("��� �Ͻ÷��� y �ƴϸ� n�� �Է��Ͽ� �ֽʽÿ�");

				game = sc.nextLine();

				if (game.equalsIgnoreCase("y")) {
					conti = true;
					conti3 = false;
				} else {
					if (game.equalsIgnoreCase("n")) {
						conti = false;
						conti3 = false;
					} else {
						conti3 = true;
						System.out.println("�߸��� �Է��Դϴ�.");
					}

				}
			} // while3�� �κ� - ����Ұųİ� ����� �κ�

		} // while conti1�� ��

		System.out.println("�̿����ּż� �����մϴ�."); 


		}
	}