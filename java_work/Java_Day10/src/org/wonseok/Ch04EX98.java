package org.wonseok;

class Speaker{
	private int volum = 5;
	
	public void showVolum()
	{
		System.out.println("스피커 볼륨: "+volum);
	}
	
	public void soundUp()
	{
		System.out.println("스피커 볼륨을 올립니다.");
		volum++;
		showVolum();
//		System.out.println("스피커 볼륨 : "+volum);
	}
	
	public void soundDown()
	{
		System.out.println("스피커 볼륨을 내립니다.");
		volum--;
		showVolum();
//		System.out.println("스피커 볼륨 : "+volum);
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
		System.out.println(this.company+" "+this.name+"TV 켜기"); 
		
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
		
		System.out.println(++this.channel+"번 방송 보기.");
	}
	
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println(--this.channel+"번 방송 보기.");
		
	}
	
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(this.company+" "+this.name+"TV 끄기");
		
	}
	@Override
	public String toString() {
		return "Tv [name=" + name + ", company=" + company + ", vol=" + vol + ", channel=" + channel + "]";
	}
	
}


public class Ch04EX98 {
	public static void main(String[] args) {

		Tv[] tv = new Tv[1];
		tv[0] = new Tv("올레드","LG");
		tv[0].turnOn(); // LG 올레드 TV 켜기.
		tv[0].volumUp();  // 현재 볼륨 레벨은 6입니다.
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].volumDown(); 
		tv[0].channelUp(); // 11번 방송 보기
		tv[0].channelDown(); // 10번 방송 보기
		tv[0].turnOff(); // LG 올레드 TV 끄기.
//		tv[1] = new Tv();
//		tv[1] .turnOn(); // LG 올레드 TV 켜기.
//		tv[1] .volumUp();  // 현재 볼륨 레벨은 6입니다.
//		tv[1] .volumDown(); 
//		tv[1] .volumDown(); 
//		tv[1] .volumDown(); 
//		tv[1] .channelUp(); // 11번 방송 보기
//		tv[1] .channelUp(); // 11번 방송 보기
//		tv[1] .channelUp(); // 11번 방송 보기
//		tv[1] .channelUp(); // 11번 방송 보기
//		tv[1] .turnOff(); // LG 올레드 TV 끄기.
		for(int i=0; i<tv.length; i++)
		{
			
				System.out.println(tv[i].toString());
			
		}
	}
}
