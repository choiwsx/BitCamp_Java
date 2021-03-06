package org.wonseok;

class 할배 {
	public void 나팔() {
		System.out.println("할배 나팔");
	}

}

class 아배 extends 할배 {

	 @Override
	public void 나팔() {
		System.out.println("아배가 나팔을 분다~");
	}
}

class 손자 extends 아배
{
	@Override
	public void 나팔()
	{
		System.out.println("손자가 나팔을 분당ㅇㅇㅇㅇㅇ");
	}
}


public class Ch04Ex100 {
	
	public static void main(String[] args) {
		할배 a;
		a = new 아배();
		a.나팔();
		System.out.println(a instanceof 손자);
		a = new 손자();
		a.나팔();
		
		// 모든 클래스는 Object 묵시적으로 상속 받는다.
		Object obj = a;
		// 부모 클래스에 선언되지 않은 자손의 멤버는 호출할 수 없다.
		// 자손으로 형변환 하면 호출 가능하다.
		((할배)obj).나팔();
		
		
	}
	
	public static void test(String[] args) {
		할배 a = new 아배();
		a.나팔();
		System.out.println(a instanceof 손자);
		
	}
}
