package org.wonseok;

import java.util.Scanner;

public class mul {
	public static void main(String[] args) {
		//과제3
		//시작단 종료단 입력하기
		int startdan = 0;
		int enddan = 0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("시작단을 입력하세요. >");
		startdan = scan.nextInt();
		
		System.out.printf("종료단을 입력하세요. >");
		enddan = scan.nextInt();
		int temp = 0;
		if(startdan>enddan)
		{
			temp = startdan;
			startdan = enddan;
			enddan = temp;
		}
		
		for(int dan=startdan; dan<=enddan; dan+=3)
		{
			for(int i=0; i<3; i++)
			{
				if(dan+i<=enddan)
					System.out.printf("**%d**\t\t",dan+i);		
			}
			System.out.println();
			for(int cnt=1; cnt<=9; cnt++)
			{
				for(int k=0; k<3; k++)
				{
					if(dan+k<=enddan){
						System.out.printf("%d*%d=%d\t\t",dan+k, cnt ,(dan+k)*cnt);
					}
				}
				System.out.println();
			}
		}
		
		
		
	}
}
