package org.wonseok.calc;

import java.awt.Button;

import org.wonseok.MyFrame;

public class MyCalc2 extends MyFrame{
	
	Button btn = new Button("btn");
	public MyCalc2() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		add(btn);
		btn.setBounds(100,100,100,100);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyCalc2();
	}
	

}
