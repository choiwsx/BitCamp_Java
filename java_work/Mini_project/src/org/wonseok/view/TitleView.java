package org.wonseok.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		JLabel title = new JLabel("고 . 객 . 관 . 리 . 시 . 스 . 템");
		title.setFont(new Font("궁서", Font.BOLD, 32));
		add(title);
	}

}
