package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex11 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int score = 0;
		String grade = "F";

		System.out.printf("성적 입력 : ");
		score = scan.nextInt();

		while (!(score >= 0 && score <= 100)) {
			System.out.println("유효하지 않은 점수를 입력하였습니다.!");
			System.out.printf("성적 입력 : ");
			score = scan.nextInt();
		}
		// 정수와 정수를 연산하면 결과 타입은 정수형이다.
		switch (score / 10) {
		case 10:
		case 9: {
			grade = "A";
			break;
		}
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;

		default:
			grade = "F";

		}
		// A+, A-, A 형식으로 만들어본다.
//		if (!grade.equals("F")) {
//			switch (score % 10) {
//			case 9:
//			case 8:
//			case 7:
//				grade += "+";
//				break;
//			case 2:
//			case 1:
//			case 0:
//				grade += "-";
//			}
//			if (score == 100) {
//				grade = "A+";
//			}
//		}
		
		switch(score/10)
		{
		case 10: grade += "+"; break;
		case 9: case 8: case 7: case 6:
			switch(score%10)
			{
			case 9: case 8: case 7:
				grade += "+"; break;
			case 0: case 1: case 2:
				grade +="-"; 
			}
		
		}

		System.out.printf("%d점은 %s학점입니다.\n", score, grade);

	}
}
