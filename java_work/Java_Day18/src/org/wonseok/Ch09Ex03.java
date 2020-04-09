package org.wonseok;

import java.awt.Button;
import java.awt.FlowLayout;

public class Ch09Ex03 extends MyFrame{
	public Ch09Ex03(String title) {
		// TODO Auto-generated constructor stub
		super(title, 640, 380);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
		add(new Button("OK"));
	}
	
	public static void main(String[] args) {
		new Ch09Ex03("플로우레이아웃 예제").setVisible(true);
	}
}
