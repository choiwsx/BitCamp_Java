package org.wonseok.view;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(inputTitle);
		System.out.print("전화번호부에 등록할 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("전화번호부에 등록할 번호를 입력하세요 > ");
		String phone = scan.next();

		Dto dto = new Dto();
		dto.setName(name);
		dto.setPhone(phone);

		data.dto = dto;
		System.out.println("입력 완료!");
	}

}
