package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(outputTitle);
		System.out.print("무슨 순으로 출력할까요(1.Key값  2.성적순)? ");
		int select = scan.nextInt();
		data.searchNumber = select;
	}
}
