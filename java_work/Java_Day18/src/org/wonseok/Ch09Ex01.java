package org.wonseok;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class Ch09Ex01 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640,480);
	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
	
	
	public static void test(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640, 480);

		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowDeactivated(WindowEvent e) {

			}

			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {

			}

			@Override
			public void windowActivated(WindowEvent e) {

			}
		});

		// 보여지는 기능은 마지막에 설정한다.
		frame.show();

	}
}
