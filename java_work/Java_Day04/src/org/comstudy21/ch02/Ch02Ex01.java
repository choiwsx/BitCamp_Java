package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int age = 0;
		String result = "미성년자";
		String end = "";
//		System.out.printf("나이를 입력해주세요 :");
//		age = scan.nextInt();
//		//미성년자, 청년, 장년, 노년을 구분.
//		if(age>65)
//		{
//			result = "노년";
//		}
//		else if(age>40)
//		{
//			result = "장년";
//		}
//		else if(age>19)
//		{
//			result = "청년";
//		}
//		System.out.printf("%d세는 %s입니다.",age,result);
//		
		while(true)
		{
			System.out.printf("나이를 입력해주세요(종료를 원할시 end입력) > ");
			end = scan.nextLine();
			if(end.equals("end"))
			{
				System.out.println("시스템을 종료합니다.");
				break;
			}
			age = Integer.parseInt(end);
			if(age<0||age>150)
			{
				System.out.println("경고! 유효할 수 없는 나이입니다.");
				continue;			
			}
			if(age>65)
			{
				result = "노년";
			}
			else if(age>40)
			{
				result = "장년";
			}
			else if(age>19)
			{
				result = "청년";
			}else
			{
				result = "미성년자";
			}
			System.out.printf("%d세는 %s입니다.\n",age,result);
		}
		
		
		
	}
}
