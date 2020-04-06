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
		System.out.println("»ï¼ºtv ÄÒ´Ù.");
	}
	public void powerOff()
	{
		System.out.println("»ï¼ºtv ²ö´Ù.");
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
		System.out.println("¿¤Áãtv ÄÒ´Ù.");
	}
	public void turnOff()
	{
		System.out.println("¿¤Áãtv ²ö´Ù.");
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
