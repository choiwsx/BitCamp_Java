package org.wonseok.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class windowApp2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowApp2 window = new windowApp2();
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
	public windowApp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이     름:");
		lblNewLabel.setBounds(25, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("아 이 디:");
		label_2.setBounds(25, 77, 57, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label = new JLabel("패스워드:");
		label.setBounds(25, 121, 57, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("나    이:");
		label_1.setBounds(25, 161, 57, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(94, 32, 210, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 74, 210, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 118, 210, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 158, 210, 21);
		frame.getContentPane().add(textField_3);
		
		JButton button = new JButton("가입하기");
		button.setBounds(81, 215, 97, 23);
		frame.getContentPane().add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(326, 31, 242, 207);
		frame.getContentPane().add(textArea);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				String text2 = textField_1.getText();
				String text3 = textField_2.getText();
				String text4 = textField_3.getText();
//				System.out.printf("%s, %s, %s, %s\n", text, text2, text3, text4);
				textArea.append(text+", "+text2+", "+text3+", "+ text4+"\n");
			}
		});
		
		JButton button_1 = new JButton("다시쓰기");
		button_1.setBounds(201, 215, 97, 23);
		frame.getContentPane().add(button_1);
	}
}
