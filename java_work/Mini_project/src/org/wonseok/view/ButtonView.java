package org.wonseok.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonView extends View {

	public ButtonView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		JPanel pane = new JPanel();
		JButton allBtn = new JButton("전체보기");
		JButton insertBtn = new JButton("추가");
		JButton searchBtn = new JButton("검색");
		JButton deleteBtn = new JButton("삭제");
		JButton cancelBtn = new JButton("취소");
		
		pane.add(allBtn);
		pane.add(insertBtn);
		pane.add(searchBtn);
		pane.add(deleteBtn);
		pane.add(cancelBtn);
		
		add(pane);
	}

}
