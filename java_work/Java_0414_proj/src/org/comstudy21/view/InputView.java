package org.comstudy21.view;

import java.awt.GridLayout;

import javax.naming.NamingEnumeration;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends View {
	JPanel pane = new JPanel(new GridLayout(4, 1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	public InputView() {
		init();
	}

	@Override
	public void init() {
		p1.add(new JLabel("name:"));
		p1.add(nameField);
		p2.add(new JLabel("email:"));
		p2.add(emailField);
		p3.add(new JLabel("phone:"));
		p3.add(phoneField);
		p4.add(noLabel);
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		
		add(pane);
	}

	@Override
	public void start() {

	}

}
