package org.wonseok.view;

import org.wonseok.model.Dto;

public class Delete implements View {

	@Override
	public void display() {
		if(data.map.size()==0)
		{
			return;
		}
		System.out.println(deleteTitle);
		System.out.print("삭제 하고 싶은 사람의 Key값을 입력하세요 > ");
		int idx = scan.nextInt();
		data.keynumber = idx;
	
	}

}
