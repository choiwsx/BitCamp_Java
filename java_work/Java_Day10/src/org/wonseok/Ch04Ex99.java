package org.wonseok;


class ����
{
	private String �̸�;
	private String ������;
	private int �뷮;
	
	 public ����() {
		// TODO Auto-generated constructor stub
		 this("no-name","no-company",0);
	 }
	
	 public ����(String �̸�, String ������, int �뷮)
	 {
		 this.�̸� =�̸�;
		 this.������ = ������;
		 this.�뷮 = �뷮;
	 }

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public int get�뷮() {
		return �뷮;
	}

	public void set�뷮(int �뷮) {
		this.�뷮 = �뷮;
	}

	@Override
	public String toString() {
		return "���� [�̸�=" + �̸� + ", ������=" + ������ + ", �뷮=" + �뷮 + "]";
	}
	
	
}


class ��Ź�� extends ����
{
	public ��Ź��()
	{
		
	}
	
	public ��Ź��(String �̸�, String ������, int �뷮)
	{
		super(�̸�,������,�뷮);
	}
	
	public void  ��Ź(){
		String �̸� = super.get�̸�();
		int �뷮 = super.get�뷮();
		System.out.println(�̸�+"��Ź�Ⱑ"+�뷮+"ų���� ���� �Ѵ�.");
	}
	
	
}


class laundry{
	
	private int cc;
	private String name;
	private String company;
	
	public laundry()
	{
		this(100,"��ŸƮ��","�ʱ⼼����");
		System.out.println("�⺻ ������");
	}
	public laundry(int cc, String company, String name)
	{
		this.cc = cc;
		this.company = company;
		this.name = name;
	}
	

	public void wash(){
		System.out.printf("%s ��Ź~", this.name);
	}
	
	public void dry(){
		System.out.println("Ż��~");
	}
	
	public void showInfo()
	{
		System.out.println("�뷮 ="+this.cc+" ������ ="+this.company+" �̸� ="+this.name);	
	}
	
	
}

public class Ch04Ex99 {
	public static void main(String[] args) {
		laundry[] laund = new laundry[2];
		
		laund[0] = new laundry();
		laund[1] = new laundry(1000,"���","�ֽż�Ź��");
		
		for(laundry l : laund)
		{
			l.wash();
			l.showInfo();
			
		}
		
		
		
	}
}
