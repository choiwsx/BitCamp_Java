package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		Dto dto = new Dto();
		System.out.print("성명 입력:");
		dto.setName(scan.next());
		System.out.print("전화번호 입력:");
		dto.setPhone(scan.next());
		
		data.dto = dto;
		System.out.println("---------정보 입력 완료!!-------");
		
	}

}
