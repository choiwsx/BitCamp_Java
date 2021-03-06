package org.wonseok.controller;

import java.util.ArrayList;
import java.util.Vector;

import org.wonseok.model.Member;

public class ListController implements Controller {
	public ListController() {
	}

	@Override
	public void service() {
		ArrayList<Member> dataList = dao.selectAll();
		if (dataList != null) {
			while (dm.getRowCount() > 0) {
				dm.removeRow(0);
			}
			for (Member rowData : dataList) {
				Vector v = new Vector<>();
				v.add(rowData.getNo());
				v.add(rowData.getName());
				v.add(rowData.getEmail());
				v.add(rowData.getPhone());
				dm.addRow(v);
			}
		} else {
			System.out.println("출력 할 데이터가 없습니다.!");
		}
	}
}
