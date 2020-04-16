package org.comstudy21.evt_handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import org.comstudy21.resource.R;
import org.comstudy21.view.ListView;

public class MouseEvtHandler implements MouseListener, R{

	ListView target = null;
	
	public MouseEvtHandler(ListView target)
	{
		this.target = target;	
	}
	
	
	public MouseEvtHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JTable)
		{
			JTable table = (JTable)e.getSource();
			int row = table.getSelectedRow();
			int column = table.getSelectedColumn();
			System.out.println(dm.getValueAt(row, column));
			nameField.setText(dm.getValueAt(row, 1).toString());
			emailField.setText(dm.getValueAt(row, 2).toString());
			phoneField.setText(dm.getValueAt(row, 3).toString());
			noLabel.setText("NO:" +dm.getValueAt(row, 0).toString());
		}
	}

}
