package org.wonseok;

public class multipratice {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 2; i <= 9; i++) {

			System.out.printf("***%d***\t\t", i);

			cnt++;
			int stdan = 1;
			int edan = 1;
			if (i <= 7) {
				if (cnt > 3) {
					System.out.println();
					for (int dd = 1; dd <= 9; dd++) {
						if (i <= 4) {
							stdan = 1;
						} else if (i <= 7) {
							stdan = 4;
						}
						for (int k = 0; k < 3; k++) {
							cnt = 1;
							stdan++;
							System.out.printf("%d*%d=%d\t\t", stdan, edan, stdan * edan);
						}
						edan++;
						System.out.println();
					}
					System.out.println();
				}
			} else {
				if (cnt > 2) {
					System.out.println();
					for (int dd = 1; dd <= 9; dd++) {
						stdan = 7;
						for (int k = 0; k < 2; k++) {
							cnt = 1;
							stdan++;
							System.out.printf("%d*%d=%d\t\t", stdan, edan, stdan * edan);
						}
						edan++;
						System.out.println();
					}
					System.out.println();
				}
			}

		}
	}
}