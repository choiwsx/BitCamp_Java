package java_day07;

import java.util.Arrays;

public class Ch03Ex26 {
	static int[][] arr = new int[5][5];
	static int count = 1;
	public static final int RIGHT =0;
	public static final int DOWN =1;
	public static final int LEFT =2;
	public static final int TOP =3;
	
	
	
	public static void printArr() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int number =1;
		int no = RIGHT;
		int i=0, j=0;
		int cnt =0;
		while(cnt<=25)
		{
//			arr[i][j] = number++;
			switch(no)
			{
			case RIGHT:
				arr[i][j++] = number++;
				if(j==5||arr[i][j]!=0)
				{
					no++;
					j--;
					i++;
				}
				break;
			case DOWN:
				arr[i++][j] = number++;
				if(i==5||arr[i][j]!=0)
				{
					no++;
					i--;
					j--;
				}
				break;
			case LEFT:
				arr[i][j--] = number++;
				if(j==-1||arr[i][j]!=0)
				{
					no++;
					j++;
					i--;
				}
				break;
			case TOP:
				arr[i--][j] = number++;
				if(arr[i][j]!=0)
				{
					no=RIGHT	;
					i++;
					j++;
				}
				break;
			}
//			no%=4;
			cnt++;
		}
		printArr();
	}
	
	
	public static void tt3(String[] args) {
		//case 1,2,3,4
		int row = 0;
		int col = 0;
		int temps = 0;
		int temp = 5;
		while(count<26)
		{
			
			for(int i = row; i<temp; i++)
			{
				arr[row][i] = count++;
				col = i;
			}
			row++;
			for(int i=row; i<temp; i++)
			{
				arr[i][col] =count++;
				row = i;
			}
			temp--;
			for(int i=temp-1; i>=temps; i--)
			{
				arr[row][i] = count++;
				col = i;
			}
			
			for(int i=temp-1; i>temps; i--)
			{
				arr[i][col] = count++;
				row = i;
			}
			temps++;
		}
		
		printArr();
		
		
	}
	
	
	
	
	public static void tt1(String[] args) {
		int temp = 5;
		int row = 0;
		int col = -1;
		int move = 1;
		while(true)
		{
			for(int i=0; i<temp; i++)
			{
				col += move;
				arr[row][col] = count++;
			}
			temp--;
			if(temp==0) break;
			for(int i=0; i<temp; i++)
			{
				row += move;
				arr[row][col] = count++;
			}
			move *= -1;
		}
		printArr();
		
	}
	
	
	// 과제5
	public static void tt2(String[] args) {
		int tempx = 5;
		boolean flag = true;
		for(int i=0; i<tempx; i++)
		{
			arr[0][i] = count++;
			if(i==tempx-1)
			{
				for(int j=1; j<tempx; j++)
				{
					arr[j][tempx-1] = count++;
					if(j==tempx-1)
					{
						for(int k=tempx-2; k>=0; k--)
						{
							arr[j][k] = count++;
							if(k==0)
							{
								for(int l=tempx-2; l>0; l--)
								{
									arr[l][k] = count++;
									if(l==1)
									{
										for(int m=1; m<=tempx-2; m++){
											arr[l][m] = count++;
											if(m==tempx-2)
											{
												for(int n=2; n<=tempx-2; n++)
												{
													arr[n][m] = count++;
													if(n==tempx-2)
													{
														for(int o=tempx-3; o>0; o--)
														{
															arr[n][o] =  count++;
															if(o==1){
																for(int p=tempx-3; p>1; p--)
																{
																	arr[p][o] = count++;
																	if(p==2)
																	{
																		for(int q=2; q<=tempx-3; q++)
																		{
																			arr[p][q] = count++;
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		printArr();
	}

	// 과제4
	public static void main2(String[] args) {
		int start = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 5 - start) {
					arr[i][j] = count++;
				}
			}
			start = i < 2 ? start + 1 : start - 1;
		}
		printArr();
	}

	// 과제3
	public static void home3(String[] args) {
		int start = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= start && j < 5 - start) {
					arr[j][i] = count++;
				}
			}
			start = i < 2 ? start + 1 : start - 1;
		}
		printArr();

	}

	// 과제2.
	public static void home2(String[] args) {
		int start = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= start && j < 5 - start) {
					arr[i][j] = count++;
				}
			}
			start = i < 2 ? start + 1 : start - 1;
		}
		printArr();
	}

	public static void test05(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 4 - i)
					arr[i][j] = count++;
			}
		}
		printArr();
	}

	public static void test04(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i)
					arr[i][j] = count++;
			}
		}
		printArr();
	}

	public static void test03(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				arr[i % 2 == 0 ? j : 4 - j][i] = count;
				count++;
			}
		}
		printArr();

	}

	public static void test2(String[] args) {
		int[][] arr = new int[5][5];

		int count = 1;

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = count;
					count++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void test1(String[] args) {
		int[][] arr = new int[5][5];

		int count = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void test01(String[] args) {
		int[][] arr = { { 90, 85, 95 }, { 95, 75, 95 }, { 90, 80, 70 }, { 80, 90, 60 }, { 95, 65, 85 } };

		// for(int i=0; i<arr.length; i++)
		// {
		//
		// }
		//

		// for(int[] ar : arr)
		// {
		//// System.out.println(Arrays.toString(ar));
		// for(int num : ar)
		// {
		// System.out.print(num+ " ");
		// }
		// System.out.println();
		// }

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
