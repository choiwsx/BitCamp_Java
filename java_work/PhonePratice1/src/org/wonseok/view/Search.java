package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		data.dto = new Dto();
		System.out.print("검색할 사람의 이름을 입력하세요 : ");
		data.dto.setName(scan.next());
	}
	
	
	public void display(Dto[] dto)
	{
		if(dto.length==0){
			System.out.println("검색한 사람이 없습니다.");
			return;
		}
		for(int i=0; i<dto.length; i++)
		{
			System.out.println(dto[i].toString());
		}
		
		
	}

}
