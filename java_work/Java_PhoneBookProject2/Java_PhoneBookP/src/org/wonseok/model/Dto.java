package org.wonseok.model;

public class Dto {
	private int idx;
	private String name;
	private String phone;
	public Dto() {
		// TODO Auto-generated constructor stub
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
	public Dto(int idx, String name, String phone) {
		super();
		this.idx = idx;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Dto [idx=" + idx + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
