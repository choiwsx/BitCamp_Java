package org.wonseok;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class WeekHome {

	private JFrame frame;
	private JTextField numText;
	private JTextField nameText;
	private JTextField emailText;
	private JTextField phoneText;

	JPanel contentPane = null;

	JScrollPane infoScrollPane;
	JTable searchResultTable;

	DefaultTableModel tableModel;

	String[] col = { "번호", "이름", "이메일", "전화번호" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeekHome window = new WeekHome();
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
	public WeekHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tableModel = new DefaultTableModel(null, col);
		searchResultTable = new JTable(tableModel);
		infoScrollPane = new JScrollPane(searchResultTable);
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

		numText = new JTextField();
		numText.setBounds(80, 20, 116, 21);
		frame.getContentPane().add(numText);
		numText.setColumns(10);

		nameText = new JTextField();
		nameText.setColumns(10);
		nameText.setBounds(80, 66, 116, 21);
		frame.getContentPane().add(nameText);

		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(80, 115, 116, 21);
		frame.getContentPane().add(emailText);

		phoneText = new JTextField();
		phoneText.setColumns(10);
		phoneText.setBounds(81, 166, 116, 21);
		frame.getContentPane().add(phoneText);

		JButton allSearachBtn = new JButton("전체보기");
		allSearachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					tableModel.addRow(inputStr);
					numText.setText("");
					nameText.setText("");
					emailText.setText("");
					phoneText.setText("");
					JOptionPane.showMessageDialog(null, "추가성공", "메시지", JOptionPane.INFORMATION_MESSAGE);
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
				boolean bAllCheck = false;
				String[] inputStr = new String[4];
				inputStr[0] = numText.getText();
				inputStr[1] = nameText.getText();
				inputStr[2] = emailText.getText();
				inputStr[3] = phoneText.getText();
				// System.out.println(tableModel.getColumnName(0));
				for (int i = 0; i < inputStr.length; i++) {
					if (!inputStr[i].equals("")) {
						bAllCheck = true;
						for (int j = 0; j < tableModel.getRowCount(); j++) {
							if (inputStr[i].equals(tableModel.getValueAt(j, i))) {
								System.out.println("해당 값을 찾았습니다.");
								tableModel.removeRow(j);
								JOptionPane.showMessageDialog(null, "삭제성공", "메시지", JOptionPane.INFORMATION_MESSAGE);
							} else {
								System.out.println("해당 값을 찾지 못했습니다.");
//								JOptionPane.showMessageDialog(null, "입력한 값을 찾지 못했습니다.", "삭제실패", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
				if (!bAllCheck) {
					if (searchResultTable.getSelectedRow() == -1) {
						JOptionPane.showMessageDialog(null, "삭제 할 행을 선택 혹은 삭제할 값을 하나 입력해주세요.", "삭제실패",
								JOptionPane.ERROR_MESSAGE);
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

		frame.getContentPane().add(infoScrollPane);
		frame.getContentPane().add(infoScrollPane);

	}
}
