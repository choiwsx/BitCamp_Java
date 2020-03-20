package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex04 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double width=0, height=0; //지역변수 선언시 초기화 필수.
		
		
		out.printf("직사각형의 넓이를 구합니다\n"
				+ "가로 길이를 입력해주세요 :");	
		width = scan.nextDouble();
		out.printf("세로 길이를 입력해주세요 :");
		height = scan.nextDouble();
		
		out.printf("직사각형의 넓이는 %.2fcm^2입니다.", width * height);
		
	
		
	}
}

