package org.comstudy21.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		init();
	}

	@Override
	public void init() {
		JLabel title = new JLabel("::::: customer management systme :::::");
		title.setFont(new Font("맑은고딕", Font.BOLD, 28));
		this.add(title);
	}

	@Override
	public void start() {

	}

}
