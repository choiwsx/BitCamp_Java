package org.wonseok.controller;

import java.util.Vector;

import org.wonseok.resource.R;

public class ListController implements Controller, R {

	public ListController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		Vector<Vector> dataVector = dao.selectAll();
		dm.setDataVector(dataVector, columnIdentifiers);
		
	}

}