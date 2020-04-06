package org.wonseok.model;

public class People {
	private int idx;
	private String name;
	private String Phone;
	
	public People()
	{
		this(0,"","");
	}
	public People(int idx, String name, String Phone)
	{
		this.idx = idx;
		this.name = name;
		this.Phone = Phone;
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
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "People [idx=" + idx + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
