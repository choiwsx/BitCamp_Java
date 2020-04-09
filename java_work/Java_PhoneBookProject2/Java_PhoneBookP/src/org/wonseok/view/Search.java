package org.wonseok.view;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(searchTitle);
		data.dto = new Dto();
		System.out.print("검색 할 이름: ");
		data.dto.setName(scan.next());
	}

	public void display(Dto[] arr)
	{
		System.out.println("---------검색 결과--------");
		if(arr.length==0){
			System.out.println("검색 결과 그런 사람이 없습니다.");
			return;
		}
		for(Dto dto : arr)
		{
			System.out.println(dto);
		}
	}

}
