package org.wonseok.view;

import javax.swing.JButton;

import org.wonseok.evt_handler.ButtonEvtHandler;

public class ButtonView extends View {
	
	public JButton allBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("입력");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public ButtonView() {
		init();
		start();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		add(allBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		ButtonEvtHandler handler = new ButtonEvtHandler(this);
		allBtn.addActionListener(handler);
		inputBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		cancelBtn.addActionListener(handler);
	}

}
