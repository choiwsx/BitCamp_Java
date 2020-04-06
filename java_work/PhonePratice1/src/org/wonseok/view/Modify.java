package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.dtoArr.length==0)
		{
			System.out.println("그런 사람은 없습니다.");
			return;
		}
		
		System.out.print("수정 원하는 사람의 idx를 입력해주세요 > ");
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
			System.out.println("입력한 idx의 사람은 없습니다.");
			data.dto = new Dto(0,null,null);
		}
		
		System.out.print("수정할 이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("수정할 번호를 입력하세요 : ");
		String phone = scan.next();
		
		
		data.dto = new Dto(idx, name, phone);
		

	}

}
