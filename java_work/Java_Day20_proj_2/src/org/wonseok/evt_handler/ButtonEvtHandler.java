package org.wonseok.evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.wonseok.resource.R;
import org.wonseok.view.ButtonView;
import org.wonseok.view.ListView;

public class ButtonEvtHandler implements ActionListener, R {

	ButtonView target;
	
	public ButtonEvtHandler(ButtonView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton)
		{
			JButton btn = (JButton)e.getSource();
			if(btn== target.allBtn)
			{
				listController.service();
			}
			if(btn== target.inputBtn)
			{
				inputController.service();
				listController.service();
			}
			if(btn== target.deleteBtn)
			{
				
				deleteController.service();
			}
			if(btn== target.searchBtn)
			{
				searchController.service();
				
			}
			if(btn== target.cancelBtn)
			{
				System.exit(0);
			}
		}
	}

}
