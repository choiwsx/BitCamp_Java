package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		if(data.dtoArr.length==0)
		{
			System.out.println("수정 가능한 사람이 없습니다.");
			return;
		}
		
		
		System.out.print("수정 하고 싶은 사람의 idx 값을 입력하세요 >");
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
			System.out.println("존재 하지 않는 idx값입니다.");
			data.dto = new Dto(0, null, null);
			return;
		}
		
		System.out.print("수정하실 이름을 입력하세요 > ");
		String name = scan.next();
		
		System.out.print("수정하실 번호를 입력하세요 > ");
		String phone = scan.next();
		
		data.dto = new Dto(idx, name, phone);
		
		
		
	}

}
