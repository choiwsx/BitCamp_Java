package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.dtoArr.length==0)
		{
			System.out.println("����� ����� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<data.dtoArr.length; i++)
		{
			System.out.println(data.dtoArr[i].toString());
		}
		
	}

}
