package org.wonseok.controller;


import static org.wonseok.resource.R.*;
import org.wonseok.view.Search;


public class Controller {

	public static void search()
	{
		viewArr[3].display();
		data.dtoArr = dao.search(data.dto);
		((Search)viewArr[3]).display(data.dtoArr);
	}
	
	
	public void service() {
		// TODO Auto-generated method stub
		viewArr[data.number].display();
		
		try {
			switch(data.number)
			{
			case 1:
				viewArr[data.number].display();
				dao.insert(data.dto);
				break;
			case 2:
				viewArr[data.number].display();
				dao.selectAll();
				break;
			case 3:
				search();
				break;
			case 4:
				search();
				viewArr[data.number].display();
				dao.update(data.dto);
				break;
			case 5:
				search();
				viewArr[data.number].display();
				dao.delete(data.dto);
				break;
				
			case 6:
				System.out.println("********** 시 스 템 종 료 **********");
				System.exit(0);
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			data.number = 0;
			service();
		} 
		catch (Exception e)
		{
			data.number = 0;
			service();
		}
		
		data.number = 0;
		service();
		
		
	}

}
