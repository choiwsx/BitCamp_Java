package org.wonseok;

class �ҹ� {
	public void ����() {
		System.out.println("�ҹ� ����");
	}

}

class �ƹ� extends �ҹ� {

	 @Override
	public void ����() {
		System.out.println("�ƹ谡 ������ �д�~");
	}
}

class ���� extends �ƹ�
{
	@Override
	public void ����()
	{
		System.out.println("���ڰ� ������ �д礷��������");
	}
}


public class Ch04Ex100 {
	
	public static void main(String[] args) {
		�ҹ� a;
		a = new �ƹ�();
		a.����();
		System.out.println(a instanceof ����);
		a = new ����();
		a.����();
		
		// ��� Ŭ������ Object ���������� ��� �޴´�.
		Object obj = a;
		// �θ� Ŭ������ ������� ���� �ڼ��� ����� ȣ���� �� ����.
		// �ڼ����� ����ȯ �ϸ� ȣ�� �����ϴ�.
		((�ҹ�)obj).����();
		
		
	}
	
	public static void test(String[] args) {
		�ҹ� a = new �ƹ�();
		a.����();
		System.out.println(a instanceof ����);
		
	}
}