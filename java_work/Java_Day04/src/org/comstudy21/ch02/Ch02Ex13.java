package org.comstudy21.ch02;

public class Ch02Ex13 {

	public static void main(String[] args) {
		// for(int i=0; i<5; i++)
		// {
		// for(int j=0; j<4-i + i*2+1; j++)
		// {
		// System.out.printf(j<4-i?" ":"*");
		// }
		//
		// System.out.println();
		// }
		//
		// for(int i=0; i<5; i++)
		// {
		// for(int j=0; j<i; j++)
		// {
		// System.out.print(" ");
		// }
		// for(int j=0; j<(5-i)*2-1; j++)
		// {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		//
		// int cnt =1;
		// for(int i=0; i<9; i++)
		// {
		//// System.out.println(cnt);
		// for(int j=0; j<5-cnt; j++)
		// {
		// System.out.printf(" ");
		// }
		// for(int j=0; j<cnt*2-1; j++)
		// {
		// System.out.printf("*");
		// }
		// cnt = i < 4 ? cnt+1 : cnt-1;
		// System.out.println();
		// }
		//
		
		//�ָ� ����1
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 5 - cnt || j > 3 + cnt)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			cnt = i < 4 ? cnt + 1 : cnt - 1;
			System.out.println();
		}

	}

	public static void test13(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		int total = 0;
		final int END = 8;

		for (int i = 1; i <= END; i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			total += num3;
			System.out.print((i < END) ? num3 + "+" : num3);
		}
		System.out.print("=" + total);
	}

	public static void test8(String[] args) {
		int end = 4;
		final int maxline = 9;
		int mid = 9 / 2;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (mid - i <= j && mid + i >= j) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (mid - end <= j && j <= mid + end) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			end = end - 1;
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		int start = 0;
		for (int i = 0; i < maxline; i++) {
			for (int j = 0; j < maxline; j++) {
				if (!(i == mid)) {
					if (mid - start <= j && j <= mid + start) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				} else {
					System.out.printf("*");
				}

			}
			if (i < mid) {
				start = start + 1;
			} else {
				start = start - 1;
			}
			System.out.println();
		}
	}

	public static void test9(String[] args) {

		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		int num = 1;
		int num2 = 1;
		int temp = 1;
		int result = 0;
		for (int i = 0; i < 8; i++) {
			if (i <= 1) {
				if (i == 0)
					System.out.printf("%d+", num);
				if (i == 1)
					System.out.printf("%d", num2);
				result = num + num2;
			} else {
				temp = num + num2;
				System.out.printf("+%d", temp);
				num = num2;
				num2 = temp;
				result += temp;
			}
		}
		System.out.printf("=%d", result);

		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		// int minustmp = 0;
		// for(int i=0; i<8; i++)
		// {
		// if(i<=1)
		// {
		// if(i==0)
		// System.out.printf("%d", num);
		// if(i==1)
		// System.out.printf("+%d",num2);
		// result = num + num2;
		// }
		// else
		// {
		// temp = num + num2;
		// if(i%2==0){
		// minustmp = temp * -1;
		// System.out.printf("%d", minustmp);
		// result = result + minustmp;
		// }else{
		// result += temp;
		// System.out.printf("+%d", temp);
		// }
		// num = num2;
		// num2 = temp;
		//
		// }
		// }
		// System.out.printf("=%d",result);
		//
		//

	}

	public static void test6(String[] args) {

		final int ml = 9;
		int start = 4;
		int mid = ml / 2;
		for (int i = 0; i < ml; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < start) {
					System.out.printf("^");
				} else {
					System.out.printf("*");
				}
			}
			start = (i < 4) ? start - 1 : start + 1;
			System.out.println();
		}

		System.out.println("--------------------");
		for (int i = 0; i < ml; i++) {
			for (int j = 0; j <= mid; j++) {
				if (i < mid) {
					if (j >= mid - i) {
						System.out.printf("*");
					} else {
						System.out.printf("^");
					}
				} else if (i == mid) {
					System.out.printf("*");
				} else {
					if (j >= i - mid) {
						System.out.printf("*");
					} else {
						System.out.printf("^");
					}
				}

			}
			System.out.println();
		}

	}

	public static void test5(String[] args) {
		// final int maxl = 9;
		// int mid = maxl /2;
		//
		// for(int i=0; i<maxl; i++)
		// {
		// for(int j=0; j<=mid; j++)
		// {
		// if(i<mid)
		// {
		// if(j<=i)
		// System.out.printf("*");
		// }
		// if(i==mid)
		// System.out.print("*");
		// if(i>mid)
		// {
		// if(j<maxl-i)
		// System.out.printf("*");
		// }
		//
		// }
		// System.out.println();
		// }
		int end = 1;
		for (int i = 0; i < 9; i++) {
			// System.out.println(end);
			for (int j = 0; j < end; j++) {
				System.out.printf("*");
			}
			System.out.println();
			end = (i < 4) ? end + 1 : end - 1;
		}

	}

	public static void test4(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}

			}
			System.out.println();
		}

	}

	public static void test3(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i) {
					System.out.printf("^");
				} else {
					System.out.printf("*");
				}

			}
			System.out.println();
		}

		//
		// for(int i=0; i<5; i++)
		// {
		// for(int j=0; j<4-i; j++)
		// {
		// System.out.printf("^");
		// }
		// for(int j=0; j<i+1; j++)
		// {
		// System.out.printf("*");
		// }
		// System.out.println();
		// }
		//
		//

	}

	public static void test2(String[] args) {
		final int ml = 9;
		int mid = ml / 2;
		for (int i = 0; i < ml; i++) {
			for (int j = 0; j < ml; j++) {
				if (i < mid) {
					if (mid - i <= j && mid + i >= j) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
				if (i == mid) {
					System.out.printf("*");
				}
				if (i > mid) {
					if (i - mid <= j && ml - (i - mid) > j) {
						System.out.printf("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

	}

	public static void test(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
