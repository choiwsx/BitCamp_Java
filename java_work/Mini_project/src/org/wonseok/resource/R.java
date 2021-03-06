package org.wonseok.resource;

import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.wonseok.controller.DeleteController;
import org.wonseok.controller.InsertController;
import org.wonseok.controller.ListController;
import org.wonseok.controller.SearchController;
import org.wonseok.model.Dao;

public interface R {

	
	DefaultTableModel dm = new DefaultTableModel(10, 4);
	
	Vector<String> columnIdentifiers = new Vector<>();
	
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);

	Dao dao =new Dao();
	
	DeleteController deleteController = new DeleteController();
	SearchController searchController = new SearchController();
	InsertController insertController = new InsertController();
	ListController listController = new ListController();
	
}
