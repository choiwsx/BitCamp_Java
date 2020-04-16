package org.wonseok.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View{

	DefaultTableModel dm;
	JTable table;
	
	public ListView(DefaultTableModel dm, Object[] colNames) {
		// TODO Auto-generated constructor stub
		this.dm = dm;
		dm.setColumnIdentifiers(colNames);
		init();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		JTable table = new JTable(dm);
		this.table = table;
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

}
