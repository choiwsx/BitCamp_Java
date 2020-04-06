package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.People;

public class PhonebookController {
	
	public void service() {
		if (data.no == 0) {
			menu.display();
		}
		switch (data.no) {
		case 1:
			input.display();
			// 리소스에 있는 데이터를 모델로 넘긴다.
			People dto = data.people;
			dao.insert(dto);
			break;
		case 2:
			// 출력 전에 리스소스에서 데이터를 가져온다.
			data.pArr = dao.select();
			output.display();
			break;
		case 3 :
			// 검색어 입력
			search.display();
			// 검색어를 이용해서 dao에서 검색
			data.pArr = dao.select(data.people);
			// 검색결과를 resource 담아두고 다시 뷰로 이동
			search.display(data.pArr);
			break;
		case 4 :
			modify.display();
			break;
		case 5 :
			delete.display();
			break;
		case 6:
			System.out.println(">>> 프로그램 종료!");
			System.exit(0);
			break;
		default:
			System.out.println("해당 메뉴가 준비 되지 않았습니다!");
		}

		data.no = 0;
		service();
	}
}
