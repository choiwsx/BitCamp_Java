package org.homework;

import java.util.Scanner;

public class pr {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean conti = true;

		while (conti) {

			int goal = (int) (Math.random() * 100) + 1; 
			int count = 3;
			int min = 1;
			int max = 100;
			boolean conti3 = true;

			System.out.println("하이로우 게임이 시작되었습니다.");
			System.out.printf("도전기회는 총 %d회입니다.\n",count);  // 여기까지 셋팅 및 초기화하기

			while (count!=0) {

				System.out.printf("숫자의 범위는 %d~%d사이입니다.", min, max); 
				System.out.println("정답을 입력해주세요.");
				int input = sc.nextInt();
				sc.nextLine();
				
				// 여기까지 입력받는 부분
												
				
			
				if (min <= input && input <= max) {	
					if (input == goal) {
						System.out.println("축하합니다 정답입니다.");
						count=0;
					} else {
						count--;
						if (count == 0) {
							System.out.printf("틀렸습니다.정답은 %d 였습니다.\n",goal);
							System.out.println("기회를 모두 사용하셨습니다.");
							System.out.println("-----GAME OVER-----");
						} else {
							if (input > goal) {
								max = input - 1;
								System.out.println("하이! 너무 큰 숫자입니다.");
								System.out.printf("%d번의 기회가 남았습니다.\n", count);
							} else {
								min = input + 1;
								System.out.println("로우! 너무 작은 숫자입니다.");
								System.out.printf("%d번의 기회가 남았습니다.\n", count);
							}
						}

					}
				} else {
					System.out.println("잘못된 범위를 입력하셨습니다.");	}
					//여기까지 평가하는 부분
			} // while 2번끝
			
			
			
			while (conti3) {
				String game;
				System.out.println("게임을 종료하시겠습니까?");
				System.out.println("계속 하시려면 y 아니면 n를 입력하여 주십시오");

				game = sc.nextLine();

				if (game.equalsIgnoreCase("y")) {
					conti = true;
					conti3 = false;
				} else {
					if (game.equalsIgnoreCase("n")) {
						conti = false;
						conti3 = false;
					} else {
						conti3 = true;
						System.out.println("잘못된 입력입니다.");
					}

				}
			} // while3끝 부분 - 계속할거냐고 물어보는 부분

		} // while conti1번 끝

		System.out.println("이용해주셔서 감사합니다."); 


		}
	}
