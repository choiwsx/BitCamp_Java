package org.wonseok.controller;

import java.util.ArrayList;
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
		ArrayList<Member> searchList = dao.search(dto);
		System.out.println(searchList);
		if(searchList!=null)
		{
			while(dm.getRowCount()>0)
			{
				dm.removeRow(0);
			}
			for(Member rowData : searchList)
			{
				Vector v = new Vector<>();
				v.add(rowData.getNo());
				v.add(rowData.getName());
				v.add(rowData.getEmail());
				v.add(rowData.getPhone());
				dm.addRow(v);
			}
		}
		if(searchList.size()==0)
		{
			JOptionPane.showMessageDialog(null, "입력한 이름의 사람은 존재하지 않습니다.", "경고",
					JOptionPane.WARNING_MESSAGE);
		}
	}

}
