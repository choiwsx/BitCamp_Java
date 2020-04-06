package org.wonseok.model;

import static org.wonseok.resource.R.*;

public class Dao {
	private People[] pArr = new People[MAX];
	private int top = 0;
		
	
	private Dao()
	{
		
	}
	
	private static Dao instance;
	public static Dao getInstance()
	{
		if(instance==null)
		{
			instance = new Dao();
		}		
		return instance;
	}
	
	public void Insert(People p)
	{
		if(top>=MAX)
		{
			System.out.println("더 이상 입력 불가.");
			return;
		}
		pArr[top++] = p;
	}
	
	public People[] select()
	{
		People[] arr = new People[top];
		for(int i=0; i<arr.length; i++)
		{
			People dto = new People();
			dto.setIdx(pArr[i].getIdx());
			dto.setName(pArr[i].getName());
			dto.setPhone(pArr[i].getPhone());
			arr[i] = dto;
		}
		
		
		
		return arr;
	}
	
	
		
}
