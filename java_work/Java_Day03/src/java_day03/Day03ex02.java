package java_day03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day03ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ â ����.
		Frame win = new Frame("My Window");
		win.setSize(600,400);
		win.setVisible(true);

		win.add(new Button("Ȯ�� ��ư"), BorderLayout.SOUTH);
		
		win.addWindowListener(new WindowAdapter(){
			//�ݱ� ��ư �̺�Ʈ ����
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("â�� �ݽ��ϴ�.");
				win.dispose();
				//super.windowClosing(0);
				System.exit(0);
			}
		});
	}

}