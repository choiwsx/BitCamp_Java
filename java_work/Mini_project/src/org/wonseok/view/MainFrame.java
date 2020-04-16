package org.wonseok.view;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	JPanel content = null;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		
		content = (JPanel)getContentPane();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ListView listView = new ListView();
		TitleView titleView = new TitleView();
		ButtonView buttonView = new ButtonView();
		InputView inputView = new InputView();
		
		
		add(BorderLayout.NORTH, titleView);
		setSize(750,560);
		add(listView);
		add(BorderLayout.SOUTH, buttonView);
		add(BorderLayout.WEST, inputView);
		setVisible(true);
		

	}

	

}
