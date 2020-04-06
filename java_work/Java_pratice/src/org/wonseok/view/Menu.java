package org.wonseok.view;

public class Menu implements PhonebookView{
	
	@Override
	public void display()
	{
		System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		System.out.print("Choice >>");
		int no = scan.nextInt();
		data.no = no;
	}

}
