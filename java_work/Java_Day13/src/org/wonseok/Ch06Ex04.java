package org.wonseok;

class MyException extends Exception
{
	public MyException() {
		// TODO Auto-generated constructor stub
		super("Myexception 예외 발생!!!");
	}
}


public class Ch06Ex04 {
	public static void test() throws Exception {
		throw new MyException();
	}
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
