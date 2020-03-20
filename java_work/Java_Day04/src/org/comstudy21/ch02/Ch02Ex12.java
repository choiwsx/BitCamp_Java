package org.comstudy21.ch02;

public class Ch02Ex12 {
	static final int END = 10;

	
	public static void main(String[] args) {
		// 1+ 2+3+4+5+6+7+8+9+10=55
		// 1+2-3+4-5+6-7+8-9+10=7
		int total = 0;
		char c = '+';
		int temp = 0;
		for (int i = 1; i <= END; i++) {
			if(i<=2)
			{
				temp = i;
			}
			else{
				if (i % 2 == 1) {
					c = '-';
					temp = -i;
				} else {
					c = '+';
					temp = i;
				}
			}
			total += temp;
			if(i<=END-1){
				System.out.printf("%c%d", c, i);
			}else{
				System.out.printf("%c%d=%d", c, i, total);
			}
		}

	}

	public static void test(String[] args) {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.printf("%d ", i);
		}
		System.out.println();

		System.out.printf("total = %d", total);
	}
}
