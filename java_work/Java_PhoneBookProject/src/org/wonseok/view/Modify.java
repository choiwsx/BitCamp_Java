package org.wonseok.view;

import org.wonseok.model.Dto;

public class Modify implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(modifyTitle);
		System.out.print("수정하고 싶은 사람의 Idx값을 입력하세요 > ");
		int idx = scan.nextInt();
		
		System.out.print("수정 원하는 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("수정 원하는 번호를 입력하세요 > ");
		String phone = scan.next();
		data.dto = new Dto(idx, name, phone);
		
	}

}
