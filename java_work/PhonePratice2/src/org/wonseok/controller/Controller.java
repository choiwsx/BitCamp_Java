package org.wonseok.controller;

import static org.wonseok.resource.R.*;
import org.wonseok.view.Search;

public class Controller {

	public static void search() {
		viewArr[3].display();
		data.dtoArr = dao.search(data.dto);
		((Search) viewArr[3]).display(data.dtoArr);
	}

	public static void service() {
		viewArr[data.number].display();
		switch (data.number) {
		case 1:
			viewArr[data.number].display();
			dao.insert(data.dto);
			break;
		case 2:
			data.dtoArr = dao.selectAll();
			viewArr[data.number].display();
			break;

		case 3:
			viewArr[data.number].display();
			data.dtoArr = dao.search(data.dto);
			((Search) viewArr[data.number]).display(data.dtoArr);
			break;

		case 4:
			search();
			viewArr[data.number].display();
			dao.update(data.dto);
			break;

		case 5:
			search();
			viewArr[data.number].display();
			if (data.dto.getIdx() != 0)
				dao.delete(data.dto);
			break;
		case 6:
			System.out.println("프로그램을 종료");
			System.exit(0);

		}
		data.number = 0;
		service();

	}

}
