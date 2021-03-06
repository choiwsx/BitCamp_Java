package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener {
	MyCalc window;

	public ButtonHandler(MyCalc window) {
		// TODO Auto-generated constructor stub
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();

			// System.out.println(btn.getLabel()+"버튼 눌렀다");
			// window.label.setText(btn.getLabel()+"버튼 눌렀다.");
		}
	}
}

public class MyCalc extends MyFrame {
	int total = 0;
	int resultL = 0;
	int tempL = 0;
	boolean bInit = false;
	boolean bOper = false;
	Button[] btns1 = new Button[12];
	Button[] btns2 = new Button[12];
	Button[] btns3 = new Button[5];
	String[] txt3 = { "M-", "√", "%", "1/x", "=" };
	{
		for (int i = 0; i < btns3.length; i++) {
			btns3[i] = new Button(txt3[i]);
		}
	}
	String[] txt1 = { "MC", "MR", "←", "CE", "7", "8", "4", "5", "1", "2", "0", "", };
	String[] txt2 = { "MS", "M+", "C", "±", "9", "/", "6", "*", "3", "-", ".", "+", };
	{
		for (int i = 0; i < btns1.length; i++) {
			btns1[i] = new Button(txt1[i]);
			btns2[i] = new Button(txt2[i]);
		}
	}
	Panel p1 = new Panel(new GridLayout(6, 1, 5, 5));
	Panel p2 = new Panel(new GridLayout(6, 2, 5, 5));
	Panel p3 = new Panel(new GridLayout(3, 1, 5, 5));
	Panel[] p1subs = new Panel[6];
	{
		for (int i = 0; i < p1subs.length; i++) {
			p1subs[i] = new Panel(new GridLayout(1, 1, 5, 5));
			p1.add(p1subs[i]);
		}
		for (int i = 0; i < btns2.length; i++) {
			p2.add(btns2[i]);
		}
		Panel p3sub1 = new Panel(new GridLayout(2, 1, 5, 5));
		Panel p3sub2 = new Panel(new GridLayout(2, 1, 5, 5));
		p3sub1.add(btns3[0]);
		p3sub1.add(btns3[1]);
		p3sub2.add(btns3[2]);
		p3sub2.add(btns3[3]);
		p3.add(p3sub1);
		p3.add(p3sub2);
		p3.add(btns3[4]);
	}

	Panel keyboard = new Panel(new FlowLayout());
	Panel resultPane = new Panel(new GridLayout(2, 1, 5, 5));
	Label resultLabel = new Label("0");
	Label tempLabel = new Label("0");

	public MyCalc() {
		super("MyCalc", 200, 270);

		p1subs[0].add(btns1[0]);
		p1subs[0].add(btns1[1]);
		p1subs[1].add(btns1[2]);
		p1subs[1].add(btns1[3]);
		p1subs[2].add(btns1[4]);
		p1subs[2].add(btns1[5]);
		p1subs[3].add(btns1[6]);
		p1subs[3].add(btns1[7]);
		p1subs[4].add(btns1[8]);
		p1subs[4].add(btns1[9]);
		p1subs[5].add(btns1[10]);

		keyboard.add(p1);
		keyboard.add(p2);
		keyboard.add(p3);

		add(BorderLayout.CENTER, keyboard);
		resultPane.add(tempLabel);
		resultPane.add(resultLabel);
		resultLabel.setBackground(Color.PINK);
		tempLabel.setBackground(Color.cyan);
		resultLabel.setBounds(0, 0, 180, 40);
		tempLabel.setBounds(0, 0, 180, 40);
		resultLabel.setAlignment(2);
		tempLabel.setAlignment(2);
		resultPane.setSize(360, 80);
		add(BorderLayout.NORTH, resultPane);
		play();
		setVisible(true);
	}

