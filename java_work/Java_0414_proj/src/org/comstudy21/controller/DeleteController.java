package org.comstudy21.controller;

import org.comstudy21.model.Member;

public class DeleteController implements Controller {

	public DeleteController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		int no = Integer.parseInt(noLabel.getText().substring(3));
		Member dto = new Member(no, name, email, phone);
		dao.delete(dto);
	}

}
