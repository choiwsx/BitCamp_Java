package org.wonseok;



abstract class Animal
{
	String animal_name;
	
	Animal(String name)
	{
		animal_name = name;
	}
	
	protected abstract void cry();
	
	protected abstract void behavior();
	
}

class Tiger extends Animal
{
	
	public Tiger(String name)
	{
		super(name);
	}
	
	@Override
	protected void cry()
	{
		System.out.println("어흥");
	}
	protected void behavior()
	{
		System.out.println("우측으로 빠르게 움직인다.");
	}
	
}

interface OpenClose
{
	public void open();
	
}
interface Close
{
	public void closeF();
}

class Door implements OpenClose, Close
{
	@Override
	public void open()
	{
		System.out.println("문 오픈.");
	}
	@Override
	public void closeF()
	{
		System.out.println("문 닫앗.");
	}
}


public class Abstract_interface {
	public static void main(String[] args) {
		Tiger tiger = new Tiger("hello");
		tiger.cry();
		tiger.behavior();
		System.out.println(tiger.animal_name);
		Door d = new Door();
		d.open();
		d.closeF();
	}
}
