package java_day03;

public class Day03ex03 {
	
	//�Լ� ���� �Ѵ�.
	public static String output(String name, int age) {
		
		return "[2] ����: "+name+", ����: " +age;
	}
	
	public static void main(String[] args) {
		//static ����� static ����� ���� �����ϴ�.
		System.out.println("�����Լ�...");
		//output("Kim",25);
		
		String result = output("Kim",25);
		System.out.println(result);
		
		
		
		System.out.println("���α׷� ����");
		
		
		String str = "Good";
		System.out.println(str.getBytes().length);
		System.out.println((char)0x12340041);
	}
}