package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		if(data.map.size()==0)
		{
			return;
		}
		System.out.println(modifyTitle);
		System.out.print("수정하고 싶은 사람의 Key값을 입력하세요 > ");
		int idx = scan.nextInt();
		data.keynumber = idx;
		if(!data.map.containsKey(idx))
		{
			System.out.println("해당 키값은 없습니다, 수정 실패");
			return;
		}
		System.out.print("수정 원하는 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("수정 원하는 번호를 입력하세요 > ");
		String phone = scan.next();
		data.dto = new Dto(name, phone);
	}

}
