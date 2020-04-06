package org.wonseok.resource;

import java.util.Scanner;

import org.wonseok.model.Dao;
import org.wonseok.view.Delete;
import org.wonseok.view.Input;
import org.wonseok.view.Menu;
import org.wonseok.view.Modify;
import org.wonseok.view.Output;
import org.wonseok.view.Search;
import org.wonseok.view.View;

public interface R {

	String menuTitle = ":::::Menu::::";

	
	String[] menuArr = {"","입력","출력","검색","수정","삭제","종료"};
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	Scanner scan = new Scanner(System.in);
	Data data = new Data();
	Dao dao = new Dao();
	
}
