package org.wonseok.controller;

import static org.wonseok.resource.R.*;

import org.wonseok.model.Dto;
import org.wonseok.view.View;

public class Controller {
	public void service() {
		
		
		viewArr[0].run2();

		System.out.println(data.btnNum);

	}
	

	public void insert(Dto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
		dao.update(dto, viewArr[0].tableModel);
	}
	
	public void delete(String s)
	{
		dao.delete(s, viewArr[0].tableModel);
	}

	
//
//	public void delete(String text) {
//		// TODO Auto-generated method stub
//		
//	}
//	

	
	
}
