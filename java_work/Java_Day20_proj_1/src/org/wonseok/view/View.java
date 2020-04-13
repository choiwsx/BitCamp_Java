package org.wonseok.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.wonseok.resource.R;

public abstract class View extends JPanel implements R{

	public abstract void init(); // 레이아웃 설정
	public abstract void start(); // 이벤트 설정
}