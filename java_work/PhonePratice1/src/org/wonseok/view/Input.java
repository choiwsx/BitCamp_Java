package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("이름을 입력해주세요: ");
		Dto dto = new Dto();
		dto.setName(scan.next());
		System.out.print("전화번호를 입력해주세요: ");
		dto.setPhone(scan.next());

		data.dto = dto;
	
	}

}
