package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch09Ex7 extends MyFrame implements ActionListener{
	Panel p = new Panel(new GridLayout(1,3, 10, 0));
	Button playBtn = new Button("PLAY");
	Button stopBtn = new Button("STOP");
	Button nextBtn = new Button("NEXT");
	Button prevBtn = new Button("PREV");
	Panel p2 = new Panel(new GridLayout(2,1,0,0));
	Panel center = new Panel(new GridBagLayout());
	Button clickBtn = new Button("버튼을 눌러주세요.");
	Label label = new Label();
	public Ch09Ex7() {
		add(BorderLayout.SOUTH, p);
		p.add(playBtn);
		p.add(stopBtn);
//		p.add(openBtn);
		p2.add(nextBtn);
		p2.add(prevBtn);
		center.add(label);
		center.add(clickBtn);
//		label.addComponentListener(l);
		p.add(p2);
		this.add("Center",center);
		
		play();//이벤트 리스터
		
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof Button)
		{
			Button btn = (Button)e.getSource();
			
			System.out.println(btn.getLabel()+"버튼 눌렀다");
		}
	}
	
	private void play(){
		playBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		nextBtn.addActionListener(this);
		prevBtn.addActionListener(this);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ch09Ex7();
		
	}



}
