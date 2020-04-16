package org.wonseok.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		init();
	}

	@Override
	public void init() {
		JLabel title = new JLabel(":::::CUSTOMER MANAGEMENT SYSTEM::::::");
		title.setFont(new Font("맑은고딕체", Font.BOLD, 28));
		this.add(title);
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
