package org.wonseok.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.wonseok.resource.R;

public class MainFrame extends JFrame implements R{

	JPanel content = null;
	
	public MainFrame() {
		content = (JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(BorderLayout.NORTH, new TitleView());
		add(listView);
//		add(BorderLayout.WEST, new InputView());
//		
		
		setSize(800,600);
		setVisible(true);
	}
	
	

}
