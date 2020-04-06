package org.wonseok.access;

public class AccessSub extends AccessSuper{
	public void showAccessSuper()
	{
		printLine(60);
		//private 멤버는 서브 클래스에서도 접근 불가능
//		System.out.println("m_pri"+m_pri); 
		System.out.println("m_def"+m_def);
		System.out.println("m_pro"+m_pro);
		System.out.println("m_pub"+m_pub);
		printLine(60);
	}
	
	public void printLine(int size)
	{
		for(int i=0; i<size; i++) System.out.print("-");
		System.out.println();
	}
	private void mian() {
		// TODO Auto-generated method stub
//		showAccessSuper();
	}
}
