package org.wonseok;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


//class Handler implements ActionListener
//{
//	Calc window;
//	public Handler(Calc window) {
//		// TODO Auto-generated constructor stub
//		this.window = window;
////		System.out.println(this);
//		System.out.println("! ");
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource() instanceof Button)
//		{
//			JButton btn = (JButton)e.getSource();
//			System.out.println(btn.getText()+"를 눌렀다.");
//			System.out.println("????????");
////			System.out.println(btn.getLabel()+"버튼 눌렀다");
////			window.label.setText(btn.getLabel()+"버튼 눌렀다.");
//		}
//	}	
//}

public class Calc extends MyFrame implements ActionListener{

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel l = new JLabel("",JLabel.RIGHT);
	JLabel l2 = new JLabel("", JLabel.RIGHT);
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b10 = new JButton("MC");
	JButton b11 = new JButton("MR");
	JButton b12 = new JButton("MS");
	JButton b13 = new JButton("M+");
	JButton b14 = new JButton("M-");
	JButton b15 = new JButton("<-");
	JButton b16 = new JButton("CE");
	JButton b17 = new JButton("C");
	JButton b18 = new JButton("±");
	JButton b19 = new JButton("√");
	JButton b20 = new JButton("/");
	JButton b21 = new JButton("%");
	JButton b22 = new JButton("*");
	JButton b23 = new JButton("1/x");
	JButton b24 = new JButton("-");
	JButton b25 = new JButton("+");
	JButton b26 = new JButton("=");
	JButton b27 = new JButton(".");
	
	GridBagLayout grid = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	HashMap<Integer, JButton> map = new HashMap<>();
	boolean flag = false;
	int total = 0;
	int tmpInt = 0;
	public Calc() {
		setLayout(new GridLayout(2,1));
		
		p1.setLayout(grid);
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		make(b10, 0, 0, 1, 1);
		make(b11, 1, 0, 1, 1);
		make(b12, 2, 0, 1, 1);
		make(b13, 3, 0, 1, 1);
		make(b14, 4, 0, 1, 1);

		make(b15, 0, 1, 1, 1);
		make(b16, 1, 1, 1, 1);
		make(b17, 2, 1, 1, 1);
		make(b18, 3, 1, 1, 1);
		make(b19, 4, 1, 1, 1);
		
		make(b7, 0, 2, 1, 1);
		make(b8, 1, 2, 1, 1);
		make(b9, 2, 2, 1, 1);
		make(b20, 3, 2, 1, 1);
		make(b21, 4, 2, 1, 1);
		
		make(b4, 0, 3, 1, 1);
		make(b5, 1, 3, 1, 1);
		make(b6, 2, 3, 1, 1);
		make(b22, 3, 3, 1, 1);
		make(b23, 4, 3, 1, 1);
		
		make(b1, 0, 4, 1, 1);
		make(b2, 1, 4, 1, 1);
		make(b3, 2, 4, 1, 1);
		make(b24, 3, 4, 1, 1);
		make(b26, 4, 4, 1, 2);
		
		make(b0, 0, 5, 2, 1);
		make(b27, 2, 5, 1, 1);
		make(b25, 3, 5, 1, 1);
		
		add(p2);
		add(p1);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		p1.add(b13);
		p1.add(b14);
		
		p1.add(b15);
		p1.add(b16);
		p1.add(b17);
		p1.add(b18);
		p1.add(b19);
		
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(b20);
		p1.add(b21);
		
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b22);
		p1.add(b23);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b24);
		p1.add(b26);
		
		p1.add(b0);
		p1.add(b27);
		p1.add(b25);
		
//		p2.add(l);
		p2.setLayout(new GridLayout(2,1));
		p2.add(l);
		p2.add(l2);
//		l2.setPreferredSize(new Dimension(200,200));
		l2.setFont(l2.getFont().deriveFont(64.0f));
//		p2.add(l2);
		
