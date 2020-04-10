package org.wonseok.jtable;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class JtableExam extends JFrame{
	
	
	JPanel contentPane = null;
	
	JScrollPane infoScrollPane;
	JTable searchResultTable;
	
	DefaultTableModel tableModel;
	
	public JtableExam() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = (JPanel)getContentPane();
		
		Object[][] data = {
				{"강아지","dog@naver.com","1111","30"}, 
				{"이장미","rose@nate.com","2222","28"},
				{"이바라","sun@daum.net","3333","1"}
		};
		String[] colums = {"성명","이메일","전화번호","나이"};
		
//		tableModel.setRowCount(20);
		
		Vector v = new Vector<>();
		v.add(data[0]);
		v.add(data[1]);
		v.add(data[2]);
		Vector v2 = new Vector();
		v2.add("성명");
		v2.add("이메일");
		v2.add("번호");
		v2.add("나이");
		
		tableModel = new DefaultTableModel(v,v2);
		searchResultTable = new JTable(tableModel);
		infoScrollPane = new JScrollPane(searchResultTable);
		add(infoScrollPane);
		
		tableModel.addTableModelListener(new TableModelListener() {
			
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getSource());
			}
		});
		
		setSize(1040,800);
		setVisible(true);
	
	}

	
	public static void main(String[] args) {
		new JtableExam();
	}
}
