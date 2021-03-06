package org.wonseok.controller;

import static org.wonseok.resource.R.*;
import org.wonseok.view.Search;

public class Controller {

	public static void search() {
		viewArr[3].display();
		switch (data.searchNumber) {
		case 1:
			((Search) viewArr[3]).display(data.searchNumber);
			data.map = dao.search(data.dto);
			((Search) viewArr[3]).display(data.map);
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			((Search) viewArr[3]).display(data.searchNumber);
			data.map = dao.searchScore(data.searchNumber, data.dto);
			((Search) viewArr[3]).display(data.map);
			break;
		}
	}

	public void service() {
		viewArr[data.number].display();

		try {
			switch (data.number) {
			case 1:
				viewArr[data.number].display();
				dao.insert(data.dto);
				break;
			case 2:
				viewArr[data.number].display();
				if (data.searchNumber == 1) {
					dao.selectAll();
				} else if (data.searchNumber == 2) {
					dao.Raking();
				} else {
					System.out.println("해당하지 않는 번호입니다.");
				}

				break;
			case 3:
				search();
				break;
			case 4:
				search();
				viewArr[data.number].display();
				dao.update(data.map, data.dto, data.keynumber);
				break;
			case 5:
				search();
				viewArr[data.number].display();
				if (data.map.size() != 0) {
					dao.delete(data.map, data.keynumber);
				}
				break;

			case 6:
				System.out.println("********** 시 스 템 종 료 **********");
				System.exit(0);
				break;
			case 7:
				dao.Raking();
			}
		} catch (NullPointerException e) {
			data.number = 0;
			service();
		} catch (Exception e) {
			data.number = 0;
			service();
		}

		data.number = 0;
		service();

	}

}
