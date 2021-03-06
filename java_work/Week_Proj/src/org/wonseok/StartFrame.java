package org.wonseok;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StartFrame {

	private JFrame frame;
	private JTextField textField;

	public static Connection conn = Test_jdbc.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "INSERT INTO PLAYER(NAME) VALUES(?)";
	public static Statement stmt = null;
	public static ResultSet rs = null;
	public static String sql2 = "SELECT * FROM PLAYER WHERE NAME=?";

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame window = new StartFrame();
					window.frame.setVisible(true);
					try {
						stmt = conn.createStatement();
						rs = stmt.executeQuery("SELECT * FROM PLAYER");
//						ResultSet rs = stmt.executeQuery("SELECT * FROM PLAYER");
						if(!rs.next()) {
							String sql = "CREATE TABLE PLAYER( NAME VARCHAR(30),"
									+ "TIME INT, SCORE INT)";
							stmt.execute(sql);
							stmt.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartFrame() {
	
			initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이 름 :");
		lblNewLabel.setBounds(234, 333, 57, 30);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(340, 336, 192, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Game  Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textField.getText();
				try {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setString(1, name);

					rs = pstmt.executeQuery();
					
					boolean check = false;
					while (rs.next()) {
						String tmpName = rs.getString("NAME");
						if (tmpName.equals(name)) {
							System.out.println("존재하는 이름입니다.");
							JOptionPane.showMessageDialog(null, "존재하는 이름입니다, 다른 이름 입력하세요", "경고!",
									JOptionPane.WARNING_MESSAGE);
							check = true;
						}
					}
					if (!check) {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, name);
						pstmt.executeUpdate();

						Test2.main(name);
						frame.dispose();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(231, 658, 301, 54);
		frame.getContentPane().add(btnNewButton);
		frame.setLocationRelativeTo(null);
	}
}
