package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex02 {
	
	
	//멤버 필드
	static Scanner scan = new Scanner(System.in);
	
	
	//멤버 메소드
	public static void main(String[] args) {
		// 성적을 입력 받아서 80점 이상이면 Pass
		
//		int score = 0;
//		
//		while(true)
//		{
//			System.out.printf("성적을 입력하세요 : ");
//			score = scan.nextInt();
//			if(score==-1)
//			{
//				out.println("시스템종료");
//				break;
//			}
//			else if(score>=80)
//			{
//				out.println("pass");
//			}
//			else
//			{
//				out.println("Nonpass");
//			}
//		}
//		
		String score1 = "";
		
		while(true)
		{
			System.out.printf("성적을 입력하세요: ");
			score1 = scan.nextLine();
			if(score1.equals("end"))
			{
				out.println("시스템 종료.");
				break;
			}
			int score1toint = Integer.parseInt(score1);
			if(score1toint>=80)
			{
				out.println("pass");
			}
			else
			{
				out.println("nonpass");
			}
			
			
		}
		
	}

}
