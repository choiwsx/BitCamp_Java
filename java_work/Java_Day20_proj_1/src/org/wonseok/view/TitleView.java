package org.wonseok.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		// TODO Auto-generated constructor stub
		init();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		JLabel title = new JLabel("::::::: Customer Mangement System ::::::::");
		title.setFont(new Font("맑은고딕체", Font.BOLD, 28));
		this.add(title);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
