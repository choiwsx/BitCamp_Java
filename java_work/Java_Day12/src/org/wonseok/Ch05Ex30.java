package org.wonseok;

interface MyInterface
{
	// �������̽��� ����� �߻� �޼ҵ常�� ����� ���� �� �֝�.
	// java 8 �̻���ʹ� default �޼ҵ带 ����� ���� �� �ִ�.
	// java 9 �̻� ���ʹ� static �޼ҵ�� private �޼ҵ嵵 ����� ���� �� �ִ�.
	
//	public static final String name = "MyInterface";
	String name = "MyInterface";
	
	// public abstract�� ���� �Ǿ���.
	void showName();

}

interface MyInterface2
{
	void showData();
	
	
	
}

//�������̽��� impliments�� ��� �޴´�.
//�������̽��� ��� ������ �߻� �޼ҵ带 �ݵ�� ���� �ؾ� �Ѵ�.
//�������̽��� Ŭ������ ���� ����� �����ϴ�.
public class Ch05Ex30 implements MyInterface, MyInterface2{
	
	//�������̽��� �߻�޼ҵ带 ������ �Ҷ��� public ���� �����ڸ� �� ����ؾ��Ѵ�.
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
		// name static ����̹Ƿ� �ܺ� Ŭ�������� ���� �����ϴ�.
//		System.out.println(MyInterface.name);
		
		Ch05Ex30 obj = new Ch05Ex30();
		obj.showName();
		
		
		MyInterface mi = obj;
		MyInterface2 mi2 = obj;
		
		
		
	}
}
