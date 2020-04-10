package org.wonseok.resource;

import java.util.Scanner;

import org.wonseok.view.View;
import org.wonseok.view.test;

public interface R {
	Scanner scan = new Scanner(System.in);
	Data data = new Data();
	View[] viewArr ={new View(), new test()};
}
