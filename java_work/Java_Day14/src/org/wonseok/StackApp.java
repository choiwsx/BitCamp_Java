package org.wonseok;

public interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val)
	{
		return false;
	}

}


class StringStack implements Stack
{

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class StackApp {
	public static void main(String[] args) {
		StringStack stack = new StringStack(3);
		stack.push("hello");
		stack.push("sunny");
		stack.push("smile");
		stack.psuh("happy");
		while(push.length())>0){
		{
			
		}
	}

}
