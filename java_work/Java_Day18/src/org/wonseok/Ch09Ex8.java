package org.wonseok;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;

public class Ch09Ex8 extends MyFrame{
	Button btn01 = new Button("하잉");
	public Ch09Ex8() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		
//		add(new Label("안녕아헤셤"));
		add(btn01);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ch09Ex8();
		System.out.println("하잉");
		System.out.println("하잉");
		System.out.println("하잉");
		System.out.println("하잉");
	}

}
