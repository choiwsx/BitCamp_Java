package org.wonseok.controller;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import org.wonseok.model.Member;

public class DeleteController implements Controller {

	public DeleteController() {
	}

	@Override
	public void service() {

		JTable table = listView.getTable();
		if (table.getSelectedRow() == -1) {

			String name = nameField.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			Member dto = new Member(0, name, email, phone);
			ArrayList<Member> searchList = dao.search(dto);

			if(searchList!=null)
			{
				while(dm.getRowCount()>0)
				{
					dm.removeRow(0);
				}
				for(Member rowData : searchList)
				{
					Vector v = new Vector<>();
					v.add(rowData.getNo());
					v.add(rowData.getName());
					v.add(rowData.getEmail());
					v.add(rowData.getPhone());
					dm.addRow(v);
				}
			}
			if(searchList.size()==0)
			{
				JOptionPane.showMessageDialog(null, "입력한 이름의 사람은 존재하지 않습니다.", "경고",
						JOptionPane.WARNING_MESSAGE);
			}
			if (dm.getRowCount() > 0) {
				String input = JOptionPane.showInputDialog("몇번의 " + dto.getName() + "을 지우시겠습니까?");
				if (input == null || input.equals("-1")) {
					JOptionPane.showMessageDialog(null, "번호를 입력하셔야 삭제가 가능합니다", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					boolean flag = false;
					for (int i = 0; i < searchList.size(); i++) {
						Member m = new Member();
						m = searchList.get(i);
						int mNo = m.getNo();
						int temp = Integer.parseInt(input);
						if (temp == mNo) {
							flag = true;
							dao.remove(temp, true);
							JOptionPane.showMessageDialog(null, "삭제 성공.");
							listController.service();
						}
					}
					if (!flag)
						JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다, 다시 확인 후 진행하세요.", "경고",
								JOptionPane.WARNING_MESSAGE);
					listController.service();
				}
			} else {
				JOptionPane.showMessageDialog(null, "해당하는 사람을 찾지 못하였습니다. 확인후 다시 진행해주세요.", "경고",
						JOptionPane.WARNING_MESSAGE);
				listController.service();
			}
		} else {
			if (table.getSelectedRowCount() == 1) {
				dao.remove(table.getSelectedRow(), false);
				JOptionPane.showMessageDialog(null, "삭제 성공.");
				listController.service();
			}
//			else
//			{
//				dao.remove(table.getSelectedRow(), table.getSelectedRowCount());
//				listController.service();
//			}

		}

	}

}
