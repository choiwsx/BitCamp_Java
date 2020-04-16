package org.comstudy21.controller;

import java.util.Vector;

import org.comstudy21.model.Member;

public class SearchController implements Controller {

	public SearchController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();

		Member member = new Member(0, name, email, phone);
		
		Vector<Vector> dataVector = dao.select(member);
		
		
		dm.setDataVector(dataVector, columnNames);
		
		
	}

}
