package org.wonseok.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameEx extends javax.swing.JFrame {

	
	JPanel contentPane;
	JLabel label = new JLabel("성명");
	JTextField txt = new JTextField(10);
	JButton button = new JButton("확인");
	JPanel p = new JPanel(new FlowLayout());
	
	
	
	public JFrameEx() {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = (JPanel)getContentPane();
//		txt.setSize(200, 50);
		p.add(label);
		p.add(txt);
		p.add(button);
		setLayout(new BorderLayout());
		contentPane.add(BorderLayout.NORTH,p);
		
		ImageIcon image = new ImageIcon("1.jpg");
		JLabel imgLabel = new JLabel(image);
		contentPane.add(imgLabel);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx();
	}	

}