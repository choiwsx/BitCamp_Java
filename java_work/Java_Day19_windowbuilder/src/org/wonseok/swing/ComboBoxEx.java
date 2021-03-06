package org.wonseok.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComboBoxEx extends JFrame implements ListSelectionListener {
	
	JList list;
	JTextField tf;
	
	
	public ComboBoxEx() {
		// TODO Auto-generated constructor stub
		String[] str = {"등산","윈드서핑","독서","수영","골프","영화"};
		list = new JList(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JLabel("취미를 선택 하 시 오^______^."), "North");
		add(list);
		tf = new JTextField();
		add(tf,"South");
		
		list.addListSelectionListener(this);
		setSize(200,300);
		setVisible(true);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
//			tf.setText("선택하세요!");
		Object[] item;
		String total = "";
			
		if(e.getSource() instanceof JList)
		{
			JList lis = (JList)e.getSource();
			item = lis.getSelectedValues();
			for(int i=0; i<item.length; i++)
			{
				total = total + item[i] + " ";
			}
			tf.setText(total);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx();
	}

}
