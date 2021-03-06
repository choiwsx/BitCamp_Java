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

	String[] menuArr = {"","입력","출력","검색","수정","삭제","종료"};
	String menuTitle = "::::::::::M E N U::::::::::";
	String inputTitle = ":::::::::: 입 력 ::::::::::";
	String outputTitle = ":::::::::: 출 력 ::::::::::";
	String searchTitle = ":::::::::: 검 색 ::::::::::";
	String modifyTitle = ":::::::::: 수 정 ::::::::::";
	String deleteTitle = ":::::::::: 삭 제 ::::::::::";
	
	Data data = new Data();
	Dao dao = new Dao();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	
	Scanner scan = new Scanner(System.in);
}
