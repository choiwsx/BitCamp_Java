package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(outputTitle);
		System.out.print("���� ������ ����ұ��(1.Key��  2.������)? ");
		int select = scan.nextInt();
		data.searchNumber = select;
	}
}
