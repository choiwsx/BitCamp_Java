package org.comstudy21.controller;

import javax.naming.event.NamingExceptionEvent;

import org.comstudy21.model.Member;

public class InputController implements Controller {

	public InputController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		Member dto = new Member(0, name, email, phone);
		dao.insert(dto);
	}

}
