package org.wonseok.ch04;


//�ڹ� �� ��ü ������ ���� Ŭ���� ����
//�ڹ� ���� �����͸� ��� ��ü

public class People {
	private int idx;
	private String name;
	private String phone;
	private int deleIdx;
	public People(){
		this(0,"no-name","no-phone");
	}
	public People(int idx, String name, String phone)
	{
		this.idx = idx;
		this.name = name;
		this.phone = phone;
	}

	
	public int getDeleIdx()
	{
		return deleIdx;
	}
	
	public void setDeleIdx(int Idx)
	{
		this.deleIdx = Idx;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "People [idx=" + idx + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
}