package org.wonseok;


interface Tv
{
	void turnOn();
	void turnOff();
}

class SamsungTV implements Tv
{
	public void powerOn()
	{
		System.out.println("�Ｚtv �Ҵ�.");
	}
	public void powerOff()
	{
		System.out.println("�Ｚtv ����.");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		powerOn();
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		powerOff();
		
	}
	
}


class LgTV implements Tv
{
	public void turnOn()
	{
		System.out.println("����tv �Ҵ�.");
	}
	public void turnOff()
	{
		System.out.println("����tv ����.");
	}
	
}






public class Ch05Ex32 {
	
	static void tvPlayer(Tv tv)
	{
		tv.turnOn();
		tv.turnOff();
	}
	
	
	
	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		tvPlayer(tv);

		LgTV tv2 = new LgTV();
		tvPlayer(tv2);
	}
}
