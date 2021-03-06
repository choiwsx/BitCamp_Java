package org.wonseok.model;

public class Dto {
	private String name;
	private int Korean;
	private int English;
	private int Math;
	private double avg;

	public Dto() {
		// TODO Auto-generated constructor stub
	}

	public Dto(String name, int korean, int english, int math) {
		this.name = name;
		Korean = korean;
		English = english;
		Math = math;
		this.avg = (korean + english + math) / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return Korean;
	}

	public void setKorean(int korean) {
		Korean = korean;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public double getAvg() {
		return avg;
	}
	
	public double InitAvg()
	{
		return (Korean + English + Math) / 3.0;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", Korean=" + Korean + ", English=" + English + ", Math=" + Math + ", avg=" + InitAvg()
				+ "]";
	}

}
