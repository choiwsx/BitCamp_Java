import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args){
		//문자열+문자열 => 문자열
		//문자열+숫자 => 문자열
		final int testconst = 30;
		//testconst = 31;
		System.out.println("Hello "+ 365 +" java world");
		System.out.println(3+"");
		System.out.println(testconst);
		Scanner sc = new Scanner(System.in);
		int age;
		age = sc.nextInt();
		System.out.println(age);
		
		// 문자열과 문자는 다르다.
		// "이것은 문자열."
		// 'a', 'A', '5'
	}
}
