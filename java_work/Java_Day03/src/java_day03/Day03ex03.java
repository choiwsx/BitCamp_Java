package java_day03;

public class Day03ex03 {
	
	//함수 선언 한다.
	public static String output(String name, int age) {
		
		return "[2] 성명: "+name+", 나이: " +age;
	}
	
	public static void main(String[] args) {
		//static 멤버는 static 멤버만 접근 가능하다.
		System.out.println("메인함수...");
		//output("Kim",25);
		
		String result = output("Kim",25);
		System.out.println(result);
		
		
		
		System.out.println("프로그램 종료");
		
		
		String str = "Good";
		System.out.println(str.getBytes().length);
		System.out.println((char)0x12340041);
	}
}
