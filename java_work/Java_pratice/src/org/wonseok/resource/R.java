package org.wonseok.resource;

import java.util.Scanner;

import org.wonseok.controller.PhonebookController;
import org.wonseok.model.Dao;
import org.wonseok.view.Input;
import org.wonseok.view.Menu;
import org.wonseok.view.Output;

public interface R {

	int MAX = 100;
	Data data = new Data();
	Scanner scan = new Scanner(System.in);
	Input input = new Input();
	Menu menu = new Menu();
	Output output = new Output();
	PhonebookController controller = new PhonebookController();
	Dao dao = Dao.getInstance();
}
