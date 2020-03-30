package org.wonseok;

class Speaker{
	private int volum = 5;
	
	public void showVolum()
	{
		System.out.println("����Ŀ ����: "+volum);
	}
	
	public void soundUp()
	{
		System.out.println("����Ŀ ������ �ø��ϴ�.");
		volum++;
		showVolum();
//		System.out.println("����Ŀ ���� : "+volum);
	}
	
	public void soundDown()
	{
		System.out.println("����Ŀ ������ �����ϴ�.");
		volum--;
		showVolum();
//		System.out.println("����Ŀ ���� : "+volum);
	}	
}
class Tv{
	private String name;
	private String company;
	private int vol = 10;
	private int channel = 7;
	private Speaker speaker;
	
	
	public Tv() {
		// TODO Auto-generated constructor stub
		this("no-name","no-company");
		
	}
	public Tv(String name, String company)
	{
		this.name = name;
		this.company = company;
		speaker = new Speaker();
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(this.company+" "+this.name+"TV �ѱ�"); 
		
	}

	public void volumUp() {
		// TODO Auto-generated method stub
		speaker.soundUp();
	}
	
	public void volumDown() {
		// TODO Auto-generated method stub		
		speaker.soundDown();
	}
	
	public void channelUp() {
		// TODO Auto-generated method stub
		
		System.out.println(++this.channel+"�� ��� ����.");
	}
	
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println(--this.channel+"�� ��� ����.");
		
	}
	
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(this.company+" "+this.name+"TV ����");
		
	}
	@Override
	public String toString() {
		return "Tv [name=" + name + ", company=" + company + ", vol=" + vol + ", channel=" + channel + "]";
	}
	
}


public class Ch04EX98 {
	public static void main(String[] args) {

		Tv[] tv = new Tv[1];
		tv[0] = new Tv("�÷���","LG");
		tv[0].turnOn(); // LG �÷��� TV �ѱ�.
		tv[0].volumUp();  // ���� ���� ������ 6�Դϴ�.
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].channelUp(); // 11�� ��� ����
		tv[0].channelDown(); // 10�� ��� ����
		tv[0].turnOff(); // LG �÷��� TV ����.
//		tv[1] = new Tv();
//		tv[1] .turnOn(); // LG �÷��� TV �ѱ�.
//		tv[1] .volumUp();  // ���� ���� ������ 6�Դϴ�.
//		tv[1] .volumDown(); 
//		tv[1] .volumDown(); 
//		tv[1] .volumDown(); 
//		tv[1] .channelUp(); // 11�� ��� ����
//		tv[1] .channelUp(); // 11�� ��� ����
//		tv[1] .channelUp(); // 11�� ��� ����
//		tv[1] .channelUp(); // 11�� ��� ����
//		tv[1] .turnOff(); // LG �÷��� TV ����.
		for(int i=0; i<tv.length; i++)
		{
			
				System.out.println(tv[i].toString());
			
		}
	}
}