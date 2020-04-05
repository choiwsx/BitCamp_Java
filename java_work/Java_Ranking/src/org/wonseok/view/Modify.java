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
		System.out.println();
		System.out.print("변경하고 싶은 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("변경하고 싶은 국어 점수를 입력하세요 > ");
		int Korean = scan.nextInt();
		System.out.print("변경하고 싶은 영어 점수를 입력하세요 > ");
		int English = scan.nextInt();
		System.out.print("변경하고 싶은 수학 점수를 입력하세요 > ");
		int Math = scan.nextInt();
		
		Dto dto = new Dto();
		dto.setName(name);
		dto.setKorean(Korean);
		dto.setEnglish(English);
		dto.setMath(Math);
		data.dto = dto;
	}

}
