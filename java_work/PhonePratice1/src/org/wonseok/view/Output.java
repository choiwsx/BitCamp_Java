package org.wonseok.view;

public class Output implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.dtoArr.length==0)
		{
			System.out.println("출력할 사람이 없습니다.");
			return;
		}
		
		for(int i=0; i<data.dtoArr.length; i++)
		{
			System.out.println(data.dtoArr[i].toString());
		}
		
	}

}
