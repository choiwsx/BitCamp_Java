package org.comstudy21.view;

import javax.swing.JButton;

import org.comstudy21.evt_handler.BtnEvtHandler;

public class ButtonView extends View {
	public JButton allBtn = new JButton("all");
	public JButton inputBtn = new JButton("input");
	public JButton deleteBtn = new JButton("delete");
	public JButton searchBtn = new JButton("search");
	public JButton cancelBtn = new JButton("cancel");

	public ButtonView() {
		init();
		start();
	}

	@Override
	public void init() {
		add(allBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
	}

	@Override
	public void start() {
		BtnEvtHandler handler = new BtnEvtHandler(this);
		allBtn.addActionListener(handler);
		inputBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		cancelBtn.addActionListener(handler);
	}

}
