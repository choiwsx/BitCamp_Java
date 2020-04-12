package org.wonseok.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.wonseok.model.Dto;


public class test implements View{
	
	
	public static void main(String[] args) {
	}
	
	public void run2() {
		try {
			test window = new test();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public test() {
		// TODO Auto-generated constructor stub
		initialize();
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		frame.setBounds(100, 100, 608, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		infoScrollPane.setSize(350, 250);
		infoScrollPane.setLocation(220, 20);

		JLabel lblNewLabel = new JLabel("번  호");
		lblNewLabel.setBounds(12, 23, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("이  름");
		label.setBounds(12, 69, 57, 15);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("이 메 일");
		label_1.setBounds(12, 118, 57, 15);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("전화번호");
		label_2.setBounds(12, 169, 57, 15);
		frame.getContentPane().add(label_2);

		numText.setBounds(80, 20, 116, 21);
		frame.getContentPane().add(numText);
		numText.setColumns(10);

		nameText.setColumns(10);
		nameText.setBounds(80, 66, 116, 21);
		frame.getContentPane().add(nameText);

		emailText.setColumns(10);
		emailText.setBounds(80, 115, 116, 21);
		frame.getContentPane().add(emailText);

		phoneText.setColumns(10);
		phoneText.setBounds(81, 166, 116, 21);
		frame.getContentPane().add(phoneText);

		JButton allSearachBtn = new JButton("전체보기");
		allSearachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.btnNum = 1;
				SetTitle("전체보기");
				SetTF(true, true, true, true);
			}
		});
		allSearachBtn.setBounds(26, 298, 97, 23);
		frame.getContentPane().add(allSearachBtn);

		JButton addBtn = new JButton("추  가");
		addBtn.setBounds(135, 298, 97, 23);
		frame.getContentPane().add(addBtn);
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String[] inputStr = new String[4];
				inputStr[0] = numText.getText();
				inputStr[1] = nameText.getText();
				inputStr[2] = emailText.getText();
				inputStr[3] = phoneText.getText();
				boolean bCheck = true;
				for (int i = 0; i < inputStr.length; i++) {
					if (inputStr[i].equals(""))
						bCheck = false;
				}
				if (bCheck) {
					Dto dto = new Dto(inputStr[0], inputStr[1], inputStr[2], inputStr[3]);
					data.dto = dto;
					numText.setText("");
					nameText.setText("");
					emailText.setText("");
					phoneText.setText("");
					JOptionPane.showMessageDialog(null, "추가성공", "메시지", JOptionPane.INFORMATION_MESSAGE);
					controller.insert(data.dto);

				} else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력해야지만 추가가능", "메시지", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton delBtn = new JButton("삭  제");
		delBtn.setBounds(244, 298, 97, 23);
		frame.getContentPane().add(delBtn);
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				boolean bAllCheck = false;
				String[] inputStr = new String[4];
				inputStr[0] = numText.getText();
				inputStr[1] = nameText.getText();
				inputStr[2] = emailText.getText();
				inputStr[3] = phoneText.getText();
				SetTitle("삭 제");
				SetTF(false, true, false, false);
				if(!inputStr[1].equals(""))
				{
					controller.delete(nameText.getText());
				}
				else
				{
					if (searchResultTable.getSelectedRow() == -1) {
						JOptionPane.showMessageDialog(null, "삭제 할 행을 선택 혹은 삭제할 값을 하나 입력해주세요.", "삭제모드",
								JOptionPane.INFORMATION_MESSAGE);
						return;
					} else {
						if (searchResultTable.getSelectedRowCount() > 1) {
							for (int i = 0; i < searchResultTable.getSelectedRowCount(); i++) {
								System.out.println(searchResultTable.getSelectedRowCount());
								tableModel.removeRow(searchResultTable.getSelectedRow() + i);
								i--;
							}
						} else if (searchResultTable.getSelectedRowCount() == 1)
							tableModel.removeRow(searchResultTable.getSelectedRow());
						JOptionPane.showMessageDialog(null, "삭제성공", "메시지", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});

		JButton SearchBtn = new JButton("검  색");
		SearchBtn.setBounds(353, 298, 97, 23);
		frame.getContentPane().add(SearchBtn);

		JButton cancleBtn = new JButton("취  소");
		cancleBtn.setBounds(462, 298, 97, 23);
		frame.getContentPane().add(cancleBtn);
		frame.setTitle("고객정보시스템관리");
		frame.getContentPane().add(infoScrollPane);
		frame.getContentPane().add(infoScrollPane);
	}
	
	public void SetTitle(String s)
	{
		frame.setTitle(s);
	}
	
	public void SetTF(boolean t1,boolean t2,boolean t3,boolean t4)
	{
		numText.setEnabled(t1);			
		nameText.setEnabled(t2);
		emailText.setEnabled(t3);
		phoneText.setEnabled(t4);
		if(t1)
		{
			numText.setBackground(Color.WHITE);
		}
		if(!t1)
		{
			numText.setBackground(Color.GRAY);			
		}
		if(t2)
		{
			nameText.setBackground(Color.WHITE);
		}
		if(!t2)
		{
			nameText.setBackground(Color.GRAY);			
		}
		if(t3)
		{
			emailText.setBackground(Color.WHITE);
		}
		if(!t3)
		{
			emailText.setBackground(Color.GRAY);			
		}
		if(t4)
		{
			phoneText.setBackground(Color.WHITE);
		}
		if(!t4)
		{
			phoneText.setBackground(Color.GRAY);			
		}
	}
	
}
