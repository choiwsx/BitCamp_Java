package org.wonseok.controller;

import static org.wonseok.resource.R.*;

public class Controller {
	public void service() {
		viewArr[0].main(null);

		System.out.println(data.btnNum);

		try {
			switch (data.btnNum) {
			case 1:
				viewArr[1].main(null);
				break;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
