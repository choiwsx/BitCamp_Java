package org.homework;

import java.util.Scanner;

public class Ch02homework {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

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