package org.wonseok.view;

import org.wonseok.controller.Controller;
import org.wonseok.resource.R;


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

public interface View extends R {

	 JFrame frame = new JFrame();
	 JTextField numText = new JTextField();
	 JTextField nameText = new JTextField();
	 JTextField emailText = new JTextField();
	 JTextField phoneText = new JTextField();

	JPanel contentPane = null;

	Controller controller = new Controller();

	String[] col = { "번호", "이름", "이메일", "전화번호" };
	DefaultTableModel tableModel = new DefaultTableModel(null, col);
	JTable searchResultTable = new JTable(tableModel);
	JScrollPane infoScrollPane = new JScrollPane(searchResultTable);

	void run2();
	void initialize(); 
	void SetTitle(String s);
}
