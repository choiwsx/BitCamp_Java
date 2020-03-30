package org.wonseok;

//���� ��Ű�� ������ ���� ����.
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
	
///��� Ŭ������ Object Ŭ������ ���������� ��� �޴´�.
//����� �Ǹ� �θ� Ŭ������ ����� ������(Override) �����ϴ�. 
//toString() �޼ҵ� ������
//��ü�� ����Ҷ� �ڵ����� ȣ��ȴ�.
//	@Override
//	public String toString() {
//
//		return "x="+x+" y="+y;
//	}
	
	//��Ŭ������ �ڵ�ȭ ���
	
}



public class Ch04Ex01 {
	public static void main(String[] args) {
		//���� ������ �����Ѵ�.
		//Ŭ������ ����� ���� �ڷ���(Ÿ��)�̴�.
		//Ŭ������ ������ ������ ����(reference) �����̴�.
		//������������ ��ü�� �ּҰ� ����. ����� Ÿ���� ��ü �ּҸ�.
		Point pt01;
		//��ü�� �����ؼ� ���������� �ּ�(���� ��)�� �ѱ��.
		pt01 = new Point();
		//new ������ ����ϸ� �� ������ �Ҵ�.
		
		
		//���������� ���ؼ� ��ü���� ����� �����Ѵ�.
		//������� ������: ��(.)
		pt01.x = 10;
		pt01.y = 20;
		System.out.println(pt01.x+" "+pt01.y);
		pt01.swap(pt01.x, pt01.y);
		System.out.println(pt01.x+" "+pt01.y);
		
		System.out.println(pt01);
	}
}