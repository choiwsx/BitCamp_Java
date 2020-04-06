package org.wonseok;

interface MyInterface
{
	// 인터페이스는 상수와 추상 메소드만을 멤버로 가질 수 있앋.
	// java 8 이상부터는 default 메소드를 멤버로 가질 수 있다.
	// java 9 이상 부터는 static 메소드와 private 메소드도 멤버로 가질 수 있다.
	
//	public static final String name = "MyInterface";
	String name = "MyInterface";
	
	// public abstract가 생략 되었다.
	void showName();

}

interface MyInterface2
{
	void showData();
	
	
	
}

//인터페이스는 impliments로 상속 받는다.
//인터페이스를 상속 받으면 추상 메소드를 반드시 구현 해야 한다.
//인터페이스는 클래스로 다중 상속이 가능하다.
public class Ch05Ex30 implements MyInterface, MyInterface2{
	
	//인터페이스에 추상메소드를 구현을 할때는 public 접근 지정자를 꼭 사용해야한다.
	@Override
	public void showName()
	{
		System.out.println("name=> "+name);
	}
	
	@Override
	public void showData()
	{
		System.out.println("showData");
	}
	
	public static void main(String[] args) {
		// name static 멤버이므로 외부 클래스에서 접근 가능하다.
//		System.out.println(MyInterface.name);
		
		Ch05Ex30 obj = new Ch05Ex30();
		obj.showName();
		
		
		MyInterface mi = obj;
		MyInterface2 mi2 = obj;
		
		
		
	}
}
