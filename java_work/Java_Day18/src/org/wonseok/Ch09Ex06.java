package org.wonseok;

import java.awt.GridBagLayout;
import java.awt.Label;

public class Ch09Ex06 extends MyFrame{

	public Ch09Ex06() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		
		add(new Label("안녕아헤셤"));
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ch09Ex06();
		System.out.println("하잉");
	}

}
