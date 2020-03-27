package org.wonseok;


class 스펙
{
	private String 이름;
	private String 제조사;
	private int 용량;
	
	 public 스펙() {
		// TODO Auto-generated constructor stub
		 this("no-name","no-company",0);
	 }
	
	 public 스펙(String 이름, String 제조사, int 용량)
	 {
		 this.이름 =이름;
		 this.제조사 = 제조사;
		 this.용량 = 용량;
	 }

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get제조사() {
		return 제조사;
	}

	public void set제조사(String 제조사) {
		this.제조사 = 제조사;
	}

	public int get용량() {
		return 용량;
	}

	public void set용량(int 용량) {
		this.용량 = 용량;
	}

	@Override
	public String toString() {
		return "스펙 [이름=" + 이름 + ", 제조사=" + 제조사 + ", 용량=" + 용량 + "]";
	}
	
	
}


class 세탁기 extends 스펙
{
	public 세탁기()
	{
		
	}
	
	public 세탁기(String 이름, String 제조사, int 용량)
	{
		super(이름,제조사,용량);
	}
	
	public void  세탁(){
		String 이름 = super.get이름();
		int 용량 = super.get용량();
		System.out.println(이름+"세탁기가"+용량+"킬로의 빨래 한다.");
	}
	
	
}


class laundry{
	
	private int cc;
	private String name;
	private String company;
	
	public laundry()
	{
		this(100,"스타트업","초기세톽기");
		System.out.println("기본 생성자");
	}
	public laundry(int cc, String company, String name)
	{
		this.cc = cc;
		this.company = company;
		this.name = name;
	}
	

	public void wash(){
		System.out.printf("%s 세탁~", this.name);
	}
	
	public void dry(){
		System.out.println("탈수~");
	}
	
	public void showInfo()
	{
		System.out.println("용량 ="+this.cc+" 제조사 ="+this.company+" 이름 ="+this.name);	
	}
	
	
}

public class Ch04Ex99 {
	public static void main(String[] args) {
		laundry[] laund = new laundry[2];
		
		laund[0] = new laundry();
		laund[1] = new laundry(1000,"삼송","최신세탁기");
		
		for(laundry l : laund)
		{
			l.wash();
			l.showInfo();
			
		}
		
		
		
	}
}
