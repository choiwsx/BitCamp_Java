package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Button;

public class Ch09Ex04 extends MyFrame {
	//컴포넌트는 이벤트 처리를 위해서 필드로 선언한다.
	Button btn01 = new Button("북쪽");
	Button btn02 = new Button("남쪽");
	Button btn03 = new Button("동쪽");
	Button btn04 = new Button("서쪽");
	Button btn05 = new Button("중앙");
	public Ch09Ex04() {
		// TODO Auto-generated constructor stub
		// 프레임의 기본 배치관리자는 보더레이아웃이다.
		add(BorderLayout.NORTH, btn01);
		add(BorderLayout.SOUTH, btn02);
		add(BorderLayout.EAST, btn03);
		add(BorderLayout.WEST, btn04);
		add(BorderLayout.CENTER, btn05);
		
//		btn01.action(evt, what)
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ch09Ex04();
	}

}
