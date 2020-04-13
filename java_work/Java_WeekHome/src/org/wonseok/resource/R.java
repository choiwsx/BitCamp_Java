package org.wonseok.resource;

import java.util.Scanner;

import org.wonseok.model.Dao;
import org.wonseok.view.AllSerach;
import org.wonseok.view.View;
import org.wonseok.view.test;

public interface R {
	Scanner scan = new Scanner(System.in);
	Data data = new Data();
	Dao dao = new Dao();
	View[] viewArr ={new test(), new AllSerach()};
}
