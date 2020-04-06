package org.wonseok.view;

import org.wonseok.model.Dto;

public class Delete implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.dtoArr.length==0)
		{
			System.out.println("삭제 할 수 있는 사람이 없습니다.");
			return;
		}

		System.out.print("삭제할 사람의 idx값을 입력하세요 > ");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.dtoArr.length; i++)
		{
			if(idx==data.dtoArr[i].getIdx())
			{
				flag = true;
				break;
			}
			
		}
		
		if(!flag)
		{
			System.out.println("해당 idx값의 사람이 없습니다.");
			data.dto = new Dto(0,null,null);
			return;
		}
		
		data.dto = new Dto(idx,null, null);
	}

}
