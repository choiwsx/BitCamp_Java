package org.wonseok.resource;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.wonseok.view.InputView;
import org.wonseok.view.ListView;
import org.wonseok.view.TitleView;

public interface R {
	
	DefaultTableModel dm = new DefaultTableModel(10,4);
	Object[] colNames = {"num","name","email","phone"};
	ListView listView = new ListView(dm, colNames);
	
	
	TitleView titleView = new TitleView();
	InputView inputView = new InputView();
	
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	
	
	
}
