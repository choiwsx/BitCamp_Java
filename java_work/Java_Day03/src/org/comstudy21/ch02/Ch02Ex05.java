package org.comstudy21.ch02;


import static java.lang.System.out;
import static org.comstudy21.ch02.Ch02Ex02.scan;


public class Ch02Ex05 {
	static int score;
	static int score1;
	static char grade;
	static char grade1;
	
	public static void main(String[] args) {
		/**
		 * 0~100사이의 점수는 실행.
		 * 그 외에는 에러이거나 다시 실행.
		 * A+ A A- 형식으로 점수가 표시되게 0,1,2 -  7,8,9 + 3,4,5,6 0
		 * 변수를 추가하거나 수정하는것은 자유
		 * 
		 * 매일 기본 과제: 1) 그날 배운거 정리해서 카페에 올리기.
		 * 			   2) 내일 배울 내용 예습하기.
		 */
		out.printf("점수 입력: ");
		score = scan.nextInt();
		
		
		grade = 'F';
		//1번째 방법.
		if(score>=0&&score<=100){
			if(score>=90)
			{
				grade = 'A';
			}
			else if(score>=80)
			{
				grade = 'B';
			}
			else if(score>=70)
			{
				grade = 'C';
			}
			else if(score>=60)
			{
				grade = 'D';
			}
			
			score1 = score % 10;
			if(score1>=7)
			{
				grade1 = '+';
			}
			else if(score1>=3)
			{
				grade1 = '0';
			}
			else{
				grade1= '-';
			}
			if(grade=='F')
				grade1='0';
			out.printf("%d점은 %c%c학점입니다",score,grade,grade1);
		}
		else
		{
			out.println("Error!");
			main(null);
		}
		
	
//		//2번째 방법.
//			if(score>100)
//			{
//				out.println("Error!");
//				main(null);
//			}
//			else if(score>=90)
//			{
//				grade = 'A';
//				score1 = score % 10;
//				if(score1>=7)
//				{
//					grade1 = '+';
//				}
//				else if(score1>=3)
//				{
//					grade1 = '0';
//				}
//				else{
//					grade1= '-';
//				}
//				out.printf("%d점은 %c%c학점입니다\n",score,grade,grade1);
//			}
//			else if(score>=80)
//			{
//				grade = 'B';
//				score1 = score % 10;
//				if(score1>=7)
//				{
//					grade1 = '+';
//				}
//				else if(score1>=3)
//				{
//					grade1 = '0';
//				}
//				else{
//					grade1= '-';
//				}
//				out.printf("%d점은 %c%c학점입니다\n",score,grade,grade1);
//			}
//			else if(score>=70)
//			{
//				grade = 'C';
//				score1 = score % 10;
//				if(score1>=7)
//				{
//					grade1 = '+';
//				}
//				else if(score1>=3)
//				{
//					grade1 = '0';
//				}
//				else{
//					grade1= '-';
//				}
//				out.printf("%d점은 %c%c학점입니다\n",score,grade,grade1);
//			}
//			else if(score>=60)
//			{
//				grade = 'D';
//				score1 = score % 10;
//				if(score1>=7)
//				{
//					grade1 = '+';
//				}
//				else if(score1>=3)
//				{
//					grade1 = '0';
//				}
//				else{
//					grade1= '-';
//				}
//				out.printf("%d점은 %c%c학점입니다\n",score,grade,grade1);
//				
//			}else if(score>=0&&score<60)
//			{
//				grade1 = '0';
//				out.printf("%d점은 %c%c학점입니다\n",score,grade,grade1);
//			}
//			else if(score<0)
//			{
//				out.println("Error!");
//				main(null);
//			}
		//3번째 방법.
//		if(score>=0&&score<=100){
//			if(score>=90)
//			{
//				grade = 'A';
//				if(score>=97) grade1 = '+';
//				else if(score>=93) grade1 = '0';
//				else grade1 = '-';
//			}
//			else if(score>=80)
//			{
//				grade = 'B';
//				if(score>=97) grade1 = '+';
//				else if(score>=93) grade1 = '0';
//				else grade1 = '-';
//
//			}
//			else if(score>=70)
//			{
//				grade = 'C';
//				if(score>=97) grade1 = '+';
//				else if(score>=93) grade1 = '0';
//				else grade1 = '-';
//
//			}
//			else if(score>=60)
//			{
//				grade = 'D';
//				if(score>=97) grade1 = '+';
//				else if(score>=93) grade1 = '0';
//				else grade1 = '-';
//			}
//			else
//			{
//				grade1 = '0';
//			}
//			
//			out.printf("%d점은 %c%c학점입니다",score,grade,grade1);
//		}
//		else
//		{
//			out.println("Error!");
//			main(null);
//		}
	
		
		
		
	}
}
