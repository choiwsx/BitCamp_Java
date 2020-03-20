package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex06 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String name="";
		double Korean = 0 , English = 0 , Math = 0, avg = 0, sum = 0;
		out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		out.print("국어 점수를 입력하세요 : ");
		Korean = scan.nextDouble();
		out.print("영어 점수를 입력하세요 : ");
		English = scan.nextDouble();
		out.print("수학 점수를 입력하세요 : ");
		Math = scan.nextDouble();
		
		sum = Korean+English+Math;
		avg = sum/3.0;
		out.printf("%s의 총점은 %.2f점이며, 평균은 %.2f점 입니다. \n", name, sum, avg);
	}
}

//	out.println("----자기소개 입력하기------");
//out.print("나이를 입력하세요 : ");
//age = scan.nextLine();
//out.print("사는곳을 입력하세요 : ");
//city = scan.nextLine();
//out.print("전공을 입력하세요 : ");
//major = scan.nextLine();
//out.print("직업를 입력하세요 : ");
//job = scan.nextLine();
//out.print("특기를 입력하세요 : ");
//specialty = scan.nextLine();
//out.print("키를 입력하세요 : ");
//height = scan.nextLine();
//out.print("시력을 입력하세요 : ");
//eye = scan.nextLine();
//out.print("혈액형을 입력하세요 : ");
//bloodType = scan.nextLine();
//out.print("장래희망을 입력하세요 : ");
//future = scan.nextLine();
//
//
//out.println("===자기소개===");
//out.printf("1. 성명 : %s\n2. 나이 : %d\n3. 사는곳 : %s\n4. 전공 : %s\n5. 직업 : %s\n6. 특기 : %s\n7. 키 : %.2f\n8. 시력 : %.1f\n9. 혈액형 : %s\n10. 장래희망 : %s\n",
//			name,age,city,major,job,specialty,height,eye,bloodType,future);
//성명, 국어, 영어, 수학 점수를 입력받아서 총점, 평균을 출력하는 프로그램.
//자기소개를 데이터 입력 받아서 출력하기.
//String city="", major="", bloodType="",job="", specialty="", future="",age="",height="", eye=""; 
