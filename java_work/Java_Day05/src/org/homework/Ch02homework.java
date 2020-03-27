package org.homework;

import java.util.Scanner;

public class Ch02homework {
	static Scanner scan = new Scanner(System.in);

	static void println(String message)
	{
		System.out.println(message);
	}
	static void print(String message)
	{
		System.out.print(message);
	}
	
	static void print(int number)
	{
		System.out.print(number);
	}
	
	public static void main(String[] args) {
		int a,b,c;
		int max,mid,min;
		
		// 매개 변수로 인수 전달.
		
		print("정수 입력1 : ");
		a = scan.nextInt();
		print("정수 입력2 : ");
		b = scan.nextInt();
		print("정수 입력3 : ");
		c = scan.nextInt();
	
		
		if(a>b)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		if(c>max)
		{
			mid = max;
			max = c;	 
		{
			if(c<min)
			{
				mid = min;
				min = c;
			}
			else
			{
				mid = c;
			}
		}
		System.out.printf("%d %d %d ",min,mid,max);
		
		
	}
	
	
	public static void test2(String[] args) {
		
		int cnt = 5;
		
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(j<cnt || j>=9-cnt?"*":" ");
				
			}
			cnt = i<4? cnt-1 : cnt+1;
			System.out.println();
		}
		
		
		
	}
	
	public static void test1(String[] args) {

		int ran = (int) (Math.random() * 50) + 1;
		//System.out.println(ran);
		int count = 5;
		System.out.println("------------------------------");
		System.out.println("\tGAME\t");
		System.out.println("------------------------------");

		System.out.println("랜덤 숫자가 생성되었습니다.");

		int min = 0;
		int max = 51;
		int playernum = 0;
		char choice = 'a';
		while (count > -1) {
			System.out.printf("플레이어, 숫자를 맞춰보세요.(%d~%d) :", min+1, max-1);
			playernum = scan.nextInt();
			if (ran == playernum) {
				System.out.println(">>>정답입니다!!");
				System.out.println("------------------");
				do {
					System.out.println();
					System.out.printf("계속하시겠습니까(y/n)?");
					scan.nextLine();
					choice = scan.next().charAt(0);
					if (choice == 'y') {
						main(null);
					}
					if (choice == 'n') {
						System.out.println("게임을 종료합니다.");
						System.exit(0);
					}
					System.out.printf("y혹은n만 입력해주세요.");
				} while (choice != 'y' || choice != 'n');
			} else if (playernum < min+1 || playernum > max-1) {
				System.out.printf(">>> 범위를 초과 하였습니다. 다시 입력하세요.\n");
				continue;
			} else {
				if (ran > playernum) {
					System.out.printf(">>> %d은 너무 작은 숫자입니다.\n", playernum);
					System.out.printf(">>> 기회가 %d번 남았습니다.\n", count);
					min = playernum;
				} else {
					System.out.printf(">>> %d은 너무 큰 숫자입니다.\n", playernum);
					System.out.printf(">>> 기회가 %d번 남았습니다.\n", count);
					max = playernum;
				}
				count--;
			}
		}
		// 범위 초과
		System.out.println("------------------------------");
		System.out.println("기회를 모두 사용하였습니다.");
		System.out.println("컴퓨터 승.");

		do {
			System.out.println();
			System.out.printf("계속하시겠습니까(y/n)?");
			scan.nextLine();
			choice = scan.next().charAt(0);
			if (choice == 'y') {
				main(null);
			}
			if (choice == 'n') { 
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.printf("y혹은n만 입력해주세요.");
		} while (choice != 'y' || choice != 'n');
	}
}

/**
 * 주말과제4 난수생성, 사용자가 정해진 횟수안에 맞추기
 * 
 */
// 높다 낮다 게임 구현하기