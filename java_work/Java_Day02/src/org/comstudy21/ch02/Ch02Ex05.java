package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex05 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			
		double area=0; //원의 면적.
		final double pi = 3.141592; // 원주율 상수.
		double r=0; // 원의 반지름.
		double line=0; //원의 둘레
		
		//원의 반지름을 입력받아서 둘레의 길이와 면적을 출력하는 프로그램.
		
		out.print("원의 반지름을 입력하세요 : ");
		r = scan.nextDouble();
		
		area = pi * r * r;
		line = pi * r * 2;
		out.printf("반지름이 %.1f 인 원의 면적은 : %.2fcm^2이며, 원의 둘레는 : %.2fcm입니다.", 
				r, area, line);
		
	}
}

