package org.wonseok.view;

import org.wonseok.model.People;

public class Input implements PhonebookView{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		People p = new People();
		System.out.println("***입력 기능***");
		System.out.print("성명을 입력하셈>>");
		p.setName(scan.next());
		System.out.print("번호를 입력하셈>>");
		p.setPhone(scan.next());
		
		data.people = p;
		System.out.println("입력 완료");
	}
	
	
}
