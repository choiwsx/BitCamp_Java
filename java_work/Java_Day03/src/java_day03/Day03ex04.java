package java_day03;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Day03ex04 {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan =	new Scanner(new FileInputStream(new File("test.txt")));
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		
	}
	
	
	public static void test2(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성명 입력: ");
		String name = scan.next();
		scan.nextLine();
		System.out.print("주소 입력: ");
		// newxtLine() 공백 입력 가능.
		String addr = scan.nextLine();
		
		
		
		
		System.out.println("주소: " +addr);
		System.out.println("성명: "+name);
	}
	public static void test(String[] args) {
		
		Scanner scanner = new Scanner("500 hello true korea 3.14");
		
		while(scanner.hasNext())
		{
			
			System.out.println(scanner.next());
			
		}
	
	
		
	
	
	}
}
