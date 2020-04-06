package org.wonseok.model;

public class Dto {
	private int idx;
	private String name;
	private String Phone;
	public Dto() {
		// TODO Auto-generated constructor stub
	}
	public Dto(int idx, String name, String phone) {
		super();
		this.idx = idx;
		this.name = name;
		Phone = phone;
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
		return "Dto [idx=" + idx + ", name=" + name + ", Phone=" + Phone + "]";
	}
}