	public void play() {
		ButtonHandler handler = new ButtonHandler(this);

		btns1[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("7");
				input("7");
			}
		});
		btns1[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("8");
				input("8");
			}
		});
		btns1[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("4");
				input("4");
			}
		});
		btns1[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("5");
				input("5");
			}
		});
		btns1[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("1");
				input("1");
			}
		});
		btns1[9].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("2");
				input("2");
			}
		});
		btns1[10].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("0");
				input("0");
			}
		});
		btns2[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("9");
				input("9");
			}
		});
		btns2[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("6");
				input("6");
			}
		});
		btns2[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("3");
				input("3");
			}
		});
		btns2[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("C");
				clear();
			}
		});
		btns2[11].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!bOper) {
					System.out.println("+");
					oper("+");
				}else
				{
					String tpl = tempLabel.getText();
					int k = tpl.length();
					StringBuilder sb = new StringBuilder(tpl);
					sb.setCharAt(k-1, '+');
					tempLabel.setText(sb.toString());
				}
			}
		});
		btns2[9].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!bOper) {
					System.out.println("-");
					oper("-");
				}else
				{
					String tpl = tempLabel.getText();
					int k = tpl.length();
					StringBuilder sb = new StringBuilder(tpl);
					sb.setCharAt(k-1, '-');
					tempLabel.setText(sb.toString());
				}
			}
		});
		btns3[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!bOper) {
					System.out.println("=");
					oper("=");
				}
			}
		});
		btns2[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!bOper) {
					System.out.println("*");
					oper("*");
				}else
				{
					String tpl = tempLabel.getText();
					int k = tpl.length();
					StringBuilder sb = new StringBuilder(tpl);
					sb.setCharAt(k-1, '*');
					tempLabel.setText(sb.toString());
				}
			}
		});
		btns2[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (!bOper) {
					System.out.println("/");
					oper("/");
				} else {
					String tpl = tempLabel.getText();
					int k = tpl.length();
					StringBuilder sb = new StringBuilder(tpl);
					sb.setCharAt(k-1, '/');
					tempLabel.setText(sb.toString());
				}
			}
		});

	}

	public void input(String s) {
		String getRlabel = resultLabel.getText();

		if (bInit) {
			clear();
			// bInit=false;
			bOper = false;
			// input(s);
		} // 여기서 숫자 눌렀을때 초기화 해야됨.

		if (!bOper)
			if (getRlabel.equals("0")) {
				getRlabel = s;
			} else {
				if (bInit) {
					getRlabel = s;
					bInit = false;
				} else {
					getRlabel += s;
				}
			}
		else {
			getRlabel = s;
			bOper = false;
		}

		resultLabel.setText(getRlabel);

	}

	public void clear() {
		resultLabel.setText("0");
		tempLabel.setText("0");
	}

	public void oper(String s) {
		String resultS = resultLabel.getText();
		int resultI = Integer.parseInt(resultS);
		resultS += s;
		String tempString = tempLabel.getText();
		if (s.equals("="))
			bInit = true;

		if (tempString.equals("0")) {
			total = resultI;
			tempLabel.setText(resultS);
		} else {
			int lastIdx = tempString.length();
			char c = tempString.charAt(lastIdx - 1); // 템프 라벨에 있던 마지막 기호를 가지고옴.
			switch (c) {
			case '+':
				total += resultI;
				tempString += resultS;
				tempLabel.setText(tempString);
				String resultString = Integer.toString(total);
				resultLabel.setText(resultString);
				break;
			case '-':
				total -= resultI;
				tempString += resultS;
				tempLabel.setText(tempString);
				String resultString2 = Integer.toString(total);
				resultLabel.setText(resultString2);
				break;
			case '*':
				total *= resultI;
				tempString += resultS;
				tempLabel.setText(tempString);
				String resultString3 = Integer.toString(total);
				resultLabel.setText(resultString3);
				break;
			case '/':
				total /= resultI;
				tempString += resultS;
				tempLabel.setText(tempString);
				String resultString4 = Integer.toString(total);
				resultLabel.setText(resultString4);
				break;
			}
		}
		bOper = true;
	}

	public static void main(String[] args) {
		new MyCalc();
	}
}
//
// btns1[4]-7
// btns1[5]-8
// btns1[6]-4
// btns1[7]-5
// btns1[8]-1
// btns1[9]-2
// btns1[10]-0
// btns2[4]-9
// btns2[6]-6
// btns2[8]-3
//
//
// btns2[2]-C
//
// btns2[11]- +
// btns2[9]- -
// btns2[7]- *
// btns2[5]- /
//
// btns3[4] - =