package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("검색하고 싶은 사람의 이름을 입력하세요 > ");
		String name = scan.next();
		Dto dto = new Dto();
		dto.setName(name);
		data.dto = dto;
	}
	
	public void display(Dto[] dto)
	{
		for(Dto d : dto)
		{
			System.out.println(d);
		}
	}

}
