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
		// System.out.print("나눗수를 입력하시오 > ");
		// idv = scan.nextInt();
		boolean tt = (3<5)? true:false;
		while (true) {	
			System.out.print("나눌수를 입력하시오 > ");
			div = scan.nextInt();
			int res =0;
			try {
				res = 100/div;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
				continue;
			}
			catch(InputMismatchException e){
				System.out.println("숫자가아님");
				continue;
				//160-166 107-112
				//106
			}
			System.out.printf("100을 %d로 나눈 몫->%d", div, num / div);
			break;
		}

	}
}
