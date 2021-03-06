package org.wonseok;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class GameOverFrame implements ActionListener {

	private JFrame frame;
	String playerName;
	/**
	 * Launch the application.
	 */
	public static void main(String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					GameOverFrame window = new GameOverFrame(name);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameOverFrame(String s) {
		initialize(s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String s) {
		frame = new JFrame();
		playerName = s;
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("src/image/gameover.png").getImage(),0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		JButton btn1 = new JButton("다시하기");
		JButton btn2 = new JButton("결과표 보기");
		JButton btn3 = new JButton("나가기");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String tmp = btn.getText();
		switch(tmp)
		{
		case "다시하기":
			frame.dispose();
			Test2.main(playerName);
			break;
		case "결과표 보기":
			System.out.println("결과표");
			frame.dispose();
			EndFrame.main(null);
			break;
		case "나가기":
			System.out.println("나가기");
			System.exit(0);
			break;
		}
		
	}

}
