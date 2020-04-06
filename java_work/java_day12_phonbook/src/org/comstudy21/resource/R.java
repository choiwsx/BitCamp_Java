package org.comstudy21.resource;

import java.util.Scanner;

import org.comstudy21.controller.PhonebookController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.Input;
import org.comstudy21.view.Menu;
import org.comstudy21.view.Output;

public interface R {
	String appName = "Phone Book";
	
	PhonebookController controller = new PhonebookController();
	
	int MAX = 100;
	
	Input input = new Input();
	Output output = new Output();
	Menu menu = new Menu();
	
	//Dao dao = new Dao();
	// �̱��� ��ü�� �����Ѵ�.
	Dao dao = Dao.getInstance();
	
	Scanner scan = new Scanner(System.in);
	
	// ���߿� �÷��� ��ü�� ���� �� �� �ִ�.
	Data data = new Data();
}
