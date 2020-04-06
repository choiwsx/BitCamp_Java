package org.wonseok;

class Pen
{
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

class SharpPencil extends Pen
{
	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}

class BallPen extends Pen
{
	private String color;	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}

class FountainPen extends BallPen
{
	public void refill(int n)
	{
		super.setAmount(n);
	}
	
}



public class Ch05Ex02 {
	public static void main(String[] args) {
		
	}
}
