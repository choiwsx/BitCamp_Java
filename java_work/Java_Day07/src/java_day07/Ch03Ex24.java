package java_day07;

import java.util.Random;
import java.util.Scanner;

public class Ch03Ex24 {
	
	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	
	
	public static void main(String[] args) {
	
		int sysNum = 가위 + random.nextInt(보);
		
		System.out.println(sysNum);
		System.out.printf("사용자 입력 (1:가위, 2:바위, 3:보) :");
		int userNum = scan.nextInt();
		while(!(userNum >= 가위 && userNum <= 보))
		{
			System.out.print("잘못 입력 하셨습니다. 다시 입력하세요!\n");
			System.out.printf("사용자 입력 : ");
			userNum = scan.nextInt();
		}
		if(userNum==sysNum)
		{
			System.out.println("결과 : 비겼습니다!");
		}
		switch(userNum)
		{
		case 가위:
			switch(sysNum){
			case 바위 : System.out.println("결과 : 사용자 패배"); break;
			case 보: System.out.println("결과 : 사용자 승리"); break;
			}
			break;
		case 바위:
			switch(sysNum){
			case 보 : System.out.println("결과 : 사용자 패배"); break;
			case 가위: System.out.println("결과 : 사용자 승리"); break;
			}
			break;
		case 보:
			switch(sysNum){
			case 가위 : System.out.println("결과 : 사용자 패배"); break;
			case 바위: System.out.println("결과 : 사용자 승리"); break;
			}
			
		
		
		}
	}
}
