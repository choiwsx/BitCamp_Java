package org.wonseok;

interface �达����
{

	void �达��������();
}

interface �ھ�����
{
	void �ھ���������();
}

abstract class ȫ������
{
	abstract void ȫ����������();
}

class ȫ�浿 extends ȫ������ implements �达����, �ھ�����
{
	public void ȫ����������()
	{
		System.out.println("ȫ������ ���� ����");
	}
	public void �达��������()
	{
		System.out.println("�达���� ���� ����");
	}
	public void �ھ���������()
	{
		System.out.println("�ھ����� ���� ����");
	}
}



public class Ch05Ex31 {
	public static void main(String[] args) {
		ȫ������ hong = new ȫ�浿();
		if(hong instanceof ȫ������)
			hong.ȫ����������();
		
		if(hong instanceof �达����)
			((�达����)hong).�达��������();
		
		if(hong instanceof �ھ�����)
			hong.�ھ���������();
		
	}
}