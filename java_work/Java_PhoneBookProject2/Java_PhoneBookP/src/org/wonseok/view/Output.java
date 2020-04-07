package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		if(data.dtoArr == null)
		{
			System.out.println("출력할게 없습니다.");
			return;
		}
		System.out.println(outputTitle);
		for(int i=0; i<dao.getTop(); i++)
		{
			System.out.println(data.dtoArr[i]);
		}
	}

}