//		putMap();
		
		addAction();

		

		setVisible(true);
	}
	
//	public void putMap()
//	{
//		map.put(0, b0);
//		map.put(1, b1);
//		map.put(2, b2);
//		map.put(3, b2);
//		map.put(4, b3);
//		map.put(5, b4);
//		map.put(5, b5);
//		map.put(6, b6);
//		map.put(7, b7);
//		map.put(8, b8);
//		map.put(9, b9);
//		map.put(10, b10);
//		map.put(11, b11);
//		map.put(12, b12);
//		map.put(13, b13);
//		map.put(14, b14);
//		map.put(15, b15);
//		map.put(16, b16);
//		map.put(17, b17);
//		map.put(18, b18);
//		map.put(19, b19);
//		map.put(20, b20);
//		map.put(21, b21);
//		map.put(22, b22);
//		map.put(23, b23);
//		map.put(24, b24);
//		map.put(25, b25);
//		map.put(26, b26);
//		map.put(27, b27);
//	}
//	
	
	public void addAction()
	{
//		Handler h = new Handler(this);
//		for( Map.Entry<Integer, JButton> elem : map.entrySet() ){
////            System.out.println( String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
//			elem.getValue().addActionListener(this);
//        }
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = l2.getText();
				String tmp = null;
				if(s.equals("0"))
				{
					tmp = "0";
				}else{
					tmp = s+"0";
				}
		        l2.setText(tmp);
			}
		});
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "1";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"1";
				l2.setText(tmp);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "2";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"2";
				l2.setText(tmp);
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "3";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"3";
				l2.setText(tmp);
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "4";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"4";
				l2.setText(tmp);
				}
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "5";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"5";
				l2.setText(tmp);
				}
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "6";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"6";
				l2.setText(tmp);
				}
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "7";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"7";
				l2.setText(tmp);
				}
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "8";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"8";
				l2.setText(tmp);
			}
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flag)
				{
					String tmp = "9";
					l2.setText(tmp);
					flag = false;
				}else{
				String s = l2.getText();
				String tmp = s+"9";
				l2.setText(tmp);
				}
			}
		});
		b25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				String l1S = l.getText();
//				String s = l2.getText();
//				String tmp = s+"+";
//				l.setText(l1S+tmp);
//				int tmp1 = Integer.parseInt(s);
//				total += tmp1;
				String l1S = l.getText();
				String s = l2.getText();
				tmpInt = Integer.parseInt(s);
				s = s+'+';
				l.setText(l1S+s);
				calcu();
//				String to = Integer.toString(total);
//				l2.setText(to);
				flag = true;
			}
		});
		b24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String l1S = l.getText();
				String s = l2.getText();
				tmpInt = Integer.parseInt(s);
				s = s+'-';
				l.setText(l1S+s);
				calcu();
//				String to = Integer.toString(total);
//				l2.setText(to);
				flag = true;
			}
		});
		
	}
	
	public void calcu()
	{
		String calcS = l.getText();
		String ans;
		char ch = calcS.charAt(calcS.length()-1);
		System.out.println(ch);
		switch(ch)
		{
		case '+':
			total += tmpInt;
			ans = Integer.toString(total);
			l2.setText(ans);
			break;
		case '-':
//			total -= tmpInt;
			ans = Integer.toString(total);
			l2.setText(ans);
			break;
		case '*':
			total *= tmpInt;
			ans = Integer.toString(total);
			l2.setText(ans);
			break;
		case '/':
			total /= tmpInt;
			ans = Integer.toString(total);
			l2.setText(ans);
			break;
			
		}
		
	}
	
	
	public void make(JButton b, int x, int y, int w, int h)
	{
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		grid.setConstraints(b, gbc);
	}
	
	public static void main(String[] args) {
		new Calc();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton)
		{
			JButton b = new JButton();
//			System.out.println(b.getLayout()+"를 눌렀당.");
//			System.out.println("오잉");
//			System.out.println(b.text);
		}
	}
}
