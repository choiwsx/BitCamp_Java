package org.wonseok;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EndFrame {

	private JFrame frame;
	private JTable table;
	
	Connection conn = Test_jdbc.getConnection();
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "SELECT * FROM PLAYER";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndFrame window = new EndFrame();
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
	public EndFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		DefaultTableModel dm = new DefaultTableModel(10, 3);
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
//		scrollPane.setViewportView(table);
		frame.add(scrollPane);
		Vector<Vector> v = new Vector<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Vector tmpv = new Vector<>();
				String name = rs.getString("name");
				int time = rs.getInt("time");
				int score = rs.getInt("score");
				tmpv.add(name);
				tmpv.add(time);
				tmpv.add(score);
				v.add(tmpv);
			}
			Vector<String> columnIdentifiers = new Vector<>();
			columnIdentifiers.add("이름");
			columnIdentifiers.add("시간");
			columnIdentifiers.add("점수");
			dm.setDataVector(v, columnIdentifiers);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
