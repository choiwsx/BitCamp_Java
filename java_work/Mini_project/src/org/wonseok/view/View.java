package org.wonseok.view;

import java.awt.LayoutManager;

import javax.swing.JPanel;

import org.wonseok.resource.R;

public abstract class View extends JPanel implements R{
	public View() {
		// TODO Auto-generated constructor stub
		display();
	}

	public abstract void display();

}
