package org.wonseok;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch03Ex35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 100;
		int div = 0;
		int _i;
		final int o3;
		// System.out.print("�������� �Է��Ͻÿ� > ");
		// idv = scan.nextInt();
		boolean tt = (3<5)? true:false;
		while (true) {	
			System.out.print("�������� �Է��Ͻÿ� > ");
			div = scan.nextInt();
			int res =0;
			try {
				res = 100/div;
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
				continue;
			}
			catch(InputMismatchException e){
				System.out.println("���ڰ��ƴ�");
				continue;
				//160-166 107-112
				//106
			}
			System.out.printf("100�� %d�� ���� ��->%d", div, num / div);
			break;
		}

	}
}
