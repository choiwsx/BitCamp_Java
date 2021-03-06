package org.comstudy21.ch02;

public class Ch02Ex03 {

	public static void main(String[] args) {
		// Math 클래스 : 수학적 연산을 지원한다.
//		파이 상수 : Math.PI
//		E 상수 : Math.E
		
		/**
		 * 승수 : Math.Pow(number1, number2)
		 * 제곱근 : Math.sqrt(number)
		 * 최대값 : Math.max(number1, number2)
		 * 최소값 : Math.min(number1, number2)
		 * 난수값 : Math.random()
		 * 절대값 : Math.abs(number)
		 * Math.ceil(), Math.sin(), Math.cos(), Math.floor() ...
		 */
		
		
		//random 함수는 static 멤버(클래스멤버) 이므로
		//클래스 이름으로 바로 접근 가능하다.
		int ran = (int)(Math.random()*100)+1;
		System.out.println(ran);
	
	
	
	}

}
