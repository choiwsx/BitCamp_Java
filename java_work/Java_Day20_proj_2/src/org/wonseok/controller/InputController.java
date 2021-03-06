package org.wonseok.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import org.wonseok.model.Dao;
import org.wonseok.model.Member;

public class InputController implements Controller {

	public InputController() {
	}

	@Override
	public void service() {
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		if (!name.equals("") && !email.equals("") && !phone.equals("")) {
			Member dto = new Member(0, name, email, phone);
			dao.insert(dto);
		} else {
			JOptionPane.showMessageDialog(null, "모든 정보를 입력하셔야합니다.", "경고", JOptionPane.WARNING_MESSAGE);
		}
	}

}
