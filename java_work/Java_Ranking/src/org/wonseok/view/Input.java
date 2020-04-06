package org.wonseok.view;

import java.util.HashMap;

import org.wonseok.model.Dto;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		System.out.print("성적부에 등록할 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("국어 점수를 입력하세요 > ");
		int Korean = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");
		int English = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");
		int Math = scan.nextInt();
		Dto dto = new Dto();
		dto.setName(name);
		dto.setKorean(Korean);
		dto.setEnglish(English);
		dto.setMath(Math);
		data.dto = dto;
		System.out.println("입력 완료!");
	}

}
