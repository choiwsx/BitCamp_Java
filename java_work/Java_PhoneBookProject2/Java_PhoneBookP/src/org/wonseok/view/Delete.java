package org.wonseok.view;

import org.wonseok.model.Dto;

public class Delete implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(deleteTitle);
		if(data.dtoArr.length==0)
		{
			return;
		}
		System.out.print("수정 원하는 사람의 idx를 입력해주세요. ");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.dtoArr.length; i++)
		{
			if(data.dtoArr[i].getIdx()==idx)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("그런 사람이 없습니다.");
			data.dto = new Dto(0, null, null);
			return;
		}
		

		data.dto = new Dto(idx, null, null);
	}

}
