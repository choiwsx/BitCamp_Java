package org.wonseok.main;



import static org.wonseok.resource.R.*;

import org.wonseok.controller.Controller;


public class MainCls {
	
	public static void main(String[] args) {
		System.out.println(appTitle);
		
		// 컨트롤러 호출
		Controller.service();
	}
}
