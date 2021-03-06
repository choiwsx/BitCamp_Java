package org.wonseok;

//같은 패키지 내에서 접근 가능.
class Point{
	int x;
	int y;
	
	void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
///모든 클래스는 Object 클래스를 묵시적으로 상속 받는다.
//상속이 되면 부모 클래스의 멤버를 재정의(Override) 가능하다. 
//toString() 메소드 재정의
//객체를 사용할때 자동으로 호출된다.
//	@Override
//	public String toString() {
//
//		return "x="+x+" y="+y;
//	}
	
	//이클립스의 자동화 기능
	
}



public class Ch04Ex01 {
	public static void main(String[] args) {
		//참조 변수를 선언한다.
		//클래스는 사용자 정의 자료형(타입)이다.
		//클래스로 선언한 변수는 참조(reference) 변수이다.
		//참조변수에는 객체의 주소가 들어간다. 선언된 타입의 객체 주소만.
		Point pt01;
		//객체를 생성해서 참조변수에 주소(참조 값)를 넘긴다.
		pt01 = new Point();
		//new 연산자 사용하면 힙 영역에 할당.
		
		
		//참조변수를 통해서 객체내의 멤버를 접근한다.
		//멤버접근 연산자: 점(.)
		pt01.x = 10;
		pt01.y = 20;
		System.out.println(pt01.x+" "+pt01.y);
		pt01.swap(pt01.x, pt01.y);
		System.out.println(pt01.x+" "+pt01.y);
		
		System.out.println(pt01);
	}
}
