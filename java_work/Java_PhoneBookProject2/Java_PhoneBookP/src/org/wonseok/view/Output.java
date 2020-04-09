package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		if(data.dtoArr == null)
		{
			System.out.println("����Ұ� �����ϴ�.");
			return;
		}
		System.out.println(outputTitle);
		for(int i=0; i<dao.getTop(); i++)
		{
			System.out.println(data.dtoArr[i]);
		}
	}

}
