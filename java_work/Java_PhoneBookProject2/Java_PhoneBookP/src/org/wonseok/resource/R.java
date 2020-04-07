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
	String appTitle = "::::::::::: 전화 번호부 :::::::::::";
	String inputTitle = "::: 입력 기능 :::";
	String outputTitle = "::: 출력 기능 :::";
	String menuTitle = ":::::::::::::Menu::::::::::::";
	String searchTitle = "::: 검색 기능 :::";
	String modifyTitle = "::: 수정 기능 :::";
	String deleteTitle = ":::: 삭제 기능 ::::";
	String[] menuArr = {" ","입력","출력","검색","수정","삭제","종료"};

	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	
	
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	Dao dao = Dao.getInstance();
}
