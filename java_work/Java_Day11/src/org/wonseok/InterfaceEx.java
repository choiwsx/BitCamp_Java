package org.wonseok;


interface PhoneInterface{
	final int TIMEOUT = 1000;
	void sendCall();
	void receiveCall();


	default void printLogo()
	{
		System.out.println("** phone **");
		
	}
}

interface MobilePhoneInterface extends PhoneInterface
{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface
{
	public void play();
	public void stop();
}


class PDA
{
	public int calculate(int x, int y)
	{
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
	@Override
	public void sendCall()
	{
		System.out.println("������~~������~~");
	}
	@Override
	public void receiveCall()
	{
		System.out.println("��ȭ �Ծ��.");
	}
	@Override
	public void sendSMS()
	{
		System.out.println("���ڰ��ϴ�.");
	}
	@Override
	public void receiveSMS()
	{
		System.out.println("���ڿԾ��.");
	}
	
	//MP3 Interface
	@Override
	public void play()
	{
		System.out.println("���� ����");
	}
	@Override
	public void stop()
	{
		System.out.println("���� �ߴ��մϴ�.");
	}
	
	public void schedule()
	{
		System.out.println("���� �����մϴ�.");
	}
	
}



class SamsungPhone implements PhoneInterface
{
	@Override
	public void sendCall()
	{
		System.out.println("�츮����");
	}
	
	@Override
	public void receiveCall()
	{
		System.out.println("��ȭ�� �Խ���");
	}
	
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�");}
		
}



public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		
		System.out.println("3�� 5�� ���ϸ� "+phone.calculate(3, 5));
		phone.schedule();
	}
}
