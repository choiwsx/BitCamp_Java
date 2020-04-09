package org.wonseok;

import java.awt.Button;
import java.awt.GridLayout;

public class Ch09Ex05 extends MyFrame {
	Button[] btns = new Button[8];
	{
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("Button" + i);
		}
	}
	GridLayout grid = new GridLayout(4, 2);

	public Ch09Ex05() {
		// TODO Auto-generated constructor stub
		setLayout(grid);
		for (int i = 0; i < btns.length; i++) {
			add(btns[i]);
		}

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex05();
	}
}
