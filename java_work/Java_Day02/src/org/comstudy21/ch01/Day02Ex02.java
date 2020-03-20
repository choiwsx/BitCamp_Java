package org.comstudy21.ch01;

//static import로 out 필드 객체 불러오기
//import 프로젝트 외부에 선언된 클래스나 객체를 불러온다.
import static java.lang.System.out;
import static java.lang.System.err;

public class Day02Ex02 {
	public static void main(String[] args) {
		err.printf("info: 만사형통하세융\n");
		System.out.println("--- 자기소개 ---");
		System.out.printf("1. 성명 : 최원석\n");
		System.out.printf("2. 나이 : %d\n", 29);
		System.out.println("3. 사는곳 : 경기도 광명시");
		System.out.printf("4. 전공 : %s\n","컴퓨터공학과");
		System.out.printf("5. 직업 : %s\n", "취업준비생" );
		System.out.printf("6. 특기 : %s\n", "오목");
		System.out.printf("7. 키 : %d\n", 178);
		System.out.printf("8. 시력 : %.1f, %.1f\n", 1.0, 0.8);
		System.out.printf("9. 혈액형: %s\n", "B");
		System.out.println("10. 장래희망 : 실력 있는 개발자 ");
		out.println("테스트");
 	}
}
