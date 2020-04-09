package org.wonseok;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this("MyFrame");
	}
	

	public MyFrame(String title) {
		// TODO Auto-generated constructor stub
		this(title, 800, 600);
	}

	
	//창을 정 가운데 배치하기

	public MyFrame(String title, int width, int height) {
		// TODO Auto-generated constructor stub
		super(title);
		setSize(width, height);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
			}
		});
		
		int x;
		int y;
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		x = d.width/2-width/2;
		y = d.height/2-height/2;
		setLocation(x, y);
	}


	public static void main(String[] args) {
		new MyFrame("고객관리시스템",640,480).setVisible(true);
		
	}
}
