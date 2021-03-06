package org.comstudy21.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.evt_handler.MouseEvtHandler;

public class ListView extends View {
	DefaultTableModel dm;
	JTable table;
	public void setTableModel(DefaultTableModel dm){
		this.dm = dm;
	}

	public ListView(DefaultTableModel dm, Object[] colNames) {
		this.dm = dm;
		dm.setColumnIdentifiers(colNames);
		for(int i=0; i<colNames.length; i++)
		{
			columnNames.add(colNames[i].toString());
		}
		init();
		start();
	}

	@Override
	public void init() {
//		JTable table = new JTable(dm);
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);

		add(scrollPane);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		MouseEvtHandler handler = new MouseEvtHandler();
		table.addMouseListener(handler);

	}

}
