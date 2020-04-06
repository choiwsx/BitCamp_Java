package org.wonseok.view;

import org.wonseok.model.People;

public class Output implements PhonebookView{
	
	@Override
	public void display()
	{
		People[] pArr = data.pArr;
		System.out.println("**출력 기능**");
		if(pArr==null)
		{
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		if(pArr.length==0)
		{
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		for(People p : pArr)
		{
			System.out.println(p);
		}
		
	}
}
