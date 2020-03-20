package java_day03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day03ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//윈도우 창 생성.
		Frame win = new Frame("My Window");
		win.setSize(600,400);
		win.setVisible(true);

		win.add(new Button("확인 버튼"), BorderLayout.SOUTH);
		
		win.addWindowListener(new WindowAdapter(){
			//닫기 버튼 이벤트 설정
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창을 닫습니다.");
				win.dispose();
				//super.windowClosing(0);
				System.exit(0);
			}
		});
	}

}
