package org.comstudy21.resource;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.controller.DeleteController;
import org.comstudy21.controller.InputController;
import org.comstudy21.controller.ListController;
import org.comstudy21.controller.SearchController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.ListView;

public interface R {
	DefaultTableModel dm = new DefaultTableModel(10, 4);
	Object[] colNames = {"no","name","email","phone"};
	Vector<String> columnNames = new Vector<>();
	ListView listView = new ListView(dm, colNames);
	
	JLabel noLabel = new JLabel();
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	
	ListController listController = new ListController();
	InputController inputController = new InputController();
	SearchController searchController = new SearchController();
	DeleteController deleteController = new DeleteController();
	
	
	Dao dao = new Dao();
}
