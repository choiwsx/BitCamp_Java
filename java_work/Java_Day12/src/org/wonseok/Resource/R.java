package org.wonseok.Resource;

import org.wonseok.Controller.PhonebookController;
import org.wonseok.View.Input;
import org.wonseok.View.Output;

public interface R {
	String appName = "Phone Book";
	
	PhonebookController controller = new PhonebookController();
	
	int MAX = 100;
	
	Input input = new Input();
	Output output = new Output();
}
