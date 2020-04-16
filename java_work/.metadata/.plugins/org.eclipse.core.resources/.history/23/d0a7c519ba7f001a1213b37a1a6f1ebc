package org.wonseok.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import org.wonseok.model.Member;

public class SearchController implements Controller{

	public SearchController() {
	}

	@Override
	public void service() {
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		Member dto = new Member(0,name,email,phone);
		Vector<Vector> searchList = dao.search(dto);
		System.out.println(searchList);
		if(searchList!=null)
		{
			while(dm.getRowCount()>0)
			{
				dm.removeRow(0);
			}
			for(Vector rowData : searchList)
			{
				dm.addRow(rowData);
			}
		}
		if(searchList.size()==0)
		{
			JOptionPane.showMessageDialog(null, "입력한 이름의 사람은 존재하지 않습니다.", "경고",
					JOptionPane.WARNING_MESSAGE);
		}
	}

}
