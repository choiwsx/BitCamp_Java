package org.wonseok.view;

import javax.swing.JPanel;

import org.wonseok.resource.R;

public abstract class View extends JPanel implements R{

	public abstract void init();
	public abstract void start();
}
