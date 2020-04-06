package org.wonseok.controller;


import static org.wonseok.resource.R.*;

import org.wonseok.resource.Data;
import org.wonseok.view.Search;


public class Controller {

	public static void service() {
		// TODO Auto-generated method stub
		
		viewArr[data.number].display();
		
		switch(data.number)
		{
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
			((Search)viewArr[data.number]).display(data.dtoArr);
			break;
		case 4:
			viewArr[3].display();
			data.dtoArr = dao.search(data.dto);
			((Search)viewArr[3]).display(data.dtoArr);
			viewArr[data.number].display();
			dao.update(data.dto);
			break;
		case 5:
			viewArr[3].display();
			data.dtoArr = dao.search(data.dto);
			((Search)viewArr[3]).display(data.dtoArr);
			viewArr[data.number].display();
			if(data.dto.getIdx()!=0)
				dao.delete(data.dto);
			
			break;	
			
		}
		
		data.number = 0;
		service();
		
	}

}
