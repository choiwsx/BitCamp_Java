package org.wonseok;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0 ;
		System.out.println("정수를 입력하세요.(마지막엔 -1을 입력하세요)");
		
		
		
		
		int n = scan.nextInt();
		
		while(n!=-1)
		{
			count++;
			sum += n;
			n = scan.nextInt();
		}
		if(count ==0)
			System.out.println("입력된 정수가 없습니다.");
		else
		{
			System.out.printf("정수의 개수는 %d개이며, 평균은 %.2f입니다.",count,(float)sum/count);
		}
		
		
		
	}
	public static void test(String[] args) {
		test:
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j==2)
					break test;
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
