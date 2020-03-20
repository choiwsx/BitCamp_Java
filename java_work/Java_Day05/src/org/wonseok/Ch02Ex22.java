package org.wonseok;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex22 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 2; i <= 9; i++) {

			System.out.printf("***%d***\t\t", i);

			cnt++;
			int stdan = 1;
			int edan = 1;
			if (i <= 4) {
				if (cnt > 3) {
					System.out.println();
					for (int dd = 1; dd <= 9; dd++) {
						for (int k = 0; k < 3; k++) {
							cnt = 1;
							stdan++;
							System.out.printf("%d*%d=%d\t\t", stdan, edan, stdan * edan);
						}
						stdan = 1;
						edan++;
						System.out.println();
					}
					System.out.println();
				}
			} else if (i <= 7) {
				stdan = 4;
				if (cnt > 3) {
					System.out.println();
					for (int dd = 1; dd <= 9; dd++) {
						for (int k = 0; k < 3; k++) {
							cnt = 1;
							stdan++;
							System.out.printf("%d*%d=%d\t\t", stdan, edan, stdan * edan);
						}
						stdan = 4;
						edan++;
						System.out.println();
					}
					System.out.println();
				}
			} else {
				stdan = 7;
				if (cnt > 2) {
					System.out.println();
					for (int dd = 1; dd <= 9; dd++) {
						for (int k = 0; k < 2; k++) {
							cnt = 1;
							stdan++;
							System.out.printf("%d*%d=%d\t\t", stdan, edan, stdan * edan);
						}
						stdan = 7;
						edan++;
						System.out.println();
					}
					System.out.println();
				}
			}
		}

	}

	
}
