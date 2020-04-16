package org.wonseok.resource;


import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.wonseok.controller.DeleteController;
import org.wonseok.controller.InputController;
import org.wonseok.controller.ListController;
import org.wonseok.controller.SearchController;
import org.wonseok.model.Dao;
import org.wonseok.view.ListView;

public interface R {

//		Vector<String> columnNames = new Vector<>();
	
		DefaultTableModel dm = new DefaultTableModel(10, 4); 
	
		Object[] colNames = {"num","name","email","phone"};
		ListView listView = new ListView(dm, colNames);
//		InputView inputView = new InputView();
		
		
		JTextField numField = new JTextField(15);
		JTextField nameField = new JTextField(15);
		JTextField emailField = new JTextField(15);
		JTextField phoneField = new JTextField(15);
		
		ListController listController = new ListController();
		InputController inputController = new InputController();
		SearchController searchController = new SearchController();
		DeleteController deleteController = new DeleteController();
		
		
		Dao dao = new Dao();
		
}
